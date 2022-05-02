package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface getCode {
    @OperationType("alipayplus.mobilewallet.security.get.publickey")
    @SignCheck
    getTimeCost fetchPublicKey(getResponse getresponse);
}
