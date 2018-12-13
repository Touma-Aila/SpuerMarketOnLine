package com.touma.spuermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.page.PageMethod;
import com.touma.spuermarketonline.dao.TestDAO;
import com.touma.spuermarketonline.entity.TbToken;
import com.touma.spuermarketonline.service.TestService;
import com.touma.spuermarketonline.utils.JsonMessage;
import com.touma.spuermarketonline.utils.PageBean;

/**
 *
 * @author touma
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService {
  @Autowired
  private TestDAO testDAO;

  @Override
  public JsonMessage queryTokens(PageBean page) throws Exception {
    PageMethod.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbToken> list = (Page<TbToken>) testDAO.queryTokens();
    page.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.put("page", page);
    message.put("list", list);
    return message;
  }

}
