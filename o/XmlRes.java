package o;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat;
import o.Experimental;

public final class XmlRes {
    @NonNull
    private final Handler length;
    @NonNull
    private final FontsContractCompat.FontRequestCallback setMin;

    public XmlRes(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        this.setMin = fontRequestCallback;
        this.length = handler;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull Experimental.Level.setMin setmin) {
        if (setmin.setMax()) {
            final Typeface typeface = setmin.setMin;
            final FontsContractCompat.FontRequestCallback fontRequestCallback = this.setMin;
            this.length.post(new Runnable() {
                public final void run() {
                    fontRequestCallback.length(typeface);
                }
            });
            return;
        }
        final int i = setmin.length;
        final FontsContractCompat.FontRequestCallback fontRequestCallback2 = this.setMin;
        this.length.post(new Runnable() {
            public final void run() {
                fontRequestCallback2.getMin(i);
            }
        });
    }
}
