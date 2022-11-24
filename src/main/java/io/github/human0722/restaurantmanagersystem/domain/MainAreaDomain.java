package io.github.human0722.restaurantmanagersystem.domain;

import io.github.human0722.restaurantmanagersystem.domain.base.BaseMysqlDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author human0722
 * @date 2022-11-24 22:36
 **/
@Data
@NoArgsConstructor
public class MainAreaDomain extends BaseMysqlDomain {
    private String seatName;
    private Integer sort;
}
