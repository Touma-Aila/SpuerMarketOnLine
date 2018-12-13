package com.touma.spuermarketonline.service;

/**
 * -计划任务服务
 *
 * @author touma
 *
 */
public interface ScheduleTaskService {

  /**
   * -删除过期的token
   *
   * @return 过期的token数量
   * @throws Exception
   */
  int deleteTokens() throws Exception;
}
