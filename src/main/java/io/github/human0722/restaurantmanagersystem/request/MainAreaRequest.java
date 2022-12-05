package io.github.human0722.restaurantmanagersystem.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xueliang
 * @date 2022-11-25 16:27
 */
@ApiModel("区域相关请求参数")
public class MainAreaRequest {

    @ApiModel(value = "新增区域参数")
    @Data
    @NoArgsConstructor
    public static class Create {

        private String areaName;
        private Integer sort;
    }

    @ApiModel(value = "修改参数列表")
    @Data
    @NoArgsConstructor
    public static class Update {
        private Integer id;
        private String areaName;
        private Integer sort;
    }
}
