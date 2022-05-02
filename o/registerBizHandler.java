package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface registerBizHandler {
    @OperationType("alipayplus.mobilewallet.wallet.tab.home")
    @SignCheck
    flushMessages getHomeInfo(removeToken removetoken);
}
