package zsx.mycoursera.controller;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.controller
 *  @author: 赵思绣
 *  @description:
 *  @date: 01 0:37
 */

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zsx.mycoursera.dao.ComputerNumberMapper;

@RestController
public class ComputerNumberController {
    @Autowired
    private ComputerNumberMapper computerNumberMapper;
    @GetMapping(value = "/computernumber",produces = "application/json;charset=utf-8")
    public String CollegeNumber(){ return JSON.toJSONString(computerNumberMapper.getComputerNumber());}
}
