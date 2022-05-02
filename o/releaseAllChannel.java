package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import o.BigDataChannelManager;

public interface releaseAllChannel {
    @OperationType("alipayplus.mobilewallet.referral.consult.referrer")
    @SignCheck
    pickNext consult(pushData pushdata);

    @OperationType("alipayplus.mobilewallet.referral.status.consult")
    @SignCheck
    setChannelId statusConsult(BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobilewallet.referral.verify")
    @SignCheck
    setViewId verify(BigDataChannelManager.AnonymousClass1 r1);
}
