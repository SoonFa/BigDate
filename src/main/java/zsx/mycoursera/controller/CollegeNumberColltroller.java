package zsx.mycoursera.controller;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.controller
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 17:50
 */
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zsx.mycoursera.dao.CollegeNumberMapper;

@RestController
public class CollegeNumberColltroller {
    @Autowired
    private CollegeNumberMapper collegeNumberMapper;
    @GetMapping(value = "/collegenumber",produces = "application/json;charset=utf-8")
    public String CollegeNumber(){ return JSON.toJSONString(collegeNumberMapper.getCollegeNumber());}
}
