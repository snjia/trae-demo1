-- 用户表创建SQL语句
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tenant_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '租户ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码（加密存储）',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `gender` tinyint(1) DEFAULT 0 COMMENT '性别（0-未知，1-男，2-女）',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态（0-禁用，1-启用）',
  `is_del` int(11) NOT NULL DEFAULT 0 COMMENT '是否删除（0-未删除，1-已删除）',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '更新用户ID',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建用户ID',
  `gmt_modified` datetime DEFAULT NULL COMMENT '更新时间',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_username` (`username`),
  UNIQUE KEY `uk_phone` (`phone`),
  UNIQUE KEY `uk_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';