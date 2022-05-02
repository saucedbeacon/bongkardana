package com.alibaba.griver.api.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverPromptExtension extends GriverExtension {
    void applyShow(Dialog dialog, GriverCreatePromptParam griverCreatePromptParam);

    Dialog createDialog(Activity activity, GriverCreatePromptParam griverCreatePromptParam);
}
