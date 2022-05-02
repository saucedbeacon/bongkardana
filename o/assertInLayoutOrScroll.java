package o;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

public interface assertInLayoutOrScroll<T> {
    @NonNull
    PointF getMin(@NonNull PointF pointF);

    @NonNull
    T setMin(@NonNull RectF rectF, int i);
}
