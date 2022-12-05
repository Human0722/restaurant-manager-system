package io.github.human0722.restaurantmanagersystem.mapstruct;

import io.github.human0722.restaurantmanagersystem.domain.SeatDomain;
import io.github.human0722.restaurantmanagersystem.request.SeatRequest;
import io.github.human0722.restaurantmanagersystem.response.SeatResponse;
import org.mapstruct.Mapper;

/**
 * @author human0722
 * @description TODO
 * @date 2022-12-01 10:59
 **/
@Mapper(componentModel = "spring")
public interface SeatMapStruct {
    SeatResponse.DTO domainToDTO(SeatDomain seatDomain);

    SeatDomain storeToDomain(SeatRequest.Store store);

    SeatDomain updateToDomain(SeatRequest.Update update);
}
