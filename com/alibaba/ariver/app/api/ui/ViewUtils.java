package com.alibaba.ariver.app.api.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import io.reactivex.annotations.SchedulerSupport;

public class ViewUtils {
    public static int specToLayoutParam(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        return mode == 0 ? -2 : -1;
    }

    public static boolean isTransparentTitle(@NonNull Bundle bundle, String str) {
        boolean z = false;
        boolean z2 = TextUtils.equals(RVStartParams.TRANSPARENT_TITLE_ALWAYS, str) || TextUtils.equals("auto", str);
        if (z2) {
            return true;
        }
        if (!TextUtils.equals(SchedulerSupport.CUSTOM, str) || !bundle.containsKey("backBtnImage") || !bundle.containsKey(RVParams.LONG_BACKBTN_TEXTCOLOR) || !bundle.containsKey("titleColor")) {
            return z2;
        }
        String string = BundleUtils.getString(bundle, "backBtnImage");
        int i = BundleUtils.getInt(bundle, RVParams.LONG_BACKBTN_TEXTCOLOR);
        int i2 = BundleUtils.getInt(bundle, "titleColor");
        if (!((TextUtils.isEmpty(string) || TextUtils.equals(string, "default")) && i == -16777216 && i2 == -16777216)) {
            z = true;
        }
        return z;
    }
}
