package androidx.media;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat {
    private final int getMax;
    private int getMin;
    private final int setMax;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public void setMax(int i) {
    }

    public void setMin(int i) {
    }

    public final int setMax() {
        return this.getMin;
    }

    public final int getMin() {
        return this.getMax;
    }

    public final int getMax() {
        return this.setMax;
    }
}
