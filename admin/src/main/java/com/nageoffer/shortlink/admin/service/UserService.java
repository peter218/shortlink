package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * title:
 * author:Lv Haoyuan
 * date:2024-09-09
 * description:
 */
public interface UserService extends IService<UserDO> {
    UserRespDTO getUserByUsername(String username);

    Boolean hasUserName(String username);

    void register(UserRegisterReqDTO requestParam);
    void update(UserUpdateReqDTO requestParam);

    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    Boolean checkLogin(String username,String token);

    void logout(String username, String token);
}
