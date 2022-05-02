package com.iap.ac.android.diagnoselog.rpc.marmotconfig;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface FetchMarmotConfigFacade {
    @OperationType("ap.mobileamcs.diagnose.fetch.marmot.config")
    @SignCheck
    MarmotConfigResult fetchMarmotConfig(MarmotConfigRequest marmotConfigRequest);
}
