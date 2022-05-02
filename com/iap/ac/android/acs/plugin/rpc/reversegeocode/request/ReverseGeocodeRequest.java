package com.iap.ac.android.acs.plugin.rpc.reversegeocode.request;

import com.iap.ac.android.acs.plugin.rpc.reversegeocode.model.LocationInfo;
import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;

public class ReverseGeocodeRequest extends BaseRpcRequest {
    public LocationInfo locationInfo;
}
