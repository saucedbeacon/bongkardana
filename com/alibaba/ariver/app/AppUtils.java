package com.alibaba.ariver.app;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.fastjson.JSONObject;

public class AppUtils {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8945a = false;
    private static int b;
    private static int c;
    private static float d;

    public static void sendToApp(@NonNull App app, String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback) {
        Page activePage = app.getActivePage();
        if (activePage != null && activePage.getRender() != null) {
            EngineUtils.sendToRender(activePage.getRender(), str, jSONObject, sendToRenderCallback);
        }
    }

    public static int getContainerWidth(PageContext pageContext) {
        if ((pageContext.getContentView() != null ? pageContext.getContentView().getWidth() : 0) <= 0) {
            a(pageContext.getActivity());
        }
        return b;
    }

    public static int getContainerHeight(PageContext pageContext) {
        if ((pageContext.getContentView() != null ? pageContext.getContentView().getHeight() : 0) <= 0) {
            a(pageContext.getActivity());
        }
        return c;
    }

    private static void a(Context context) {
        if (!f8945a) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            d = displayMetrics.density;
            if (i < i2) {
                b = i;
                c = i2;
            } else {
                b = i2;
                c = i;
            }
            f8945a = true;
        }
    }
}
