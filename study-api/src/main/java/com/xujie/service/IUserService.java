package com.xujie.service;

import com.xujie.domian.UserInfo;

/**
 * Created by xj on 2017/12/25.
 */
public interface IUserService {
    public UserInfo queryUserList(String userId);

    public int checkLogin(UserInfo record);
}
