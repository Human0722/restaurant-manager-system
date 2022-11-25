package io.github.human0722.restaurantmanagersystem.service;

import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:57
 **/
public interface MainAreaService {
    List<MainAreaResponse.DTO> getMainAreaList();

    MainAreaResponse.DTO addMainArea(MainAreaRequest mainAreaRequest);
}
