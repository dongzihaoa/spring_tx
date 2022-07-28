package com.dzh.controller;

import com.dzh.entity.Users;
import com.dzh.service.UserService;
import com.dzh.utils.JsonResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    public final UserService userService;

    /**
     * 构造器注入依赖
     * @param userService 依赖项
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 分页查询
     * @param pageNum 起始页
     * @param pageSize 页数
     * @return  JsonResult<PageInfo<Users>>
     */
    public JsonResult<PageInfo<Users>> findByPage(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        List<Users> all = userService.findAll();

        JsonResult<PageInfo<Users>> jsonResult = new JsonResult<PageInfo<Users>>();
        PageInfo<Users> usersPageInfo = new PageInfo<Users>(all);

        if (!usersPageInfo.getList().isEmpty()) {
            jsonResult.success();
        } else {
            jsonResult.error();
        }

        jsonResult.setData(usersPageInfo);

        return jsonResult;
    }

}
