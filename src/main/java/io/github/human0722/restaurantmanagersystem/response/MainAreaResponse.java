package io.github.human0722.restaurantmanagersystem.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xueliang
 * @date 2022-11-25 15:04
 */

public class MainAreaResponse {

    @ApiModel("区域")
    @Data
    @NoArgsConstructor
    public static class DTO {
        @ApiModelProperty("区域id")
        private String id;
        @ApiModelProperty("区域名称")
        private String areaName;
        @ApiModelProperty("排序")
        private Integer sort;
    }
}
