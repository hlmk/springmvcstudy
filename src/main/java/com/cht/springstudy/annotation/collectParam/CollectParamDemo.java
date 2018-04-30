package com.cht.springstudy.annotation.collectParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.cht.springstudy.annotation.collectParam
 *
 * @author chenhaiting
 * @name CollectParamDemo
 * @description
 * @date 2018-04-29 10:43
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
@Controller
@RequestMapping("collect")
public class CollectParamDemo {


    /**
     * 常见类型的参数
     * @param model
     * @param userName
     * @param height
     * @return
     */
    @RequestMapping(value = "/commonTyps",method = RequestMethod.POST)
//    @PostMapping
    public String commonTyps(Model model,String userName, Double height){
        System.out.println("userName:"+userName + "  height:"+height);
        model.addAttribute("message","参数测试成功,userName:" +userName + "  height:" +height);
        return "annotation";
    }


}
