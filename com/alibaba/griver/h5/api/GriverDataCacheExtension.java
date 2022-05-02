package com.alibaba.griver.h5.api;

import com.alibaba.griver.api.common.GriverExtension;

public interface GriverDataCacheExtension extends GriverExtension {
    String get(String str);

    boolean has(String str);

    void remove(String str);

    void set(String str, String str2);

    void set(String str, String str2, boolean z);
}
