package io.github.human0722.restaurantmanagersystem.web;

import io.github.human0722.restaurantmanagersystem.service.MainAreaService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String getMainAreaList() {
        return "ok";
    }

}
