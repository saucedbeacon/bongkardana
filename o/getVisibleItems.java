package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public abstract class getVisibleItems extends RecyclerView.ItemAnimator {
    boolean toString = true;

    public abstract boolean length(RecyclerView.valueOf valueof);

    public abstract boolean setMax(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4);

    public abstract boolean setMin(RecyclerView.valueOf valueof);

    public abstract boolean setMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4);

    public final boolean setMax(@NonNull RecyclerView.valueOf valueof) {
        return !this.toString || valueof.isInvalid();
    }

    public final boolean getMin(@NonNull RecyclerView.valueOf valueof, @NonNull RecyclerView.ItemAnimator.setMax setmax, @Nullable RecyclerView.ItemAnimator.setMax setmax2) {
        int i = setmax.getMin;
        int i2 = setmax.setMax;
        View view = valueof.itemView;
        int left = setmax2 == null ? view.getLeft() : setmax2.getMin;
        int top = setmax2 == null ? view.getTop() : setmax2.setMax;
        if (valueof.isRemoved() || (i == left && i2 == top)) {
            return setMin(valueof);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return setMax(valueof, i, i2, left, top);
    }

    public final boolean setMin(@NonNull RecyclerView.valueOf valueof, @Nullable RecyclerView.ItemAnimator.setMax setmax, @NonNull RecyclerView.ItemAnimator.setMax setmax2) {
        if (setmax == null || (setmax.getMin == setmax2.getMin && setmax.setMax == setmax2.setMax)) {
            return length(valueof);
        }
        return setMax(valueof, setmax.getMin, setmax.setMax, setmax2.getMin, setmax2.setMax);
    }

    public final boolean setMax(@NonNull RecyclerView.valueOf valueof, @NonNull RecyclerView.ItemAnimator.setMax setmax, @NonNull RecyclerView.ItemAnimator.setMax setmax2) {
        if (setmax.getMin != setmax2.getMin || setmax.setMax != setmax2.setMax) {
            return setMax(valueof, setmax.getMin, setmax.setMax, setmax2.getMin, setmax2.setMax);
        } else if (this.toFloatRange == null) {
            return false;
        } else {
            this.toFloatRange.length(valueof);
            return false;
        }
    }

    public final boolean setMin(@NonNull RecyclerView.valueOf valueof, @NonNull RecyclerView.valueOf valueof2, @NonNull RecyclerView.ItemAnimator.setMax setmax, @NonNull RecyclerView.ItemAnimator.setMax setmax2) {
        int i;
        int i2;
        int i3 = setmax.getMin;
        int i4 = setmax.setMax;
        if (valueof2.shouldIgnore()) {
            int i5 = setmax.getMin;
            i = setmax.setMax;
            i2 = i5;
        } else {
            i2 = setmax2.getMin;
            i = setmax2.setMax;
        }
        return setMin(valueof, valueof2, i3, i4, i2, i);
    }
}
