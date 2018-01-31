package com.xujie.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.xujie.domian.UserInfo;


@Service(version = "1.0")
public class UserService implements IUserService {

	@Override
	public UserInfo queryUserList(String userId) {
		UserInfo userInfo=new UserInfo();
		userInfo.setUserid("1");
		return userInfo;
	}

	@Override
	public int checkLogin(UserInfo record) {
		return 0;
	}
}
