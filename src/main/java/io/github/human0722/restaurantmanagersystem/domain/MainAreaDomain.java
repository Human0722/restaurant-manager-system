package io.github.human0722.restaurantmanagersystem.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import io.github.human0722.restaurantmanagersystem.domain.base.BaseMysqlDomain;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author human0722
 * @date 2022-11-24 22:36
 **/
@Data
@NoArgsConstructor
@TableName("rms_main_area")
public class MainAreaDomain extends BaseMysqlDomain {
    private String areaName;
    private Integer sort;
}
