package io.github.human0722.restaurantmanagersystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.human0722.restaurantmanagersystem.domain.SeatDomain;
import io.github.human0722.restaurantmanagersystem.dao.SeatDao;
import io.github.human0722.restaurantmanagersystem.mapstruct.SeatMapStruct;
import io.github.human0722.restaurantmanagersystem.request.SeatRequest;
import io.github.human0722.restaurantmanagersystem.response.SeatResponse;
import io.github.human0722.restaurantmanagersystem.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author human0722
 * @description TODO
 * @date 2022-11-25 21:43
 **/
@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService {

    final private SeatDao seatDao;
    final private SeatMapStruct seatMapStruct;

    @Override
    public SeatResponse.DTO show(String seat_id) {
        SeatDomain seatDomain = seatDao.selectById(seat_id);
        return seatMapStruct.domainToDTO(seatDomain);
    }

    @Override
    public List<SeatResponse.DTO> index(String mainAreaId) {
        QueryWrapper<SeatDomain> query = new QueryWrapper<>();
        if (StringUtils.hasLength(mainAreaId)) {
            query.eq(SeatDomain.Fields.mainAreaId, mainAreaId);
        }
        List<SeatDomain> seatList = seatDao.selectList(query);
        return seatList.stream().map(seatMapStruct::domainToDTO).collect(Collectors.toList());
    }

    @Override
    public SeatResponse.DTO store(SeatRequest.Store store) {
        SeatDomain seatDomain = seatMapStruct.storeToDomain(store);
        seatDomain.preCreate();
        seatDao.insert(seatDomain);
        return seatMapStruct.domainToDTO(seatDomain);
    }

    @Override
    public SeatResponse.DTO update(SeatRequest.Update update) {
        SeatDomain seatDomain = seatMapStruct.updateToDomain(update);
        seatDomain.preUpdate();
        seatDao.updateById(seatDomain);
        return seatMapStruct.domainToDTO(seatDomain);
    }

    @Override
    public SeatResponse.DTO destroy(String seat_id) {
        // 检查是否有订单
        // 删除
        SeatDomain seatDomain = seatDao.selectById(seat_id);
        if (seatDomain == null) {
            return null;
        }
        seatDao.deleteById(seat_id);
        return seatMapStruct.domainToDTO(seatDomain);
    }
}
