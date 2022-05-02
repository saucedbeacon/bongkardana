package com.alipay.plus.push.core.rpc.bind;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.plus.push.core.rpc.ResultPbPB;
import com.alipay.plus.push.core.rpc.bind.pb.BindInfoReqPbPB;
import com.alipay.plus.push.core.rpc.bind.pb.UnbindReqPbPB;

public interface PushBindFacade {
    @OperationType("alipay.client.yunpushcore.bind")
    @SignCheck
    ResultPbPB bind(BindInfoReqPbPB bindInfoReqPbPB);

    @OperationType("alipay.client.yunpushcore.unbind")
    @SignCheck
    ResultPbPB unbind(UnbindReqPbPB unbindReqPbPB);
}
