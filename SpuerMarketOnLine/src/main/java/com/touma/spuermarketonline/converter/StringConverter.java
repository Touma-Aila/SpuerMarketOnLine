package com.touma.spuermarketonline.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.touma.spuermarketonline.utils.MyUtils;

/**
 * String数值转换器
 *
 * @author touma
 *
 */
@Component
public class StringConverter implements Converter<String, String> {

  @Override
  public String convert(String source) {
    return MyUtils.trim(source);
  }

}
