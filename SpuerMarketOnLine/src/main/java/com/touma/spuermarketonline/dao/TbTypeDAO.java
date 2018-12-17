package com.touma.spuermarketonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.touma.spuermarketonline.entity.TbType;

/**
 * -TbType数据访问层
 * 
 * @author touma
 *
 */
@Mapper
public interface TbTypeDAO {

  /**
   * -查询
   * 
   * @return 查询结果
   * @throws Exception 处理发生错误
   */
  public List<TbType> queryAll() throws Exception;

  /**
   * -按主键查询
   * 
   * @param tbType 查询数据
   * @return 查询结果
   * @throws Exception 处理发生错误
   */
  public TbType queryAll(TbType tbType) throws Exception;

  /**
   * -添加
   * 
   * @param tbType 添加数据
   * @return 添加结果
   * @throws Exception 处理发生错误
   */
  int add(TbType tbType) throws Exception;

  /**
   * -更新
   * 
   * @param tbType 更新数据
   * @return 更新结果
   * @throws Exception 处理发生错误
   */
  int update(TbType tbType) throws Exception;

  /**
   * -删除
   * 
   * @param tbType 删除数据
   * @return 删除结果
   * @throws Exception 处理发生错误
   */
  int delete(TbType tbType) throws Exception;
}
