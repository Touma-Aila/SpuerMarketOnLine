package com.touma.spuermarketonline.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.touma.spuermarketonline.utils.MyUtils;

/**
 * Double数值转换器
 *
 * @author touma
 *
 */
@Component
public class DoubleConverter implements Converter<String, Double> {

  @Override
  public Double convert(String source) {
    if (MyUtils.isEmpty(source)) {
      return null;
    }
    source = MyUtils.trim(source);
    try {
      return Double.valueOf(source);
    } catch (Exception ex) {
    }
    return null;
  }

}
