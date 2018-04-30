package com.cht.springstudy.annotation.beanParam;

import com.cht.springstudy.bean.UserBean;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.cht.springstudy.annotation.beanParam
 *
 * @author chenhaiting
 * @name BeanParamDemo
 * @description
 * @date 2018-04-29 16:26
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
@Controller
@RequestMapping("bean")
public class BeanParamDemo {

    @RequestMapping(value = "/beanParam",method = RequestMethod.POST)
    public String beanDemo(UserBean userBean, Model model)throws Exception{
        System.out.println("进入beanDemo...");
        model.addAttribute("message",userBean.toString());
        return "annotation";
    }


}
