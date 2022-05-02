package o;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;
import o.onTextChanged;

public final class setTextAppearance extends onTextChanged {
    setTextAppearance(getMin getmin) {
        super(getmin.setMax, getmin.setMin, getmin.getMax);
    }

    public static final class getMin extends onTextChanged.getMax<getMin, setTextAppearance> {
        /* access modifiers changed from: package-private */
        @NonNull
        public final /* bridge */ /* synthetic */ onTextChanged.getMax getMax() {
            return this;
        }

        public getMin(@NonNull Class<? extends ListenableWorker> cls, long j, @NonNull TimeUnit timeUnit) {
            super(cls);
            getInternalPopup getinternalpopup = this.setMin;
            long millis = timeUnit.toMillis(j);
            long j2 = 900000;
            if (millis < 900000) {
                setSupportBackgroundTintList.getMax();
                Long.valueOf(900000);
                millis = 900000;
            }
            if (millis < 900000) {
                setSupportBackgroundTintList.getMax();
                Long.valueOf(900000);
            } else {
                j2 = millis;
            }
            if (millis < 300000) {
                setSupportBackgroundTintList.getMax();
                Long.valueOf(300000);
                millis = 300000;
            }
            if (millis > j2) {
                setSupportBackgroundTintList.getMax();
                Long.valueOf(j2);
                millis = j2;
            }
            getinternalpopup.isInside = j2;
            getinternalpopup.equals = millis;
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public final /* synthetic */ onTextChanged setMax() {
            if (this.length && Build.VERSION.SDK_INT >= 23 && this.setMin.toFloatRange.setMin()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!this.setMin.valueOf || Build.VERSION.SDK_INT < 23 || !this.setMin.toFloatRange.setMin()) {
                return new setTextAppearance(this);
            } else {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
        }
    }
}
