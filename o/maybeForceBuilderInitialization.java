package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

public final class maybeForceBuilderInitialization {
    private static final float[] onPostMessage = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    protected final Typeface FastBitmap$CoordinateSystem;
    protected final int Grayscale$Algorithm;
    protected final int ICustomTabsCallback;
    protected final int IsOverlapping;
    protected final float Mean$Arithmetic;
    protected final int b;
    protected final int create;
    protected final int equals;
    protected final Drawable extraCallbackWithResult;
    protected final int getCause;
    protected final int getMax;
    protected final int getMin;
    protected final int hashCode;
    protected final int invoke;
    protected final Typeface invokeSuspend;
    protected final int isInside;
    protected final int length;
    protected final int onMessageChannelReady;
    protected final int onNavigationEvent;
    protected final int onRelationshipValidationResult;
    protected final int setMax;
    protected final int setMin;
    protected final int toDoubleRange;
    protected final int toFloatRange;
    protected final int toIntRange;
    protected final int toString;
    protected final float[] valueOf;
    protected final int values;

    private static int setMax(Context context, @AttrRes int i) {
        int[] iArr = {i};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    protected maybeForceBuilderInitialization(@NonNull setMax setmax) {
        this.length = setmax.setMin;
        this.setMin = setmax.getMax;
        this.setMax = setmax.getMin;
        this.getMax = setmax.setMax;
        this.getMin = setmax.length;
        this.toIntRange = setmax.isInside;
        this.toFloatRange = setmax.toFloatRange;
        this.IsOverlapping = setmax.IsOverlapping;
        this.equals = setmax.equals;
        this.isInside = setmax.toIntRange;
        this.values = setmax.toString;
        this.toString = setmax.values;
        this.FastBitmap$CoordinateSystem = setmax.hashCode;
        this.hashCode = setmax.toDoubleRange;
        this.toDoubleRange = setmax.FastBitmap$CoordinateSystem;
        this.Grayscale$Algorithm = setmax.valueOf;
        this.invokeSuspend = setmax.Grayscale$Algorithm;
        this.valueOf = setmax.invoke;
        this.Mean$Arithmetic = setmax.Mean$Arithmetic;
        this.invoke = setmax.invokeSuspend;
        this.getCause = setmax.b;
        this.b = setmax.onNavigationEvent;
        this.create = setmax.ICustomTabsCallback;
        this.ICustomTabsCallback = setmax.getCause;
        this.onNavigationEvent = setmax.create;
        this.onRelationshipValidationResult = setmax.extraCallback;
        this.onMessageChannelReady = setmax.onMessageChannelReady;
        this.extraCallbackWithResult = setmax.onRelationshipValidationResult;
    }

    public final void setMax(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(true);
        int i = this.length;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public final void getMin(@NonNull Paint paint) {
        paint.setUnderlineText(true);
        int i = this.length;
        if (i != 0) {
            paint.setColor(i);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    public final void setMax(@NonNull Paint paint) {
        int i = this.getMax;
        if (i == 0) {
            i = (paint.getColor() & FlexItem.MAX_SIZE) | 419430400;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
    }

    public final int length() {
        return this.setMin;
    }

    public final int getMax() {
        int i = this.setMax;
        return i == 0 ? (int) ((((float) this.setMin) * 0.25f) + 0.5f) : i;
    }

    public final void getMax(@NonNull Paint paint) {
        int i = this.getMin;
        if (i == 0) {
            i = paint.getColor();
        }
        paint.setColor(i);
        int i2 = this.toIntRange;
        if (i2 != 0) {
            paint.setStrokeWidth((float) i2);
        }
    }

    public final int getMax(int i) {
        int min = Math.min(this.setMin, i) / 2;
        int i2 = this.toFloatRange;
        return (i2 == 0 || i2 > min) ? min : i2;
    }

    public final void length(@NonNull Paint paint, boolean z) {
        float f;
        int i;
        if (!z || (i = this.equals) == 0) {
            int i2 = this.IsOverlapping;
            if (i2 != 0) {
                paint.setColor(i2);
            }
        } else {
            paint.setColor(i);
        }
        Typeface typeface = this.FastBitmap$CoordinateSystem;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i3 = this.hashCode;
            if (i3 != 0) {
                paint.setTextSize((float) i3);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i4 = this.hashCode;
        if (i4 != 0) {
            f = (float) i4;
        } else {
            f = paint.getTextSize() * 0.87f;
        }
        paint.setTextSize(f);
    }

    public final int setMax() {
        return this.toString;
    }

    public final int setMax(@NonNull Paint paint, boolean z) {
        int i;
        if (z && (i = this.values) != 0) {
            return i;
        }
        int i2 = this.isInside;
        return i2 != 0 ? i2 : 419430400 | (paint.getColor() & FlexItem.MAX_SIZE);
    }

    public final void getMin(@NonNull Paint paint, @IntRange(from = 1, to = 6) int i) {
        Typeface typeface = this.invokeSuspend;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.valueOf;
        if (fArr == null) {
            fArr = onPostMessage;
        }
        if (fArr == null || fArr.length < i) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", new Object[]{Integer.valueOf(i), Arrays.toString(fArr)}));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i - 1]);
    }

    public final void setMin(@NonNull Paint paint) {
        int i = this.Grayscale$Algorithm;
        if (i == 0) {
            i = (paint.getColor() & FlexItem.MAX_SIZE) | 1258291200;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.toDoubleRange;
        if (i2 >= 0) {
            paint.setStrokeWidth((float) i2);
        }
    }

    public final void setMin(@NonNull TextPaint textPaint) {
        float f;
        if (Float.compare(this.Mean$Arithmetic, 0.0f) == 0) {
            f = 0.75f;
        } else {
            f = this.Mean$Arithmetic;
        }
        textPaint.setTextSize(textPaint.getTextSize() * f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }

    public final void length(@NonNull TextPaint textPaint) {
        float f;
        if (Float.compare(this.Mean$Arithmetic, 0.0f) == 0) {
            f = 0.75f;
        } else {
            f = this.Mean$Arithmetic;
        }
        textPaint.setTextSize(textPaint.getTextSize() * f);
        textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
    }

    public final void length(@NonNull Paint paint) {
        int i = this.invoke;
        if (i == 0) {
            i = (paint.getColor() & FlexItem.MAX_SIZE) | 419430400;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.getCause;
        if (i2 >= 0) {
            paint.setStrokeWidth((float) i2);
        }
    }

    public final int getMin() {
        return this.b;
    }

    public final int toIntRange(@NonNull Paint paint) {
        int i = this.ICustomTabsCallback;
        return i == -1 ? (int) (paint.getStrokeWidth() + 0.5f) : i;
    }

    public final void IsOverlapping(@NonNull Paint paint) {
        int i = this.create;
        if (i == 0) {
            i = (paint.getColor() & FlexItem.MAX_SIZE) | 1258291200;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void equals(@NonNull Paint paint) {
        int i = this.onNavigationEvent;
        if (i == 0) {
            i = (paint.getColor() & FlexItem.MAX_SIZE) | 369098752;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void toFloatRange(@NonNull Paint paint) {
        paint.setColor(this.onRelationshipValidationResult);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void isInside(@NonNull Paint paint) {
        paint.setColor(this.onMessageChannelReady);
        paint.setStyle(Paint.Style.FILL);
    }

    @Nullable
    public final Drawable setMin() {
        return this.extraCallbackWithResult;
    }

    public static class setMax {
        int FastBitmap$CoordinateSystem = -1;
        Typeface Grayscale$Algorithm;
        int ICustomTabsCallback;
        int IsOverlapping;
        float Mean$Arithmetic;
        int b = -1;
        int create;
        int equals;
        int extraCallback;
        int getCause = -1;
        int getMax;
        int getMin;
        Typeface hashCode;
        float[] invoke;
        int invokeSuspend;
        int isInside;
        int length;
        int onMessageChannelReady;
        int onNavigationEvent;
        Drawable onRelationshipValidationResult;
        int setMax;
        int setMin;
        int toDoubleRange;
        int toFloatRange;
        int toIntRange;
        int toString;
        int valueOf;
        int values;

        setMax() {
        }

        @NonNull
        public final maybeForceBuilderInitialization getMin() {
            return new maybeForceBuilderInitialization(this);
        }
    }

    static class setMin {
        final float getMin;

        setMin(@NonNull Context context) {
            this.getMin = context.getResources().getDisplayMetrics().density;
        }
    }

    @NonNull
    public static maybeForceBuilderInitialization getMax(@NonNull Context context) {
        int max = setMax(context, 16842907);
        int max2 = setMax(context, 16842801);
        setMin setmin = new setMin(context);
        setMax setmax = new setMax();
        setmax.values = (int) ((setmin.getMin * 8.0f) + 0.5f);
        setmax.getMax = (int) ((setmin.getMin * 24.0f) + 0.5f);
        setmax.getMin = (int) ((setmin.getMin * 4.0f) + 0.5f);
        setmax.isInside = (int) ((setmin.getMin * 1.0f) + 0.5f);
        setmax.FastBitmap$CoordinateSystem = (int) ((setmin.getMin * 1.0f) + 0.5f);
        setmax.b = (int) ((setmin.getMin * 4.0f) + 0.5f);
        setmax.onNavigationEvent = (int) ((setmin.getMin * 4.0f) + 0.5f);
        setmax.getCause = (int) ((setmin.getMin * 1.0f) + 0.5f);
        setmax.onRelationshipValidationResult = new setAppIDBytes(max, max, max2);
        return setmax.getMin();
    }
}
