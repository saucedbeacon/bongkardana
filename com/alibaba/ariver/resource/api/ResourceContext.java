package com.alibaba.ariver.resource.api;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceProvider;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.network.OnlineResourceFetcher;
import com.alibaba.ariver.resource.api.storage.TabBarDataStorage;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.content.ResourcePackagePool;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ResourceContext {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<App> f9037a;
    public String appType;
    private String b;
    private Bundle c;
    public boolean cubeEngineInitFailed = false;
    private Bundle d;
    private String e;
    @Nullable
    private AppModel f;
    private final Set<String> g = new HashSet();
    private final Object h = new Object();
    public boolean hasPageEntered = false;
    private String i = null;
    @Nullable
    private ResourcePackage j;
    private final Map<String, ResourcePackage> k = new ConcurrentHashMap();
    private ResourceProvider l;
    private Map<String, byte[]> m = new ConcurrentHashMap();
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private final OnlineResourceFetcher f9038o = new OnlineResourceFetcher();
    public boolean startWithNBUrl = false;
    public TabBarDataStorage tabBarDataStorage = new TabBarDataStorage();

    public App getApp() {
        WeakReference<App> weakReference = this.f9037a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public OnlineResourceFetcher getOnlineResourceFetcher() {
        return this.f9038o;
    }

    public void releaseResourcePackages() {
        ResourceProvider resourceProvider = this.l;
        if (resourceProvider != null) {
            resourceProvider.releaseContent();
            this.l = null;
        }
        ResourcePackage resourcePackage = this.j;
        if (resourcePackage != null) {
            resourcePackage.teardown();
            this.j = null;
        }
        for (ResourcePackage teardown : this.k.values()) {
            teardown.teardown();
        }
        this.k.clear();
        synchronized (this.g) {
            this.g.clear();
        }
    }

    public ResourceProvider getContentProvider() {
        return this.l;
    }

    public void setContentProvider(ResourceProvider resourceProvider) {
        this.l = resourceProvider;
    }

    public byte[] getSnapshotIndex(String str) {
        if (this.m.containsKey(str)) {
            return this.m.get(str);
        }
        return null;
    }

    public void setSnapshotIndex(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null) {
            this.m.put(str, bArr);
        }
    }

    public String getSnapshotTitleBarParams() {
        return this.n;
    }

    public void setSnapshotTitleBarParams(String str) {
        this.n = str;
    }

    @Nullable
    public ResourcePackage getMainPackage() {
        return this.j;
    }

    public void setMainPackage(@Nullable ResourcePackage resourcePackage) {
        this.j = resourcePackage;
    }

    public void addPackage(@NonNull ResourcePackage resourcePackage) {
        if (!this.k.containsKey(resourcePackage.appId())) {
            this.k.put(resourcePackage.appId(), resourcePackage);
            attachResourcePackage(resourcePackage.appId());
        }
        StringBuilder sb = new StringBuilder("addPackage ");
        sb.append(resourcePackage);
        sb.append(" to ");
        sb.append(this);
        RVLogger.d("AriverRes:ResourceContext", sb.toString());
    }

    @Nullable
    public Resource getRawResource(@NonNull ResourceQuery resourceQuery) {
        Resource resource;
        ResourcePackage resourcePackage = this.j;
        if (resourcePackage != null && (resource = resourcePackage.get(resourceQuery)) != null) {
            return resource;
        }
        for (ResourcePackage resourcePackage2 : this.k.values()) {
            Resource resource2 = resourcePackage2.get(resourceQuery);
            if (resource2 != null) {
                return resource2;
            }
        }
        return null;
    }

    public Bundle getSceneParams() {
        return this.d;
    }

    public void setSceneParams(Bundle bundle) {
        this.d = bundle;
    }

    public String getAppId() {
        return this.b;
    }

    public void setAppId(String str) {
        this.b = str;
    }

    public void setApp(App app) {
        this.f9037a = new WeakReference<>(app);
    }

    public Bundle getStartParams() {
        return this.c;
    }

    public void setStartParams(Bundle bundle) {
        this.c = bundle;
    }

    public String getAppVersion() {
        return this.e;
    }

    public void setAppVersion(String str) {
        this.e = str;
    }

    @Nullable
    public AppModel getMainPackageInfo() {
        return this.f;
    }

    public void setMainPackageInfo(@Nullable AppModel appModel) {
        if (appModel != null) {
            this.f = appModel;
            setAppVersion(appModel.getAppVersion());
        }
    }

    public void attachResourcePackage(String str) {
        synchronized (this.g) {
            this.g.add(str);
        }
    }

    public boolean containsPackage(String str) {
        return this.g.contains(str);
    }

    public Set<String> getResourcePackages() {
        return this.g;
    }

    public void updatePackageBrief() {
        App app = this.f9037a.get();
        if (app != null) {
            String packageBrief = getPackageBrief(true);
            RVLogger.d("AriverRes:ResourceContext", "updatePackageBrief: ".concat(String.valueOf(packageBrief)));
            app.putStringValue(RVConstants.KEY_PACKAGE_BRIEF, packageBrief);
        }
    }

    public String getPackageBrief(boolean z) {
        synchronized (this.h) {
            if (this.i == null || z) {
                StringBuilder sb = new StringBuilder();
                HashSet<ResourcePackage> hashSet = new HashSet<>();
                hashSet.add(this.j);
                synchronized (this.g) {
                    for (String str : this.g) {
                        ResourcePackage resourcePackage = ResourcePackagePool.getInstance().getPackage(str);
                        if (resourcePackage != null) {
                            hashSet.add(resourcePackage);
                        }
                    }
                }
                Collection<ResourcePackage> packages = GlobalPackagePool.getInstance().getPackages();
                if (packages != null) {
                    hashSet.addAll(packages);
                }
                for (ResourcePackage resourcePackage2 : hashSet) {
                    if (sb.length() > 0) {
                        sb.append("|");
                    }
                    if (resourcePackage2 != null) {
                        sb.append(resourcePackage2.appId());
                        sb.append("_");
                        sb.append(resourcePackage2.count() > 0 ? "Y_" : "N_");
                        sb.append(resourcePackage2.version());
                    }
                }
                String obj = sb.toString();
                this.i = obj;
                return obj;
            }
            String str2 = this.i;
            return str2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceContext@");
        sb.append(hashCode());
        sb.append("{appId=");
        sb.append(this.b);
        sb.append(", appVersion=");
        sb.append(this.e);
        sb.append(", appType=");
        sb.append(this.appType);
        sb.append('}');
        return sb.toString();
    }

    public String toFullString() {
        StringBuilder sb = new StringBuilder("ResourceContext{appId=");
        sb.append(this.b);
        sb.append(", startParam=");
        sb.append(this.c);
        sb.append(", sceneParam=");
        sb.append(this.d);
        sb.append(", appVersion=");
        sb.append(this.e);
        sb.append(", appType=");
        sb.append(this.appType);
        sb.append(", mainPackageInfo=");
        AppModel appModel = this.f;
        sb.append(appModel != null ? appModel.toString() : null);
        sb.append(", contentProvider=");
        sb.append(this.l);
        sb.append(", mainPackage=");
        sb.append(this.j);
        sb.append(", resourcePackages=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
