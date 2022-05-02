package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

public class StaticIndeterminateCircularProgressDrawable extends BaseProgressDrawable {
    @Dimension(unit = 0)
    private static final int PADDED_INTRINSIC_SIZE_DP = 48;
    private static final Path PATH_PROGRESS;
    @Dimension(unit = 0)
    private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
    private static final RectF RECT_PADDED_BOUND = new RectF(0.0f, 0.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS_BOUND = new RectF(3.0f, 3.0f, 21.0f, 21.0f);
    @NonNull
    private final Matrix mMatrix = new Matrix();
    @Px
    private final int mPaddedIntrinsicSize;
    @NonNull
    private final Path mPath = new Path();
    @Px
    private final int mProgressIntrinsicSize;

    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @IntRange(from = 0, to = 255)
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Nullable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @NonNull
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = 255) int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setTint(@ColorInt int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(@Nullable ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    static {
        Path path = new Path();
        PATH_PROGRESS = path;
        path.moveTo(17.65f, 6.35f);
        PATH_PROGRESS.cubicTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        PATH_PROGRESS.cubicTo(7.58f, 4.0f, 4.01f, 7.58f, 4.01f, 12.0f);
        PATH_PROGRESS.rCubicTo(0.0f, 4.42f, 3.57f, 8.0f, 7.99f, 8.0f);
        PATH_PROGRESS.rCubicTo(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        PATH_PROGRESS.rLineTo(-2.08f, 0.0f);
        PATH_PROGRESS.cubicTo(16.83f, 16.33f, 14.61f, 18.0f, 12.0f, 18.0f);
        PATH_PROGRESS.cubicTo(8.69f, 18.0f, 6.0f, 15.31f, 6.0f, 12.0f);
        PATH_PROGRESS.cubicTo(6.0f, 8.69f, 8.69f, 6.0f, 12.0f, 6.0f);
        PATH_PROGRESS.rCubicTo(1.66f, 0.0f, 3.1f, 0.69f, 4.22f, 1.78f);
        PATH_PROGRESS.lineTo(13.0f, 11.0f);
        PATH_PROGRESS.rLineTo(7.0f, 0.0f);
        PATH_PROGRESS.lineTo(20.0f, 4.0f);
        PATH_PROGRESS.close();
    }

    public StaticIndeterminateCircularProgressDrawable(@NonNull Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicSize = Math.round(42.0f * f);
        this.mPaddedIntrinsicSize = Math.round(f * 48.0f);
        setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    @Px
    private int getIntrinsicSize() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicSize : this.mProgressIntrinsicSize;
    }

    @Px
    public int getIntrinsicWidth() {
        return getIntrinsicSize();
    }

    @Px
    public int getIntrinsicHeight() {
        return getIntrinsicSize();
    }

    /* access modifiers changed from: protected */
    public void onPreparePaint(@NonNull Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint) {
        RectF rectF = this.mUseIntrinsicPadding ? RECT_PADDED_BOUND : RECT_PROGRESS_BOUND;
        this.mMatrix.setScale(((float) i) / rectF.width(), ((float) i2) / rectF.height());
        this.mMatrix.preTranslate(-rectF.left, -rectF.top);
        PATH_PROGRESS.transform(this.mMatrix, this.mPath);
        canvas.drawPath(this.mPath, paint);
    }
}
