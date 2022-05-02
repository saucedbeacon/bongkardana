package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.getDecoratedRight;
import o.getRightDecorationWidth;
import o.getTopDecorationHeight;
import o.isFocusedChildVisibleAfterScrolling;
import o.layoutDecorated;
import o.onInterceptFocusSearch;

public class TransformImageView extends ImageView {
    /* access modifiers changed from: private */
    public String IsOverlapping;
    private float[] getMax;
    /* access modifiers changed from: private */
    public String getMin;
    private float[] length;
    protected boolean mBitmapDecoded;
    protected boolean mBitmapLaidOut;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    protected Matrix mCurrentImageMatrix;
    protected int mThisHeight;
    protected int mThisWidth;
    protected getMax mTransformImageListener;
    private int setMax;
    private final float[] setMin;
    /* access modifiers changed from: private */
    public getDecoratedRight toIntRange;

    public interface getMax {
        void getMin(@NonNull Exception exc);

        void length(float f);

        void setMax();

        void setMax(float f);
    }

    public TransformImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.setMin = new float[9];
        this.mCurrentImageMatrix = new Matrix();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
        this.setMax = 0;
        init();
    }

    public void setTransformImageListener(getMax getmax) {
        this.mTransformImageListener = getmax;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setMaxBitmapSize(int i) {
        this.setMax = i;
    }

    public int getMaxBitmapSize() {
        if (this.setMax <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int sqrt = (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
            Canvas canvas = new Canvas();
            int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (min > 0) {
                sqrt = Math.min(sqrt, min);
            }
            int max = getRightDecorationWidth.setMax();
            if (max > 0) {
                sqrt = Math.min(sqrt, max);
            }
            this.setMax = sqrt;
        }
        return this.setMax;
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new onInterceptFocusSearch(bitmap));
    }

    public String getImageInputPath() {
        return this.getMin;
    }

    public String getImageOutputPath() {
        return this.IsOverlapping;
    }

    public getDecoratedRight getExifInfo() {
        return this.toIntRange;
    }

    public void setImageUri(@NonNull Uri uri, @Nullable Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        new getTopDecorationHeight(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new layoutDecorated() {
            public final void getMax(@NonNull Bitmap bitmap, @NonNull getDecoratedRight getdecoratedright, @NonNull String str, @Nullable String str2) {
                String unused = TransformImageView.this.getMin = str;
                String unused2 = TransformImageView.this.IsOverlapping = str2;
                getDecoratedRight unused3 = TransformImageView.this.toIntRange = getdecoratedright;
                TransformImageView.this.mBitmapDecoded = true;
                TransformImageView.this.setImageBitmap(bitmap);
            }

            public final void getMax(@NonNull Exception exc) {
                if (TransformImageView.this.mTransformImageListener != null) {
                    TransformImageView.this.mTransformImageListener.getMin(exc);
                }
            }
        }).execute(new Void[0]);
    }

    public float getCurrentScale() {
        return getMatrixScale(this.mCurrentImageMatrix);
    }

    public float getMatrixScale(@NonNull Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) getMatrixValue(matrix, 0), 2.0d) + Math.pow((double) getMatrixValue(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return getMatrixAngle(this.mCurrentImageMatrix);
    }

    public float getMatrixAngle(@NonNull Matrix matrix) {
        return (float) (-(Math.atan2((double) getMatrixValue(matrix, 1), (double) getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.getMax);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.length);
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof onInterceptFocusSearch)) {
            return null;
        }
        return ((onInterceptFocusSearch) getDrawable()).length;
    }

    public void postTranslate(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.mCurrentImageMatrix.postTranslate(f, f2);
            setImageMatrix(this.mCurrentImageMatrix);
        }
    }

    public void postScale(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.mCurrentImageMatrix.postScale(f, f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
            getMax getmax = this.mTransformImageListener;
            if (getmax != null) {
                getmax.length(getMatrixScale(this.mCurrentImageMatrix));
            }
        }
    }

    public void postRotate(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.mCurrentImageMatrix.postRotate(f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
            getMax getmax = this.mTransformImageListener;
            if (getmax != null) {
                getmax.setMax(getMatrixAngle(this.mCurrentImageMatrix));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.mThisWidth = (getWidth() - getPaddingRight()) - paddingLeft;
            this.mThisHeight = (getHeight() - getPaddingBottom()) - paddingTop;
            onImageLaidOut();
        }
    }

    /* access modifiers changed from: protected */
    public void onImageLaidOut() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Integer.valueOf((int) intrinsicWidth);
            Integer.valueOf((int) intrinsicHeight);
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.getMax = isFocusedChildVisibleAfterScrolling.setMax(rectF);
            this.length = new float[]{rectF.centerX(), rectF.centerY()};
            this.mBitmapLaidOut = true;
            getMax getmax = this.mTransformImageListener;
            if (getmax != null) {
                getmax.setMax();
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getMatrixValue(@NonNull Matrix matrix, @IntRange(from = 0, to = 9) int i) {
        matrix.getValues(this.setMin);
        return this.setMin[i];
    }

    /* access modifiers changed from: protected */
    public void printMatrix(@NonNull String str, @NonNull Matrix matrix) {
        getMatrixValue(matrix, 2);
        getMatrixValue(matrix, 5);
        getMatrixScale(matrix);
        getMatrixAngle(matrix);
    }
}
