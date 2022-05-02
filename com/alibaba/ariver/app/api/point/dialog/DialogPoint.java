package com.alibaba.ariver.app.api.point.dialog;

import android.app.Activity;
import android.app.Dialog;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
@DefaultImpl("com.alibaba.ariver.jsapi.dialog.DefaultDialogImplExtension")
public interface DialogPoint extends Extension {
    Dialog createDialog(Activity activity, CreateDialogParam createDialogParam);
}
