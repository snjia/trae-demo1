package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;

/**
 * 基础Service接口
 * 所有业务Service接口都应继承此接口
 */
public interface MyService<T> {

    /**
     * 根据ID查询
     * @param id 主键id
     * @return 实体对象
     */
    T selectById(Serializable id);

    /**
     * 分页查询
     * @param entity 查询条件
     * @param current 当前页
     * @param size 每页数量
     * @return 分页结果
     */
    Page<T> page(T entity, long current, long size);

    /**
     * 获取详情页数据
     * @param id 主键id
     * @return 实体对象
     */
    T getDetail(Serializable id);

    /**
     * 获取编辑页数据
     * @param id 主键id
     * @return 实体对象
     */
    T getEdit(Serializable id);

    /**
     * 新增
     * @param entity 实体对象
     * @return 主键id
     */
    Long insert(T entity);

    /**
     * 修改
     * @param entity 实体对象
     */
    void update(T entity);

    /**
     * 删除
     * @param id 主键id
     */
    void delete(Serializable id);
}
