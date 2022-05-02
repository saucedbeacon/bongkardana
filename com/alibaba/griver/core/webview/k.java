package com.alibaba.griver.core.webview;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;
import java.util.Map;

public class k extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, View> f10393a = new HashMap();

    public k(@NonNull Context context) {
        super(context);
    }

    public void setAndroidWebView(WebView webView) {
        addViewInLayout(webView, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(String str) {
        View remove = this.f10393a.remove(str);
        if (remove != null) {
            removeView(remove);
        }
    }

    public void a(String str, @Nullable View view, int i, int i2, int i3, int i4) {
        if (this.f10393a.containsKey(str)) {
            RVLogger.w("AndroidWebViewDelegateView", "addEmbedView just modify view param!");
            View view2 = this.f10393a.get(str);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.topMargin = i3;
            layoutParams.leftMargin = i4;
            layoutParams.width = i;
            layoutParams.height = i2;
            view2.setLayoutParams(layoutParams);
        } else if (str == null || view == null) {
            StringBuilder sb = new StringBuilder("addEmbedView param error! id: ");
            sb.append(str);
            sb.append(" embedView: ");
            sb.append(view);
            RVLogger.w("AndroidWebViewDelegateView", sb.toString());
        } else {
            a aVar = new a(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
            layoutParams2.topMargin = i3;
            layoutParams2.leftMargin = i4;
            aVar.addView(view, layoutParams2);
            this.f10393a.put(str, aVar);
            addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        for (View next : this.f10393a.values()) {
            next.offsetLeftAndRight(-i5);
            next.offsetTopAndBottom(-i6);
        }
    }

    static class a extends FrameLayout {
        public a(@NonNull Context context) {
            super(context);
        }
    }
}
