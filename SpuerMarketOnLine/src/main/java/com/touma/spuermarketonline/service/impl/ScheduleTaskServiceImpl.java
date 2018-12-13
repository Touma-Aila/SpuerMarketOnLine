package com.touma.spuermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.touma.spuermarketonline.dao.TbTokenDAO;
import com.touma.spuermarketonline.dao.TbTokenInfoDAO;
import com.touma.spuermarketonline.service.ScheduleTaskService;

/**
 *
 * @author touma
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ScheduleTaskServiceImpl implements ScheduleTaskService {
  @Autowired
  private TbTokenDAO tbTokenDAO;
  @Autowired
  private TbTokenInfoDAO tbTokenInfoDAO;

  @Override
  public int deleteTokens() throws Exception {
    tbTokenInfoDAO.deleteTokenInfos();
    return tbTokenDAO.deleteTokens();
  }

}
