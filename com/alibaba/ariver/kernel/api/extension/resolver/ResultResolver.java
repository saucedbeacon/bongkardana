package com.alibaba.ariver.kernel.api.extension.resolver;

import java.util.List;

public interface ResultResolver<T> {
    public static final ResultResolver<Boolean> INTERSECTION_BOOL_RESOLVER = new BoolIntersectionResolver();
    public static final ResultResolver<Boolean> POSITIVE_RESOLVER = new BoolPositiveResolver();

    T resolve(List<T> list);
}
