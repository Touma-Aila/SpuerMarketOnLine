package com.touma.spuermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.touma.spuermarketonline.entity.TbToken;

/**
 * -测试dao
 *
 * @author touma
 *
 */
@Mapper
public interface TestDAO {

  /**
   * -查询token
   *
   * @return
   * @throws Exception
   */
  List<TbToken> queryTokens() throws Exception;
}
