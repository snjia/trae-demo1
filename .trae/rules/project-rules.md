## 项目名称
demo

## 环境
windows 11
jdk 17
maven 3.9.13

## 框架
Spring Boot 3.4.2
Spring Boot Web
Spring Boot Test
Lombok
Mybatis Plus 3.5.6
Mysql 8.0.33
Hutool 5.8.24

## 架构
标准分层
- Controller
- Service
- Mapper
- Entity

## 包结构
- `com.example.demo`
  - `controller`
  - `service`
  - `mapper`
  - `entity`
  - `vo`
  - `utils`
  - `config`
  - `exception`

## Entity
- 所有业务Entity需要继承项目中已经存在的BaseEntity基类

## Mapper
- 使用Mybatis Plus框架
- 开启分页插件

## Service
- 所有业务Service接口需要实现项目中已经存在的MyService接口, 所有业务ServiceImpl实现类需要继承项目中已经存在的MyServiceImpl基类, 基类中已经实现了基本的CRUD操作

## 配置规范
- 配置文件：application.yml + application-dev/test/prod.yml
- 敏感信息（密码、密钥）放入环境变量或配置中心
- 禁止明文密码

## 代码规范
- 代码符合阿里巴巴Java开发规范，添加必要的注释，异常处理简洁合理