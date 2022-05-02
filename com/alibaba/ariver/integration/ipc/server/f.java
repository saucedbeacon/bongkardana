package com.alibaba.ariver.integration.ipc.server;

import android.app.Activity;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.integration.ipc.server.a.b;
import com.alibaba.ariver.integration.ipc.server.a.c;

class f {
    static void a(Page page) {
        if ((page instanceof PageNode) && page.getRender() == null) {
            ((PageNode) page).setRender(new c(page.getApp().getEngineProxy(), (Activity) null, page, (CreateParams) null));
        }
    }

    static void a(App app) {
        if ((app instanceof AppNode) && app.getEngineProxy() == null) {
            ((AppNode) app).setEngineProxy(new b(app));
        }
    }
}
