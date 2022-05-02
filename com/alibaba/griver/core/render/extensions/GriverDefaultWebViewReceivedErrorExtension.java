package com.alibaba.griver.core.render.extensions;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.griver.api.webview.GriverWebViewReceivedErrorExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.core.render.e;
import com.alibaba.griver.core.utils.g;
import o.getTabbarModel;

@Keep
public class GriverDefaultWebViewReceivedErrorExtension implements GriverWebViewReceivedErrorExtension {
    private static final String TAG = "GriverDefaultWebViewReceivedErrorExtension";

    public void showError(Page page, String str, int i) {
        String a2 = g.a(i, false);
        String a3 = g.a(i, true);
        Render render = page.getRender();
        if (render instanceof c) {
            showDefaultErrorPage(page, (c) render, str, i, a2, a3);
        }
    }

    private void showDefaultErrorPage(final Page page, c cVar, String str, int i, String str2, String str3) {
        String readAsset = IOUtils.readAsset(GriverEnv.getResources(), ErrorPageUtils.getH5ErrorPage());
        if (readAsset != null) {
            cVar.loadDataWithBaseURL(str, readAsset.replaceAll("&&&&", str2).replaceAll("!!!!", String.valueOf(i)), "text/html", getTabbarModel.ENC, str);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    e d;
                    Render render = page.getRender();
                    if ((render instanceof c) && (d = ((c) render).d()) != null) {
                        d.a();
                        d.b();
                    }
                }
            }, 300);
        }
    }
}
