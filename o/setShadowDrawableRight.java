package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class setShadowDrawableRight extends RecyclerView.getMax {
    private int getMin;

    public setShadowDrawableRight(int i) {
        this.getMin = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.set(0, this.getMin, 0, 0);
        }
    }
}
