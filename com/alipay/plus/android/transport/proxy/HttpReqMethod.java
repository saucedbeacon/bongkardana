package com.alipay.plus.android.transport.proxy;

import androidx.annotation.NonNull;
import com.alipay.plus.android.transport.sdk.HttpMethod;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpReqMethod {
    @NonNull
    HttpMethod value();
}
