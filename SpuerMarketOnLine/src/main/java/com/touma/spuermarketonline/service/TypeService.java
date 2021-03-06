package com.touma.spuermarketonline.service;

import com.touma.spuermarketonline.model.TbTypeModel;
import com.touma.spuermarketonline.utils.JsonMessage;

/**
 * TbType
 * 
 * @author touma
 *
 */
public interface TypeService {

  /**
   * -查询全部
   * 
   * @param model 页面数据
   * @return 查询结果
   * @throws Exception 处理发生异常
   */
  JsonMessage queryAll(TbTypeModel model) throws Exception;

  /**
   * -添加
   * 
   * @param model 页面数据
   * @return 添加结果
   * @throws Exception 处理发生异常
   */
  JsonMessage add(TbTypeModel model) throws Exception;

}
