package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import o.to;

public class MockView extends View {
    private Rect IsOverlapping = new Rect();
    private int equals = 4;
    private Paint getMax = new Paint();
    private Paint getMin = new Paint();
    private int isInside = Color.argb(255, 50, 50, 50);
    private boolean length = true;
    protected String mText = null;
    private Paint setMax = new Paint();
    private boolean setMin = true;
    private int toFloatRange = Color.argb(255, 0, 0, 0);
    private int toIntRange = Color.argb(255, 200, 200, 200);

    public MockView(Context context) {
        super(context);
        getMin(context, (AttributeSet) null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(context, attributeSet);
    }

    private void getMin(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.onCreateSupportNavigateUpTaskStack);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.onPrepareSupportNavigateUpTaskStack) {
                    this.mText = obtainStyledAttributes.getString(index);
                } else if (index == to.length.onSupportNavigateUp) {
                    this.length = obtainStyledAttributes.getBoolean(index, this.length);
                } else if (index == to.length.setSupportProgress) {
                    this.toFloatRange = obtainStyledAttributes.getColor(index, this.toFloatRange);
                } else if (index == to.length.setSupportProgressBarIndeterminateVisibility) {
                    this.isInside = obtainStyledAttributes.getColor(index, this.isInside);
                } else if (index == to.length.onContentChanged) {
                    this.toIntRange = obtainStyledAttributes.getColor(index, this.toIntRange);
                } else if (index == to.length.getSupportParentActivityIntent) {
                    this.setMin = obtainStyledAttributes.getBoolean(index, this.setMin);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.getMax.setColor(this.toFloatRange);
        this.getMax.setAntiAlias(true);
        this.setMax.setColor(this.toIntRange);
        this.setMax.setAntiAlias(true);
        this.getMin.setColor(this.isInside);
        this.equals = Math.round(((float) this.equals) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.length) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.getMax);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.getMax);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.getMax);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.getMax);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.getMax);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.getMax);
        }
        String str = this.mText;
        if (str != null && this.setMin) {
            this.setMax.getTextBounds(str, 0, str.length(), this.IsOverlapping);
            float width2 = ((float) (width - this.IsOverlapping.width())) / 2.0f;
            float height2 = (((float) (height - this.IsOverlapping.height())) / 2.0f) + ((float) this.IsOverlapping.height());
            this.IsOverlapping.offset((int) width2, (int) height2);
            Rect rect = this.IsOverlapping;
            rect.set(rect.left - this.equals, this.IsOverlapping.top - this.equals, this.IsOverlapping.right + this.equals, this.IsOverlapping.bottom + this.equals);
            canvas.drawRect(this.IsOverlapping, this.getMin);
            canvas.drawText(this.mText, width2, height2, this.setMax);
        }
    }
}
