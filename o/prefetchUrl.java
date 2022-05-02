package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface prefetchUrl {
    @OperationType("com.alipay.fc.riskcloud.dispatch")
    @SignCheck
    createOnlineResource getSecurityQuestionState(OfflineMode offlineMode);
}
