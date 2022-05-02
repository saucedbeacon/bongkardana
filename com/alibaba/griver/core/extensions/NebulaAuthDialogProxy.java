package com.alibaba.griver.core.extensions;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.permission.api.proxy.AuthDialogProxy;
import com.alibaba.ariver.permission.model.AuthProtocol;
import com.alibaba.ariver.permission.view.IOpenAuthDialog;
import com.alibaba.ariver.permission.view.IOpenAuthNoticeDialog;
import com.alibaba.ariver.permission.view.LocalPermissionDialog;
import com.alibaba.griver.api.ui.auth.GriverLocalAuthDialogExtension;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.R;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class NebulaAuthDialogProxy implements AuthDialogProxy {
    public IOpenAuthDialog getOpenAuthDialog(Context context) {
        return new IOpenAuthDialog() {
            public void cancel() {
            }

            public void setContent(String str, String str2, App app, List<String> list, List<String> list2, List<AuthProtocol> list3, String str3, Map<String, String> map) {
            }

            public void setOnCloseClickListener(View.OnClickListener onClickListener) {
            }

            public void setOnConfirmClickListener(View.OnClickListener onClickListener) {
            }

            public void show() {
            }
        };
    }

    public IOpenAuthNoticeDialog getAuthNoticeDialog(Context context) {
        return new IOpenAuthNoticeDialog() {
            public void cancel() {
            }

            public void setNegativeListener(View.OnClickListener onClickListener) {
            }

            public void setPositiveListener(View.OnClickListener onClickListener) {
            }

            public void show() {
            }
        };
    }

    public void showErrorTipDialog(Context context, String str, String str2) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1941721925, oncanceled);
                onCancelLoad.getMin(-1941721925, oncanceled);
            }
        }
        CreateDialogParam createDialogParam = new CreateDialogParam(str, str2, context.getString(R.string.griver_base_confirm), (String) null, (String) null);
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(1127305394, oncanceled);
                    onCancelLoad.getMin(1127305394, oncanceled);
                }
                dialogInterface.dismiss();
            }
        };
        ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).createDialog(GriverEnv.getTopActivity().get(), createDialogParam).show();
    }

    public LocalPermissionDialog getLocalPermissionDialog(Context context) {
        return ((GriverLocalAuthDialogExtension) RVProxy.get(GriverLocalAuthDialogExtension.class)).createDialog(context);
    }
}
