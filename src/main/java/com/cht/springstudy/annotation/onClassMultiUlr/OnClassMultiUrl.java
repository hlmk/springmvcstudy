package com.cht.springstudy.annotation.onClassMultiUlr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.cht.springstudy.annotation.onClassMultiUlr
 *
 * @author chenhaiting
 * @name OnClassMultiUrl
 * @description
 * @date 2018-04-29 10:25
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
@Controller
@RequestMapping("/demo")
public class OnClassMultiUrl {


    @RequestMapping("/add")
    public String add(Model model,String username){//可以用方法传参的形式接收页面传过来的参数，也可以是实体bean
        System.out.println("一个类多个url请求之add");
        model.addAttribute("message","大家好，这是一个类多个功能子模块的测试类，当前方法add");
        //返回逻辑名
        return "annotation";
    }

    @RequestMapping("/delete")
    public String delete(Model model,String username){//可以用方法传参的形式接收页面传过来的参数，也可以是实体bean
        System.out.println("一个类多个url请求之delete");
        model.addAttribute("message","大家好，这是一个类多个功能子模块的测试类,当前方法delete");
        //返回逻辑名
        return "annotation";
    }

    @RequestMapping("/update")
    public String update(Model model,String username){//可以用方法传参的形式接收页面传过来的参数，也可以是实体bean
        System.out.println("一个类多个url请求之update");
        model.addAttribute("message","大家好，这是一个类多个功能子模块的测试类,当前方法update");
        //返回逻辑名
        return "annotation";
    }


}
