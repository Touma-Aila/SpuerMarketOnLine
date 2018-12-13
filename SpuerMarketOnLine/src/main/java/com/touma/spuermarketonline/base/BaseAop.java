package com.touma.spuermarketonline.base;

import org.aspectj.lang.annotation.Pointcut;

/**
 * aop的基础类，配置切面
 *
 * @author touma
 *
 */
public abstract class BaseAop {
  /**
   * -控制器切面
   */
  @Pointcut("execution(public * com.touma.spuermarketonline.controller..*.*(..))")
  public void controllerPointcut() {
  }

}
