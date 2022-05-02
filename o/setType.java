package o;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;

public abstract class setType implements updatePostLayout<Bitmap> {
    /* access modifiers changed from: protected */
    public abstract Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2);

    @NonNull
    public final fireTrigger<Bitmap> getMax(@NonNull Context context, @NonNull fireTrigger<Bitmap> firetrigger, int i, int i2) {
        if (getDependents.length(i, i2)) {
            rebuildScene rebuildscene = Glide.setMax(context).getMin;
            Bitmap min = firetrigger.setMin();
            if (i == Integer.MIN_VALUE) {
                i = min.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = min.getHeight();
            }
            Bitmap max = setMax(rebuildscene, min, i, i2);
            if (min.equals(max)) {
                return firetrigger;
            }
            if (max == null) {
                return null;
            }
            return new getType(max, rebuildscene);
        }
        StringBuilder sb = new StringBuilder("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
