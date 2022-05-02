package com.alibaba.ariver.app.proxy;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.integration.proxy.impl.DefaultScreenOrientationProxyImpl")
public interface RVScreenOrientationProxy extends Proxiable {
    String getScreenOrientation(Activity activity);

    boolean setScreenOrientation(Activity activity, String str, Page page);
}
