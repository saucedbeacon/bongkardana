package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import o.calculateDtToFit;

public abstract class onPointerUp {
    protected Exception getMin;
    @VisibleForTesting(otherwise = 4)
    calculateDtToFit.length length;
    @VisibleForTesting
    length setMax;

    public interface length {
        void getMax(@Nullable calculateDtToFit.length length, @Nullable Exception exc);

        void getMin(boolean z);
    }

    public abstract void getMax();

    public onPointerUp(@NonNull calculateDtToFit.length length2, @Nullable length length3) {
        this.length = length2;
        this.setMax = length3;
    }

    /* access modifiers changed from: protected */
    public void getMin() {
        length length2 = this.setMax;
        if (length2 != null) {
            length2.getMax(this.length, this.getMin);
            this.setMax = null;
            this.length = null;
        }
    }
}
