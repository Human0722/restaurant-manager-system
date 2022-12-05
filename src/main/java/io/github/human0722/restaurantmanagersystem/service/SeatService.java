package io.github.human0722.restaurantmanagersystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.human0722.restaurantmanagersystem.domain.SeatDomain;
import io.github.human0722.restaurantmanagersystem.request.SeatRequest;
import io.github.human0722.restaurantmanagersystem.response.SeatResponse;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-25 21:42
 **/
public interface SeatService{

    SeatResponse.DTO show(String seat_id);

    List<SeatResponse.DTO> index(String mainAreaId);

    SeatResponse.DTO store(SeatRequest.Store store);

    SeatResponse.DTO update(SeatRequest.Update update);

    SeatResponse.DTO destroy(String seat_id);
}
