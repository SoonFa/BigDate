package zsx.mycoursera.dao;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.dao
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 21:58
 */

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FiveCollegeMapperTest {

    private FiveCollegeMapper fiveCollegeMapper;

    @Autowired
    public void setFiveCollegeMapper(FiveCollegeMapper fiveCollegeMapper) {
        this.fiveCollegeMapper = fiveCollegeMapper;
    }
    @Test
    public void selectInfoTest() {
        List<Map<String,String>> list = fiveCollegeMapper.selectInfo();
        System.out.println(JSON.toJSONString(list));

    }

}
