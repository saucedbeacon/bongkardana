package com.alipay.ap.mobileprod.biz.uniresultpage.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import com.alipayplus.mobile.component.common.facade.uniresultpage.request.UniResultPageAckRequest;
import com.alipayplus.mobile.component.uniresultpage.service.request.UniResultPageQueryRequest;
import com.alipayplus.mobile.component.uniresultpage.service.result.UniResultPageQueryResult;

public interface UniResultPageRpcFacade {
    @OperationType("alipayplus.mobileprod.uniresultpage.ack")
    @SignCheck
    BaseServiceResult ack(UniResultPageAckRequest uniResultPageAckRequest);

    @OperationType("alipayplus.mobileprod.uniresultpage.query")
    @SignCheck
    UniResultPageQueryResult query(UniResultPageQueryRequest uniResultPageQueryRequest);
}
