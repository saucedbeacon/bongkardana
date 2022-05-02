package com.alibaba.griver.core.model.codec;

import com.alibaba.griver.base.common.rpc.BaseGriverRpcRequest;

public class UrlCodecRequest extends BaseGriverRpcRequest {
    private String code;

    public UrlCodecRequest(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
