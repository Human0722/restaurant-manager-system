package io.github.human0722.restaurantmanagersystem.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xueliang
 * @date 2022-11-25 16:27
 */
@ApiModel("区域相关请求参数")
@Data
@NoArgsConstructor
public class MainAreaRequest {
    private String areaName;
}
