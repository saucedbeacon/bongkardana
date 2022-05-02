package com.alibaba.ariver.resource.content;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.model.PluginParamModel;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.PluginDownloadCallback;
import com.alibaba.ariver.resource.api.PluginInstallCallback;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.PluginPackageParsedPoint;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.proxy.RVPluginResourceManager;
import com.alibaba.ariver.resource.parser.ParseContext;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PluginResourcePackage extends BaseStoragePackage {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f10186a;
    private boolean b;
    private PluginModel c;
    private ResourceContext d;
    /* access modifiers changed from: private */
    public RVPluginResourceManager e = ((RVPluginResourceManager) RVProxy.get(RVPluginResourceManager.class));
    private String f;

    public boolean needWaitForSetup() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean needWaitSetupWhenGet() {
        return true;
    }

    public void reload() {
    }

    public PluginResourcePackage(@NonNull PluginModel pluginModel, @NonNull ResourceContext resourceContext) {
        this.c = pluginModel;
        this.d = resourceContext;
        StringBuilder sb = new StringBuilder("AriverRes:PluginPackage_");
        sb.append(pluginModel.getAppId());
        sb.append("_");
        sb.append(pluginModel.getVersion());
        this.f10186a = sb.toString();
    }

    public String getLogTag() {
        return this.f10186a;
    }

    public void setup(boolean z) {
        ResourceContext resourceContext = this.d;
        if (resourceContext == null) {
            throw new IllegalStateException("plugin resource cannot setup without app context");
        } else if (resourceContext.getMainPackageInfo() == null) {
            throw new IllegalStateException("plugin resource cannot setup without app main packageInfo");
        } else if (this.b) {
            RVLogger.w(this.f10186a, "already setupted!");
        } else {
            String vhost = this.d.getMainPackageInfo().getAppInfoModel().getVhost();
            StringBuilder sb = new StringBuilder("__plugins__/");
            sb.append(this.c.getAppId());
            this.f = FileUtils.combinePath(vhost, sb.toString());
            this.b = true;
            RVLogger.d(this.f10186a, "begin setup with lock: ".concat(String.valueOf(z)));
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                RVLogger.w(this.f10186a, "prepareContent with lock!");
            }
            List singletonList = Collections.singletonList(this.c);
            boolean isAvailable = this.e.isAvailable(singletonList);
            String str = this.f10186a;
            StringBuilder sb2 = new StringBuilder("prepareContent appId:");
            sb2.append(this.c.getAppId());
            sb2.append(" appVersion ");
            sb2.append(this.c.getVersion());
            sb2.append(" installed:");
            sb2.append(isAvailable);
            RVLogger.d(str, sb2.toString());
            if (isAvailable) {
                parseContent(this.c.getAppId(), this.e.getInstallPath(this.c));
            } else {
                this.e.downloadPlugins(singletonList, new MyPluginDownloadCallback(this.c));
            }
            if (z) {
                try {
                    getSetupLock().await(5, TimeUnit.SECONDS);
                } catch (InterruptedException e2) {
                    RVLogger.w(this.f10186a, "prepareContent block error", e2);
                }
                String str2 = this.f10186a;
                StringBuilder sb3 = new StringBuilder("prepareContent block ");
                sb3.append(System.currentTimeMillis() - currentTimeMillis);
                sb3.append(" ms");
                RVLogger.d(str2, sb3.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void beforeParsePackage(ParseContext parseContext) {
        super.beforeParsePackage(parseContext);
        parseContext.onlineHost = this.f;
    }

    /* access modifiers changed from: protected */
    public void afterParsePackage(ParseContext parseContext) {
        App app;
        AppConfigModel parseFromJSON;
        super.afterParsePackage(parseContext);
        ResourceContext resourceContext = this.d;
        if (resourceContext != null && (app = resourceContext.getApp()) != null) {
            Resource resource = get(ResourceQuery.asUrl(RVConstants.FILE_APP_CONFIG).setNeedAutoCompleteHost());
            if (!(resource == null || (parseFromJSON = AppConfigModel.parseFromJSON(resource.getBytes())) == null || parseFromJSON.getPageLaunchParams() == null)) {
                ((PluginParamModel) app.getData(PluginParamModel.class, true)).putPluginConfig(this.c.getAppId(), parseFromJSON);
            }
            ExtensionPoint.as(PluginPackageParsedPoint.class).node(app).create().onPluginParsed(this.d.getMainPackageInfo(), this.c, this);
        }
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        if (resourceQuery.isNeedAutoCompleteHost() && !TextUtils.isEmpty(this.f)) {
            resourceQuery.pureUrl = FileUtils.combinePath(this.f, resourceQuery.pureUrl);
        }
        return super.get(resourceQuery);
    }

    public String appId() {
        return this.c.getAppId();
    }

    public String version() {
        return this.c.getDeveloperVersion();
    }

    public PluginModel getPluginModel() {
        return this.c;
    }

    class MyPluginDownloadCallback implements PluginDownloadCallback {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final PluginModel f10187a;

        public void onSingleFailed(PluginModel pluginModel, int i, String str) {
        }

        MyPluginDownloadCallback(PluginModel pluginModel) {
            this.f10187a = pluginModel;
        }

        public void onSuccess() {
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public void run() {
                    ((RVPluginResourceManager) RVProxy.get(RVPluginResourceManager.class)).installPlugins(Collections.singletonList(MyPluginDownloadCallback.this.f10187a), new PluginInstallCallback() {
                        public void onSingleFailed(PluginModel pluginModel, int i, String str) {
                        }

                        public void onSuccess(List<Pair<PluginModel, String>> list) {
                            RVLogger.d(PluginResourcePackage.this.f10186a, "installPlugins onSuccess");
                            PluginResourcePackage.this.parseContent(MyPluginDownloadCallback.this.f10187a.getAppId(), PluginResourcePackage.this.e.getInstallPath(MyPluginDownloadCallback.this.f10187a));
                        }

                        public void onFailed(int i, String str) {
                            String access$100 = PluginResourcePackage.this.f10186a;
                            StringBuilder sb = new StringBuilder("installPlugins onFailed ");
                            sb.append(i);
                            sb.append(", ");
                            sb.append(str);
                            RVLogger.w(access$100, sb.toString());
                            PluginResourcePackage.this.onPrepareDone();
                            PluginResourcePackage.this.onParseDone();
                        }
                    });
                }
            });
        }

        public void onFailed(int i, String str) {
            String access$100 = PluginResourcePackage.this.f10186a;
            StringBuilder sb = new StringBuilder("onFailed ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
            RVLogger.w(access$100, sb.toString());
            PluginResourcePackage.this.onPrepareDone();
            PluginResourcePackage.this.onParseDone();
        }
    }
}
