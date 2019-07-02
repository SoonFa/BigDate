package zsx.mycoursera.controller;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.controller
 *  @author: 赵思绣
 *  @description:
 *  @date: 29 22:25
 */

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zsx.mycoursera.dao.SchoolSexMapper;

@RestController
public class SchoolSexController {
    @Autowired
    private SchoolSexMapper schoolSexMapper;
    @GetMapping(value = "/schoolsex",produces = "application/json;charset=utf-8")
    public String SchoolSex(){
        return JSON.toJSONString(schoolSexMapper.selectAll());
    }
}
