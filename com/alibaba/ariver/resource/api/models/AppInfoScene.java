package com.alibaba.ariver.resource.api.models;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;

public enum AppInfoScene {
    ONLINE,
    DEBUG,
    TRIAL,
    REVIEW,
    YUNTEST,
    INSPECT;
    
    public static final String PARAM_SCENE = "nbsn";
    public static final String PARAM_SCENE_VERSION = "nbsv";
    public static final String PARAM_SOURCE = "nbsource";

    public static boolean isDevSource(Bundle bundle) {
        return DEBUG.name().equalsIgnoreCase(BundleUtils.getString(bundle, PARAM_SOURCE));
    }

    public final boolean isOnline() {
        return this == ONLINE;
    }

    public static AppInfoScene parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return ONLINE;
        }
        try {
            return valueOf(str);
        } catch (Throwable unused) {
            return ONLINE;
        }
    }

    public static AppInfoScene extractScene(Bundle bundle) {
        String string = BundleUtils.getString(bundle, PARAM_SCENE);
        if (TextUtils.isEmpty(string)) {
            return ONLINE;
        }
        for (AppInfoScene appInfoScene : values()) {
            if (appInfoScene.name().equalsIgnoreCase(string)) {
                return appInfoScene;
            }
        }
        return DEBUG;
    }

    public static String extractSceneVersion(Bundle bundle) {
        String string = BundleUtils.getString(bundle, PARAM_SCENE_VERSION);
        return TextUtils.isEmpty(string) ? "*" : string;
    }
}
