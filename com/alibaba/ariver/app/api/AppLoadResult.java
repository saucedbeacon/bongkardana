package com.alibaba.ariver.app.api;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

public class AppLoadResult {
    public String appType;
    public String appVersion;
    public String mainHtmlUrl;
    public String mainJsUrl;
    @Nullable
    public Callable<Boolean> waitLoadFuture;

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLoadResult{mainJsUrl='");
        sb.append(this.mainJsUrl);
        sb.append('\'');
        sb.append(", mainHtmlUrl='");
        sb.append(this.mainHtmlUrl);
        sb.append('\'');
        sb.append(", appType=");
        sb.append(this.appType);
        sb.append(", appVersion='");
        sb.append(this.appVersion);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
