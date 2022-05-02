package com.alipay.plus.android.ab.sdk.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.plus.android.ab.sdk.facade.request.AbTestingRequest;
import com.alipay.plus.android.ab.sdk.facade.result.AbTestingResponse;

public interface AbTestingFacade {
    @OperationType("ap.amcs.abtesting.variation.get")
    AbTestingResponse getVariation(AbTestingRequest abTestingRequest);
}
