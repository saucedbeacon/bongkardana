package com.iap.ac.android.common.json.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ParameterizedTypeImpl implements ParameterizedType {
    private final Type[] args;
    private final Class raw;

    public Type getOwnerType() {
        return null;
    }

    public ParameterizedTypeImpl(Class cls, Type[] typeArr) {
        this.raw = cls;
        this.args = typeArr == null ? new Type[0] : typeArr;
    }

    public Type[] getActualTypeArguments() {
        return this.args;
    }

    public Type getRawType() {
        return this.raw;
    }
}
