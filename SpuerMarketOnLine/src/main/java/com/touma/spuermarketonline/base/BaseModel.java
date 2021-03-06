package com.touma.spuermarketonline.base;

import com.touma.spuermarketonline.entity.TbToken;
import com.touma.spuermarketonline.entity.TbTokenInfo;

/**
 * model层（获取客户端数据）基础类
 *
 * @author touma
 *
 */
public abstract class BaseModel extends BaseEntity {

  private static final long serialVersionUID = -9188998793975747208L;

  /**
   * token-客户端标识，由服务器端管理，客户端每次都需要提交该数据
   */
  private String token;

  public BaseModel() {
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * getToken的委托方法，将客户端获取的token信息转递给TbToken对象
   *
   * @return 传递结果
   */
  public TbToken makeTbToken() {
    TbToken tbToken = new TbToken();
    tbToken.setToken(token);
    return tbToken;
  }

  /**
   * getToken的委托方法，将客户端获取的token信息转递给TbTokenInfo对象
   *
   * @return 传递结果
   */
  public TbTokenInfo makeTbTokenInfo() {
    TbTokenInfo info = new TbTokenInfo();
    info.setToken(token);
    return info;
  }

}
