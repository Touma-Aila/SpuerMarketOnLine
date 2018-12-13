package com.touma.spuermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.touma.spuermarketonline.model.IndexModel;
import com.touma.spuermarketonline.service.IndexService;
import com.touma.spuermarketonline.utils.JsonMessage;

/**
 * -默认首页控制器
 *
 * @author touma
 *
 */
@RestController
public class IndexController {
  @Autowired
  private IndexService indexService;

  @RequestMapping("")
  public JsonMessage index(IndexModel model) throws Exception {
    // {"echo":"测试"}
    JsonMessage message = indexService.index();
    message.put("echo", model.getEcho());
    return message;
  }
}
