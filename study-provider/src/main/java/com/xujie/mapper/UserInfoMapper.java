package com.xujie.mapper;

import com.xujie.domian.UserInfo;

/**
 * Created by xj on 2017/12/27.
 */
public interface UserInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int checkLogin(UserInfo record);
}
