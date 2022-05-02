package com.alibaba.griver.api.activity;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverActivityRestoreExtension extends GriverExtension {
    void restore(Context context, String str, Bundle bundle);
}
