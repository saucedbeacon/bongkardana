package com.alibaba.ariver.engine.common.extension.bind;

import java.lang.annotation.Annotation;

public interface Binder<A extends Annotation, T> {
    T bind(Class<T> cls, A a2);
}
