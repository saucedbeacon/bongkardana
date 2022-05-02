package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class setSupportImageTintList<T> extends AppCompatMultiAutoCompleteTextView<T> {
    private static final String setMin = setSupportBackgroundTintList.length("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver setMax = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                setSupportImageTintList.this.setMin(intent);
            }
        }
    };

    public abstract IntentFilter getMax();

    public abstract void setMin(@NonNull Intent intent);

    public setSupportImageTintList(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        super(context, getminwidthminor);
    }

    public final void setMin() {
        setSupportBackgroundTintList.getMax();
        getClass().getSimpleName();
        this.getMin.registerReceiver(this.setMax, getMax());
    }

    public final void getMin() {
        setSupportBackgroundTintList.getMax();
        getClass().getSimpleName();
        this.getMin.unregisterReceiver(this.setMax);
    }
}
