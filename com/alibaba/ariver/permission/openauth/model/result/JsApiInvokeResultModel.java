package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;
import java.util.Map;

@Keep
public final class JsApiInvokeResultModel {
    private Map<String, String> extInfo;
    private String response;

    public JsApiInvokeResultModel(JsApiInvokeResultModel jsApiInvokeResultModel) {
        if (jsApiInvokeResultModel != null) {
            this.response = jsApiInvokeResultModel.response;
            this.extInfo = jsApiInvokeResultModel.extInfo;
        }
    }

    public JsApiInvokeResultModel() {
    }

    public final Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(Map<String, String> map) {
        this.extInfo = map;
    }

    public final String getResponse() {
        return this.response;
    }

    public final void setResponse(String str) {
        this.response = str;
    }
}
