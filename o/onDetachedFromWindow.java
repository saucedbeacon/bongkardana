package o;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

public final class onDetachedFromWindow {
    private setMin getMax;
    public final hasText length;
    private final Handler setMin = new Handler();

    public onDetachedFromWindow(@NonNull setChecked setchecked) {
        this.length = new hasText(setchecked);
    }

    public final void getMax(Lifecycle.Event event) {
        setMin setmin = this.getMax;
        if (setmin != null) {
            setmin.run();
        }
        setMin setmin2 = new setMin(this.length, event);
        this.getMax = setmin2;
        this.setMin.postAtFrontOfQueue(setmin2);
    }

    static class setMin implements Runnable {
        private final hasText getMax;
        final Lifecycle.Event getMin;
        private boolean setMax = false;

        setMin(@NonNull hasText hastext, Lifecycle.Event event) {
            this.getMax = hastext;
            this.getMin = event;
        }

        public final void run() {
            if (!this.setMax) {
                hasText hastext = this.getMax;
                Lifecycle.Event event = this.getMin;
                hastext.getMin("handleLifecycleEvent");
                hastext.getMax(event.getTargetState());
                this.setMax = true;
            }
        }
    }
}
