package o;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import o.onTextChanged;

public final class setBackgroundDrawable extends onTextChanged {
    setBackgroundDrawable(getMin getmin) {
        super(getmin.setMax, getmin.setMin, getmin.getMax);
    }

    public static final class getMin extends onTextChanged.getMax<getMin, setBackgroundDrawable> {
        /* access modifiers changed from: package-private */
        @NonNull
        public final /* bridge */ /* synthetic */ onTextChanged.getMax getMax() {
            return this;
        }

        public getMin(@NonNull Class<? extends ListenableWorker> cls) {
            super(cls);
            this.setMin.length = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public final /* synthetic */ onTextChanged setMax() {
            if (this.length && Build.VERSION.SDK_INT >= 23 && this.setMin.toFloatRange.setMin()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!this.setMin.valueOf || Build.VERSION.SDK_INT < 23 || !this.setMin.toFloatRange.setMin()) {
                return new setBackgroundDrawable(this);
            } else {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
        }
    }
}
