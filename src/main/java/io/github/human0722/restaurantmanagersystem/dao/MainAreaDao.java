package io.github.human0722.restaurantmanagersystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.human0722.restaurantmanagersystem.domain.MainAreaDomain;
import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;

import java.util.List;

/**
 * @author xueliang
 * @date 2022-11-25 14:27
 */
public interface MainAreaDao extends BaseMapper<MainAreaDomain> {
    List<MainAreaResponse> showAll();
}
