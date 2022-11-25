package io.github.human0722.restaurantmanagersystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.mapper.MainAreaMapper;
import io.github.human0722.restaurantmanagersystem.mapstruct.MainAreaMapStruct;
import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;
import io.github.human0722.restaurantmanagersystem.service.MainAreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:57
 **/
@Service
@RequiredArgsConstructor
public class MainAreaServiceImpl implements MainAreaService {

    final private MainAreaMapper mainAreaMapper;
    final private MainAreaMapStruct mainAreaMapStruct;

    @Override
    public List<MainAreaResponse.DTO> getMainAreaList() {
        List<MainAreaDomain> mainAreaDomains = mainAreaMapper.selectList(null);
        return mainAreaMapStruct.domainListToDTOList(mainAreaDomains);
    }

    @Override
    public MainAreaResponse.DTO addMainArea(MainAreaRequest mainAreaRequest) {
        MainAreaDomain mainAreaDomain = mainAreaMapStruct.requestToDomain(mainAreaRequest);
        mainAreaDomain.preCreate();
        int insert = mainAreaMapper.insert(mainAreaDomain);
        if (insert > 0) {
            return mainAreaMapStruct.domainToDTO(mainAreaDomain);
        }
        return null;
    }
}
