package com.jack.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 * @site www.ctf.com.cn
 * @company 周大福
 * @create 2019-12-09 14:47
 */
@RestController
public class DemoController {
    @GetMapping(value = "/info")
   public String Info()
   {
       return "Jekins Demo123456";
   }
}
