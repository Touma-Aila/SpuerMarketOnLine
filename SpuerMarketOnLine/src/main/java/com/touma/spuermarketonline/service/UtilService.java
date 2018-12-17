package com.touma.spuermarketonline.service;

import com.touma.spuermarketonline.entity.TbTokenInfo;

/**
 * -工具服务
 *
 * @author touma
 *
 */
public interface UtilService {

  /**
   * - 获取图片校验码
   *
   * @param tokenInfo 获取图片校验码数据
   * @return 获取图片校验码结果
   * @throws Exception 处理发生错误
   */
  String imageCode(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -查看校验码是否正确
   *
   * @param tokenInfo 查看校验码数据
   * @return 查看校验码结果
   * @throws Exception 处理发生错误
   */
  boolean checkImageCode(TbTokenInfo tokenInfo) throws Exception;

}
