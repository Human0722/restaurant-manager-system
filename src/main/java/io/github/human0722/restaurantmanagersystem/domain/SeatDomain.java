package io.github.human0722.restaurantmanagersystem.domain;

import io.github.human0722.restaurantmanagersystem.domain.base.BaseMysqlDomain;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.springframework.context.annotation.Profile;

/**
 * @author human0722
 * @date 2022-12-01 10:53
 **/
@Data
@NoArgsConstructor
@FieldNameConstants
public class SeatDomain extends BaseMysqlDomain {
    /**
     * 作为名称
     */
    private String name;
    /**
     * 区域Id
     */
    private String mainAreaId;
    /**
     * 排序
     */
    private Integer sort;
}
