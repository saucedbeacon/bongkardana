package com.alipay.iap.android.common.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    private static long currentThreadID = 1;
    private static Toast toast;

    private ToastUtil() {
    }

    public static Toast showMsg(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (toast == null || currentThreadID != Thread.currentThread().getId()) {
            Toast makeText = Toast.makeText(context.getApplicationContext(), str, 0);
            toast = makeText;
            makeText.setGravity(17, 0, 0);
            currentThreadID = Thread.currentThread().getId();
        } else {
            toast.setText(str);
        }
        toast.show();
        return toast;
    }
}
