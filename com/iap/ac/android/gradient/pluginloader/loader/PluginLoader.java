package com.iap.ac.android.gradient.pluginloader.loader;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.iap.ac.android.gradient.pluginloader.listener.OnPluginLoadedListener;
import com.iap.ac.android.gradient.proguard.model.result.LoadPluginResult;

public interface PluginLoader {
    @WorkerThread
    LoadPluginResult loadPlugin(Context context, String str);

    void loadPluginAsync(Context context, String str, OnPluginLoadedListener onPluginLoadedListener);
}
