package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface layoutChildWithAnchor<R> extends setGuidelinePercent {
    @Nullable
    getResolvedLayoutParams getMax();

    void getMax(@Nullable Drawable drawable);

    void getMin(@Nullable Drawable drawable);

    void getMin(@NonNull R r);

    void getMin(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints);

    void length(@Nullable Drawable drawable);

    void setMax(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints);

    void setMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams);
}
