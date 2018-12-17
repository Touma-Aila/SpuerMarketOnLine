package com.touma.spuermarketonline.entity;

import java.util.Date;

import com.touma.spuermarketonline.base.BaseEntity;

/**
 * 
 * @author touma
 *
 */
public class TbConfig extends BaseEntity {

  private static final long serialVersionUID = -5532036828706417055L;

  private String configKey;
  private String configValue;
  private Date lastupdate;

  public TbConfig() {
  }

  public String getConfigKey() {
    return configKey;
  }

  public void setConfigKey(String configKey) {
    this.configKey = configKey;
  }

  public String getConfigValue() {
    return configValue;
  }

  public void setConfigValue(String configValue) {
    this.configValue = configValue;
  }

  public Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }

  public TbConfig(String configKey, String configValue, Date lastupdate) {
    super();
    this.configKey = configKey;
    this.configValue = configValue;
    this.lastupdate = lastupdate;
  }

}
