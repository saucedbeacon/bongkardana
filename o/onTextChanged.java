package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class onTextChanged {
    @NonNull
    public getInternalPopup getMax;
    @NonNull
    public Set<String> setMax;
    @NonNull
    public UUID setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public onTextChanged(@NonNull UUID uuid, @NonNull getInternalPopup getinternalpopup, @NonNull Set<String> set) {
        this.setMin = uuid;
        this.getMax = getinternalpopup;
        this.setMax = set;
    }

    public static abstract class getMax<B extends getMax<?, ?>, W extends onTextChanged> {
        public Set<String> getMax = new HashSet();
        Class<? extends ListenableWorker> getMin;
        boolean length = false;
        UUID setMax = UUID.randomUUID();
        public getInternalPopup setMin;

        @NonNull
        public abstract B getMax();

        /* access modifiers changed from: package-private */
        @NonNull
        public abstract W setMax();

        getMax(@NonNull Class<? extends ListenableWorker> cls) {
            this.getMin = cls;
            this.setMin = new getInternalPopup(this.setMax.toString(), cls.getName());
            this.getMax.add(cls.getName());
        }

        @NonNull
        public final B length(@NonNull BackoffPolicy backoffPolicy, @NonNull TimeUnit timeUnit) {
            this.length = true;
            this.setMin.FastBitmap$CoordinateSystem = backoffPolicy;
            getInternalPopup getinternalpopup = this.setMin;
            long j = 10000;
            long millis = timeUnit.toMillis(10000);
            if (millis > 18000000) {
                setSupportBackgroundTintList.getMax();
                millis = 18000000;
            }
            if (millis < 10000) {
                setSupportBackgroundTintList.getMax();
            } else {
                j = millis;
            }
            getinternalpopup.toString = j;
            return getMax();
        }

        @NonNull
        public final B setMax(long j, @NonNull TimeUnit timeUnit) {
            this.setMin.IsOverlapping = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.setMin.IsOverlapping) {
                return getMax();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NonNull
        public final W setMin() {
            W max = setMax();
            this.setMax = UUID.randomUUID();
            getInternalPopup getinternalpopup = new getInternalPopup(this.setMin);
            this.setMin = getinternalpopup;
            getinternalpopup.getMax = this.setMax.toString();
            return max;
        }
    }
}
