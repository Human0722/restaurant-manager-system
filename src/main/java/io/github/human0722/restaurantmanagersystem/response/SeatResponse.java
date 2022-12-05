package io.github.human0722.restaurantmanagersystem.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author human0722
 * @date 2022-11-25 21:44
 **/
@ApiModel("座位响应")
public class SeatResponse {

    @ApiModel("DTO")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DTO {
        @ApiModelProperty("id")
        private String id;
        @ApiModelProperty("座位名称")
        private String seatName;
        @ApiModelProperty("区域ID")
        private String mainAreaId;
        @ApiModelProperty("排序")
        private Integer sort;
    }
}
