package o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.ConstraintLayout;

final class Constraints implements Group {
    private final Set<setGuidelinePercent> getMax = Collections.newSetFromMap(new WeakHashMap());
    private boolean getMin;
    private boolean setMin;

    Constraints() {
    }

    public final void getMax(@NonNull setGuidelinePercent setguidelinepercent) {
        this.getMax.add(setguidelinepercent);
        if (this.getMin) {
            setguidelinepercent.setMin();
        } else if (this.setMin) {
            setguidelinepercent.setMax();
        } else {
            setguidelinepercent.getMin();
        }
    }

    final class LayoutParams implements ConstraintLayout.LayoutParams {
        final ConstraintLayout.LayoutParams.length getMax;
        private final BroadcastReceiver getMin = new BroadcastReceiver() {
            public final void onReceive(@NonNull Context context, Intent intent) {
                boolean z = LayoutParams.this.length;
                LayoutParams.this.length = LayoutParams.setMin(context);
                if (z != LayoutParams.this.length) {
                    LayoutParams.this.getMax.getMax(LayoutParams.this.length);
                }
            }
        };
        boolean length;
        private boolean setMax;
        private final Context setMin;

        public final void setMin() {
        }

        LayoutParams(@NonNull Context context, @NonNull ConstraintLayout.LayoutParams.length length2) {
            this.setMin = context.getApplicationContext();
            this.getMax = length2;
        }

        @SuppressLint({"MissingPermission"})
        static boolean setMin(@NonNull Context context) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        return false;
                    }
                    return true;
                } catch (RuntimeException unused) {
                    return true;
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }

        public final void setMax() {
            if (!this.setMax) {
                this.length = setMin(this.setMin);
                try {
                    this.setMin.registerReceiver(this.getMin, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.setMax = true;
                } catch (SecurityException unused) {
                }
            }
        }

        public final void getMin() {
            if (this.setMax) {
                this.setMin.unregisterReceiver(this.getMin);
                this.setMax = false;
            }
        }
    }

    public final void getMin(@NonNull setGuidelinePercent setguidelinepercent) {
        this.getMax.remove(setguidelinepercent);
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        this.setMin = true;
        for (T max : getDependents.getMin(this.getMax)) {
            max.setMax();
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax() {
        this.setMin = false;
        for (T min : getDependents.getMin(this.getMax)) {
            min.getMin();
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        this.getMin = true;
        for (T min : getDependents.getMin(this.getMax)) {
            min.setMin();
        }
    }
}
