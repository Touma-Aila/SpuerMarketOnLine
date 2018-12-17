package com.touma.spuermarketonline.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;

/**
 * UtilsDAO-系统工具DAO
 *
 * @author touma
 *
 */
@Mapper
public interface UtilsDAO {
  /**
   * -查询系统时间
   *
   * @return 查询系统时间结果
   * @throws Exception 处理数据错误
   */
  Date queryTime() throws Exception;
}
