package zsx.mycoursera.dao;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.dao
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 20:43
 */

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FiveCollegeMapper {
    List<Map<String,String>> selectInfo();
}
