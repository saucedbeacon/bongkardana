package com.alibaba.griver.core.model.codec;

import com.alibaba.griver.base.common.rpc.BaseGriverRpcResult;

public class UrlCodecResult extends BaseGriverRpcResult {
    public String schema;

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String str) {
        this.schema = str;
    }
}
