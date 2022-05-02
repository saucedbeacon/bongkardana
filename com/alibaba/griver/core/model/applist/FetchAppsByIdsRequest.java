package com.alibaba.griver.core.model.applist;

import android.text.TextUtils;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.rpc.BaseGriverRpcRequest;
import java.util.List;

public class FetchAppsByIdsRequest extends BaseGriverRpcRequest {
    private static final String TAG = "FetchAppsByIdsRequest";
    private List<String> appIdList;
    @Deprecated
    private int querySize = 0;
    @Deprecated
    private int queryStartIndex = 0;
    private String relatedEnv;
    private String scope = "appIdList";
    private String userId;

    public FetchAppsByIdsRequest(List<String> list) {
        this.appIdList = list;
        if (!TextUtils.isEmpty(GriverEnv.getEnvironment())) {
            setRelatedEnv(GriverEnv.getEnvironment());
        }
        try {
            setUserId(GriverAccount.getUserId());
        } catch (Exception e) {
            GriverLogger.e(TAG, "get usedId failed", e);
        }
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getUserId() {
        return this.userId;
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

    public void setScope(String str) {
        this.scope = str;
    }

    public String getScope() {
        return this.scope;
    }

    public List<String> getAppIdList() {
        return this.appIdList;
    }

    public void setAppIdList(List<String> list) {
        this.appIdList = list;
    }
}
