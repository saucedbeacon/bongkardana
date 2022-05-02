package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import o.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub;
import o.MediaSessionCompat$QueueItem;
import o.MediaSessionCompat$ResultReceiverWrapper;
import o.MediaSessionCompat$SessionFlags;
import o.PlaybackStateCompat;
import o.postToHandler;

public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final PlaybackStateCompat.Actions IMPL;
    private final MediaSessionCompat$SessionFlags mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            IMPL = new MediaSessionCompat$ResultReceiverWrapper();
        } else if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new MediaSessionCompat$QueueItem();
        } else {
            IMPL = new MediaSessionCompat$MediaSessionImplBase$MediaSessionStub();
        }
        IMPL.getMin();
    }

    public CardView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, postToHandler.setMin.getMax);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new MediaSessionCompat$SessionFlags() {
            private Drawable length;

            public final void setMin(Drawable drawable) {
                this.length = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            public final boolean length() {
                return CardView.this.getUseCompatPadding();
            }

            public final boolean setMax() {
                return CardView.this.getPreventCornerOverlap();
            }

            public final void getMin(int i, int i2, int i3, int i4) {
                CardView.this.mShadowBounds.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.mContentPadding.left, i2 + CardView.this.mContentPadding.top, i3 + CardView.this.mContentPadding.right, i4 + CardView.this.mContentPadding.bottom);
            }

            public final void getMin(int i, int i2) {
                if (i > CardView.this.mUserSetMinWidth) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.mUserSetMinHeight) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            public final Drawable getMin() {
                return this.length;
            }

            public final View getMax() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, postToHandler.getMin.getMax, i, postToHandler.setMax.setMax);
        if (obtainStyledAttributes.hasValue(postToHandler.getMin.setMin)) {
            valueOf = obtainStyledAttributes.getColorStateList(postToHandler.getMin.setMin);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(postToHandler.length.getMax);
            } else {
                i2 = getResources().getColor(postToHandler.length.getMin);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(postToHandler.getMin.getMin, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(postToHandler.getMin.IsOverlapping, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(postToHandler.getMin.equals, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(postToHandler.getMin.toFloatRange, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(postToHandler.getMin.isInside, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.toIntRange, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.hashCode, dimensionPixelSize);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.toDoubleRange, dimensionPixelSize);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.FastBitmap$CoordinateSystem, dimensionPixelSize);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.values, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.length, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(postToHandler.getMin.setMax, 0);
        obtainStyledAttributes.recycle();
        IMPL.getMax(this.mCardViewDelegate, context, colorStateList, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.toIntRange(this.mCardViewDelegate);
        }
    }

    public void setContentPadding(@Px int i, @Px int i2, @Px int i3, @Px int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.toFloatRange(this.mCardViewDelegate);
    }

    public void onMeasure(int i, int i2) {
        if (!(IMPL instanceof MediaSessionCompat$ResultReceiverWrapper)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) IMPL.setMax(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) IMPL.getMin(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        IMPL.getMin(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.getMin(this.mCardViewDelegate, colorStateList);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.IsOverlapping(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public void setRadius(float f) {
        IMPL.length(this.mCardViewDelegate, f);
    }

    public float getRadius() {
        return IMPL.setMin(this.mCardViewDelegate);
    }

    public void setCardElevation(float f) {
        IMPL.getMin(this.mCardViewDelegate, f);
    }

    public float getCardElevation() {
        return IMPL.length(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.setMin(this.mCardViewDelegate, f);
    }

    public float getMaxCardElevation() {
        return IMPL.getMax(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.equals(this.mCardViewDelegate);
        }
    }
}
