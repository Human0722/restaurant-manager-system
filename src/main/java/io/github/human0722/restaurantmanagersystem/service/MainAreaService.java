package io.github.human0722.restaurantmanagersystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:57
 **/
public interface MainAreaService {
    List<MainAreaResponse> getMainAreaList();

    MainAreaResponse addMainArea(MainAreaRequest.Create create);

    MainAreaResponse updateMainArea(MainAreaRequest.Update update);

    MainAreaResponse destroyMainArea(String seat_id);
}
