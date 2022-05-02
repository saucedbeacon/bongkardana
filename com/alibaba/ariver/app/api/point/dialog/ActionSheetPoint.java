package com.alibaba.ariver.app.api.point.dialog;

import android.app.Dialog;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import java.util.ArrayList;

@AutoExtension
public interface ActionSheetPoint extends Extension {
    Dialog getActionSheet(CreateActionSheetParam createActionSheetParam);

    void onRelease();

    void updateActionSheetContent(ArrayList<String> arrayList);
}
