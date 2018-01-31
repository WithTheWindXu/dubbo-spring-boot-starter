package com.xujie.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.xujie.domian.UserInfo;
import com.xujie.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


@Service(version = "1.0",timeout = 130000)
public class UserService implements IUserService {

	@Autowired
	private UserInfoMapper UserMapper;

	@Override
	public UserInfo queryUserList(String userId) {
		return UserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int checkLogin(UserInfo record) {
		return UserMapper.checkLogin(record);
	}
}
