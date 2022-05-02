package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;
import o.dispatchChildAttached;

public final class getChildItemId {
    private onChildDetachedFromWindow getMax;

    public getChildItemId(@NonNull onChildDetachedFromWindow onchilddetachedfromwindow) {
        this.getMax = onchilddetachedfromwindow;
    }

    public final void setMax(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dispatchChildAttached.length.IsOverlapping, 0, 0);
        length(obtainStyledAttributes);
        getMin(obtainStyledAttributes);
        setMin(obtainStyledAttributes);
        setMax(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void length(@NonNull TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(dispatchChildAttached.length.create, -1);
        boolean z = typedArray.getBoolean(dispatchChildAttached.length.equals, true);
        int i = 0;
        boolean z2 = typedArray.getBoolean(dispatchChildAttached.length.hashCode, false);
        int i2 = typedArray.getInt(dispatchChildAttached.length.toIntRange, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = typedArray.getInt(dispatchChildAttached.length.valueOf, 0);
        if (i3 >= 0 && (i2 <= 0 || i3 <= i2 - 1)) {
            i = i3;
        }
        this.getMax.create = resourceId;
        this.getMax.toDoubleRange = z;
        this.getMax.FastBitmap$CoordinateSystem = z2;
        this.getMax.invoke = i2;
        this.getMax.getCause = i;
        this.getMax.onNavigationEvent = i;
        this.getMax.b = i;
    }

    private void getMin(@NonNull TypedArray typedArray) {
        int color = typedArray.getColor(dispatchChildAttached.length.onNavigationEvent, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(dispatchChildAttached.length.b, Color.parseColor("#ffffff"));
        this.getMax.toString = color;
        this.getMax.hashCode = color2;
    }

    private void setMin(@NonNull TypedArray typedArray) {
        boolean z = typedArray.getBoolean(dispatchChildAttached.length.values, false);
        long j = (long) typedArray.getInt(dispatchChildAttached.length.isInside, 350);
        if (j < 0) {
            j = 0;
        }
        AnimationType length = length(typedArray.getInt(dispatchChildAttached.length.toFloatRange, AnimationType.NONE.ordinal()));
        RtlMode max = setMax(typedArray.getInt(dispatchChildAttached.length.invokeSuspend, RtlMode.Off.ordinal()));
        boolean z2 = typedArray.getBoolean(dispatchChildAttached.length.FastBitmap$CoordinateSystem, false);
        long j2 = (long) typedArray.getInt(dispatchChildAttached.length.toDoubleRange, 3000);
        this.getMax.Grayscale$Algorithm = j;
        this.getMax.values = z;
        this.getMax.onPostMessage = length;
        this.getMax.extraCallback = max;
        this.getMax.invokeSuspend = z2;
        this.getMax.valueOf = j2;
    }

    private void setMax(@NonNull TypedArray typedArray) {
        Orientation orientation;
        if (typedArray.getInt(dispatchChildAttached.length.toString, Orientation.HORIZONTAL.ordinal()) == 0) {
            orientation = Orientation.HORIZONTAL;
        } else {
            orientation = Orientation.VERTICAL;
        }
        int dimension = (int) typedArray.getDimension(dispatchChildAttached.length.invoke, (float) ((int) TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics())));
        int i = 0;
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(dispatchChildAttached.length.Mean$Arithmetic, (float) ((int) TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics())));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(dispatchChildAttached.length.Grayscale$Algorithm, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) typedArray.getDimension(dispatchChildAttached.length.getCause, (float) ((int) TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics())));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        onChildDetachedFromWindow onchilddetachedfromwindow = this.getMax;
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        if (onchilddetachedfromwindow.onPostMessage == AnimationType.FILL) {
            i = dimension3;
        }
        this.getMax.getMax = dimension;
        this.getMax.ICustomTabsCallback = orientation;
        this.getMax.length = dimension2;
        this.getMax.equals = f;
        this.getMax.toIntRange = i;
    }

    private static AnimationType length(int i) {
        switch (i) {
            case 0:
                return AnimationType.NONE;
            case 1:
                return AnimationType.COLOR;
            case 2:
                return AnimationType.SCALE;
            case 3:
                return AnimationType.WORM;
            case 4:
                return AnimationType.SLIDE;
            case 5:
                return AnimationType.FILL;
            case 6:
                return AnimationType.THIN_WORM;
            case 7:
                return AnimationType.DROP;
            case 8:
                return AnimationType.SWAP;
            case 9:
                return AnimationType.SCALE_DOWN;
            default:
                return AnimationType.NONE;
        }
    }

    private static RtlMode setMax(int i) {
        if (i == 0) {
            return RtlMode.On;
        }
        if (i == 1) {
            return RtlMode.Off;
        }
        if (i != 2) {
            return RtlMode.Auto;
        }
        return RtlMode.Auto;
    }
}
