package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import java.util.HashMap;
import java.util.Map;

public class AUAttrsUtils {
    public static final int HEIGHT = 1;
    public static final int MARGINBOTTOM = 5;
    public static final int MARGINLEFT = 2;
    public static final int MARGINRIGHT = 4;
    public static final int MARGINTOP = 3;
    public static final String TAG = "AUAttrsUtils";
    public static final int WIDTH = 0;

    public static Boolean isAP(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griverAUScreenAdapt);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.griverAUScreenAdapt_isAP, false);
        obtainStyledAttributes.recycle();
        return Boolean.valueOf(z);
    }

    public static int[] getViewSizeAndMargin(Context context, Map<String, Object> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = (String) map.get(AUAttrsConstant.VIEW_WIDTH);
        String str2 = (String) map.get(AUAttrsConstant.VIEW_HEIGHT);
        String str3 = (String) map.get(AUAttrsConstant.VIEW_MARGIN);
        String str4 = (String) map.get(AUAttrsConstant.VIEW_MARGIN_LEFT);
        String str5 = (String) map.get(AUAttrsConstant.VIEW_MARGIN_TOP);
        String str6 = (String) map.get(AUAttrsConstant.VIEW_MARGIN_RIGHT);
        String str7 = (String) map.get(AUAttrsConstant.VIEW_MARGIN_BOTTOM);
        int i6 = -2;
        if (TextUtils.equals(str, "-1")) {
            i = -1;
        } else if (TextUtils.equals(str, AUAttrsConstant.WRAP_CONTENT)) {
            i = -2;
        } else {
            i = AUScreenAdaptTool.getApFromAttrsStr(context, str);
        }
        if (TextUtils.equals(str2, "-1")) {
            i6 = -1;
        } else if (!TextUtils.equals(str2, AUAttrsConstant.WRAP_CONTENT)) {
            i6 = AUScreenAdaptTool.getApFromAttrsStr(context, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            i3 = AUScreenAdaptTool.getApFromAttrsStr(context, str3);
            i2 = i3;
            i5 = i2;
            i4 = i5;
        } else {
            int apFromAttrsStr = !TextUtils.isEmpty(str4) ? AUScreenAdaptTool.getApFromAttrsStr(context, str4) : 0;
            i5 = !TextUtils.isEmpty(str5) ? AUScreenAdaptTool.getApFromAttrsStr(context, str5) : 0;
            i4 = !TextUtils.isEmpty(str6) ? AUScreenAdaptTool.getApFromAttrsStr(context, str6) : 0;
            if (!TextUtils.isEmpty(str7)) {
                i2 = AUScreenAdaptTool.getApFromAttrsStr(context, str7);
                i3 = apFromAttrsStr;
            } else {
                i3 = apFromAttrsStr;
                i2 = 0;
            }
        }
        return new int[]{i, i6, i3, i5, i4, i2};
    }

    public static void replaceLayoutParam(Context context, ViewGroup.MarginLayoutParams marginLayoutParams, int[] iArr) {
        marginLayoutParams.width = chooseSizeAndMargin(context, marginLayoutParams.width, iArr[0]);
        marginLayoutParams.height = chooseSizeAndMargin(context, marginLayoutParams.height, iArr[1]);
        marginLayoutParams.setMargins(chooseSizeAndMargin(context, marginLayoutParams.leftMargin, iArr[2]), chooseSizeAndMargin(context, marginLayoutParams.topMargin, iArr[3]), chooseSizeAndMargin(context, marginLayoutParams.rightMargin, iArr[4]), chooseSizeAndMargin(context, marginLayoutParams.bottomMargin, iArr[5]));
    }

    public static int chooseSizeAndMargin(Context context, int i, int i2) {
        if (i2 > 0 || i <= 0) {
            return i2 <= 0 ? i : i2;
        }
        return AUScreenAdaptTool.getApFromPx(context, (float) i);
    }

    public static Map<String, Object> handleAttrs(AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        int attributeCount = attributeSet.getAttributeCount();
        if (attributeCount < 0) {
            return hashMap;
        }
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeValue != null) {
                hashMap.put(attributeName, attributeValue);
            }
        }
        return hashMap;
    }

    public static void adptApPadding(View view, Context context) {
        if (view != null) {
            view.setPadding(AUScreenAdaptTool.getApFromPx(context, (float) view.getPaddingLeft()), AUScreenAdaptTool.getApFromPx(context, (float) view.getPaddingTop()), AUScreenAdaptTool.getApFromPx(context, (float) view.getPaddingRight()), AUScreenAdaptTool.getApFromPx(context, (float) view.getPaddingBottom()));
        }
    }

    public static void adptApMinMax(View view, Context context) {
        if (view != null && view.getMinimumHeight() > 0) {
            view.setMinimumHeight(AUScreenAdaptTool.getApFromPx(context, (float) view.getMinimumHeight()));
        }
    }
}
