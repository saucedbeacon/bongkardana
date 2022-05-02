package com.alibaba.griver.core.b.a;

import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.permission.view.LocalPermissionDialog;
import com.alibaba.ariver.permission.view.PermissionPermitListener;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.R;
import java.util.List;

public class a implements LocalPermissionDialog {

    /* renamed from: a  reason: collision with root package name */
    Context f10284a;
    private String b;
    private String c;
    /* access modifiers changed from: private */
    public PermissionPermitListener d;

    public a(Context context) {
        this.f10284a = context;
    }

    public void setDialogContent(List<String> list, String str, String str2, String str3) {
        this.b = str2;
        this.c = str;
    }

    public void setPermissionPermitListener(PermissionPermitListener permissionPermitListener) {
        this.d = permissionPermitListener;
    }

    public void show(Page page) {
        CreateDialogParam createDialogParam = new CreateDialogParam(this.b, this.c, this.f10284a.getString(R.string.griver_core_allow), this.f10284a.getString(R.string.griver_core_deny), (String) null);
        createDialogParam.cancelable = false;
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                a.this.d.onSuccess();
            }
        };
        createDialogParam.negativeListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                a.this.d.onFailed(-1, a.this.f10284a.getString(R.string.griver_core_user_unauthorized), true);
            }
        };
        ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).createDialog(GriverEnv.getTopActivity().get(), createDialogParam).show();
    }
}
