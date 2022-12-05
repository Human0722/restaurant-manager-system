package io.github.human0722.restaurantmanagersystem.web;

import io.github.human0722.restaurantmanagersystem.request.SeatRequest;
import io.github.human0722.restaurantmanagersystem.response.SeatResponse;
import io.github.human0722.restaurantmanagersystem.response.base.Response;
import io.github.human0722.restaurantmanagersystem.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author human0722
 * @date 2022-11-25 21:38
 **/
@RestController
@RequestMapping(SeatController.BASE_URL)
@RequiredArgsConstructor
public class SeatController {
    public static final String BASE_URL = "/seat-manager";

    final private SeatService seatService;

    @GetMapping("/show")
    public Response<SeatResponse.DTO> show(@PathVariable(value = "seat_id")String seat_id) {
        return Response.success(seatService.show(seat_id));
    }

    @PostMapping
    public Response<SeatResponse.DTO> store(@RequestBody SeatRequest.Store store) {
        return Response.success(seatService.store(store));
    }

    @PutMapping
    public Response<SeatResponse.DTO> update(@RequestBody SeatRequest.Update update) {
        return Response.success(seatService.update(update));
    }

    @DeleteMapping
    public Response<SeatResponse.DTO> destroy(@RequestParam("seat_id")String seat_id) {
        return Response.success(seatService.destroy(seat_id));
    }

}
