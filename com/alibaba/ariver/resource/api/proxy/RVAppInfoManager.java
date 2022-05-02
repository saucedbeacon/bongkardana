package com.alibaba.ariver.resource.api.proxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;

public interface RVAppInfoManager extends Proxiable {
    @WorkerThread
    @Nullable
    String findUrlMappedAppId(String str);

    @WorkerThread
    AppInfoModel getAppInfoModel(@NonNull AppInfoQuery appInfoQuery);

    @WorkerThread
    AppModel getAppModel(@NonNull AppInfoQuery appInfoQuery);

    @WorkerThread
    long getLastUpdateTime(String str);

    @WorkerThread
    void refreshUpdateTime(String str, long j);
}
