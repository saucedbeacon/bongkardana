package com.alibaba.ariver.resource.api.models;

import android.text.TextUtils;
import androidx.annotation.NonNull;

public class AppInfoQuery {
    public static final String QUERY_HIGHEST_VERSION = "*";
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private String f10174a;
    private String b = "*";
    private AppInfoScene c = AppInfoScene.ONLINE;
    private boolean d = false;

    public static AppInfoQuery make(String str) {
        return new AppInfoQuery(str);
    }

    public AppInfoQuery(@NonNull AppInfoQuery appInfoQuery) {
        this.f10174a = appInfoQuery.f10174a;
        this.b = appInfoQuery.b;
        this.c = appInfoQuery.c;
    }

    public AppInfoQuery(@NonNull String str) {
        this.f10174a = str;
    }

    public AppInfoQuery version(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b = "*";
        } else {
            this.b = str;
        }
        return this;
    }

    public AppInfoQuery disableCache() {
        this.d = true;
        return this;
    }

    public AppInfoQuery scene(AppInfoScene appInfoScene) {
        if (appInfoScene == null) {
            this.c = AppInfoScene.ONLINE;
        } else {
            this.c = appInfoScene;
        }
        return this;
    }

    @NonNull
    public String getAppId() {
        return this.f10174a;
    }

    public String getVersion() {
        return this.b;
    }

    public AppInfoScene getScene() {
        return this.c;
    }

    public boolean forHighestVersion() {
        return TextUtils.isEmpty(this.b) || "*".equals(this.b);
    }

    public boolean forSpecificVersion() {
        return !TextUtils.isEmpty(this.b) && !this.b.contains("*");
    }

    public boolean isDisableCache() {
        return this.d;
    }

    public boolean isOnlineScene() {
        return AppInfoScene.ONLINE.equals(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfoQuery{appId=");
        sb.append(this.f10174a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", scene=");
        sb.append(this.c);
        sb.append(", disableCache=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
