package com.touma.spuermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touma.spuermarketonline.config.MyConfig;
import com.touma.spuermarketonline.converter.DateConverter;
import com.touma.spuermarketonline.dao.UtilsDAO;
import com.touma.spuermarketonline.service.IndexService;
import com.touma.spuermarketonline.utils.JsonMessage;

/**
 *
 * @author touma
 *
 */
@Service
public class IndexServiceImpl implements IndexService {
  @Autowired
  private MyConfig myConfig;
  @Autowired
  private UtilsDAO utilsDAO;

  @Override
  public JsonMessage index() throws Exception {
    JsonMessage message = JsonMessage.getSuccess(String.format("欢迎使用%s，%s", myConfig.appName, DateConverter.SDF_LONG.format(utilsDAO.queryTime())));
    return message;
  }

}
