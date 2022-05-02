package com.alibaba.griver.base.common.monitor;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import java.util.HashMap;
import java.util.Map;

public class MonitorMap {

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f9053a = new HashMap();

        public Builder Builder() {
            return this;
        }

        public Builder url(String str) {
            this.f9053a.put("url", str);
            return this;
        }

        public Builder appId(String str) {
            this.f9053a.put("appId", str);
            return this;
        }

        public Builder version(String str) {
            this.f9053a.put("version", str);
            return this;
        }

        public Builder version(App app) {
            if (app == null) {
                this.f9053a.put("version", "");
                this.f9053a.put("deployVersion", "");
                return this;
            } else if (BundleUtils.getBoolean(app.getStartParams(), RVParams.isH5App, false)) {
                this.f9053a.put("version", BundleUtils.getString(app.getStartParams(), "appVersion"));
                this.f9053a.put("deployVersion", BundleUtils.getString(app.getStartParams(), "appVersion"));
                return this;
            } else {
                AppModel appModel = (AppModel) app.getData(AppModel.class);
                if (appModel != null) {
                    return version(appModel);
                }
                String string = BundleUtils.getString(app.getStartParams(), "appVersion");
                version(string);
                return deployVersion(string);
            }
        }

        public Builder version(AppModel appModel) {
            String str;
            String developerVersion = AppInfoUtils.getDeveloperVersion(appModel);
            if (TextUtils.isEmpty(developerVersion)) {
                Map<String, String> map = this.f9053a;
                if (appModel == null) {
                    str = "";
                } else {
                    str = appModel.getAppVersion();
                }
                map.put("version", str);
            } else {
                this.f9053a.put("version", developerVersion);
            }
            return deployVersion(appModel);
        }

        public Builder message(String str) {
            this.f9053a.put("message", str);
            return this;
        }

        public Builder apiName(String str) {
            this.f9053a.put("apiName", str);
            return this;
        }

        public Builder cost(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_COST, str);
            return this;
        }

        public Builder size(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_SIZE, str);
            return this;
        }

        public Builder code(String str) {
            this.f9053a.put("code", str);
            return this;
        }

        public Builder exception(Throwable th) {
            if (th == null) {
                return this;
            }
            this.f9053a.put(GriverMonitorConstants.KEY_EXCEPTION_CLASS, th.getClass().getName());
            this.f9053a.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, th.getLocalizedMessage());
            return this;
        }

        public Builder needAsynAppType(boolean z) {
            this.f9053a.put(GriverMonitorConstants.KEY_NEED_ASYNC_APP_TYPE, String.valueOf(z));
            return this;
        }

        public Builder threshold(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_THRESHOLD, str);
            return this;
        }

        public Builder downloadPath(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_DOWNLOAD_PATH, str);
            return this;
        }

        public Builder installPath(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_INSTALL_PATH, str);
            return this;
        }

        public Builder overTime(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_OVER_TIME, str);
            return this;
        }

        public Builder workerType(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_WORKER_TYPE, str);
            return this;
        }

        public Builder appType(String str) {
            this.f9053a.put("appType", str);
            return this;
        }

        public Builder pageUrl(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_PAGE_URL, str);
            return this;
        }

        public Builder requestUrl(String str) {
            this.f9053a.put(GriverMonitorConstants.KEY_REQUEST_URL, str);
            return this;
        }

        public Builder deployVersion(String str) {
            this.f9053a.put("deployVersion", str);
            return this;
        }

        public Builder deployVersion(AppModel appModel) {
            String str;
            Map<String, String> map = this.f9053a;
            if (appModel == null) {
                str = "";
            } else {
                str = appModel.getAppVersion();
            }
            map.put("deployVersion", str);
            return this;
        }

        public Builder append(String str, String str2) {
            this.f9053a.put(str, str2);
            return this;
        }

        public Builder appendAll(Map<String, String> map) {
            if (map != null && map.size() > 0) {
                this.f9053a.putAll(map);
            }
            return this;
        }

        public Builder env(String str) {
            Map<String, String> map = this.f9053a;
            if (TextUtils.isEmpty(str)) {
                str = "prod";
            }
            map.put("env", str);
            return this;
        }

        public Map<String, String> build() {
            this.f9053a.put(GriverMonitorConstants.KEY_CURRENT_PROCESS, ProcessUtils.getProcessName());
            this.f9053a.put("containerVersion", "2.25.2");
            return this.f9053a;
        }
    }
}
