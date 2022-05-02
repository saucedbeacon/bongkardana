package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface onEmbedViewVisibilityChanged {
    @OperationType("alipay.client.yunpushcore.bind")
    @SignCheck
    onSurfaceAvailable bindApp(onWebViewPause onwebviewpause);

    @OperationType("alipay.client.yunpushcore.device.report")
    @SignCheck
    ResourceResponseInfo reportDevice(IEmbedViewManager iEmbedViewManager);

    @OperationType("alipay.client.yunpushcore.unbind")
    @SignCheck
    ReceivedHeaderPoint unBindApp(onSurfaceSizeChanged onsurfacesizechanged);
}
