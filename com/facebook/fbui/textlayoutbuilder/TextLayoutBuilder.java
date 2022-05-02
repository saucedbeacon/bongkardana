package com.facebook.fbui.textlayoutbuilder;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import o.PlaybackStateCompat;
import o.getContext;
import o.setCustomTitle;

public final class TextLayoutBuilder {
    @VisibleForTesting
    static final PlaybackStateCompat.ErrorCode<Integer, Layout> setMax = new PlaybackStateCompat.ErrorCode<>(100);
    private boolean IsOverlapping = true;
    private Layout equals = null;
    private int getMax = 2;
    private int getMin = Integer.MAX_VALUE;
    private boolean isInside = false;
    private int length = 0;
    @VisibleForTesting
    final getMax setMin = new getMax();
    private int toFloatRange = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeasureMode {
    }

    @VisibleForTesting
    static class getMax {
        TextUtils.TruncateAt FastBitmap$CoordinateSystem = null;
        int Grayscale$Algorithm = 0;
        float IsOverlapping = 0.0f;
        setCustomTitle Mean$Arithmetic = getContext.setMax;
        boolean b = false;
        int equals;
        int[] getCause;
        TextPaint getMax = new TextPaint(1);
        float getMin;
        float hashCode = Float.MAX_VALUE;
        int invoke = 0;
        int invokeSuspend = 0;
        int isInside;
        int length;
        int[] onNavigationEvent;
        float setMax;
        float setMin;
        boolean toDoubleRange = true;
        float toFloatRange = 1.0f;
        CharSequence toIntRange;
        boolean toString = false;
        Layout.Alignment valueOf = Layout.Alignment.ALIGN_NORMAL;
        int values = Integer.MAX_VALUE;

        getMax() {
        }

        public final int hashCode() {
            int i = 0;
            int color = (((((((((((((((((((((((((((((((this.getMax.getColor() + 31) * 31) + Float.floatToIntBits(this.getMax.getTextSize())) * 31) + (this.getMax.getTypeface() != null ? this.getMax.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.setMin)) * 31) + Float.floatToIntBits(this.setMax)) * 31) + Float.floatToIntBits(this.getMin)) * 31) + this.length) * 31) + this.getMax.linkColor) * 31) + Float.floatToIntBits(this.getMax.density)) * 31) + Arrays.hashCode(this.getMax.drawableState)) * 31) + this.equals) * 31) + this.isInside) * 31) + Float.floatToIntBits(this.toFloatRange)) * 31) + Float.floatToIntBits(this.IsOverlapping)) * 31) + Float.floatToIntBits(this.hashCode)) * 31) + (this.toDoubleRange ? 1 : 0)) * 31;
            TextUtils.TruncateAt truncateAt = this.FastBitmap$CoordinateSystem;
            int hashCode2 = (((((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31) + (this.toString ? 1 : 0)) * 31) + this.values) * 31;
            Layout.Alignment alignment = this.valueOf;
            int hashCode3 = (hashCode2 + (alignment != null ? alignment.hashCode() : 0)) * 31;
            setCustomTitle setcustomtitle = this.Mean$Arithmetic;
            int hashCode4 = (((((((((hashCode3 + (setcustomtitle != null ? setcustomtitle.hashCode() : 0)) * 31) + this.invokeSuspend) * 31) + this.Grayscale$Algorithm) * 31) + Arrays.hashCode(this.getCause)) * 31) + Arrays.hashCode(this.onNavigationEvent)) * 31;
            CharSequence charSequence = this.toIntRange;
            if (charSequence != null) {
                i = charSequence.hashCode();
            }
            return hashCode4 + i;
        }
    }
}
