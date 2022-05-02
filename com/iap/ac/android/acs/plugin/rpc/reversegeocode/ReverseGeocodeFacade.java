package com.iap.ac.android.acs.plugin.rpc.reversegeocode;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.request.ReverseGeocodeRequest;
import com.iap.ac.android.acs.plugin.rpc.reversegeocode.result.ReverseGeocodeResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

public interface ReverseGeocodeFacade {
    public static final String OPERATION_TYPE_REVERSE_GEO_CODE = "ac.mobilepayment.lbs.geocode.reverse";

    @OperationType("ac.mobilepayment.lbs.geocode.reverse")
    @ACRpcRequest
    @SignCheck
    ReverseGeocodeResult reverseGeocode(ReverseGeocodeRequest reverseGeocodeRequest);
}
