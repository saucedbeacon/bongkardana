package com.alibaba.ariver.resource.api.appinfo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;
import java.util.Map;
import o.setNegativeButton;

public class UpdateAppParam {

    /* renamed from: a  reason: collision with root package name */
    private setNegativeButton<String, String> f10168a;
    @Nullable
    private Map<String, String> b;
    private AppInfoScene c;
    private UpdateMode d;
    private boolean e;
    @Nullable
    private Bundle f = new Bundle();

    public UpdateAppParam(String str, @Nullable String str2) {
        this.f10168a = new setNegativeButton<>(str, str2);
    }

    public setNegativeButton<String, String> getRequestMainPackage() {
        return this.f10168a;
    }

    public boolean isForce() {
        return this.e;
    }

    public void setForce(boolean z) {
        this.e = z;
    }

    @Nullable
    public Map<String, String> getRequestApps() {
        return this.b;
    }

    public void setRequestApps(Map<String, String> map) {
        this.b = map;
    }

    public AppInfoScene getQueryScene() {
        return this.c;
    }

    public void setQueryScene(AppInfoScene appInfoScene) {
        this.c = appInfoScene;
    }

    public void setExtras(@Nullable Bundle bundle) {
        this.f = bundle;
    }

    public String getExtra(String str) {
        return (String) this.f.get(str);
    }

    @Nullable
    public Bundle getExtras() {
        return this.f;
    }

    public UpdateMode getUpdateMode() {
        return this.d;
    }

    public void setUpdateMode(UpdateMode updateMode) {
        this.d = updateMode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateAppParam{mRequestMainPackage=");
        sb.append(this.f10168a);
        sb.append(", mQueryScene=");
        sb.append(this.c);
        sb.append(", mUpdateMode=");
        sb.append(this.d);
        sb.append(", mForce=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
