package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class SupportSQLiteDatabase extends RecyclerView.getMax {
    private boolean[] getMax;
    private boolean[] getMin;
    private Paint length;
    private final int setMax;
    private final Rect setMin;
    private float[] toIntRange;

    public static class getMin {
        public float[] equals = {0.0f, 0.0f, 0.0f, 0.0f};
        public int getMax;
        public int getMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 1.0f));
        public boolean[] isInside = {false, false, false, false};
        public boolean[] length = {true, true, true, true};
        public int setMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 2.0f));
        public int setMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f));
    }

    public /* synthetic */ SupportSQLiteDatabase(int i, int i2, int i3, int i4, boolean[] zArr, boolean[] zArr2, float[] fArr, byte b) {
        this(i, i2, i3, i4, zArr, zArr2, fArr);
    }

    private SupportSQLiteDatabase(int i, int i2, int i3, int i4, boolean[] zArr, boolean[] zArr2, float[] fArr) {
        this.setMin = new Rect();
        Paint paint = new Paint(1);
        this.length = paint;
        paint.setColor(i4);
        this.length.setStyle(Paint.Style.STROKE);
        this.length.setStrokeWidth((float) i3);
        this.length.setPathEffect(new DashPathEffect(new float[]{(float) i2, (float) i}, 0.0f));
        this.getMax = zArr;
        this.getMin = zArr2;
        this.toIntRange = fArr;
        this.setMax = i3;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView.getLayoutManager() != null) {
            boolean[] zArr = this.getMax;
            if (zArr[1] || zArr[3]) {
                canvas.save();
                RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    if (layoutManager instanceof GridLayoutManager) {
                        i2 = ((GridLayoutManager) layoutManager).setMin;
                    } else {
                        i2 = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = recyclerView2.getChildAt(i3);
                        if (!setMax(recyclerView2, childAt)) {
                            layoutManager.getDecoratedBoundsWithMargins(childAt, this.setMin);
                            float translationX = ((float) this.setMin.left) + childAt.getTranslationX() + this.toIntRange[0];
                            float translationX2 = (((float) this.setMin.right) - childAt.getTranslationX()) - this.toIntRange[2];
                            if (this.getMax[3]) {
                                if (this.getMin[3]) {
                                    int i4 = childCount % i2;
                                    if (i4 == 0) {
                                        if (i3 < childCount - i2) {
                                            float translationY = (((float) this.setMin.bottom) - childAt.getTranslationY()) - this.length.getStrokeWidth();
                                            canvas.drawLine(translationX, translationY, translationX2, translationY, this.length);
                                        }
                                    } else if (i3 < childCount - i4 && i3 < childCount - i2) {
                                        float translationY2 = (((float) this.setMin.bottom) - childAt.getTranslationY()) - this.length.getStrokeWidth();
                                        canvas.drawLine(translationX, translationY2, translationX2, translationY2, this.length);
                                    }
                                }
                                if (this.getMax[1] && i3 < i2 && !this.getMin[1]) {
                                    float translationY3 = ((float) this.setMin.top) + childAt.getTranslationY() + this.length.getStrokeWidth();
                                    canvas.drawLine(translationX, translationY3, translationX2, translationY3, this.length);
                                }
                            } else {
                                float translationY4 = ((float) this.setMin.top) + childAt.getTranslationY() + this.length.getStrokeWidth();
                                canvas.drawLine(translationX, translationY4, translationX2, translationY4, this.length);
                            }
                        }
                    }
                    canvas.restore();
                }
            }
            boolean[] zArr2 = this.getMax;
            if (zArr2[0] || zArr2[2]) {
                canvas.save();
                RecyclerView.IsOverlapping layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null) {
                    boolean z = layoutManager2 instanceof GridLayoutManager;
                    if (z) {
                        i = ((GridLayoutManager) layoutManager2).setMin;
                    } else {
                        i = 0;
                    }
                    int childCount2 = recyclerView.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = recyclerView2.getChildAt(i5);
                        if (!setMax(recyclerView2, childAt2)) {
                            layoutManager2.getDecoratedBoundsWithMargins(childAt2, this.setMin);
                            float translationY5 = ((float) this.setMin.top) + childAt2.getTranslationY() + this.toIntRange[1];
                            float translationY6 = (((float) this.setMin.bottom) + childAt2.getTranslationY()) - this.toIntRange[3];
                            int max = z ? ((GridLayoutManager) layoutManager2).toIntRange.setMax(recyclerView2.getChildAdapterPosition(childAt2), i) : i5;
                            if (!this.getMax[2]) {
                                float translationX3 = ((float) this.setMin.left) + childAt2.getTranslationX() + this.length.getStrokeWidth();
                                canvas.drawLine(translationX3, translationY5, translationX3, translationY6, this.length);
                            } else if (!this.getMin[2] || (max + 1) % i != 0) {
                                float translationX4 = (((float) this.setMin.right) - childAt2.getTranslationX()) - this.length.getStrokeWidth();
                                canvas.drawLine(translationX4, translationY5, translationX4, translationY6, this.length);
                                if (this.getMax[0] && i5 % i == 0 && !this.getMin[0]) {
                                    float translationX5 = ((float) this.setMin.left) + childAt2.getTranslationX() + this.length.getStrokeWidth();
                                    canvas.drawLine(translationX5, translationY5, translationX5, translationY6, this.length);
                                }
                            }
                        }
                    }
                    canvas.restore();
                }
            }
        }
    }

    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if ((recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemViewType(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition()) : 0) == 1) {
            rect.setEmpty();
        }
        int i = this.setMax;
        rect.set(i, i, i, i);
    }

    private static boolean setMax(RecyclerView recyclerView, View view) {
        if ((recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemViewType(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition()) : 0) == 1) {
            return true;
        }
        return false;
    }
}
