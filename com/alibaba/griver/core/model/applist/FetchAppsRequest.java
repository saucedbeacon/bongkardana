package com.alibaba.griver.core.model.applist;

import android.text.TextUtils;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.rpc.BaseGriverRpcRequest;

public class FetchAppsRequest extends BaseGriverRpcRequest {
    private static final String TAG = "FetchAppsRequest";
    private int querySize;
    private int queryStartIndex;
    private String relatedEnv;
    private String userId;

    public FetchAppsRequest(int i, int i2) {
        this.queryStartIndex = i;
        this.querySize = i2;
        if (!TextUtils.isEmpty(GriverEnv.getEnvironment())) {
            setRelatedEnv(GriverEnv.getEnvironment());
        }
        try {
            setUserId(GriverAccount.getUserId());
        } catch (Exception e) {
            GriverLogger.e(TAG, "get usedId failed", e);
        }
    }

    public int getQueryStartIndex() {
        return this.queryStartIndex;
    }

    public void setQueryStartIndex(int i) {
        this.queryStartIndex = i;
    }

    public int getQuerySize() {
        return this.querySize;
    }

    public void setQuerySize(int i) {
        this.querySize = i;
    }

    public String getRelatedEnv() {
        return this.relatedEnv;
    }

    public void setRelatedEnv(String str) {
        this.relatedEnv = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
