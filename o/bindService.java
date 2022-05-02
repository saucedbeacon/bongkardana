package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public interface bindService {
    @OperationType("alipayplus.mobilewallet.user.paymentcontrol.init")
    @SignCheck
    createScheduleExtensionInvoker getPaymentSecurity(BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobilewallet.user.paymentcontrol.switch")
    @SignCheck
    IpcCallClientHelper getPaymentSecuritySwitch(BaseRpcRequest baseRpcRequest);
}
