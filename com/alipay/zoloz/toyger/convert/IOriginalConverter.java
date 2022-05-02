package com.alipay.zoloz.toyger.convert;

public interface IOriginalConverter<T> {
    T converter(Object obj);
}
