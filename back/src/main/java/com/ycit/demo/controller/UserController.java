package com.ycit.demo.controller;

import com.ycit.demo.bean.dto.UserQuery;
import com.ycit.demo.bean.po.User;
import com.ycit.demo.bean.vo.ApiResponse;
import com.ycit.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author racy
 * @date 2021/10/28
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/users")
    public ApiResponse<User> find(UserQuery userQuery) {
        return ApiResponse.ok(userService.finds(userQuery));
    }

}
