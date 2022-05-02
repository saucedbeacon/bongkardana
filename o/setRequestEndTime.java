package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface setRequestEndTime {
    @OperationType("alipayplus.mobilewallet.risk.getverifytoken")
    @SignCheck
    setInstallTime getVerifyToken(getInstallTime getinstalltime);
}
