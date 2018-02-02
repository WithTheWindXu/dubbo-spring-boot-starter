package com.xujie.controller.sys;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xujie.domian.sys.Permission;
import com.xujie.service.sys.IPermissionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xujie
 * @version 1.0
 * @date 2018/2/2 11:48
 */
@RestController
public class MenuController {

    @Reference
    private IPermissionService iPermissionService;

    @RequestMapping("/queryMenu")
    public List<Permission> queryMenu(Permission permission){
        return iPermissionService.selectList(permission);
    }
}
