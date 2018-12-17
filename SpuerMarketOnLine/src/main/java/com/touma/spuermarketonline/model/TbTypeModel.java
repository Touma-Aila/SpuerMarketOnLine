package com.touma.spuermarketonline.model;

import com.touma.spuermarketonline.base.BasePageModel;
import com.touma.spuermarketonline.entity.TbType;

/**
 * TbType模型层
 * 
 * @author touma
 *
 */
public class TbTypeModel extends BasePageModel {

  private static final long serialVersionUID = 4885782501728876565L;

  private TbType tbType = new TbType();

  public TbTypeModel() {

  }

  public TbType getTbType() {
    return tbType;
  }

  public void setTbType(TbType tbType) {
    this.tbType = tbType;
  }

}
