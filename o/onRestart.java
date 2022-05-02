package o;

import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;

final class onRestart implements ICommonConfigListener {
    private final IComponent getMin;

    public onRestart(IComponent iComponent) {
        this.getMin = iComponent;
    }

    public final void onCommonConfigChanged(String str, Object obj, ConfigChangeType configChangeType) {
        handleMessage.lambda$monitorPinningMode$17(this.getMin, str, obj, configChangeType);
    }
}
