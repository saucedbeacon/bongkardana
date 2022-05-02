package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.widget.Toast;
import com.alibaba.ariver.app.api.point.view.ToastPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;

public class ToastUtils {

    public @interface TYPE {
        public static final String TYPE_EXCEPTION = "exception";
        public static final String TYPE_FAILED = "fail";
        public static final String TYPE_SUCCESS = "success";
    }

    public static void showToast(Context context, String str, int i) {
        ToastPoint create = ExtensionPoint.as(ToastPoint.class).create();
        if (create != null) {
            create.showToast(context, str, i, "none", 0, 0);
        } else {
            Toast.makeText(context, str, i).show();
        }
    }

    public static void showToast(Context context, String str, @TYPE String str2, int i) {
        ToastPoint create = ExtensionPoint.as(ToastPoint.class).create();
        if (create != null) {
            create.showToast(context, str, i, str2, 0, 0);
        } else {
            Toast.makeText(context, str, i).show();
        }
    }
}
