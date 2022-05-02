package o;

import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;

final class isTinyApp implements ICommonConfigListener {
    private final IComponent setMax;
    private final handleMessage setMin;

    public isTinyApp(handleMessage handlemessage, IComponent iComponent) {
        this.setMin = handlemessage;
        this.setMax = iComponent;
    }

    public final void onCommonConfigChanged(String str, Object obj, ConfigChangeType configChangeType) {
        this.setMin.lambda$monitorCertificatesUrl$18(this.setMax, str, obj, configChangeType);
    }
}
