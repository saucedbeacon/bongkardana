package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

final class isShuffleModeEnabledRemoved extends getRatingType {
    private final WeakReference<Context> setMax;

    public isShuffleModeEnabledRemoved(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.setMax = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.setMax.get();
        if (!(drawable == null || context == null)) {
            getRepeatMode.setMin().length(context, i, drawable);
        }
        return drawable;
    }
}
