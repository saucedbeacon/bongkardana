package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.net.ConnectivityManagerCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppCompatRadioButton extends AppCompatMultiAutoCompleteTextView<onTextContextMenuItem> {
    static final String setMax = setSupportBackgroundTintList.length("NetworkStateTracker");
    private getMin equals;
    @RequiresApi(24)
    private setMin isInside;
    private final ConnectivityManager setMin = ((ConnectivityManager) this.getMin.getSystemService("connectivity"));

    public AppCompatRadioButton(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        super(context, getminwidthminor);
        if (getMax()) {
            this.isInside = new setMin();
        } else {
            this.equals = new getMin();
        }
    }

    public final void setMin() {
        if (getMax()) {
            try {
                setSupportBackgroundTintList.getMax();
                this.setMin.registerDefaultNetworkCallback(this.isInside);
            } catch (IllegalArgumentException | SecurityException e) {
                setSupportBackgroundTintList.getMax();
                new Throwable[1][0] = e;
            }
        } else {
            setSupportBackgroundTintList.getMax();
            this.getMin.registerReceiver(this.equals, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final void getMin() {
        if (getMax()) {
            try {
                setSupportBackgroundTintList.getMax();
                this.setMin.unregisterNetworkCallback(this.isInside);
            } catch (IllegalArgumentException | SecurityException e) {
                setSupportBackgroundTintList.getMax();
                new Throwable[1][0] = e;
            }
        } else {
            setSupportBackgroundTintList.getMax();
            this.getMin.unregisterReceiver(this.equals);
        }
    }

    private static boolean getMax() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: setMax */
    public final onTextContextMenuItem length() {
        NetworkInfo activeNetworkInfo = this.setMin.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean equals2 = equals();
        boolean length = ConnectivityManagerCompat.length(this.setMin);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new onTextContextMenuItem(z2, equals2, length, z);
    }

    @VisibleForTesting
    private boolean equals() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.setMin.getNetworkCapabilities(this.setMin.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            setSupportBackgroundTintList.getMax();
            new Throwable[1][0] = e;
            return false;
        }
    }

    @RequiresApi(24)
    class setMin extends ConnectivityManager.NetworkCallback {
        setMin() {
        }

        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            setSupportBackgroundTintList.getMax();
            String str = AppCompatRadioButton.setMax;
            AppCompatRadioButton appCompatRadioButton = AppCompatRadioButton.this;
            appCompatRadioButton.getMax(appCompatRadioButton.length());
        }

        public void onLost(@NonNull Network network) {
            setSupportBackgroundTintList.getMax();
            String str = AppCompatRadioButton.setMax;
            AppCompatRadioButton appCompatRadioButton = AppCompatRadioButton.this;
            appCompatRadioButton.getMax(appCompatRadioButton.length());
        }
    }

    class getMin extends BroadcastReceiver {
        getMin() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                setSupportBackgroundTintList.getMax();
                String str = AppCompatRadioButton.setMax;
                AppCompatRadioButton appCompatRadioButton = AppCompatRadioButton.this;
                appCompatRadioButton.getMax(appCompatRadioButton.length());
            }
        }
    }
}
