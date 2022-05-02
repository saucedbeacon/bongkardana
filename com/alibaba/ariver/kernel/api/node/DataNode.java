package com.alibaba.ariver.kernel.api.node;

import androidx.annotation.Nullable;

public interface DataNode extends Node {
    @Nullable
    <T> T getData(Class<T> cls);

    <T> T getData(Class<T> cls, boolean z);

    <T> void setData(Class<T> cls, T t);
}
