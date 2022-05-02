package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import com.alibaba.wireless.security.framework.utils.a;
import com.alibaba.wireless.security.framework.utils.d;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;

public class c implements ISGPluginInfo {

    /* renamed from: a  reason: collision with root package name */
    private String f9209a;
    private String b;
    private ClassLoader c;
    private AssetManager d;
    private a e;
    private ISecurityGuardPlugin f;
    private ISGPluginManager g;

    public c(String str, ISGPluginManager iSGPluginManager, String str2, ClassLoader classLoader, a aVar, ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f9209a = str;
        this.g = iSGPluginManager;
        this.b = str2;
        this.c = classLoader;
        this.e = aVar;
        this.f = iSecurityGuardPlugin;
    }

    public String a(String str) {
        return this.e.f9207a != null ? this.e.f9207a.applicationInfo.metaData.getString(str) : this.e.a(str);
    }

    public AssetManager getAssetManager() {
        AssetManager assetManager = this.d;
        if (assetManager != null) {
            return assetManager;
        }
        try {
            AssetManager newInstance = AssetManager.class.newInstance();
            d.a((Object) newInstance).a("addAssetPath", this.f9209a);
            this.d = newInstance;
            return newInstance;
        } catch (Exception e2) {
            a.a("", e2);
            return null;
        }
    }

    public ClassLoader getClassLoader() {
        return this.c;
    }

    public PackageInfo getPackageInfo() {
        return this.e.f9207a;
    }

    public String getPluginName() {
        return this.b;
    }

    public String getPluginPath() {
        return this.f9209a;
    }

    public ISecurityGuardPlugin getSGPluginEntry() {
        return this.f;
    }

    public ISGPluginManager getSGPluginManager() {
        return this.g;
    }

    public String getVersion() {
        return this.e.f9207a != null ? this.e.f9207a.versionName : this.e.a("version");
    }
}
