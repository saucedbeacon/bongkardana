package com.alibaba.griver.core.h5;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.core.ui.GriverPage;
import com.alibaba.griver.h5.api.GriverSessionDataPoint;
import java.lang.ref.WeakReference;

public class GriverSessionDataExtension implements NodeAware<Page>, GriverSessionDataPoint {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Page> f10305a;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.f10305a = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void setData(JSONObject jSONObject) {
        WeakReference<Page> weakReference = this.f10305a;
        if (weakReference != null && weakReference.get() != null) {
            Page page = this.f10305a.get();
            if ((page instanceof GriverPage) && jSONObject != null) {
                for (String next : jSONObject.keySet()) {
                    ((GriverPage) page).getData().set(next, jSONObject.getString(next));
                }
            }
        }
    }

    public JSONObject getData(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        WeakReference<Page> weakReference = this.f10305a;
        if (!(weakReference == null || weakReference.get() == null)) {
            Page page = this.f10305a.get();
            if (page instanceof GriverPage) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getString(i);
                    jSONObject.put(string, (Object) ((GriverPage) page).getData().get(string));
                }
            }
        }
        return jSONObject;
    }
}
