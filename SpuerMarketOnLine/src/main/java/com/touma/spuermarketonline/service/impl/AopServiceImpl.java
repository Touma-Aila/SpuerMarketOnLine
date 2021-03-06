package com.touma.spuermarketonline.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.touma.spuermarketonline.dao.TbTokenDAO;
import com.touma.spuermarketonline.entity.TbToken;
import com.touma.spuermarketonline.service.AopService;
import com.touma.spuermarketonline.utils.MyUtils;

/**
 *
 * @author touma
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AopServiceImpl implements AopService {
  @Autowired
  private TbTokenDAO tbTokenDAO;

  /**
   * makeNewToken-创建一个新的token
   *
   * @return
   * @throws Exception
   */
  private TbToken makeNewToken() throws Exception {
    // 通过uuid生成随机的token
    String t = UUID.randomUUID().toString();
    TbToken stoken = new TbToken();
    stoken.setToken(t);
    // 保存到数据库
    tbTokenDAO.addToken(stoken);
    return stoken;
  }

  @Override
  public TbToken createOrUpdateToken(TbToken token) throws Exception {
    // 传入的token信息不存在就返回新的
    if (token == null || MyUtils.isEmpty(token.getToken())) {
      return makeNewToken();
    }
    // 数据库校验token信息，不存在就返回新的
    TbToken stoken = tbTokenDAO.queryToken(token);
    if (stoken == null) {
      return makeNewToken();
    }
    // 存在就更新
    tbTokenDAO.updateToken(stoken);
    return stoken;
  }

}
