package com.alibaba.ariver.app.api.ui;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface DialogService extends Proxiable {
    void showErrorDialog(App app, boolean z);
}
