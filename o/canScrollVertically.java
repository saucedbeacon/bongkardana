package o;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.Collection;

public final class canScrollVertically {
    private static final Collection<String> equals;
    private static final String getMin = canScrollVertically.class.getSimpleName();
    /* access modifiers changed from: private */
    public Handler IsOverlapping = new Handler(this.toIntRange);
    boolean getMax;
    private final Camera.AutoFocusCallback isInside = new Camera.AutoFocusCallback() {
        public final void onAutoFocus(boolean z, Camera camera) {
            canScrollVertically.this.IsOverlapping.post(new canScrollHorizontally(this));
        }
    };
    /* access modifiers changed from: private */
    public boolean length;
    private final boolean setMax;
    private final Camera setMin;
    /* access modifiers changed from: private */
    public int toFloatRange = 1;
    private final Handler.Callback toIntRange = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != canScrollVertically.this.toFloatRange) {
                return false;
            }
            canScrollVertically.this.getMin();
            return true;
        }
    };

    static {
        ArrayList arrayList = new ArrayList(2);
        equals = arrayList;
        arrayList.add("auto");
        equals.add("macro");
    }

    public canScrollVertically(Camera camera, CameraSettings cameraSettings) {
        boolean z = true;
        this.setMin = camera;
        this.setMax = (!cameraSettings.length() || !equals.contains(camera.getParameters().getFocusMode())) ? false : z;
        this.getMax = false;
        getMin();
    }

    /* access modifiers changed from: private */
    public synchronized void setMax() {
        if (!this.getMax && !this.IsOverlapping.hasMessages(this.toFloatRange)) {
            this.IsOverlapping.sendMessageDelayed(this.IsOverlapping.obtainMessage(this.toFloatRange), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        if (this.setMax && !this.getMax && !this.length) {
            try {
                this.setMin.autoFocus(this.isInside);
                this.length = true;
            } catch (RuntimeException unused) {
                setMax();
            }
        }
    }

    public final void setMin() {
        this.getMax = true;
        this.length = false;
        this.IsOverlapping.removeMessages(this.toFloatRange);
        if (this.setMax) {
            try {
                this.setMin.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
