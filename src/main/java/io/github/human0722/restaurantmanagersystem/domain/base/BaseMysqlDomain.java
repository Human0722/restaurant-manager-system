package io.github.human0722.restaurantmanagersystem.domain.base;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * @author human0722
 * @date 2022-11-24 22:35
 **/
@Data
@NoArgsConstructor
public class BaseMysqlDomain {
    private String Id;
    private String createdBy;
    private String createByName;
    private Instant createdTime;
    private String updatedBy;
    private String updatedByName;
    private Instant updatedTime;
}
