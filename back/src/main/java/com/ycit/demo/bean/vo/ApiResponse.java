package com.ycit.demo.bean.vo;

import lombok.Data;

import java.util.List;

/**
 * @author racy
 * @date 2021/10/28
 */
@Data
public class ApiResponse<T> {

    private String msg;

    private List<T> data;

    private Integer code;

    public static <T> ApiResponse<T> ok(List<T> t) {
        ApiResponse<T> apiResponse = new ApiResponse();
        apiResponse.setData(t);
        apiResponse.setCode(200);
        apiResponse.setMsg("success");
        return apiResponse;
    }

    public static <T> ApiResponse<T> error() {
        ApiResponse<T> apiResponse = new ApiResponse();
        apiResponse.setCode(500);
        apiResponse.setMsg("server error");
        return apiResponse;
    }
}
