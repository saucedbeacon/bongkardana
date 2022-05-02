package o;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

public final class resolveMeasuredDimension implements updatePostLayout<getViewWidget> {
    private final updatePostLayout<Bitmap> getMax;

    public resolveMeasuredDimension(updatePostLayout<Bitmap> updatepostlayout) {
        if (updatepostlayout != null) {
            this.getMax = updatepostlayout;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @NonNull
    public final fireTrigger<getViewWidget> getMax(@NonNull Context context, @NonNull fireTrigger<getViewWidget> firetrigger, int i, int i2) {
        getViewWidget min = firetrigger.setMin();
        getType gettype = new getType(min.getMax.getMin.IsOverlapping, Glide.setMax(context).getMin);
        fireTrigger<Bitmap> max = this.getMax.getMax(context, gettype, i, i2);
        if (!gettype.equals(max)) {
            gettype.length();
        }
        updatePostLayout<Bitmap> updatepostlayout = this.getMax;
        min.getMax.getMin.getMin(updatepostlayout, max.setMin());
        return firetrigger;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof resolveMeasuredDimension) {
            return this.getMax.equals(((resolveMeasuredDimension) obj).getMax);
        }
        return false;
    }

    public final int hashCode() {
        return this.getMax.hashCode();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        this.getMax.setMax(messageDigest);
    }
}
