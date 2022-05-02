package com.bca.xco.widget.comp;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import o.dispatchOnCancelled;
import o.ensureContentInsets;
import o.getChildVerticalGravity;
import o.onCancelLoad;
import o.onCanceled;
import o.setPaddingBottom;

public class XEditText extends EditText implements View.OnFocusChangeListener, View.OnTouchListener, ensureContentInsets.setMax {
    private View.OnFocusChangeListener getMax;
    private getMax getMin;
    private View.OnTouchListener length;
    private Location setMax = Location.RIGHT;
    private Drawable setMin;

    public interface getMax {
    }

    public enum Location {
        LEFT(0),
        RIGHT(2);
        
        final int c;

        private Location(int i) {
            this.c = i;
        }
    }

    public XEditText(Context context) {
        super(context);
        setMin();
        setMin(context);
    }

    public XEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin();
        setMin(context);
    }

    public XEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin();
        setMin(context);
    }

    private void setMin(Context context) {
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (min = dispatchOnCancelled.setMin(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, min, 8);
            onCancelLoad.setMax(1886021034, oncanceled);
            onCancelLoad.getMin(1886021034, oncanceled);
        }
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
    }

    public void setListener(getMax getmax) {
        this.getMin = getmax;
    }

    public void setIconLocation(Location location) {
        this.setMax = location;
        getMin();
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.length = onTouchListener;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.getMax = onFocusChangeListener;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            setClearIconVisible(setPaddingBottom.setMin(getText()));
        } else {
            setClearIconVisible(false);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.getMax;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public void onTextChanged(EditText editText, String str) {
        if (isFocused()) {
            setClearIconVisible(setPaddingBottom.setMin(str));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        getMin();
    }

    private void setMin() {
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
        addTextChangedListener(new ensureContentInsets(this, this));
        getMin();
        setClearIconVisible(false);
    }

    private void getMin() {
        this.setMin = null;
        if (this.setMax != null) {
            this.setMin = getCompoundDrawables()[this.setMax.c];
        }
        if (this.setMin == null) {
            this.setMin = getResources().getDrawable(getChildVerticalGravity.length.xco_ic_cancel);
        }
        Drawable drawable = this.setMin;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.setMin.getIntrinsicHeight());
        int paddingTop = getPaddingTop() + this.setMin.getIntrinsicHeight() + getPaddingBottom();
        if (getSuggestedMinimumHeight() < paddingTop) {
            setMinimumHeight(paddingTop);
        }
    }

    /* access modifiers changed from: protected */
    public void setClearIconVisible(boolean z) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable = null;
        if (z != ((this.setMax != null ? getCompoundDrawables()[this.setMax.c] : null) != null)) {
            if (z) {
                drawable = this.setMin;
            }
            Drawable drawable2 = this.setMax == Location.LEFT ? drawable : compoundDrawables[0];
            Drawable drawable3 = compoundDrawables[1];
            if (this.setMax != Location.RIGHT) {
                drawable = compoundDrawables[2];
            }
            super.setCompoundDrawables(drawable2, drawable3, drawable, compoundDrawables[3]);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if ((this.setMax != null ? getCompoundDrawables()[this.setMax.c] : null) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= (this.setMax == Location.LEFT ? 0 : (getWidth() - getPaddingRight()) - this.setMin.getIntrinsicWidth()) && x <= (this.setMax == Location.LEFT ? getPaddingLeft() + this.setMin.getIntrinsicWidth() : getWidth()) && y >= 0 && y <= getBottom() - getTop()) {
                if (motionEvent.getAction() == 1) {
                    setText("");
                }
                return true;
            }
        }
        View.OnTouchListener onTouchListener = this.length;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }
}
