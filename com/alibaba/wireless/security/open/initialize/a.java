package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;

public class a implements IInitializeComponent {

    /* renamed from: a  reason: collision with root package name */
    b f9223a;

    public a() {
        this.f9223a = new b();
    }

    public a(String str) {
        this.f9223a = new b(str);
    }

    public ISGPluginManager a() {
        return this.f9223a.a();
    }

    public int initialize(Context context) throws SecException {
        return loadLibrarySync(context);
    }

    public void initializeAsync(Context context) {
        try {
            loadLibraryAsync(context);
        } catch (SecException unused) {
        }
    }

    public boolean isSoValid(Context context) throws SecException {
        return this.f9223a.a(context);
    }

    public void loadLibraryAsync(Context context) throws SecException {
        this.f9223a.b(context, (String) null, true, false);
    }

    public int loadLibrarySync(Context context) throws SecException {
        return this.f9223a.a(context, (String) null, true, false);
    }

    public int loadLibrarySync(Context context, String str) throws SecException {
        return this.f9223a.a(context, str, true, false);
    }

    public void registerInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        this.f9223a.a(iInitFinishListener);
    }

    public void unregisterInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        this.f9223a.b(iInitFinishListener);
    }
}
