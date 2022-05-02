package com.alipay.iap.android.matamata.plugins;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import o.access$onHandlerMessage;

public class BetterSharedPreferencePlugin extends access$onHandlerMessage {
    public BetterSharedPreferencePlugin(Context context) {
        super(context);
        this.mSharedPreferences.clear();
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        if (file.exists() && file.isDirectory()) {
            for (String str : file.list()) {
                access$onHandlerMessage.length length = new access$onHandlerMessage.length(str.substring(0, str.indexOf(".xml")), 0);
                SharedPreferences sharedPreferences = context.getSharedPreferences(length.length, length.setMin);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this.onSharedPreferenceChangeListener);
                this.mSharedPreferences.put(sharedPreferences, length);
            }
        }
    }
}
