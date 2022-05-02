package com.alibaba.griver.ui.loading;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.Keep;
import com.alibaba.griver.api.ui.loadingview.GriverLoadingViewExtension;
import java.lang.ref.WeakReference;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public class GriverDefaultLoadingView implements GriverLoadingViewExtension {
    private WeakReference<GriverLoadingDialog> referenceDialog;

    public void show(Context context, String str, boolean z) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1241716837, oncanceled);
                onCancelLoad.getMin(1241716837, oncanceled);
            }
        }
        synchronized (this) {
            if (Looper.getMainLooper() == Looper.myLooper() && context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
                dismiss();
                GriverLoadingDialog griverLoadingDialog = new GriverLoadingDialog(context);
                griverLoadingDialog.setMessage(str);
                griverLoadingDialog.setCancelable(z);
                griverLoadingDialog.show();
                this.referenceDialog = new WeakReference<>(griverLoadingDialog);
            }
        }
    }

    public void dismiss() {
        GriverLoadingDialog griverLoadingDialog;
        synchronized (this) {
            if (!(Looper.getMainLooper() != Looper.myLooper() || this.referenceDialog == null || (griverLoadingDialog = this.referenceDialog.get()) == null)) {
                griverLoadingDialog.dismiss();
                this.referenceDialog.clear();
            }
        }
    }

    public boolean onBackPressed() {
        GriverLoadingDialog griverLoadingDialog;
        synchronized (this) {
            if (this.referenceDialog == null || (griverLoadingDialog = this.referenceDialog.get()) == null || !griverLoadingDialog.isShowing()) {
                return false;
            }
            dismiss();
            return true;
        }
    }
}
