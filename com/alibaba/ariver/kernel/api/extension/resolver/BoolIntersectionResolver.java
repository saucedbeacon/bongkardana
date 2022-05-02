package com.alibaba.ariver.kernel.api.extension.resolver;

import java.util.List;

public class BoolIntersectionResolver implements ResultResolver<Boolean> {
    public Boolean resolve(List<Boolean> list) {
        if (list == null) {
            return Boolean.FALSE;
        }
        for (Boolean next : list) {
            if (next == null) {
                return Boolean.FALSE;
            }
            if (!next.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
