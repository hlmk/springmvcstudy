package com.cht.springstudy.postChineseRandomCode;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * com.cht.springstudy.postChineseRandomCode
 *
 * @author chenhaiting
 * @name PostChineseRandomCodeDemo
 * @description 解决post提交方式的中文乱码问题demo
 * @date 2018-04-27 8:34
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
public class PostChineseRandomCodeDemo implements Controller {
    /**
     * Process the request and return a ModelAndView object which the DispatcherServlet
     * will render. A {@code null} return value is not an error: it indicates that
     * this object completed request processing itself and that there is therefore no
     * ModelAndView to render.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @return a ModelAndView to render, or {@code null} if handled directly
     * @throws Exception in case of errors
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //获取前台参数
        String name = request.getParameter("userName");
        String age = request.getParameter("age");
        String date = request.getParameter("date");
        System.out.println("userName=" + name + " age=" + age + " date=" + date);
        //设置返回参数和页面
        modelAndView.addObject("messege","添加成功！ 参数如下： ----> " + "userName=" + name + " age=" + age + " date=" + date);
        modelAndView.setViewName("addSuccess");
        return modelAndView;
    }
}
