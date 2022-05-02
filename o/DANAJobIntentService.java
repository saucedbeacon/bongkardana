package o;

import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import javax.annotation.Nullable;

public abstract class DANAJobIntentService implements FlipperPlugin {
    private static final int BUFFER_SIZE = 500;
    @Nullable
    private dispatchKeyShortcutEvent mConnection;
    @Nullable
    private onStartCommand<setMax> mEventQueue;

    public boolean runInBackground() {
        return true;
    }

    public synchronized void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) {
        this.mConnection = dispatchkeyshortcutevent;
        sendBufferedEvents();
    }

    public synchronized void onDisconnect() {
        this.mConnection = null;
    }

    public synchronized dispatchKeyShortcutEvent getConnection() {
        return this.mConnection;
    }

    public synchronized boolean isConnected() {
        return this.mConnection != null;
    }

    public synchronized void send(String str, FlipperObject flipperObject) {
        if (this.mEventQueue == null) {
            this.mEventQueue = new onStartCommand<>();
        }
        if (this.mConnection != null) {
            this.mConnection.setMax(str, flipperObject);
            return;
        }
        onStartCommand<setMax> onstartcommand = this.mEventQueue;
        setMax setmax = new setMax(str, flipperObject, (byte) 0);
        if (onstartcommand.getMax.size() >= onstartcommand.setMax) {
            onstartcommand.getMax.remove(0);
        }
        onstartcommand.getMax.add(setmax);
    }

    private synchronized void sendBufferedEvents() {
        if (!(this.mEventQueue == null || this.mConnection == null)) {
            for (T t : this.mEventQueue.getMax) {
                this.mConnection.setMax(t.setMax, t.setMin);
            }
            this.mEventQueue.getMax.clear();
        }
    }

    static class setMax {
        final String setMax;
        final FlipperObject setMin;

        /* synthetic */ setMax(String str, FlipperObject flipperObject, byte b) {
            this(str, flipperObject);
        }

        private setMax(String str, FlipperObject flipperObject) {
            this.setMax = str;
            this.setMin = flipperObject;
        }
    }
}
