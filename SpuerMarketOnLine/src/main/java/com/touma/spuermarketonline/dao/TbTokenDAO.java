package com.touma.spuermarketonline.dao;

import org.apache.ibatis.annotations.Mapper;

import com.touma.spuermarketonline.entity.TbToken;

/**
 * TbToken-数据访问类
 *
 * @author touma
 *
 */
@Mapper
public interface TbTokenDAO {
  /**
   * addToken-添加token
   *
   * @param token 添加数据
   * @return 添加结果
   * @throws Exception 处理发生错误
   */
  int addToken(TbToken token) throws Exception;

  /**
   * updateToken-更新token时间
   *
   * @param token 更新数据
   * @return 更新结果
   * @throws Exception 处理发生错误
   */
  int updateToken(TbToken token) throws Exception;

  /**
   * queryToken-查询token是否存在
   *
   * @param token 查询数据
   * @return 查询结果
   * @throws Exception 处理发生错误
   */
  TbToken queryToken(TbToken token) throws Exception;

  /**
   * deleteTokens-删除过期的token
   *
   * @return 删除结果
   * @throws Exception 处理发生错误
   */
  int deleteTokens() throws Exception;

}
