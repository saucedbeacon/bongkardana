package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import o.DataChannel;

public interface onSocketMessage {
    @OperationType("dana.mobilewallet.splitbill.closepayers")
    @SignCheck
    BaseRpcResult closePayers(onSocketOpen onsocketopen);

    @OperationType("dana.mobilewallet.get.splitbill.detail")
    @SignCheck
    onSocketClose getSplitBillDetail(DataChannel.DataStatusChangedListener dataStatusChangedListener);

    @OperationType("dana.mobilewallet.splitbill.gethistory")
    @SignCheck
    tyroRequest getSplitBillHistories(connect connect);
}
