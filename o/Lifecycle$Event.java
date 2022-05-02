package o;

import com.google.zxing.client.android.AmbientLightManager;

public final class Lifecycle$Event implements Runnable {
    private final AmbientLightManager setMax;
    private final boolean setMin;

    public Lifecycle$Event(AmbientLightManager ambientLightManager, boolean z) {
        this.setMax = ambientLightManager;
        this.setMin = z;
    }

    public final void run() {
        this.setMax.lambda$setTorch$0(this.setMin);
    }
}
