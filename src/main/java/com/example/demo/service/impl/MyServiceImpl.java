package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.MyBaseMapper;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 基础Service接口实现类
 * 所有业务Service实现类都应继承此类
 */
public class MyServiceImpl<M extends MyBaseMapper<T>, T> implements MyService<T> {

    @Autowired
    private M baseMapper;

    @Override
    public T selectById(Serializable id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Page<T> page(T entity, long current, long size) {
        return null;
    }

    @Override
    public T getDetail(Serializable id) {
        return null;
    }

    @Override
    public T getEdit(Serializable id) {
        return null;
    }

    @Override
    public Long insert(T entity) {
        return null;
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(Serializable id) {

    }
}
