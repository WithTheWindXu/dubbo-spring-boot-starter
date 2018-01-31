package com.xujie.service.reference;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xujie.domian.UserInfo;
import com.xujie.service.IUserService;

/**
 * Created by xj on 2017/12/27.
 */
@Service("refService")
public class RefService {
    @Reference(version="1.0")
    private IUserService iUserService;

    public int sayHello(UserInfo name){
        return iUserService.checkLogin(name);
    }
}
