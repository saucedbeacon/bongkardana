package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.AUViewInterface;
import java.util.HashMap;

public class AUScreenUtils {

    /* renamed from: a  reason: collision with root package name */
    private static String f10571a = "";
    private static Boolean b;
    private static HashMap<String, Boolean> c = new HashMap<>();

    public static void setWhiteListAP(String str, Object obj) {
        if (obj != null && obj.getClass().getName().equals("com.alipay.android.phone.home.widget.HomeWidgetGroup")) {
            if ("emptyList".equals(str)) {
                str = "";
            }
            f10571a = str;
        }
    }

    public static boolean checkApFlag(Context context, AttributeSet attributeSet, AUViewInterface aUViewInterface) {
        String str;
        if (b == null) {
            b = Boolean.valueOf(Float.compare(AUScreenAdaptTool.getAPDensity(context), AUScreenAdaptTool.getDensity(context)) == 0);
        }
        Boolean bool = b;
        if ((bool != null && bool.booleanValue()) || TextUtils.isEmpty(f10571a) || !f10571a.contains(context.getClass().getName())) {
            return false;
        }
        if (aUViewInterface instanceof View) {
            ViewParent parent = ((View) aUViewInterface).getParent();
            if (aUViewInterface.isAP() == null && (parent instanceof AUViewInterface)) {
                aUViewInterface.setAP(((AUViewInterface) parent).isAP());
            }
        }
        if (attributeSet != null) {
            str = String.valueOf(attributeSet.hashCode());
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griverAUScreenAdapt);
            if (obtainStyledAttributes.hasValue(R.styleable.griverAUScreenAdapt_isAP) && aUViewInterface != null) {
                aUViewInterface.setAP(Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.griverAUScreenAdapt_isAP, false)));
            } else if (c.containsKey(str)) {
                return c.get(str).booleanValue();
            } else {
                for (StackTraceElement className : Thread.currentThread().getStackTrace()) {
                    if (TextUtils.equals(className.getClassName(), "com.alipay.android.phone.discovery.o2ohome.O2oWidgetGroup")) {
                        c.put(str, Boolean.FALSE);
                        return false;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        } else {
            str = "";
        }
        if (aUViewInterface != null && aUViewInterface.isAP() != null) {
            return aUViewInterface.isAP().booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            c.put(str, Boolean.TRUE);
        }
        return true;
    }
}
