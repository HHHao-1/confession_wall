package com.hao.confessionswall.wxwall.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author hao
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface AccessLimit {
  //  int seconds();
  //  int maxCount();
  boolean needLogin() default true;
  
  boolean needAuth() default true;
}
