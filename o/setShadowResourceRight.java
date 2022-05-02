package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public class setShadowResourceRight extends RecyclerView.getMax {
    private float getMax;
    private float getMin;
    private final Paint length;
    private boolean setMax;
    private int setMin;

    public setShadowResourceRight(@NonNull Context context, @ColorInt int i, float f, byte b) {
        this(context, i, 0.5f);
        this.getMin = f;
        this.getMax = 0.0f;
        this.setMax = true;
    }

    public setShadowResourceRight(@NonNull Context context, @ColorInt int i, float f, char c) {
        this(context, i, 0.5f);
        this.getMin = f;
        this.getMax = 0.0f;
    }

    public setShadowResourceRight(@NonNull Context context, @ColorInt int i, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.setMin = 80;
        this.getMin = 0.0f;
        this.getMax = 0.0f;
        Paint paint = new Paint();
        this.length = paint;
        paint.setColor(i);
        this.length.setStrokeWidth(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public setShadowResourceRight(@NonNull Context context, @DimenRes int i, int i2) {
        this.setMin = 80;
        this.getMin = 0.0f;
        this.getMax = 0.0f;
        Paint paint = new Paint();
        this.length = paint;
        this.setMin = i2;
        paint.setColor(IntRange.setMax(context, 17170445));
        this.length.setStrokeWidth(context.getResources().getDimension(i));
    }

    public setShadowResourceRight(@NonNull Context context, @DimenRes int i) {
        this.setMin = 80;
        this.getMin = 0.0f;
        this.getMax = 0.0f;
        Paint paint = new Paint();
        this.length = paint;
        paint.setColor(IntRange.setMax(context, 17170445));
        this.length.setStrokeWidth(context.getResources().getDimension(i));
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        float strokeWidth = this.length.getStrokeWidth() / 2.0f;
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int viewAdapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition();
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (viewAdapterPosition < i) {
                canvas.drawLine(((float) childAt.getLeft()) + this.getMin, ((float) childAt.getBottom()) + strokeWidth, ((float) childAt.getRight()) - this.getMax, ((float) childAt.getBottom()) + strokeWidth, this.length);
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
        if (this.setMax) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic.setMin;
            }
            i = i2 - 1;
        } else if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (viewAdapterPosition < i) {
            int i3 = this.setMin;
            if (i3 != 3) {
                if (i3 != 5) {
                    if (i3 == 48) {
                        rect.set(0, (int) this.length.getStrokeWidth(), 0, 0);
                        return;
                    } else if (i3 != 8388611) {
                        if (i3 != 8388613) {
                            rect.set(0, 0, 0, (int) this.length.getStrokeWidth());
                            return;
                        }
                    }
                }
                rect.set(0, 0, (int) this.length.getStrokeWidth(), 0);
                return;
            }
            rect.set((int) this.length.getStrokeWidth(), 0, 0, 0);
            return;
        }
        rect.setEmpty();
    }
}
