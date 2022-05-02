package com.alibaba.griver.ui.ant.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.griver.ui.ant.api.AUViewInterface;

public class AUDialog extends AUBasicDialog implements AUViewInterface {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f10549a;

    public AUDialog(Context context) {
        super(context);
    }

    public AUDialog(Context context, int i) {
        super(context, i);
    }

    public AUDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    public Boolean isAP() {
        return this.f10549a;
    }

    public void setAP(Boolean bool) {
        this.f10549a = bool;
    }
}
