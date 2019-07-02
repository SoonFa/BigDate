package zsx.mycoursera.controller;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.controller
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 15:37
 */

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zsx.mycoursera.dao.ComputerSexMapper;

@RestController
public class ComputerSexController {
    @Autowired
    private ComputerSexMapper  computerSexMapper;
    @GetMapping(value = "/computersex",produces = "application/json;charset=utf-8")
    public String ComputerSex(){
        return JSON.toJSONString(computerSexMapper.getComputerSex());
    }

}
