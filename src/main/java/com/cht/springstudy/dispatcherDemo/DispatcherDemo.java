package com.cht.springstudy.dispatcherDemo;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * com.cht.springstudy.dispatcherDemo
 *
 * @author chenhaiting
 * @name DispatcherDemo
 * @description
 * @date 2018-04-25 8:56
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
public class DispatcherDemo implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("","test controller");
        modelAndView.setViewName("sucess.jsp");
        return modelAndView;
    }
}
