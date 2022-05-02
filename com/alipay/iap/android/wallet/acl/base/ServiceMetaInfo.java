package com.alipay.iap.android.wallet.acl.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceMetaInfo {
    ServiceCategory category() default ServiceCategory.FOUNDATION;

    String serviceName() default "";

    ServiceType type() default ServiceType.UNKNOWN;
}
