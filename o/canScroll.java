package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import id.dana.R;

public final class canScroll extends RecyclerView.getMax {
    private final boolean getMax = true;
    private final setMin getMin;
    /* access modifiers changed from: private */
    public int isInside;
    private View length;
    private final int setMax;
    private TextView setMin;
    private int toFloatRange;
    private boolean toIntRange;

    public interface setMin {
        boolean getMax(int i);

        CharSequence getMin(int i);
    }

    public canScroll(RecyclerView recyclerView, int i, @NonNull setMin setmin, int i2) {
        recyclerView.addOnItemTouchListener(new RecyclerView.equals() {
            public final void getMin(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            }

            public final boolean setMax(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
                return motionEvent.getY() <= ((float) canScroll.this.isInside);
            }
        });
        this.setMax = i;
        this.getMin = setmin;
        this.toFloatRange = i2;
    }

    public canScroll(RecyclerView recyclerView, int i, @NonNull setMin setmin) {
        recyclerView.addOnItemTouchListener(new RecyclerView.equals() {
            public final void getMin(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            }

            public final boolean setMax(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
                return motionEvent.getY() <= ((float) canScroll.this.isInside);
            }
        });
        this.setMax = i;
        this.getMin = setmin;
        this.toFloatRange = -1;
        this.toIntRange = true;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        View view;
        super.onDrawOver(canvas, recyclerView, recyclerView$Mean$Arithmetic);
        if (this.length == null) {
            if (this.toIntRange) {
                view = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.layout_section_header_sendmoney_v2, recyclerView, false);
            } else {
                view = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.layout_section_header, recyclerView, false);
            }
            this.length = view;
            this.setMin = (TextView) view.findViewById(R.id.f69142131365541);
            View view2 = this.length;
            view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view2.getLayoutParams().height));
            this.isInside = view2.getMeasuredHeight();
            view2.layout(0, 0, view2.getMeasuredWidth(), this.isInside + 5);
            this.length.setBackgroundColor(this.toFloatRange);
            this.setMin.setBackgroundColor(this.toFloatRange);
        }
        String str = "";
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (this.getMin.getMin(childAdapterPosition) != null) {
                String upperCase = this.getMin.getMin(childAdapterPosition).toString().toUpperCase();
                this.setMin.setText(upperCase);
                if (upperCase != null && (!str.equals(upperCase) || this.getMin.getMax(childAdapterPosition))) {
                    View view3 = this.length;
                    canvas.save();
                    if (this.getMax) {
                        canvas.translate(0.0f, (float) Math.max(0, childAt.getTop() - view3.getHeight()));
                    } else {
                        canvas.translate(0.0f, (float) (childAt.getTop() - view3.getHeight()));
                    }
                    view3.draw(canvas);
                    canvas.restore();
                    str = upperCase;
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
        if (this.getMin.getMax(recyclerView.getChildAdapterPosition(view))) {
            rect.top = this.setMax;
        }
    }
}
