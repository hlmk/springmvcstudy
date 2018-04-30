package com.cht.springstudy.json;

import com.cht.springstudy.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.cht.springstudy.json
 *
 * @author chenhaiting
 * @name JsonDemo
 * @description
 * @date 2018-04-30 8:28
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
@Controller
@RequestMapping("/json")
public class JsonDemo {


    @RequestMapping("/demo")
    @ResponseBody
    public  UserBean demo(@RequestBody UserBean userBean){
        System.out.println("接收到的参数：" + userBean.toString());
        return  userBean;
    }

}
