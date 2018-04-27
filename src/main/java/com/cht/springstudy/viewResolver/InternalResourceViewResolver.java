package com.cht.springstudy.viewResolver;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * com.cht.springstudy.viewResolver
 *
 * @author chenhaiting
 * @name InternalResourceViewResolver
 * @description 视图解析器测试类
 * @date 2018-04-26 19:29
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
public class InternalResourceViewResolver implements Controller  {


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
        System.out.println(request.getRequestURL());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("messege","视图解析器...");
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
