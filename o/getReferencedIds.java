package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

public final class getReferencedIds implements updatePostLayout<Drawable> {
    private final updatePostLayout<Bitmap> getMax;
    private final boolean length;

    public getReferencedIds(updatePostLayout<Bitmap> updatepostlayout, boolean z) {
        this.getMax = updatepostlayout;
        this.length = z;
    }

    @NonNull
    public final fireTrigger<Drawable> getMax(@NonNull Context context, @NonNull fireTrigger<Drawable> firetrigger, int i, int i2) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(556488932, oncanceled);
            onCancelLoad.getMin(556488932, oncanceled);
        }
        rebuildScene rebuildscene = Glide.setMax(context).getMin;
        Drawable min = firetrigger.setMin();
        fireTrigger<Bitmap> min2 = setMargin.setMin(rebuildscene, min, i, i2);
        if (min2 != null) {
            fireTrigger<Bitmap> max2 = this.getMax.getMax(context, min2, i, i2);
            if (max2.equals(min2)) {
                max2.length();
                return firetrigger;
            }
            Resources resources = context.getResources();
            if (max2 == null) {
                return null;
            }
            return new validateParams(resources, max2);
        } else if (!this.length) {
            return firetrigger;
        } else {
            StringBuilder sb = new StringBuilder("Unable to convert ");
            sb.append(min);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getReferencedIds) {
            return this.getMax.equals(((getReferencedIds) obj).getMax);
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
