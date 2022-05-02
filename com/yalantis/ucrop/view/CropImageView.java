package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.calculateItemDecorationsForChild;
import o.getBottomDecorationHeight;
import o.getChildRectangleOnScreenScrollAmount;
import o.getDecoratedBottom;
import o.getDecoratedTop;
import o.getTransformedBoundingBox;
import o.isFocusedChildVisibleAfterScrolling;
import o.setMeasurementCacheEnabled;

public class CropImageView extends TransformImageView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private long FastBitmap$CoordinateSystem;
    private float IsOverlapping;
    private Runnable equals;
    private float getMax;
    private getDecoratedTop getMin;
    private int hashCode;
    private float isInside;
    /* access modifiers changed from: private */
    public final RectF length;
    private float setMax;
    private final Matrix setMin;
    private int toFloatRange;
    private Runnable toIntRange;

    public CropImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.length = new RectF();
        this.setMin = new Matrix();
        this.getMax = 10.0f;
        this.equals = null;
        this.toFloatRange = 0;
        this.hashCode = 0;
        this.FastBitmap$CoordinateSystem = 500;
    }

    public void cropAndSaveImage(@NonNull Bitmap.CompressFormat compressFormat, int i, @Nullable getTransformedBoundingBox gettransformedboundingbox) {
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        new getBottomDecorationHeight(getContext(), getViewBitmap(), new calculateItemDecorationsForChild(this.length, isFocusedChildVisibleAfterScrolling.getMin(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle()), new getDecoratedBottom(this.toFloatRange, this.hashCode, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), gettransformedboundingbox).execute(new Void[0]);
    }

    public float getMaxScale() {
        return this.isInside;
    }

    public float getMinScale() {
        return this.IsOverlapping;
    }

    public float getTargetAspectRatio() {
        return this.setMax;
    }

    public void setCropRect(RectF rectF) {
        this.setMax = rectF.width() / rectF.height();
        this.length.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        Drawable drawable = getDrawable();
        if (drawable != null) {
            getMin((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds();
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.setMax = f;
            return;
        }
        if (f == 0.0f) {
            this.setMax = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        } else {
            this.setMax = f;
        }
        getDecoratedTop getdecoratedtop = this.getMin;
        if (getdecoratedtop != null) {
            getdecoratedtop.setMax(this.setMax);
        }
    }

    @Nullable
    public getDecoratedTop getCropBoundsChangeListener() {
        return this.getMin;
    }

    public void setCropBoundsChangeListener(@Nullable getDecoratedTop getdecoratedtop) {
        this.getMin = getdecoratedtop;
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.toFloatRange = i;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.hashCode = i;
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j) {
        if (j > 0) {
            this.FastBitmap$CoordinateSystem = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxScaleMultiplier(float f) {
        this.getMax = f;
    }

    public void zoomOutImage(float f) {
        zoomOutImage(f, this.length.centerX(), this.length.centerY());
    }

    public void zoomOutImage(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    public void zoomInImage(float f) {
        zoomInImage(f, this.length.centerX(), this.length.centerY());
    }

    public void zoomInImage(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    public void postScale(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.postScale(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.postScale(f, f2, f3);
        }
    }

    public void postRotate(float f) {
        postRotate(f, this.length.centerX(), this.length.centerY());
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.toIntRange);
        removeCallbacks(this.equals);
    }

    public void setImageToWrapCropBounds() {
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z) {
        boolean z2;
        float f;
        float f2;
        float f3;
        if (this.mBitmapLaidOut && !isImageWrapCropBounds()) {
            float f4 = this.mCurrentImageCenter[0];
            float f5 = this.mCurrentImageCenter[1];
            float currentScale = getCurrentScale();
            float centerX = this.length.centerX() - f4;
            float centerY = this.length.centerY() - f5;
            this.setMin.reset();
            this.setMin.setTranslate(centerX, centerY);
            float[] copyOf = Arrays.copyOf(this.mCurrentImageCorners, this.mCurrentImageCorners.length);
            this.setMin.mapPoints(copyOf);
            boolean isImageWrapCropBounds = isImageWrapCropBounds(copyOf);
            if (isImageWrapCropBounds) {
                this.setMin.reset();
                this.setMin.setRotate(-getCurrentAngle());
                float[] copyOf2 = Arrays.copyOf(this.mCurrentImageCorners, this.mCurrentImageCorners.length);
                float[] max = isFocusedChildVisibleAfterScrolling.setMax(this.length);
                this.setMin.mapPoints(copyOf2);
                this.setMin.mapPoints(max);
                RectF min = isFocusedChildVisibleAfterScrolling.getMin(copyOf2);
                RectF min2 = isFocusedChildVisibleAfterScrolling.getMin(max);
                float f6 = min.left - min2.left;
                float f7 = min.top - min2.top;
                float f8 = min.right - min2.right;
                float f9 = min.bottom - min2.bottom;
                float[] fArr = new float[4];
                if (f6 <= 0.0f) {
                    f6 = 0.0f;
                }
                fArr[0] = f6;
                if (f7 <= 0.0f) {
                    f7 = 0.0f;
                }
                fArr[1] = f7;
                if (f8 >= 0.0f) {
                    f8 = 0.0f;
                }
                fArr[2] = f8;
                if (f9 >= 0.0f) {
                    f9 = 0.0f;
                }
                fArr[3] = f9;
                this.setMin.reset();
                this.setMin.setRotate(getCurrentAngle());
                this.setMin.mapPoints(fArr);
                f3 = -(fArr[0] + fArr[2]);
                f2 = -(fArr[1] + fArr[3]);
                z2 = isImageWrapCropBounds;
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.length);
                this.setMin.reset();
                this.setMin.setRotate(getCurrentAngle());
                this.setMin.mapRect(rectF);
                float[] fArr2 = this.mCurrentImageCorners;
                RectF rectF2 = rectF;
                z2 = isImageWrapCropBounds;
                float[] fArr3 = {(float) Math.sqrt(Math.pow((double) (fArr2[0] - fArr2[2]), 2.0d) + Math.pow((double) (fArr2[1] - fArr2[3]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr2[2] - fArr2[4]), 2.0d) + Math.pow((double) (fArr2[3] - fArr2[5]), 2.0d))};
                f3 = centerX;
                f = (Math.max(rectF2.width() / fArr3[0], rectF2.height() / fArr3[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                setMin setmin = new setMin(this, this.FastBitmap$CoordinateSystem, f4, f5, f3, f2, currentScale, f, z2);
                this.toIntRange = setmin;
                post(setmin);
                return;
            }
            postTranslate(f3, f2);
            if (!z2) {
                zoomInImage(currentScale + f, this.length.centerX(), this.length.centerY());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.setMax == 0.0f) {
                this.setMax = intrinsicWidth / intrinsicHeight;
            }
            int i = (int) (((float) this.mThisWidth) / this.setMax);
            if (i > this.mThisHeight) {
                int i2 = (int) (((float) this.mThisHeight) * this.setMax);
                int i3 = (this.mThisWidth - i2) / 2;
                this.length.set((float) i3, 0.0f, (float) (i2 + i3), (float) this.mThisHeight);
            } else {
                int i4 = (this.mThisHeight - i) / 2;
                this.length.set(0.0f, (float) i4, (float) this.mThisWidth, (float) (i + i4));
            }
            getMin(intrinsicWidth, intrinsicHeight);
            float width = this.length.width();
            float height = this.length.height();
            float max = Math.max(this.length.width() / intrinsicWidth, this.length.height() / intrinsicHeight);
            float f = ((height - (intrinsicHeight * max)) / 2.0f) + this.length.top;
            this.mCurrentImageMatrix.reset();
            this.mCurrentImageMatrix.postScale(max, max);
            this.mCurrentImageMatrix.postTranslate(((width - (intrinsicWidth * max)) / 2.0f) + this.length.left, f);
            setImageMatrix(this.mCurrentImageMatrix);
            getDecoratedTop getdecoratedtop = this.getMin;
            if (getdecoratedtop != null) {
                getdecoratedtop.setMax(this.setMax);
            }
            if (this.mTransformImageListener != null) {
                this.mTransformImageListener.length(getCurrentScale());
                this.mTransformImageListener.setMax(getCurrentAngle());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    /* access modifiers changed from: protected */
    public boolean isImageWrapCropBounds(float[] fArr) {
        this.setMin.reset();
        this.setMin.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.setMin.mapPoints(copyOf);
        float[] max = isFocusedChildVisibleAfterScrolling.setMax(this.length);
        this.setMin.mapPoints(max);
        return isFocusedChildVisibleAfterScrolling.getMin(copyOf).contains(isFocusedChildVisibleAfterScrolling.getMin(max));
    }

    /* access modifiers changed from: protected */
    public void zoomImageToPosition(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        getMin getmin = new getMin(this, j, currentScale, f - currentScale, f2, f3);
        this.equals = getmin;
        post(getmin);
    }

    private void getMin(float f, float f2) {
        float min = Math.min(Math.min(this.length.width() / f, this.length.width() / f2), Math.min(this.length.height() / f2, this.length.height() / f));
        this.IsOverlapping = min;
        this.isInside = min * this.getMax;
    }

    /* access modifiers changed from: protected */
    public void processStyledAttributes(@NonNull TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(setMeasurementCacheEnabled.toFloatRange.newSessionWithExtras, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(setMeasurementCacheEnabled.toFloatRange.newSession, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.setMax = 0.0f;
        } else {
            this.setMax = abs / abs2;
        }
    }

    static class setMin implements Runnable {
        private final float IsOverlapping;
        private final boolean equals;
        private final long getMax;
        private final WeakReference<CropImageView> getMin;
        private final float isInside;
        private final long length = System.currentTimeMillis();
        private final float setMax;
        private final float setMin;
        private final float toFloatRange;
        private final float toIntRange;

        public setMin(CropImageView cropImageView, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.getMin = new WeakReference<>(cropImageView);
            this.getMax = j;
            this.setMin = f;
            this.setMax = f2;
            this.toIntRange = f3;
            this.isInside = f4;
            this.toFloatRange = f5;
            this.IsOverlapping = f6;
            this.equals = z;
        }

        public final void run() {
            CropImageView cropImageView = this.getMin.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.getMax, System.currentTimeMillis() - this.length);
                float f = this.toIntRange;
                long j = this.getMax;
                float f2 = (min / ((float) j)) - 1.0f;
                float f3 = (f * ((f2 * f2 * f2) + 1.0f)) + 0.0f;
                float f4 = (min / ((float) j)) - 1.0f;
                float f5 = (this.isInside * ((f4 * f4 * f4) + 1.0f)) + 0.0f;
                float min2 = getChildRectangleOnScreenScrollAmount.setMin(min, this.IsOverlapping, (float) j);
                if (min < ((float) this.getMax)) {
                    cropImageView.postTranslate(f3 - (cropImageView.mCurrentImageCenter[0] - this.setMin), f5 - (cropImageView.mCurrentImageCenter[1] - this.setMax));
                    if (!this.equals) {
                        cropImageView.zoomInImage(this.toFloatRange + min2, cropImageView.length.centerX(), cropImageView.length.centerY());
                    }
                    if (!cropImageView.isImageWrapCropBounds()) {
                        cropImageView.post(this);
                    }
                }
            }
        }
    }

    static class getMin implements Runnable {
        private final long getMax = System.currentTimeMillis();
        private final float getMin;
        private final float isInside;
        private final long length;
        private final WeakReference<CropImageView> setMax;
        private final float setMin;
        private final float toFloatRange;

        public getMin(CropImageView cropImageView, long j, float f, float f2, float f3, float f4) {
            this.setMax = new WeakReference<>(cropImageView);
            this.length = j;
            this.setMin = f;
            this.getMin = f2;
            this.isInside = f3;
            this.toFloatRange = f4;
        }

        public final void run() {
            CropImageView cropImageView = this.setMax.get();
            if (cropImageView != null) {
                float min = (float) Math.min(this.length, System.currentTimeMillis() - this.getMax);
                float min2 = getChildRectangleOnScreenScrollAmount.setMin(min, this.getMin, (float) this.length);
                if (min < ((float) this.length)) {
                    cropImageView.zoomInImage(this.setMin + min2, this.isInside, this.toFloatRange);
                    cropImageView.post(this);
                    return;
                }
                cropImageView.setImageToWrapCropBounds();
            }
        }
    }
}
