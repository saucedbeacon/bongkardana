package com.alibaba.griver.core.model.applist;

import com.alibaba.griver.base.common.rpc.BaseGriverRpcResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppInfosResult extends BaseGriverRpcResult implements Serializable {
    private List<AppInfo> appInfos;
    private int totalCount;

    public AppInfosResult(int i, List<AppInfo> list) {
        this.totalCount = i;
        this.appInfos = list;
    }

    public AppInfosResult() {
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public List<AppInfo> getAppInfos() {
        return this.appInfos;
    }

    public void setAppInfos(List<AppInfo> list) {
        this.appInfos = list;
    }

    public static AppInfosResult convertAppInfos(FetchAppListResult fetchAppListResult) {
        ArrayList arrayList = new ArrayList();
        if (fetchAppListResult.getExceedAppIdList() != null) {
            for (DeployAppInfo convertAppInfo : fetchAppListResult.getAppInfoList()) {
                arrayList.add(AppInfo.convertAppInfo(convertAppInfo));
            }
        }
        AppInfosResult appInfosResult = new AppInfosResult(fetchAppListResult.getTotalCount(), arrayList);
        appInfosResult.success = fetchAppListResult.success;
        appInfosResult.errorCode = fetchAppListResult.errorCode;
        appInfosResult.errorMessage = fetchAppListResult.errorMessage;
        appInfosResult.extendInfo = fetchAppListResult.extendInfo;
        return appInfosResult;
    }
}
