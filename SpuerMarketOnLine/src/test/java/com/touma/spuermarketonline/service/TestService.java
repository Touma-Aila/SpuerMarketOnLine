package com.touma.spuermarketonline.service;

import com.touma.spuermarketonline.utils.JsonMessage;
import com.touma.spuermarketonline.utils.PageBean;

/**
 * - 测试服务
 *
 * @author touma
 *
 */
public interface TestService {

  /**
   * -分页查询token
   *
   * @param page
   * @return
   * @throws Exception
   */
  JsonMessage queryTokens(PageBean page) throws Exception;

}
