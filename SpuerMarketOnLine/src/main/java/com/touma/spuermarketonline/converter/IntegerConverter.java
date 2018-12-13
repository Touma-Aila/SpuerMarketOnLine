package com.touma.spuermarketonline.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.touma.spuermarketonline.utils.MyUtils;

/**
 * Integer数值转换器
 *
 * @author touma
 *
 */
@Component
public class IntegerConverter implements Converter<String, Integer> {

  @Override
  public Integer convert(String source) {
    if (MyUtils.isEmpty(source)) {
      return null;
    }
    source = MyUtils.trim(source);
    try {
      return Integer.parseInt(source);
    } catch (Exception ex) {
    }
    return null;
  }

}
