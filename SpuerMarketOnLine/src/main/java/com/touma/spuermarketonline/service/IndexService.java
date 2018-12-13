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
   * @return
   * @throws Exception
   */
  JsonMessage index() throws Exception;

}
