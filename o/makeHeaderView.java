package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class makeHeaderView extends RecyclerView.getMax {
    private final int getMin;
    private final int length;
    private final int setMin;

    public makeHeaderView(int i, int i2, int i3) {
        this.length = i;
        this.getMin = i2;
        this.setMin = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            if (childAdapterPosition == 0) {
                rect.set(this.length, view.getPaddingTop(), this.setMin, view.getPaddingBottom());
            } else if (i <= 0 || childAdapterPosition != i - 1) {
                rect.set(this.getMin, view.getPaddingTop(), this.setMin, view.getPaddingBottom());
            } else {
                rect.set(this.getMin, view.getPaddingTop(), this.length, view.getPaddingBottom());
            }
        }
    }
}
