package com.alibaba.griver.api.common.page;

import android.content.Context;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverStartPageFailedExtension extends GriverExtension {
    void startFailed(Throwable th, Context context);
}
