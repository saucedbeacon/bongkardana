package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface AppInteractionPoint {
    public static final String METHOD_DELETE_FEEDS = "deleteActivity";
    public static final String METHOD_FEEDS = "fetchActivity";

    @OperationType("alipayplus.mobilewallet.feeds.deleteActivity")
    @SignCheck
    intercept deleteActivity(onAppLeaveHint onappleavehint);

    @OperationType("alipayplus.mobilewallet.feeds.fetchActivity")
    @SignCheck
    loadApp fetchActivity(AppLoadInterceptorPoint appLoadInterceptorPoint);
}
