package com.alibaba.ariver.permission.api.proxy;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper;

public interface H5OpenAuthProxy extends Proxiable {
    void addOpenAuthHelper(String str, RVOpenAuthHelper rVOpenAuthHelper, @Nullable Page page);

    void startH5OpenAuth(String str, String str2, Bundle bundle);
}
