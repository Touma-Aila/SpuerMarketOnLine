package com.touma.spuermarketonline.entity;

import java.util.Date;

import com.touma.spuermarketonline.base.BaseEntity;

/**
 * 
 * @author touma
 *
 */
public class TbSubType extends BaseEntity {

  private static final long serialVersionUID = -2574939424541014127L;

  private Integer stid;
  private Integer tid;
  private String subName;
  private String subInfo;
  private String isEnable;
  private Date lastupdateDate;

  public TbSubType() {

  }

  public Integer getStid() {
    return stid;
  }

  public void setStid(Integer stid) {
    this.stid = stid;
  }

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getSubInfo() {
    return subInfo;
  }

  public void setSubInfo(String subInfo) {
    this.subInfo = subInfo;
  }

  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }

  public Date getLastupdateDate() {
    return lastupdateDate;
  }

  public void setLastupdateDate(Date lastupdateDate) {
    this.lastupdateDate = lastupdateDate;
  }

  public TbSubType(int stid, int tid, String subName, String subInfo, String isEnable, Date lastupdateDate) {
    super();
    this.stid = stid;
    this.tid = tid;
    this.subName = subName;
    this.subInfo = subInfo;
    this.isEnable = isEnable;
    this.lastupdateDate = lastupdateDate;
  }

}
