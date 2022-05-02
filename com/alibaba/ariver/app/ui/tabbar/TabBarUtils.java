package com.alibaba.ariver.app.ui.tabbar;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;

@Keep
class TabBarUtils {
    private static final String TAG = "H5TabbarUtils";

    TabBarUtils() {
    }

    public static String getAbsoluteUrl(String str, Bundle bundle) {
        int indexOf;
        String string = BundleUtils.getString(bundle, "url");
        String absoluteUrlWithURLLib = !TextUtils.isEmpty(string) ? UrlUtils.getAbsoluteUrlWithURLLib(string, str) : null;
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(absoluteUrlWithURLLib) && !string.startsWith(absoluteUrlWithURLLib)) {
            return absoluteUrlWithURLLib;
        }
        Uri parse = Uri.parse(string);
        if (parse != null) {
            String encodedFragment = parse.getEncodedFragment();
            if (!TextUtils.isEmpty(encodedFragment) && (indexOf = encodedFragment.indexOf("?")) != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(absoluteUrlWithURLLib);
                sb.append(encodedFragment.substring(indexOf));
                absoluteUrlWithURLLib = sb.toString();
            }
        }
        RVLogger.d(TAG, "addHashQuery : ".concat(String.valueOf(absoluteUrlWithURLLib)));
        return absoluteUrlWithURLLib;
    }

    public static StateListDrawable generateEmptyTopDrawable() {
        return new TabStateListDrawable();
    }

    public static ColorStateList generateTextColor(int i, int i2) {
        int i3 = i2 | -16777216;
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[0]}, new int[]{i3, i3, i | -16777216});
    }

    public static void addCheckedState(StateListDrawable stateListDrawable, Drawable drawable) {
        if (!(stateListDrawable instanceof TabStateListDrawable)) {
            RVLogger.e(TAG, "tab addCheckedState invalid StateListDrawable");
        } else {
            ((TabStateListDrawable) stateListDrawable).addCheckedState(drawable);
        }
    }

    public static void addNormalState(StateListDrawable stateListDrawable, Drawable drawable) {
        if (!(stateListDrawable instanceof TabStateListDrawable)) {
            RVLogger.e(TAG, "tab addCheckedState invalid StateListDrawable");
        } else {
            ((TabStateListDrawable) stateListDrawable).addNormalState(drawable);
        }
    }
}
