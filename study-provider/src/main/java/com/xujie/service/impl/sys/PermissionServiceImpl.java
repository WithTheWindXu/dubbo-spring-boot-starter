package com.xujie.service.impl.sys;

import com.alibaba.dubbo.config.annotation.Service;
import com.xujie.domian.sys.Permission;
import com.xujie.mapper.sys.PermissionMapper;
import com.xujie.service.impl.BaseServiceImpl;
import com.xujie.service.sys.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xujie
 * @version 1.0
 * @date 2018/2/2 14:23
 */
@Service(timeout = 130000)
public class PermissionServiceImpl extends BaseServiceImpl<Permission,PermissionMapper> implements IPermissionService{

}
