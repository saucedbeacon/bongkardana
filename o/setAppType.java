package o;

import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;

final class setAppType implements ICommonConfigListener {
    private final handleMessage getMax;
    private final IComponent setMin;

    public setAppType(handleMessage handlemessage, IComponent iComponent) {
        this.getMax = handlemessage;
        this.setMin = iComponent;
    }

    public final void onCommonConfigChanged(String str, Object obj, ConfigChangeType configChangeType) {
        this.getMax.lambda$getAndMonitorCertificateWhitelist$19(this.setMin, str, obj, configChangeType);
    }
}
