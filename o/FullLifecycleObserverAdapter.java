package o;

import com.google.zxing.client.android.InactivityTimer;

public final class FullLifecycleObserverAdapter implements Runnable {
    private final boolean getMax;
    private final InactivityTimer.PowerStatusReceiver setMax;

    public FullLifecycleObserverAdapter(InactivityTimer.PowerStatusReceiver powerStatusReceiver, boolean z) {
        this.setMax = powerStatusReceiver;
        this.getMax = z;
    }

    public final void run() {
        this.setMax.lambda$onReceive$0(this.getMax);
    }
}
