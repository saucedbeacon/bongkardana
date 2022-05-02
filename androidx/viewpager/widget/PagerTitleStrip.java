package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.setExpandActivityOverflowButtonDrawable;

@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    private static final int[] isInside = {16843660};
    private static final int[] toIntRange = {16842804, 16842901, 16842904, 16842927};
    private int IsOverlapping;
    private WeakReference<setExpandActivityOverflowButtonDrawable> equals;
    private int getMax;
    private int getMin;
    private boolean length;
    TextView mCurrText;
    float mLastKnownPositionOffset;
    TextView mNextText;
    ViewPager mPager;
    TextView mPrevText;
    int mTextColor;
    private int setMax;
    private boolean setMin;
    private final getMax toFloatRange;

    static class length extends SingleLineTransformationMethod {
        private Locale length;

        length(Context context) {
            this.length = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.length);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setMax = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.toFloatRange = new getMax();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toIntRange);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setMax(this.mPrevText, resourceId);
            TextViewCompat.setMax(this.mCurrText, resourceId);
            TextViewCompat.setMax(this.mNextText, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.getMax = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.mPrevText.setEllipsize(TextUtils.TruncateAt.END);
        this.mCurrText.setEllipsize(TextUtils.TruncateAt.END);
        this.mNextText.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, isInside);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            TextView textView4 = this.mPrevText;
            textView4.setTransformationMethod(new length(textView4.getContext()));
            TextView textView5 = this.mCurrText;
            textView5.setTransformationMethod(new length(textView5.getContext()));
            TextView textView6 = this.mNextText;
            textView6.setTransformationMethod(new length(textView6.getContext()));
        } else {
            this.mPrevText.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.getMin = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.getMin = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.getMin;
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.IsOverlapping = i;
        int i2 = (i << 24) | (this.mTextColor & FlexItem.MAX_SIZE);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.mTextColor = i;
        this.mCurrText.setTextColor(i);
        int i2 = (this.IsOverlapping << 24) | (this.mTextColor & FlexItem.MAX_SIZE);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.mPrevText.setTextSize(i, f);
        this.mCurrText.setTextSize(i, f);
        this.mNextText.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.getMax = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            setExpandActivityOverflowButtonDrawable adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.toFloatRange);
            viewPager.addOnAdapterChangeListener(this.toFloatRange);
            this.mPager = viewPager;
            WeakReference<setExpandActivityOverflowButtonDrawable> weakReference = this.equals;
            updateAdapter(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), (setExpandActivityOverflowButtonDrawable) null);
            this.mPager.setInternalPageChangeListener((ViewPager.setMax) null);
            this.mPager.removeOnAdapterChangeListener(this.toFloatRange);
            this.mPager = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateText(int i, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        int count = setexpandactivityoverflowbuttondrawable != null ? setexpandactivityoverflowbuttondrawable.getCount() : 0;
        this.length = true;
        CharSequence charSequence = null;
        this.mPrevText.setText((i <= 0 || setexpandactivityoverflowbuttondrawable == null) ? null : setexpandactivityoverflowbuttondrawable.getPageTitle(i - 1));
        this.mCurrText.setText((setexpandactivityoverflowbuttondrawable == null || i >= count) ? null : setexpandactivityoverflowbuttondrawable.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && setexpandactivityoverflowbuttondrawable != null) {
            charSequence = setexpandactivityoverflowbuttondrawable.getPageTitle(i2);
        }
        this.mNextText.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mCurrText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mNextText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.setMax = i;
        if (!this.setMin) {
            updateTextPositions(i, this.mLastKnownPositionOffset, false);
        }
        this.length = false;
    }

    public void requestLayout() {
        if (!this.length) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateAdapter(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2) {
        if (setexpandactivityoverflowbuttondrawable != null) {
            setexpandactivityoverflowbuttondrawable.unregisterDataSetObserver(this.toFloatRange);
            this.equals = null;
        }
        if (setexpandactivityoverflowbuttondrawable2 != null) {
            setexpandactivityoverflowbuttondrawable2.registerDataSetObserver(this.toFloatRange);
            this.equals = new WeakReference<>(setexpandactivityoverflowbuttondrawable2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.setMax = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), setexpandactivityoverflowbuttondrawable2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTextPositions(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.setMax) {
            updateText(i6, this.mPager.getAdapter());
        } else if (!z && f2 == this.mLastKnownPositionOffset) {
            return;
        }
        this.setMin = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i12, this.mCurrText.getMeasuredHeight() + i13), this.mNextText.getMeasuredHeight() + i14);
        int i16 = this.getMax & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.mCurrText;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.getMin) - measuredWidth);
            TextView textView2 = this.mPrevText;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.getMin);
            TextView textView3 = this.mNextText;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.mLastKnownPositionOffset = f;
            this.setMin = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.mCurrText;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.getMin) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.getMin);
        TextView textView32 = this.mNextText;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.mLastKnownPositionOffset = f;
        this.setMin = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
            this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
            this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.mCurrText.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mPager != null) {
            float f = this.mLastKnownPositionOffset;
            if (f < 0.0f) {
                f = 0.0f;
            }
            updateTextPositions(this.setMax, f, true);
        }
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    class getMax extends DataSetObserver implements ViewPager.setMax, ViewPager.setMin {
        private int length;

        getMax() {
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.updateTextPositions(i, f, false);
        }

        public final void onPageSelected(int i) {
            if (this.length == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                float f = 0.0f;
                if (PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f) {
                    f = PagerTitleStrip.this.mLastKnownPositionOffset;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            this.length = i;
        }

        public final void onAdapterChanged(ViewPager viewPager, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable2) {
            PagerTitleStrip.this.updateAdapter(setexpandactivityoverflowbuttondrawable, setexpandactivityoverflowbuttondrawable2);
        }

        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            float f = 0.0f;
            if (PagerTitleStrip.this.mLastKnownPositionOffset >= 0.0f) {
                f = PagerTitleStrip.this.mLastKnownPositionOffset;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
        }
    }
}
