package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationClient$1;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getAnimatedVisibility;

public class setContentHeight {
    final Runnable FastBitmap$CoordinateSystem = new Runnable() {
        public final void run() {
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = setContentHeight.this.equals;
                if (iMultiInstanceInvalidationService != null) {
                    setContentHeight.this.length = iMultiInstanceInvalidationService.registerCallback(setContentHeight.this.IsOverlapping, setContentHeight.this.setMin);
                    setContentHeight.this.getMax.setMax(setContentHeight.this.setMax);
                }
            } catch (RemoteException unused) {
            }
        }
    };
    public final IMultiInstanceInvalidationCallback IsOverlapping = new MultiInstanceInvalidationClient$1(this);
    @Nullable
    public IMultiInstanceInvalidationService equals;
    public final getAnimatedVisibility getMax;
    public final Context getMin;
    public final Executor isInside;
    public int length;
    public final getAnimatedVisibility.setMax setMax;
    final String setMin;
    final Runnable toDoubleRange = new Runnable() {
        public final void run() {
            setContentHeight.this.getMax.length(setContentHeight.this.setMax);
        }
    };
    public final ServiceConnection toFloatRange = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            setContentHeight.this.equals = IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
            setContentHeight.this.isInside.execute(setContentHeight.this.FastBitmap$CoordinateSystem);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            setContentHeight.this.isInside.execute(setContentHeight.this.toDoubleRange);
            setContentHeight.this.equals = null;
        }
    };
    public final AtomicBoolean toIntRange = new AtomicBoolean(false);

    public setContentHeight(Context context, String str, getAnimatedVisibility getanimatedvisibility, Executor executor) {
        this.getMin = context.getApplicationContext();
        this.setMin = str;
        this.getMax = getanimatedvisibility;
        this.isInside = executor;
        this.setMax = new getAnimatedVisibility.setMax((String[]) getanimatedvisibility.setMax.keySet().toArray(new String[0])) {
            /* access modifiers changed from: package-private */
            public final boolean setMin() {
                return true;
            }

            public final void getMin(@NonNull Set<String> set) {
                if (!setContentHeight.this.toIntRange.get()) {
                    try {
                        IMultiInstanceInvalidationService iMultiInstanceInvalidationService = setContentHeight.this.equals;
                        if (iMultiInstanceInvalidationService != null) {
                            iMultiInstanceInvalidationService.broadcastInvalidation(setContentHeight.this.length, (String[]) set.toArray(new String[0]));
                        }
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        this.getMin.bindService(new Intent(this.getMin, MultiInstanceInvalidationService.class), this.toFloatRange, 1);
    }
}
