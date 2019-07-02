package zsx.mycoursera.dao;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.dao
 *  @author: 赵思绣
 *  @description:
 *  @date: 29 21:04
 */

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SchoolSexMapper {
    List<Map<String,String>> selectAll();
}
