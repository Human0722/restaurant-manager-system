package io.github.human0722.restaurantmanagersystem.request;

import io.github.human0722.restaurantmanagersystem.domain.base.BaseMysqlDomain;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

/**
 * @author human0722
 * @date 2022-12-01 11:08
 **/
@ApiModel("座位请求参数")
public class SeatRequest extends BaseMysqlDomain {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Store {
        private String seatName;
        private String mainAreaId;
        private Integer sort;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Update {
        private Integer id;
        private String seatName;
        private Integer sort;
    }
}
