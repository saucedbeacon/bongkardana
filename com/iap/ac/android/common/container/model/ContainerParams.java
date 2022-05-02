package com.iap.ac.android.common.container.model;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.container.constant.StartMethod;

public class ContainerParams {
    public String appId;
    @Nullable
    public Bundle containerBundle;
    @Nullable
    public String postParams;
    @NonNull
    public StartMethod startMethod = StartMethod.GET;
    public String url;

    public ContainerParams(@NonNull String str) {
        this.url = str;
    }

    public static ContainerParams createForMniProgram(@NonNull String str) {
        ContainerParams containerParams = new ContainerParams("");
        containerParams.appId = str;
        return containerParams;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContainerParams{appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", containerBundle=");
        sb.append(this.containerBundle);
        sb.append(", postParams='");
        sb.append(this.postParams);
        sb.append('\'');
        sb.append(", startMethod=");
        sb.append(this.startMethod);
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
