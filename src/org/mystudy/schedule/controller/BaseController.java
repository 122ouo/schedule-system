package org.mystudy.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String[] split = requestURI.split("/");
        String methodName = split[split.length - 1];

        // 使用反射 通过方法名来获取下面的方法
        Class aClass = this.getClass();
        // 获取方法
        try {
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 暴力破解 方法的访问修饰符的限制
            declaredMethod.setAccessible(true);
            // 执行方法
            declaredMethod.invoke(this, req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
