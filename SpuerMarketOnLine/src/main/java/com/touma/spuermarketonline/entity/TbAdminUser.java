package com.touma.spuermarketonline.entity;

import java.util.Date;

import com.touma.spuermarketonline.base.BaseEntity;

/**
 * 
 * @author touma
 *
 */
public class TbAdminUser extends BaseEntity {

  private static final long serialVersionUID = 7790684520664449020L;

  private Integer auid;
  private String username;
  private String password;
  private String nickname;
  private String isEnable;
  private Date lastupdate;

  public TbAdminUser() {

  }

  public Integer getAuid() {
    return auid;
  }

  public void setAuid(Integer auid) {
    this.auid = auid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }

  public Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(Date lastupdate) {
    this.lastupdate = lastupdate;
  }

  public TbAdminUser(Integer auid, String username, String password, String nickname, String isEnable, Date lastupdate) {
    super();
    this.auid = auid;
    this.username = username;
    this.password = password;
    this.nickname = nickname;
    this.isEnable = isEnable;
    this.lastupdate = lastupdate;
  }

}
