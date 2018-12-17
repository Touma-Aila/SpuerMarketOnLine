package com.touma.spuermarketonline.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.touma.spuermarketonline.dao.TbTypeDAO;
import com.touma.spuermarketonline.entity.TbType;
import com.touma.spuermarketonline.model.TbTypeModel;
import com.touma.spuermarketonline.service.TypeService;
import com.touma.spuermarketonline.utils.JsonMessage;
import com.touma.spuermarketonline.utils.MyUtils;
import com.touma.spuermarketonline.utils.PageBean;

/**
 * 
 * @author touma
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TypeServiceImpl implements TypeService {

  @Autowired
  private TbTypeDAO tbTypeDAO;

  @Override
  public JsonMessage queryAll(TbTypeModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbType> list = (Page<TbType>) tbTypeDAO.queryAll();
    page.setPageInfo(list);
    message.getDatas().put("page", page);
    message.getDatas().put("list", list);
    return message;
  }

  @Override
  public JsonMessage add(TbTypeModel model) throws Exception {
    TbType tbType = model.getTbType();
    if (MyUtils.isEmpty(tbType.getTypeName())) {
      return JsonMessage.getFail("分类名称必须填写");
    }
    if (MyUtils.isEmpty(tbType.getTypeInfo())) {
      return JsonMessage.getFail("分类描述必须填写");
    }
    TbType check = tbTypeDAO.queryByName(tbType);
    if (check != null) {
      return JsonMessage.getFail("分类名称不存在");
    }
    int result = tbTypeDAO.add(model.getTbType());
    return result == 1 ? JsonMessage.getSuccess("添加成功") : JsonMessage.getFail("添加失败");
  }
}
