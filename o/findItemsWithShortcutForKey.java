package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public class findItemsWithShortcutForKey extends RecyclerView.getMax {
    private static final int[] getMin = {16843284};
    private int getMax;
    public Drawable length;
    private final Rect setMax = new Rect();

    public findItemsWithShortcutForKey(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(getMin);
        this.length = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.getMax = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.length != null) {
            int i5 = 0;
            if (this.getMax == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    recyclerView.getDecoratedBoundsWithMargins(childAt, this.setMax);
                    int round = this.setMax.bottom + Math.round(childAt.getTranslationY());
                    this.length.setBounds(i3, round - this.length.getIntrinsicHeight(), i4, round);
                    this.length.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.setMax);
                int round2 = this.setMax.right + Math.round(childAt2.getTranslationX());
                this.length.setBounds(round2 - this.length.getIntrinsicWidth(), i, round2, i2);
                this.length.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        Drawable drawable = this.length;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.getMax == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
