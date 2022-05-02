package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public class dismissProgress extends RecyclerView.getMax {
    public boolean setMax;
    private final Paint setMin;

    public dismissProgress(@NonNull Context context, @ColorInt int i) {
        Paint paint = new Paint();
        this.setMin = paint;
        paint.setColor(i);
        this.setMin.setStrokeWidth(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int strokeWidth = (int) (this.setMin.getStrokeWidth() / 2.0f);
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (1 == (recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemViewType(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition()) : 0)) {
                canvas.drawLine((float) childAt.getLeft(), (float) (childAt.getTop() - strokeWidth), (float) childAt.getRight(), (float) (childAt.getTop() - strokeWidth), this.setMin);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
        if (1 != (recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemViewType(viewAdapterPosition) : 0)) {
            return;
        }
        if (this.setMax || viewAdapterPosition != 0) {
            rect.set(0, (int) this.setMin.getStrokeWidth(), 0, 0);
        } else {
            rect.setEmpty();
        }
    }
}
