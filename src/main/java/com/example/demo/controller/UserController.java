package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * 用户Controller
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据ID查询用户
     * @param id 用户ID
     * @return 用户信息
     */
    @GetMapping("/get/{id}")
    public UserVO get(@PathVariable Serializable id) {
        User user = userService.selectById(id);
        UserVO userVO = new UserVO();
        if (user != null) {
            BeanUtils.copyProperties(user, userVO);
        }
        return userVO;
    }

    /**
     * 分页查询用户
     * @param user 查询条件
     * @param current 当前页
     * @param size 每页数量
     * @return 分页结果
     */
    @GetMapping("/page")
    public Page<User> page(User user, long current, long size) {
        return userService.page(user, current, size);
    }

    /**
     * 新增用户
     * @param user 用户信息
     * @return 主键ID
     */
    @PostMapping("/add")
    public Long add(@RequestBody User user) {
        return userService.insert(user);
    }

    /**
     * 修改用户
     * @param user 用户信息
     */
    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    /**
     * 删除用户
     * @param id 用户ID
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Serializable id) {
        userService.delete(id);
    }

}