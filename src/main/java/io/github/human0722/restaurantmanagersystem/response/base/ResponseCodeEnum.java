package io.github.human0722.restaurantmanagersystem.response.base;

import lombok.Getter;

/**
 * @author xueliang
 * @date 2022-11-25 14:40
 */
@Getter
public enum ResponseCodeEnum {

    SUCCESS(200, "成功"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "页面不存在"),
    INNER_ERROR(500, "服务器内部错误");
    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;
}
