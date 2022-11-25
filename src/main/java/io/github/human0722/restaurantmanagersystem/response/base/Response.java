package io.github.human0722.restaurantmanagersystem.response.base;

import io.github.human0722.restaurantmanagersystem.response.MainAreaResponse;
import lombok.Getter;

import java.util.List;

/**
 * @author human0722
 * @date 2022-11-24 22:55
 **/
@Getter
public class Response<T> {

    private Response() {}

    private int code;
    private String message;
    private T data;

    public static<P> Response<P> success(P data) {
        return new Response<P>()
                .setCode(ResponseCodeEnum.SUCCESS.getCode())
                .setMessage(ResponseCodeEnum.SUCCESS.getMessage())
                .setData(data);
    }

    public static<P> Response<P> error(ResponseCodeEnum responseCodeEnum) {
        return new Response<P>()
                .setCode(responseCodeEnum.getCode())
                .setMessage(responseCodeEnum.getMessage());
    }

    private Response setCode(int code) {
        this.code = code;
        return this;
    }

    public Response setMessage(String message) {
        this.message = message;
        return this;
    }

    private Response<T> setData(T data) {
        this.data = data;
        return this;
    }

}
