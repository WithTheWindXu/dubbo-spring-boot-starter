package com.xujie.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author xujie
 * @version 1.0
 * @date 2018/2/2 11:26
 */
public interface IBaseService<T> {
    /**
     * @author xujie
     * @date 2018/2/2 11:13
     * @param [t]
     * @return T
     */
    T get(Serializable t);
    /**
     * 查询集合
     * @author xujie
     * @date 2018/2/2 11:15
     * @param [t]
     * @return java.util.List<T>
     */
    List<T> selectList(T t);
    /**
     * 分页查询集合
     * @author xujie
     * @date 2018/2/2 11:15
     * @param [t]
     * @return java.util.List<T>
     */
    List<T> selectListPage(T t);
    /**
     * 根据ID修改对象
     * @author xujie
     * @date 2018/2/2 11:18
     * @param [t]
     * @return java.lang.Integer
     */
    Integer uppdateById(T t);
    /**
     * 根据ID删除对象
     * @author xujie
     * @date 2018/2/2 11:19
     * @param [t]
     * @return java.lang.Integer
     */
    Integer deleteById(Serializable t);
    /**
     * 新增对象
     * @author xujie
     * @date 2018/2/2 11:20
     * @param [t]
     * @return java.lang.Integer
     */
    Integer insert(T t);
}
