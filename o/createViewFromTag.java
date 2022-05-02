package o;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.createSpinner;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class createViewFromTag {
    public int getMax;

    public createViewFromTag(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, createSpinner.setMax.getMax, i, i2);
            this.getMax = obtainStyledAttributes.getInteger(createSpinner.setMax.getMin, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }
}
