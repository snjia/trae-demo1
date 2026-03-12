package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 基础Entity
 * 所有业务Entity都应继承此类
 */
@Data
public class BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long tenantId;
    private Integer isDel;

    @TableField(fill = FieldFill.UPDATE)
    private Long updateUserId;
    @TableField(fill = FieldFill.INSERT, updateStrategy = FieldStrategy.NEVER)
    private Long createUserId;
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime gmtModified;
    @TableField(fill = FieldFill.INSERT, updateStrategy = FieldStrategy.NEVER)
    private LocalDateTime gmtCreate;
}
