package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import o.resetInternal;

public class EllipseTextView extends AppCompatTextView {
    private int getMin;
    private int length;
    private int setMax;
    private float setMin;
    private GradientDrawable toIntRange;

    public EllipseTextView(Context context) {
        super(context);
        getMin((AttributeSet) null);
    }

    public EllipseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(attributeSet);
    }

    public EllipseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(attributeSet);
    }

    private void getMin(AttributeSet attributeSet) {
        setMin(attributeSet);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.toIntRange = gradientDrawable;
        gradientDrawable.setShape(0);
        this.toIntRange.setStroke(this.setMax, this.getMin);
        this.toIntRange.setCornerRadius(this.setMin);
        this.toIntRange.setColor(this.length);
        if (Build.VERSION.SDK_INT < 16) {
            setBackgroundDrawable(this.toIntRange);
        } else {
            setBackground(this.toIntRange);
        }
    }

    private void setMin(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.IconCompatParcelizer);
            try {
                getResources();
                this.getMin = obtainStyledAttributes.getInt(2, -1);
                this.setMax = obtainStyledAttributes.getInt(3, 0);
                getResources();
                this.length = obtainStyledAttributes.getInt(0, -1);
                this.setMin = obtainStyledAttributes.getFloat(1, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setBackgroundColor(int i) {
        this.length = i;
        this.toIntRange.setColor(i);
    }

    public void setStrokeColor(int i) {
        this.getMin = i;
        this.toIntRange.setStroke(this.setMax, i);
    }

    public void setCornerRadius(float f) {
        this.setMin = f;
        this.toIntRange.setCornerRadius(f);
    }
}
