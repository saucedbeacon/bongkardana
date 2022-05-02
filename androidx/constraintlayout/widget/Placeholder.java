package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.to;

public class Placeholder extends View {
    private int getMax = -1;
    private int length = 4;
    private View setMin = null;

    public Placeholder(Context context) {
        super(context);
        getMin((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        getMin(attributeSet);
    }

    private void getMin(AttributeSet attributeSet) {
        super.setVisibility(this.length);
        this.getMax = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.setContentView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.getLastCustomNonConfigurationInstance) {
                    this.getMax = obtainStyledAttributes.getResourceId(index, this.getMax);
                } else if (index == to.length.onRetainCustomNonConfigurationInstance) {
                    this.length = obtainStyledAttributes.getInt(index, this.length);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setEmptyVisibility(int i) {
        this.length = i;
    }

    public int getEmptyVisibility() {
        return this.length;
    }

    public View getContent() {
        return this.setMin;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.getMax == -1 && !isInEditMode()) {
            setVisibility(this.length);
        }
        View findViewById = constraintLayout.findViewById(this.getMax);
        this.setMin = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).IPostMessageService = true;
            this.setMin.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.getMax != i) {
            View view = this.setMin;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.setMin.getLayoutParams()).IPostMessageService = false;
                this.setMin = null;
            }
            this.getMax = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        int i;
        if (this.setMin != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.setMin.getLayoutParams();
            int i2 = 0;
            layoutParams2.cancelNotification.areNotificationsEnabled = 0;
            if (layoutParams.cancelNotification.extraCommand[0] != ConstraintWidget.DimensionBehaviour.FIXED) {
                ConstraintWidget constraintWidget = layoutParams.cancelNotification;
                ConstraintWidget constraintWidget2 = layoutParams2.cancelNotification;
                if (constraintWidget2.areNotificationsEnabled == 8) {
                    i = 0;
                } else {
                    i = constraintWidget2.requestPostMessageChannelWithExtras;
                }
                constraintWidget.getMax(i);
            }
            if (layoutParams.cancelNotification.extraCommand[1] != ConstraintWidget.DimensionBehaviour.FIXED) {
                ConstraintWidget constraintWidget3 = layoutParams.cancelNotification;
                ConstraintWidget constraintWidget4 = layoutParams2.cancelNotification;
                if (constraintWidget4.areNotificationsEnabled != 8) {
                    i2 = constraintWidget4.postMessage;
                }
                constraintWidget3.toFloatRange(i2);
            }
            layoutParams2.cancelNotification.areNotificationsEnabled = 8;
        }
    }
}
