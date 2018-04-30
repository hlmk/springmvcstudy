package com.cht.springstudy.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.cht.springstudy.annotation
 *
 * @author chenhaiting
 * @name Demo
 * @description
 * @date 2018-04-29 9:26
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
@Controller
public class Demo {


    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("this is my first springmvc aunotation demo");
        model.addAttribute("message","第一个springMVC注解应用程序！");
        //返回页面的逻辑名
        return "annotation";
    }

}
