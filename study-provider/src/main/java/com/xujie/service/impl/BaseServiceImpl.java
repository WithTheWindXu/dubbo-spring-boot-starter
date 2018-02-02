package com.xujie.service.impl;

import com.xujie.mapper.BaseMapper;
import com.xujie.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * @author xujie
 * @version 1.0
 * @date 2018/2/2 11:39
 */
public class BaseServiceImpl<T,D extends BaseMapper<T>> implements IBaseService<T>{

    @Autowired
    private D dao;

    @Override
    public T get(Serializable t) {
        return dao.get(t);
    }

    @Override
    public List<T> selectList(T t) {
        return dao.selectList(t);
    }

    @Override
    public List<T> selectListPage(T t) {
        return dao.selectListPage(t);
    }

    @Override
    public Integer uppdateById(T t) {
        return dao.uppdateById(t);
    }

    @Override
    public Integer deleteById(Serializable t) {
        return dao.deleteById(t);
    }

    @Override
    public Integer insert(T t) {
        return dao.insert(t);
    }
}
