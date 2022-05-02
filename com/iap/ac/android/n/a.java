package com.iap.ac.android.n;

import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentInquireQuoteRpcFacade;

public class a extends BaseNetwork<MobilePaymentInquireQuoteRpcFacade> {
    public Class getFacadeClass() {
        return MobilePaymentInquireQuoteRpcFacade.class;
    }
}
