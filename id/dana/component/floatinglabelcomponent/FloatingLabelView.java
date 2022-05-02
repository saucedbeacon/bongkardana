package id.dana.component.floatinglabelcomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import o.setBackgroundColorRes;

public class FloatingLabelView extends TextInputLayout {
    Method collapseHintMethod;
    @FloatingLabelConstant
    private int getMin;

    public FloatingLabelView(Context context) {
        super(context);
        setFloatingLabel(context, (AttributeSet) null);
    }

    public FloatingLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFloatingLabel(context, attributeSet);
    }

    public FloatingLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFloatingLabel(context, attributeSet);
    }

    public void setFloatingLabel(Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.MediaMetadataCompat$LongKey, 0, 0);
            try {
                this.getMin = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.IMediaControllerCallback, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        boolean z2 = this.getMin == 1;
        setHintAnimationEnabled(z2);
        try {
            Method declaredMethod = TextInputLayout.class.getDeclaredMethod("collapseHint", new Class[]{Boolean.TYPE});
            this.collapseHintMethod = declaredMethod;
            if (!z2) {
                z = true;
            }
            declaredMethod.setAccessible(z);
        } catch (Exception unused) {
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        super.setError(charSequence);
        setHintTextAppearance(setBackgroundColorRes.equals.getMax);
    }

    public void invalidate() {
        super.invalidate();
        try {
            this.collapseHintMethod.invoke(this, new Object[]{Boolean.FALSE});
        } catch (Exception unused) {
        }
    }
}
