package com.alibaba.griver.api.ui.loadingview;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.griver.api.common.GriverExtension;

@Keep
public interface GriverLoadingViewExtension extends GriverExtension {
    void dismiss();

    boolean onBackPressed();

    void show(Context context, String str, boolean z);
}
