package io.github.human0722.restaurantmanagersystem.web;

import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.request.MainAreaRequest;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;
import io.github.human0722.restaurantmanagersystem.response.base.Response;
import io.github.human0722.restaurantmanagersystem.service.MainAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:40
 **/
@Api(tags = "区域管理")
@RestController
@RequestMapping(MainAreaController.BASE_URL)
@RequiredArgsConstructor
public class MainAreaController {

    public static final String BASE_URL = "/main-area";

    final private MainAreaService mainAreaService;

    @ApiOperation(value = "区域列表")
    @GetMapping
    public Response<List<MainAreaResponse>> getMainAreaList() {
        return Response.success(mainAreaService.getMainAreaList());
    }

    @ApiOperation(value = "新增一个区域")
    @PostMapping
    public Response<MainAreaResponse> addMainArea(
            @Validated @RequestBody MainAreaRequest.Create create) {
        return Response.success(mainAreaService.addMainArea(create));
    }

    @ApiModelProperty(value = "修改一个区域")
    @PutMapping
    public Response<MainAreaResponse> update(
            @Validated @RequestBody MainAreaRequest.Update update) {
        return Response.success(mainAreaService.updateMainArea(update));
    }

    @ApiModelProperty(value = "删除一个区域")
    @DeleteMapping
    public Response<MainAreaResponse> destroy(
            @RequestParam(value = "seat_id", defaultValue = "")String seat_id) {
        return Response.success(mainAreaService.destroyMainArea(seat_id));
    }
}
