package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * title:
 * author:Lv Haoyuan
 * date:2024-09-09
 * description:用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    /**
     * 根据用户名查询用户
     */
    private final UserService userService;
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username){
        return userService.getUserByUsername(username);
    }
}
