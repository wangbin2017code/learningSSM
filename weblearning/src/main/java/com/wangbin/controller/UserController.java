package com.wangbin.controller;

import com.wangbin.model.UserModel;
import com.wangbin.service.IUserService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户controller.
 * Created by wangbin on 2017/12/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void getUserById(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        UserModel userModel = this.userService.selectUserById(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(userModel));
        response.getWriter().close();
    }

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public
    @ResponseBody
    UserModel getUserInfoById(HttpServletRequest request, Model model) {
        long id = Long.parseLong(request.getParameter("id"));
        UserModel userModel = this.userService.selectUserById(id);
        model.addAttribute("user", userModel);
        return userModel;
    }

    @RequestMapping(value = "showUserInfo", method = RequestMethod.GET)
    @ResponseBody
    public UserModel getUserById(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("id"));
        UserModel userModel = this.userService.selectUserById(id);
        return userModel;
    }
}
