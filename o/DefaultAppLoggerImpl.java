package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.EventLog;

public interface DefaultAppLoggerImpl {
    @OperationType("alipayplus.mobilewallet.user.checkRegisteredUserAndSendOTP")
    @SignCheck
    EventLog checkRegisteredUserAndSendOtp(EventLog.AnonymousClass1 r1);

    @OperationType("alipayplus.mobilewallet.user.register.normalRegister")
    @SignCheck
    setEventName register(DefaultAppLogConfigProxyImpl defaultAppLogConfigProxyImpl);
}
