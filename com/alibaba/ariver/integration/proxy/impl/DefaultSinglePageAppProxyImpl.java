package com.alibaba.ariver.integration.proxy.impl;

import android.app.Activity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.proxy.RVSinglePageAppProxy;
import com.alibaba.ariver.integration.singlepage.SinglePageAppContext;
import com.alibaba.ariver.integration.singlepage.SinglePageContext;

public class DefaultSinglePageAppProxyImpl implements RVSinglePageAppProxy {
    public AppContext createAppContext(App app, Activity activity) {
        return new SinglePageAppContext(app, activity);
    }

    public PageContext createPageContext(App app, Activity activity) {
        return new SinglePageContext(app, activity);
    }
}
