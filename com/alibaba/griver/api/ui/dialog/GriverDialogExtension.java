package com.alibaba.griver.api.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverDialogExtension extends GriverExtension {
    void applyShow(Dialog dialog, CreateDialogParam createDialogParam);

    Dialog createDialog(Activity activity, CreateDialogParam createDialogParam);
}
