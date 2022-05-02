package com.facebook.stetho.inspector.elements.android;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.android.HandlerUtil;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import java.util.List;

public final class AndroidDocumentProviderFactory implements DocumentProviderFactory, ThreadBound {
    private final Application mApplication;
    private final List<DescriptorProvider> mDescriptorProviders;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public AndroidDocumentProviderFactory(Application application, List<DescriptorProvider> list) {
        this.mApplication = (Application) Util.throwIfNull(application);
        this.mDescriptorProviders = (List) Util.throwIfNull(list);
    }

    public final DocumentProvider create() {
        return new AndroidDocumentProvider(this.mApplication, this.mDescriptorProviders, this);
    }

    public final boolean checkThreadAccess() {
        return HandlerUtil.checkThreadAccess(this.mHandler);
    }

    public final void verifyThreadAccess() {
        HandlerUtil.verifyThreadAccess(this.mHandler);
    }

    public final <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
        return HandlerUtil.postAndWait(this.mHandler, uncheckedCallable);
    }

    public final void postAndWait(Runnable runnable) {
        HandlerUtil.postAndWait(this.mHandler, runnable);
    }

    public final void postDelayed(Runnable runnable, long j) {
        if (!this.mHandler.postDelayed(runnable, j)) {
            throw new RuntimeException("Handler.postDelayed() returned false");
        }
    }

    public final void removeCallbacks(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
