package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class getDesignTool {
    private final Handler getMax = new Handler(Looper.getMainLooper(), new getMin());
    private boolean length;

    getDesignTool() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMax(fireTrigger<?> firetrigger, boolean z) {
        if (!this.length) {
            if (!z) {
                this.length = true;
                firetrigger.length();
                this.length = false;
                return;
            }
        }
        this.getMax.obtainMessage(1, firetrigger).sendToTarget();
    }

    static final class getMin implements Handler.Callback {
        getMin() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((fireTrigger) message.obj).length();
            return true;
        }
    }
}
