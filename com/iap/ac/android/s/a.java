package com.iap.ac.android.s;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcRequest;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcResult;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcRequest;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

public interface a {
    @OperationType("ac.mobilepayment.basic.region.city.query")
    @ACRpcRequest
    @SignCheck
    CityQueryRpcResult a(CityQueryRpcRequest cityQueryRpcRequest);

    @OperationType("ac.mobilepayment.basic.region.mobilephoneregioncode.query")
    @ACRpcRequest
    @SignCheck
    RegionCodeQueryRpcResult a(RegionCodeQueryRpcRequest regionCodeQueryRpcRequest);
}
