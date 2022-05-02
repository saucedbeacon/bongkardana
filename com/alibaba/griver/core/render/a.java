package com.alibaba.griver.core.render;

import android.app.Activity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.BaseRenderImpl;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.EventPoint;
import com.alibaba.griver.base.api.NXH5WebViewAdapter;
import com.alibaba.griver.core.ui.GriverPage;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class a extends BaseRenderImpl {
    private static Set<String> e;

    /* renamed from: a  reason: collision with root package name */
    protected GriverPage f9074a;
    protected Page b;
    protected App c;
    protected NXH5WebViewAdapter d;

    public abstract f a();

    static {
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add("h5PageJsParam");
        e.add("h5PageReload");
        e.add("h5ToolbarMenuBt");
        e.add("h5PageClose");
        e.add("h5PageClose_tab");
        e.add("stopLoading");
        e.add("exitSession");
        e.add(RVParams.LONG_SHOW_FAVORITES);
        e.add("hideFavorites");
        e.add("h5PageAbnormal");
        e.add("h5PageDoLoadUrl");
    }

    public a(RVEngine rVEngine, Activity activity, DataNode dataNode, CreateParams createParams) {
        super(rVEngine, activity, dataNode, createParams);
        if (dataNode instanceof Page) {
            this.f9074a = (GriverPage) dataNode;
            Page page = (Page) dataNode;
            this.b = page;
            this.c = page.getApp();
            return;
        }
        throw new IllegalArgumentException("node shoud must H5Page");
    }

    /* access modifiers changed from: protected */
    public void a(NXH5WebViewAdapter nXH5WebViewAdapter) {
        this.d = nXH5WebViewAdapter;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, JSONObject jSONObject) {
        if (!e.contains(str)) {
            return false;
        }
        return ExtensionPoint.as(EventPoint.class).node(getPage()).resolve(new ResultResolver() {
            public Object resolve(List list) {
                if (list == null) {
                    return Boolean.FALSE;
                }
                for (Object next : list) {
                    if ((next instanceof Boolean) && ((Boolean) next).booleanValue()) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }).create().sendEvent(str, jSONObject);
    }
}
