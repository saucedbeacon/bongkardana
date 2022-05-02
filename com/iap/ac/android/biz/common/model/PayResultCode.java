package com.iap.ac.android.biz.common.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface PayResultCode {
    public static final String PAY_FAILURE = "PAY_FAILURE";
    public static final String PAY_PENDING = "PAY_PENDING";
    public static final String PAY_SUCCESS = "PAY_SUCCESS";
    public static final String PAY_USER_CANCEL = "USER_CANCEL";
}
