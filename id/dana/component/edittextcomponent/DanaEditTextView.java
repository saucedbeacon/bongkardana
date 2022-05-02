package id.dana.component.edittextcomponent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import o.IntRange;
import o.setBackgroundColorRes;
import o.setSize;

public class DanaEditTextView extends AppCompatEditText {
    public DanaEditTextView(@NonNull Context context) {
        super(context);
        getMin(context, (AttributeSet) null);
    }

    public DanaEditTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(context, attributeSet);
    }

    public DanaEditTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(context, attributeSet);
    }

    private void getMin(Context context, AttributeSet attributeSet) {
        int i;
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.write, 0, 0);
            try {
                i = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.read, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            z = true;
        }
        getMin(z);
        setOnTouchListener(new setSize(this));
        setMaxLines(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean setMin(MotionEvent motionEvent) {
        if (getCompoundDrawables()[2] == null || motionEvent.getAction() != 1 || motionEvent.getRawX() < ((float) (getRight() - getCompoundDrawables()[2].getBounds().width())) || getText() == null) {
            return false;
        }
        getText().clear();
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void setError(CharSequence charSequence) {
        setSupportBackgroundTintList(IntRange.getMin(getContext(), setBackgroundColorRes.getMax.isInside));
    }

    @SuppressLint({"RestrictedApi"})
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setSupportBackgroundTintList(IntRange.getMin(getContext(), setBackgroundColorRes.getMax.getMax));
        } else {
            setSupportBackgroundTintList(IntRange.getMin(getContext(), setBackgroundColorRes.getMax.setMin));
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        setCompoundDrawablesWithIntrinsicBounds(0, 0, i3 > 0 ? setBackgroundColorRes.getMin.ic_clear : 0, 0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setSupportBackgroundTintList(IntRange.getMin(getContext(), setBackgroundColorRes.getMax.equals));
        } else {
            setSupportBackgroundTintList(IntRange.getMin(getContext(), setBackgroundColorRes.getMax.getMax));
        }
    }

    private void getMin(boolean z) {
        setTextSize(0, getResources().getDimension(z ? setBackgroundColorRes.setMin.setMin : setBackgroundColorRes.setMin.getMax));
        setTextColor(getResources().getColor(z ? setBackgroundColorRes.getMax.length : setBackgroundColorRes.getMax.toFloatRange));
    }
}
