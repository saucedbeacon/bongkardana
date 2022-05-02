package com.alibaba.griver.core.jsapi.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.ui.dialog.GriverCreateDialogParam;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.core.ui.dialog.GriverDialog;

public class GriverUniformDialogExtension implements GriverDialogExtension {
    public void applyShow(Dialog dialog, CreateDialogParam createDialogParam) {
    }

    public Dialog createDialog(Activity activity, CreateDialogParam createDialogParam) {
        if (TextUtils.isEmpty(createDialogParam.getTitle()) && TextUtils.isEmpty(createDialogParam.getMessage())) {
            RVLogger.w("GriverUniformDialogExtension", "empty title and message");
        }
        GriverDialog.Builder builder = new GriverDialog.Builder(activity);
        if (!TextUtils.isEmpty(createDialogParam.getTitle())) {
            builder.title(createDialogParam.getTitle());
        }
        if (!TextUtils.isEmpty(createDialogParam.getMessage())) {
            builder.message(createDialogParam.getMessage());
        }
        builder.positiveString(createDialogParam.getPositiveString()).positiveListener(createDialogParam.positiveListener).positiveTextColor(createDialogParam.positiveTextColor);
        builder.negativeString(createDialogParam.getNegativeString()).negativeListener(createDialogParam.negativeListener).negativeTextColor(createDialogParam.negativeTextColor);
        builder.align(createDialogParam.getAlign());
        builder.cancelable(createDialogParam.cancelable);
        builder.cancelListener(createDialogParam.cancelListener);
        if (createDialogParam instanceof GriverCreateDialogParam) {
            builder.view(((GriverCreateDialogParam) createDialogParam).customView);
        }
        return builder.create();
    }
}
