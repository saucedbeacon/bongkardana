package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.offsetPositionRecordsForInsert;

public abstract class invalidateItemDecorations<T extends Animator> {
    protected T getMin;
    public offsetPositionRecordsForInsert.setMax length;
    protected long setMin = 350;

    @NonNull
    public abstract T getMax();

    public abstract invalidateItemDecorations getMax(float f);

    public invalidateItemDecorations(@Nullable offsetPositionRecordsForInsert.setMax setmax) {
        this.length = setmax;
        this.getMin = getMax();
    }

    public invalidateItemDecorations length(long j) {
        this.setMin = j;
        T t = this.getMin;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public final void length() {
        T t = this.getMin;
        if (t != null && !t.isRunning()) {
            this.getMin.start();
        }
    }

    public final void getMin() {
        T t = this.getMin;
        if (t != null && t.isStarted()) {
            this.getMin.end();
        }
    }
}
