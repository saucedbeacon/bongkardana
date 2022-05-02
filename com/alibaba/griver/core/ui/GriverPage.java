package com.alibaba.griver.core.ui;

import android.os.Bundle;
import android.os.Parcel;
import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.griver.base.api.H5Data;
import com.alibaba.griver.base.api.H5DataProvider;
import com.alibaba.griver.base.api.H5EmbededViewProvider;
import com.alibaba.griver.base.api.INebulaPage;
import com.alibaba.griver.base.nebula.H5MemData;
import com.alibaba.griver.core.embedview.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GriverPage extends PageNode implements H5DataProvider, INebulaPage {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10363a;
    private H5EmbededViewProvider b;
    private boolean c;
    private Map<String, Object> d = new ConcurrentHashMap();
    protected INebulaPage.H5PageHandler h5PageHandler;
    protected H5Data mH5Data = new H5MemData();

    public GriverPage(App app, String str, Bundle bundle, Bundle bundle2) {
        super(app, str, bundle, bundle2);
    }

    public GriverPage(App app, String str, Bundle bundle, Bundle bundle2, boolean z) {
        super(app, str, bundle, bundle2, z);
    }

    public GriverPage(App app, String str, Bundle bundle, Bundle bundle2, EmbedType embedType) {
        super(app, str, bundle, bundle2, embedType);
    }

    public GriverPage(Parcel parcel) {
        super(parcel);
    }

    public void bindContext(PageContext pageContext) {
        super.bindContext(pageContext);
        this.b = new c(pageContext.getActivity(), this);
        this.f10363a = false;
        this.c = false;
    }

    public boolean ifContainsEmbedView() {
        return this.f10363a;
    }

    public void setContainsEmbedView(boolean z) {
        this.f10363a = z;
    }

    public H5EmbededViewProvider getEmbededViewProvider() {
        return this.b;
    }

    public void setExtra(String str, Object obj) {
        this.d.put(str, obj);
    }

    public Object getExtra(String str) {
        return this.d.get(str);
    }

    public void setHandler(INebulaPage.H5PageHandler h5PageHandler2) {
        this.h5PageHandler = h5PageHandler2;
    }

    public boolean ifContainsEmbedSurfaceView() {
        return this.c;
    }

    public void setContainsEmbedSurfaceView(boolean z) {
        this.c = z;
    }

    public H5Data getData() {
        return this.mH5Data;
    }

    public void setData(H5Data h5Data) {
        this.mH5Data = h5Data;
    }
}
