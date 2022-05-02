package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import java.util.List;
import java.util.Map;

public final class setFirstHorizontalStyle extends ContextWrapper {
    @VisibleForTesting
    static final setFirstHorizontalBias<?, ?> getMin = new setVerticalBias();
    @GuardedBy("this")
    @Nullable
    private dispatchApplyWindowInsetsToBehaviors FastBitmap$CoordinateSystem;
    private final Glide.length IsOverlapping;
    private final getChildRect equals;
    final Map<Class<?>, setFirstHorizontalBias<?, ?>> getMax;
    private final boolean isInside;
    public final Registry length;
    public final setOnHide setMax;
    final List<parseBehavior<Object>> setMin;
    private final int toFloatRange;
    private final setDebugMode toIntRange;

    public setFirstHorizontalStyle(@NonNull Context context, @NonNull setOnHide setonhide, @NonNull Registry registry, @NonNull getChildRect getchildrect, @NonNull Glide.length length2, @NonNull Map<Class<?>, setFirstHorizontalBias<?, ?>> map, @NonNull List<parseBehavior<Object>> list, @NonNull setDebugMode setdebugmode, boolean z, int i) {
        super(context.getApplicationContext());
        this.setMax = setonhide;
        this.length = registry;
        this.equals = getchildrect;
        this.IsOverlapping = length2;
        this.setMin = list;
        this.getMax = map;
        this.toIntRange = setdebugmode;
        this.isInside = z;
        this.toFloatRange = i;
    }

    public final synchronized dispatchApplyWindowInsetsToBehaviors getMax() {
        if (this.FastBitmap$CoordinateSystem == null) {
            this.FastBitmap$CoordinateSystem = (dispatchApplyWindowInsetsToBehaviors) this.IsOverlapping.setMax().values();
        }
        return this.FastBitmap$CoordinateSystem;
    }

    @NonNull
    public final setDebugMode length() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1573174583, oncanceled);
            onCancelLoad.getMin(1573174583, oncanceled);
        }
        return this.toIntRange;
    }

    public final int setMin() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(852906094, oncanceled);
            onCancelLoad.getMin(852906094, oncanceled);
        }
        return this.toFloatRange;
    }

    public final boolean setMax() {
        return this.isInside;
    }

    @NonNull
    public static <X> layoutChildWithKeyline<ImageView, X> getMin(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        if (Bitmap.class.equals(cls)) {
            return new getSuggestedMinimumWidth(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new getLastChildRect(imageView);
        }
        StringBuilder sb = new StringBuilder("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
