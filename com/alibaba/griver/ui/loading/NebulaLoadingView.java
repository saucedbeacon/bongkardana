package com.alibaba.griver.ui.loading;

import android.content.Context;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.griver.api.ui.loadingview.GVLoadingView;
import com.alibaba.griver.api.ui.loadingview.GriverLoadingViewExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class NebulaLoadingView implements GVLoadingView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f10587a;

    public NebulaLoadingView(Context context) {
        this.f10587a = context;
    }

    public void show(final String str, int i, final boolean z) {
        GriverLogger.d("NebulaLoadingView", "show loading: ".concat(String.valueOf(str)));
        if (i > 0) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).show(NebulaLoadingView.this.f10587a, str, z);
                }
            }, (long) i);
        } else {
            ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).show(this.f10587a, str, z);
        }
    }

    public void dismiss() {
        ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).dismiss();
    }

    public boolean backPressed() {
        return ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).onBackPressed();
    }
}
