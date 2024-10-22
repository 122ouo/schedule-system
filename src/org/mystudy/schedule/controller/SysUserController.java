package org.mystudy.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class SysUserController extends BaseController {

    /**
     * 接收用户注册请求的业务处理方法(业务接口 不是java中的interface)
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 接收客户端提交的参数
        String username = req.getParameter("username");
        // 2 调用服务层方法, 完成注册功能
        // 3 根据注册结果(成功 失败) 做页面跳转

    }
}
