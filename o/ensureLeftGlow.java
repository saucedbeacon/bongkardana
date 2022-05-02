package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;

public class ensureLeftGlow {
    public final Context getMax;
    @VisibleForTesting
    public final OrientationEventListener getMin;
    public int length = -1;
    public int setMax = -1;
    @VisibleForTesting
    public final DisplayManager.DisplayListener setMin;
    /* access modifiers changed from: private */
    public final getMax toFloatRange;

    public interface getMax {
        void length(int i, boolean z);

        void setMin(int i);
    }

    public ensureLeftGlow(@NonNull Context context, @NonNull getMax getmax) {
        this.getMax = context;
        this.toFloatRange = getmax;
        this.getMin = new OrientationEventListener(context.getApplicationContext()) {
            public final void onOrientationChanged(int i) {
                int i2 = 0;
                if (i == -1) {
                    if (ensureLeftGlow.this.setMax != -1) {
                        i2 = ensureLeftGlow.this.setMax;
                    }
                } else if (i < 315 && i >= 45) {
                    if (i >= 45 && i < 135) {
                        i2 = 90;
                    } else if (i >= 135 && i < 225) {
                        i2 = 180;
                    } else if (i >= 225 && i < 315) {
                        i2 = 270;
                    }
                }
                if (i2 != ensureLeftGlow.this.setMax) {
                    int unused = ensureLeftGlow.this.setMax = i2;
                    ensureLeftGlow.this.toFloatRange.setMin(ensureLeftGlow.this.setMax);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 17) {
            this.setMin = new DisplayManager.DisplayListener() {
                public final void onDisplayAdded(int i) {
                    int max = dispatchOnCancelled.setMax(i);
                    if (i != max) {
                        onCanceled oncanceled = new onCanceled(i, max, 1);
                        onCancelLoad.setMax(-238116679, oncanceled);
                        onCancelLoad.getMin(-238116679, oncanceled);
                    }
                }

                public final void onDisplayRemoved(int i) {
                }

                public final void onDisplayChanged(int i) {
                    int length = ensureLeftGlow.this.length;
                    int max = ensureLeftGlow.this.getMax();
                    if (max != length) {
                        int unused = ensureLeftGlow.this.length = max;
                        ensureLeftGlow.this.toFloatRange.length(max, Math.abs(max - length) != 180);
                    }
                }
            };
        } else {
            this.setMin = null;
        }
    }

    public final void setMin() {
        this.length = getMax();
        if (Build.VERSION.SDK_INT >= 17) {
            ((DisplayManager) this.getMax.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).registerDisplayListener(this.setMin, (Handler) null);
        }
        this.getMin.enable();
    }

    /* access modifiers changed from: private */
    public int getMax() {
        int rotation = ((WindowManager) this.getMax.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
