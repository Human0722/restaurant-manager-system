package io.github.human0722.restaurantmanagersystem.domain.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    @TableId(value = "id", type = IdType.AUTO)
    private  String id;

    private String createdBy;
    private String createdByName;
    private Instant createdTime;
    private String updatedBy;
    private String updatedByName;
    private Instant updatedTime;

    public void preCreate() {
        this.createdTime = Instant.now();
        this.createdBy = "test_user_id";
        this.createdByName = "test_user";
    }

    public void preUpdate() {
        this.updatedTime = Instant.now();
        this.updatedBy = "test_user_id";
        this.createdByName = "test_user";
    }
}
