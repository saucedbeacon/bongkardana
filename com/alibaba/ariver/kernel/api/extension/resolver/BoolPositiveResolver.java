package com.alibaba.ariver.kernel.api.extension.resolver;

import java.util.Iterator;
import java.util.List;

public class BoolPositiveResolver implements ResultResolver<Boolean> {
    public Boolean resolve(List<Boolean> list) {
        boolean z;
        if (list != null) {
            Iterator<Boolean> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Boolean next = it.next();
                if (next != null && next.booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
