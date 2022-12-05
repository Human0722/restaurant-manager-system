package io.github.human0722.restaurantmanagersystem.mapstruct;

import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author xueliang
 * @description MapStruct for MainArea
 * @date 2022-11-25 15:09
 */
@Mapper(componentModel = "spring")
public interface MainAreaMapStruct {
  MainAreaResponse domainToDTO(MainAreaDomain mainAreaDomain);

  MainAreaDomain createToDomain(MainAreaRequest.Create create);

  MainAreaDomain updateToDomain(MainAreaRequest.Update update);
}
