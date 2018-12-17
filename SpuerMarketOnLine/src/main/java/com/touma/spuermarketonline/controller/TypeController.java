package com.touma.spuermarketonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.touma.spuermarketonline.model.TbTypeModel;
import com.touma.spuermarketonline.service.TypeService;
import com.touma.spuermarketonline.utils.JsonMessage;

/**
 * 
 * @author touma
 *
 */
@RestController
@RequestMapping("/type")
public class TypeController {

  @Autowired
  private TypeService typeService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbTypeModel model) throws Exception {
    // http://127.0.0.1:14000/type/queryAll?token=2caca03c-2f60-4031-b1c2-162aa4aba9e4
    return typeService.queryAll(model);
  }
  
  @RequestMapping("/add")
  public JsonMessage add(TbTypeModel model) throws Exception {
    return typeService.add(model);
  }
}
