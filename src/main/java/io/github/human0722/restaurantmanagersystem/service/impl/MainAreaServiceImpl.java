package io.github.human0722.restaurantmanagersystem.service.impl;

import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.dao.MainAreaDao;
import io.github.human0722.restaurantmanagersystem.mapstruct.MainAreaMapStruct;
import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;
import io.github.human0722.restaurantmanagersystem.response.SeatResponse;
import io.github.human0722.restaurantmanagersystem.service.MainAreaService;
import io.github.human0722.restaurantmanagersystem.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:57
 **/
@Service
public class MainAreaServiceImpl implements MainAreaService {

    @Autowired
    private MainAreaDao mainAreaDao;
    @Autowired
    private MainAreaMapStruct mainAreaMapStruct;
    @Autowired
    private SeatService seatService;


    @Override
    public List<MainAreaResponse> getMainAreaList() {
        return mainAreaDao.showAll();
    }

    @Override
    public MainAreaResponse addMainArea(MainAreaRequest.Create create) {
        MainAreaDomain mainAreaDomain = mainAreaMapStruct.createToDomain(create);
        mainAreaDomain.preCreate();
        int insert = mainAreaDao.insert(mainAreaDomain);
        if (insert > 0) {
            return mainAreaMapStruct.domainToDTO(mainAreaDomain);
        }
        return null;
    }

    @Override
    public MainAreaResponse updateMainArea(MainAreaRequest.Update update) {
        MainAreaDomain mainAreaDomain = mainAreaMapStruct.updateToDomain(update);
        mainAreaDomain.preUpdate();
        mainAreaDao.updateById(mainAreaDomain);
        return mainAreaMapStruct.domainToDTO(mainAreaDomain);
    }

    @Override
    public MainAreaResponse destroyMainArea(String mainAreaId) {
        // 检查是否有下属的座位
        List<SeatResponse.DTO> index = seatService.index(mainAreaId);
        if (index.size() > 0) {
            // TODO 抛出异常和全局异常处理函数
            return null;
        }
        MainAreaDomain mainAreaDomain = mainAreaDao.selectById(mainAreaId);
        if (mainAreaDomain == null) {
            return null;
        }
        mainAreaDao.deleteById(mainAreaId);
        return mainAreaMapStruct.domainToDTO(mainAreaDomain);
    }
}
