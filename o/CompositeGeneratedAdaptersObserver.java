package o;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;

public final class CompositeGeneratedAdaptersObserver implements Runnable {
    private final ConfigContainer getMax;
    private final String getMin;
    private final BiConsumer setMax;

    public CompositeGeneratedAdaptersObserver(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        this.setMax = biConsumer;
        this.getMin = str;
        this.getMax = configContainer;
    }

    public final void run() {
        ConfigGetParameterHandler.setMin(this.setMax, this.getMin, this.getMax);
    }
}
