package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class prepareFromUri {
    final Context length;
    TypedValue setMax;
    public final TypedArray setMin;

    public static prepareFromUri setMin(Context context, AttributeSet attributeSet, int[] iArr) {
        return new prepareFromUri(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static prepareFromUri getMin(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new prepareFromUri(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static prepareFromUri setMin(Context context, int i, int[] iArr) {
        return new prepareFromUri(context, context.obtainStyledAttributes(i, iArr));
    }

    private prepareFromUri(Context context, TypedArray typedArray) {
        this.length = context;
        this.setMin = typedArray;
    }

    public final Drawable setMax(int i) {
        int resourceId;
        if (!this.setMin.hasValue(i) || (resourceId = this.setMin.getResourceId(i, 0)) == 0) {
            return this.setMin.getDrawable(i);
        }
        return cancelAll.getMin(this.length, resourceId);
    }

    public final Drawable getMax(int i) {
        int resourceId;
        if (!this.setMin.hasValue(i) || (resourceId = this.setMin.getResourceId(i, 0)) == 0) {
            return null;
        }
        return unregisterCallbackListener.getMax().length(this.length, resourceId, true);
    }

    public final boolean setMax(int i, boolean z) {
        return this.setMin.getBoolean(i, z);
    }

    public final ColorStateList length(int i) {
        int resourceId;
        ColorStateList min;
        if (!this.setMin.hasValue(i) || (resourceId = this.setMin.getResourceId(i, 0)) == 0 || (min = cancelAll.setMin(this.length, resourceId)) == null) {
            return this.setMin.getColorStateList(i);
        }
        return min;
    }

    public final boolean setMin(int i) {
        return this.setMin.hasValue(i);
    }
}
