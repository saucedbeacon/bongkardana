package com.iap.ac.android.rpc.http.proxy;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.rpc.model.HttpMethod;
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
