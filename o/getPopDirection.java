package o;

import com.google.android.exoplayer2.util.EventDispatcher;

public final class getPopDirection implements Runnable {
    private final Object length;
    private final EventDispatcher.Event setMax;

    public getPopDirection(EventDispatcher.Event event, Object obj) {
        this.setMax = event;
        this.length = obj;
    }

    public final void run() {
        this.setMax.sendTo(this.length);
    }
}
