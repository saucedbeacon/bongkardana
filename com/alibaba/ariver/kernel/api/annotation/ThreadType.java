package com.alibaba.ariver.kernel.api.annotation;

import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ThreadType {
    String[] transSyncThreadNames() default {};

    ExecutorType value() default ExecutorType.SYNC;
}
