package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 基础Mapper接口，继承自MyBatis Plus的BaseMapper
 * 所有业务Mapper接口都应继承此接口
 */
public interface MyBaseMapper<T> extends BaseMapper<T> {
    // 可以在这里添加通用的方法定义

}