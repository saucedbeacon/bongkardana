package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;
import java.util.Map;

@Keep
public final class H5AuthParamsModel {
    private String appId;
    private Map<String, String> params;

    public H5AuthParamsModel(H5AuthParamsModel h5AuthParamsModel) {
        if (h5AuthParamsModel != null) {
            this.appId = h5AuthParamsModel.appId;
            this.params = h5AuthParamsModel.params;
        }
    }

    public H5AuthParamsModel() {
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final void setParams(Map<String, String> map) {
        this.params = map;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }
}
