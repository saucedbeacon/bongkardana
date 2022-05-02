package com.iap.ac.android.acs.plugin.rpc.reversegeocode.result;

import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public class ReverseGeocodeResult extends BaseRpcResult {
    public String region;
    public String regionCode;

    public String toString() {
        StringBuilder sb = new StringBuilder("ReverseGeocodeResult{regionCode='");
        sb.append(this.regionCode);
        sb.append('\'');
        sb.append(", region='");
        sb.append(this.region);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
