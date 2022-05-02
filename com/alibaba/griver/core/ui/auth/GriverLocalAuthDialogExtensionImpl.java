package com.alibaba.griver.core.ui.auth;

import android.content.Context;
import com.alibaba.ariver.permission.view.LocalPermissionDialog;
import com.alibaba.griver.api.ui.auth.GriverLocalAuthDialogExtension;
import com.alibaba.griver.core.b.a.a;

public class GriverLocalAuthDialogExtensionImpl implements GriverLocalAuthDialogExtension {
    public LocalPermissionDialog createDialog(Context context) {
        return new a(context);
    }
}
