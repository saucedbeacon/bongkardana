package com.iap.ac.android.gradient;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.gradient.pluginloader.listener.OnPluginLoadedListener;
import com.iap.ac.android.gradient.pluginloader.loader.PluginLoader;
import com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class Gradient extends com.iap.ac.android.gradient.a.a implements PluginLoader {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Gradient f11050a = new Gradient();
    }

    public static Gradient getInstance() {
        return a.f11050a;
    }

    public synchronized void initialize(@NonNull Context context, String str) {
        Context context2;
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            context2 = null;
        }
        if (context2 != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(context2, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-2076007201, oncanceled);
                onCancelLoad.getMin(-2076007201, oncanceled);
            }
        }
        ACLog.i(com.iap.ac.android.gradient.a.a.TAG, "initialize begin");
        if (isGradientEnable(str) && this.pluginLoader == null) {
            this.bizCode = str;
            refreshGradientConfig(context, str);
            this.pluginLoader = new com.iap.ac.android.gradient.c.a(str, this.attribute, this.gradientConfigMap);
            tryLoadPlugin(context, str);
        }
        ACLog.i(com.iap.ac.android.gradient.a.a.TAG, "initialize end");
    }

    public LoadPluginResult loadPlugin(@NonNull Context context, @NonNull String str) {
        PluginLoader pluginLoader;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-807606545, oncanceled);
                onCancelLoad.getMin(-807606545, oncanceled);
            }
        }
        if (!isGradientEnable(this.bizCode) || (pluginLoader = this.pluginLoader) == null) {
            return null;
        }
        return pluginLoader.loadPlugin(context, str);
    }

    public void loadPluginAsync(Context context, String str, OnPluginLoadedListener onPluginLoadedListener) {
        PluginLoader pluginLoader;
        if (isGradientEnable(this.bizCode) && (pluginLoader = this.pluginLoader) != null) {
            pluginLoader.loadPluginAsync(context, str, onPluginLoadedListener);
        }
    }
}
