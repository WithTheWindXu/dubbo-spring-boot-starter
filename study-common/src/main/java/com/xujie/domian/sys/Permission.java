package com.xujie.domian.sys;

import com.xujie.domian.BaseEntity;

import java.util.Date;

/**
 * @author xujie
 * @version 1.0
 * @date 2018/2/2 14:19
 */
public class Permission extends BaseEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 上级ID
     */
    private Long pid;
    /**
     * 权限名
     */
    private String name;
    /**
     * 类型 0、目录 1、菜单 2、按钮
     */
    private Integer type;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 地址
     */
    private String url;
    /**
     * 权限编码
     */
    private String permCode;
    /**
     * 图标
     */
    private String icon;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态 0、禁用 1、正常
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermCode() {
        return permCode;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
