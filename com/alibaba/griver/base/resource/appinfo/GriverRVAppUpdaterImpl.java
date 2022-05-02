package com.alibaba.griver.base.resource.appinfo;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.resource.api.appinfo.IAppUpdater;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppCallback;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppParam;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.setNegativeButton;

public class GriverRVAppUpdaterImpl implements IAppUpdater {
    public void updateApp(final UpdateAppParam updateAppParam, @Nullable final UpdateAppCallback updateAppCallback) {
        if (updateAppParam == null) {
            GriverLogger.w("GriverRVAppUpdaterImpl", "update app param is null, callback error directly");
            if (updateAppCallback != null) {
                updateAppCallback.onError((UpdateAppException) null);
                return;
            }
            return;
        }
        GriverExecutors.getExecutor(updateAppParam.isForce() ? ExecutorType.URGENT : ExecutorType.NETWORK).execute(new Runnable() {
            public void run() {
                HashMap hashMap = new HashMap();
                setNegativeButton<String, String> requestMainPackage = updateAppParam.getRequestMainPackage();
                if (!(requestMainPackage == null || requestMainPackage.setMax == null)) {
                    hashMap.put(requestMainPackage.setMax, (String) requestMainPackage.getMin);
                }
                Map<String, String> requestApps = updateAppParam.getRequestApps();
                if (requestApps != null && requestApps.size() > 0) {
                    hashMap.putAll(requestApps);
                }
                com.alibaba.griver.api.resource.appinfo.UpdateAppParam updateAppParam = new com.alibaba.griver.api.resource.appinfo.UpdateAppParam();
                updateAppParam.setRequestApps(hashMap);
                updateAppParam.setExtras(updateAppParam.getExtras());
                GriverAppUpdater.updateApp(updateAppParam, new com.alibaba.griver.api.resource.appinfo.UpdateAppCallback() {
                    public void onSuccess(List<AppModel> list) {
                        if (updateAppCallback != null) {
                            updateAppCallback.onSuccess(list);
                        }
                    }

                    public void onFailure(com.alibaba.griver.api.resource.appinfo.UpdateAppException updateAppException) {
                        if (updateAppCallback != null) {
                            UpdateAppException updateAppException2 = new UpdateAppException(updateAppException.getCode(), updateAppException.getMessage(), updateAppException.getExtras());
                            if (updateAppParam.getUpdateMode() == UpdateMode.SYNC_TRY) {
                                updateAppException2.setNeedShowError(false);
                            }
                            updateAppCallback.onError(updateAppException2);
                        }
                    }
                });
            }
        });
    }
}
