package com.iap.ac.android.gradient.pluginloader.loader;

import android.content.Context;
import com.iap.ac.android.gradient.c.a;

public interface LoadFlow {
    a buildClassLoader();

    a end();

    a extractPlugin();

    a injectClassLoader();

    a queryModuleConfig();

    a queryPluginRecords();

    a replaceClassLoader();

    a start(Context context, String str);
}
