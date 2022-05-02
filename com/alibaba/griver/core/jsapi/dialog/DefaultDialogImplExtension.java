package com.alibaba.griver.core.jsapi.dialog;

import android.app.Activity;
import android.app.Dialog;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;

@Keep
public class DefaultDialogImplExtension implements DialogPoint {
    private static final String TAG = "AriverAPI:DefaultDialogImplExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Dialog createDialog(Activity activity, CreateDialogParam createDialogParam) {
        if (activity != null && !activity.isFinishing()) {
            return ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).createDialog(activity, createDialogParam);
        }
        RVLogger.d(TAG, "activity is finishing");
        return null;
    }
}
