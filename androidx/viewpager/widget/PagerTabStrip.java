package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.IntRange;

public class PagerTabStrip extends PagerTitleStrip {
    private boolean FastBitmap$CoordinateSystem;
    private final Paint IsOverlapping;
    private int Mean$Arithmetic;
    private final Rect equals;
    private int getMax;
    private int getMin;
    private boolean hashCode;
    private int isInside;
    private int length;
    private int setMax;
    private int setMin;
    private int toDoubleRange;
    private int toFloatRange;
    private boolean toIntRange;
    private float toString;
    private float values;

    public PagerTabStrip(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IsOverlapping = new Paint();
        this.equals = new Rect();
        this.toFloatRange = 255;
        this.toIntRange = false;
        this.FastBitmap$CoordinateSystem = false;
        int i = this.mTextColor;
        this.length = i;
        this.IsOverlapping.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.getMax = (int) ((3.0f * f) + 0.5f);
        this.getMin = (int) ((6.0f * f) + 0.5f);
        this.setMax = (int) (64.0f * f);
        this.isInside = (int) ((16.0f * f) + 0.5f);
        this.toDoubleRange = (int) ((1.0f * f) + 0.5f);
        this.setMin = (int) ((f * 32.0f) + 0.5f);
        this.Mean$Arithmetic = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.mPrevText.setFocusable(true);
        this.mPrevText.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() - 1);
            }
        });
        this.mNextText.setFocusable(true);
        this.mNextText.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.toIntRange = true;
        }
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.length = i;
        this.IsOverlapping.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(IntRange.setMax(getContext(), i));
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.length;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.getMin;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTextSpacing(int i) {
        int i2 = this.setMax;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.FastBitmap$CoordinateSystem) {
            this.toIntRange = drawable == null;
        }
    }

    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (!this.FastBitmap$CoordinateSystem) {
            this.toIntRange = (i & -16777216) == 0;
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (!this.FastBitmap$CoordinateSystem) {
            this.toIntRange = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.toIntRange = z;
        this.FastBitmap$CoordinateSystem = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.toIntRange;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.setMin);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.hashCode) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.toString = x;
            this.values = y;
            this.hashCode = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.toString) > ((float) this.Mean$Arithmetic) || Math.abs(y - this.values) > ((float) this.Mean$Arithmetic))) {
                this.hashCode = true;
            }
        } else if (x < ((float) (this.mCurrText.getLeft() - this.isInside))) {
            this.mPager.setCurrentItem(this.mPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.mCurrText.getRight() + this.isInside))) {
            this.mPager.setCurrentItem(this.mPager.getCurrentItem() + 1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.isInside;
        int right = this.mCurrText.getRight() + this.isInside;
        this.IsOverlapping.setColor((this.toFloatRange << 24) | (this.length & FlexItem.MAX_SIZE));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.getMax), (float) right, f, this.IsOverlapping);
        if (this.toIntRange) {
            this.IsOverlapping.setColor(-16777216 | (this.length & FlexItem.MAX_SIZE));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.toDoubleRange), (float) (getWidth() - getPaddingRight()), f, this.IsOverlapping);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTextPositions(int i, float f, boolean z) {
        Rect rect = this.equals;
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.isInside;
        int right = this.mCurrText.getRight() + this.isInside;
        int i2 = height - this.getMax;
        rect.set(left, i2, right, height);
        super.updateTextPositions(i, f, z);
        this.toFloatRange = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.mCurrText.getLeft() - this.isInside, i2, this.mCurrText.getRight() + this.isInside, height);
        invalidate(rect);
    }
}
