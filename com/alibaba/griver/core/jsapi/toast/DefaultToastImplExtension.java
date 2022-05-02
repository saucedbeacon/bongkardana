package com.alibaba.griver.core.jsapi.toast;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.point.view.ToastPoint;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AndroidVersionUtils;
import com.alibaba.griver.core.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

@Keep
public class DefaultToastImplExtension implements ToastPoint {
    private static final int MAX_DURATION = 5000;
    private static final String TAG = "DefaultToastImplExtension";
    private PopupWindowToast mSuperToast = null;
    private Toast toast;

    public void onInitialized() {
    }

    public void showToast(Context context, String str, int i, String str2, int i2, int i3) {
        try {
            int imageResId = getImageResId(str2);
            if (!isNotifyAllowed(context)) {
                if (context instanceof Activity) {
                    GriverLogger.d(TAG, "use PopupWindow toast");
                    showPopupWindowToast(context, str, imageResId, i);
                    return;
                }
            }
            GriverLogger.d(TAG, "use system toast");
            showSysToast(context, str, imageResId, i, i2, i3);
        } catch (Exception e) {
            RVLogger.e("", (Throwable) e);
        }
    }

    private void showPopupWindowToast(Context context, String str, int i, int i2) {
        PopupWindowToast popupWindowToast = new PopupWindowToast((Activity) context, i);
        this.mSuperToast = popupWindowToast;
        popupWindowToast.setMessage((CharSequence) str);
        if (i2 == 1) {
            this.mSuperToast.showTime(PopupWindowToast.LONG_DELAY);
        } else if (i2 == 0) {
            this.mSuperToast.showTime(2000);
        } else {
            this.mSuperToast.showTime(Math.min(i2, 5000));
        }
        this.mSuperToast.show();
    }

    private void showSysToast(Context context, String str, int i, int i2, int i3, int i4) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.griver_core_toast, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.h5_mini_toast_icon);
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.h5_mini_toast_text);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        inflate.getBackground().setAlpha(PsExtractor.AUDIO_STREAM);
        this.toast = new Toast(context);
        if (!AndroidVersionUtils.isRAndAbove() || GriverEnv.isForeground()) {
            this.toast.setView(inflate);
        } else {
            this.toast.setText(str);
        }
        this.toast.setGravity(17, i3, i4);
        int i5 = 1;
        if (i2 <= 2000 && i2 != 1) {
            i5 = 0;
        }
        this.toast.setDuration(i5);
        this.toast.show();
    }

    private int getImageResId(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 3135262) {
                if (hashCode == 1481625679 && str.equals("exception")) {
                    c = 2;
                }
            } else if (str.equals("fail")) {
                c = 1;
            }
        } else if (str.equals("success")) {
            c = 0;
        }
        if (c == 0) {
            return R.drawable.griver_core_toast_ok;
        }
        if (c == 1) {
            return R.drawable.griver_core_toast_false;
        }
        if (c != 2) {
            return 0;
        }
        return R.drawable.griver_core_toast_exception;
    }

    public void hideToast() {
        Toast toast2 = this.toast;
        if (toast2 != null) {
            try {
                toast2.cancel();
                GriverLogger.d(TAG, "toast hided");
            } catch (Throwable th) {
                RVLogger.e(TAG, "hideToast error!", th);
            }
        }
        PopupWindowToast popupWindowToast = this.mSuperToast;
        if (popupWindowToast != null) {
            popupWindowToast.dismiss();
        }
    }

    public static boolean isNotifyAllowed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return i < 18 || 1 != checkOp(context, 11);
        }
        Object systemService = context.getSystemService("notification");
        try {
            int intValue = ((Integer) systemService.getClass().getDeclaredMethod("getImportance", new Class[0]).invoke(systemService, new Object[0])).intValue();
            GriverLogger.d(TAG, "notification importance: ".concat(String.valueOf(intValue)));
            return intValue != 0;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("isNotifyChangedAllowed");
            sb.append(th.getMessage());
            GriverLogger.e(TAG, sb.toString());
            return true;
        }
    }

    public static int checkOp(Context context, int i) {
        Object systemService = context.getSystemService("appops");
        Class<?> cls = systemService.getClass();
        try {
            return ((Integer) cls.getDeclaredMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(systemService, new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName()})).intValue();
        } catch (Throwable th) {
            GriverLogger.e(TAG, th.getMessage());
            return -1;
        }
    }

    public void onFinalized() {
        this.toast = null;
        this.mSuperToast = null;
    }
}
