package o;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

public final class CircularProgressDrawable$ProgressDrawableSize extends SupportSQLiteStatement<CircularProgressDrawable$ProgressDrawableSize> {
    public final long length(long j, long j2, long j3) {
        return 0;
    }

    public final void IsOverlapping(RecyclerView.valueOf valueof) {
        ViewCompat.setMin(valueof.itemView, (float) (-valueof.itemView.getHeight()));
        ViewCompat.getMin(valueof.itemView, 0.0f);
    }

    public final void isInside(RecyclerView.valueOf valueof) {
        ViewCompat.setMin(valueof.itemView, 0.0f);
        ViewCompat.getMin(valueof.itemView, 1.0f);
    }

    public final void toIntRange(RecyclerView.valueOf valueof) {
        ViewCompat.setMin(valueof.itemView, 0.0f);
        ViewCompat.getMin(valueof.itemView, 1.0f);
    }

    public final invalidateOptionsMenu values(RecyclerView.valueOf valueof) {
        return ViewCompat.Grayscale$Algorithm(valueof.itemView).getMin(getMin()).getMin(0.0f).getMax((float) valueof.itemView.getHeight()).setMin(this.getMax);
    }

    public final invalidateOptionsMenu toDoubleRange(RecyclerView.valueOf valueof) {
        return ViewCompat.Grayscale$Algorithm(valueof.itemView).getMax(0.0f).getMin(1.0f).getMin(this.IsOverlapping).setMin(this.getMax);
    }

    public final long setMax(long j, long j2, long j3) {
        return j / 2;
    }
}
