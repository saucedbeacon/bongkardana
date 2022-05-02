package com.alibaba.ariver.app.api.point.dialog;

import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
@Keep
public interface AgreementConfirmPoint extends Extension {
    boolean hasPermission(App app, String str);

    void onAgreementClick(App app, String str);
}
