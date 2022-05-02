package o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

public final class setScaleX<T> implements updatePostLayout<T> {
    private final Collection<? extends updatePostLayout<T>> setMax;

    @SafeVarargs
    public setScaleX(@NonNull updatePostLayout<T>... updatepostlayoutArr) {
        if (updatepostlayoutArr.length != 0) {
            this.setMax = Arrays.asList(updatepostlayoutArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @NonNull
    public final fireTrigger<T> getMax(@NonNull Context context, @NonNull fireTrigger<T> firetrigger, int i, int i2) {
        fireTrigger<T> firetrigger2 = firetrigger;
        for (updatePostLayout max : this.setMax) {
            fireTrigger<T> max2 = max.getMax(context, firetrigger2, i, i2);
            if (firetrigger2 != null && !firetrigger2.equals(firetrigger) && !firetrigger2.equals(max2)) {
                firetrigger2.length();
            }
            firetrigger2 = max2;
        }
        return firetrigger2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setScaleX) {
            return this.setMax.equals(((setScaleX) obj).setMax);
        }
        return false;
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        for (updatePostLayout max : this.setMax) {
            max.setMax(messageDigest);
        }
    }
}
