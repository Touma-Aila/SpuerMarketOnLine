package com.touma.spuermarketonline.service;

import com.touma.spuermarketonline.utils.JsonMessage;

/**
 * Index服务类
 *
 * @author touma
 *
 */
public interface IndexService {

  /**
   * -首页显示信息
   * 
   * @return 首页显示结果
   * @throws Exception 处理发生错误
   */
  JsonMessage index() throws Exception;

}
