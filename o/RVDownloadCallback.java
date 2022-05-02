package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface RVDownloadCallback {
    @OperationType("alipayplus.mobilewallet.risk.sendriskevent")
    @SignCheck
    getDownloadFileName sendRiskEvent(setDownloadFileName setdownloadfilename);
}
