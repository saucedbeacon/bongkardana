package com.alibaba.griver.core.model.applist;

import com.alibaba.griver.base.common.rpc.BaseGriverRpcResult;
import java.util.List;

public class FetchAppListResult extends BaseGriverRpcResult {
    private List<DeployAppInfo> appInfoList;
    private List<DeployAppInfo> deployAppInfoList;
    private List<String> exceedAppIdList;
    private int totalCount;

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public List<DeployAppInfo> getDeployAppInfoList() {
        return this.deployAppInfoList;
    }

    public void setDeployAppInfoList(List<DeployAppInfo> list) {
        this.deployAppInfoList = list;
    }

    public List<String> getExceedAppIdList() {
        return this.exceedAppIdList;
    }

    public void setExceedAppIdList(List<String> list) {
        this.exceedAppIdList = list;
    }

    public void setAppInfoList(List<DeployAppInfo> list) {
        this.appInfoList = list;
    }

    public List<DeployAppInfo> getAppInfoList() {
        return this.appInfoList;
    }
}
