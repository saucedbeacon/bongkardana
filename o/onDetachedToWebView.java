package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface onDetachedToWebView {
    @OperationType("alipayplus.mobilewallet.user.notification.fetchInbox")
    @SignCheck
    getSnapshot fetchInboxNotification(onParamChanged onparamchanged);

    @OperationType("alipayplus.mobilewallet.user.notification.hasNew")
    @SignCheck
    ResourceResponsePoint hasNewNotification(onAttachedToWebView onattachedtowebview);

    @OperationType("alipayplus.mobilewallet.user.notification.markAsRead")
    @SignCheck
    CreateWorkerPoint markAsReadNotification(onSurfaceDestroyed onsurfacedestroyed);
}
