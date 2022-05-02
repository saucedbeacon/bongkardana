package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public final class updatePostMeasure implements setElevation<Uri, Bitmap> {
    private final rebuildScene getMin;
    private final setMinHeight setMax;

    @Nullable
    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        fireTrigger<Drawable> length = this.setMax.length((Uri) obj);
        if (length == null) {
            return null;
        }
        return setMargin.setMin(this.getMin, length.setMin(), i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return length((Uri) obj);
    }

    public updatePostMeasure(setMinHeight setminheight, rebuildScene rebuildscene) {
        this.setMax = setminheight;
        this.getMin = rebuildscene;
    }

    private static boolean length(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }
}
