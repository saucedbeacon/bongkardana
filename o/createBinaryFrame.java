package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import o.continuousFrame;

public class createBinaryFrame {
    private static final int DEFAULT_MIN_TEXT_SIZE = 8;
    private static final float DEFAULT_PRECISION = 0.5f;
    private static final boolean SPEW = false;
    private static final String TAG = "AutoFitTextHelper";
    private boolean mEnabled;
    private boolean mIsAutofitting;
    private ArrayList<getMax> mListeners;
    private int mMaxLines;
    private float mMaxTextSize;
    private float mMinTextSize;
    private View.OnLayoutChangeListener mOnLayoutChangeListener = new setMin();
    private TextPaint mPaint;
    private float mPrecision;
    private float mTextSize;
    private TextView mTextView;
    private TextWatcher mTextWatcher = new setMax();

    public interface getMax {
        void onTextSizeChange(float f, float f2);
    }

    public static createBinaryFrame create(TextView textView) {
        return create(textView, (AttributeSet) null, 0);
    }

    public static createBinaryFrame create(TextView textView, AttributeSet attributeSet) {
        return create(textView, attributeSet, 0);
    }

    public static createBinaryFrame create(TextView textView, AttributeSet attributeSet, int i) {
        createBinaryFrame createbinaryframe = new createBinaryFrame(textView);
        boolean z = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            float precision = createbinaryframe.getPrecision();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, continuousFrame.getMin.AutofitTextView, i, 0);
            z = obtainStyledAttributes.getBoolean(continuousFrame.getMin.AutofitTextView_sizeToFit, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(continuousFrame.getMin.AutofitTextView_minTextSize, (int) createbinaryframe.getMinTextSize());
            float f = obtainStyledAttributes.getFloat(continuousFrame.getMin.AutofitTextView_precision, precision);
            obtainStyledAttributes.recycle();
            createbinaryframe.setMinTextSize(0, (float) dimensionPixelSize).setPrecision(f);
        }
        createbinaryframe.setEnabled(z);
        return createbinaryframe;
    }

    private static void autofit(TextView textView, TextPaint textPaint, float f, float f2, int i, float f3) {
        int width;
        float f4;
        if (i > 0 && i != Integer.MAX_VALUE && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView);
            }
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint.set(textView.getPaint());
            textPaint.setTextSize(f2);
            if ((i != 1 || textPaint.measureText(text, 0, text.length()) <= ((float) width)) && getLineCount(text, textPaint, f2, (float) width, displayMetrics) <= i) {
                f4 = f2;
            } else {
                f4 = getAutofitTextSize(text, textPaint, (float) width, i, 0.0f, f2, f3, displayMetrics);
            }
            if (f4 < f) {
                f4 = f;
            }
            textView.setTextSize(0, f4);
        }
    }

    private static float getAutofitTextSize(CharSequence charSequence, TextPaint textPaint, float f, int i, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        int i2;
        int i3;
        float f5;
        TextPaint textPaint2 = textPaint;
        float f6 = f;
        int i4 = i;
        float f7 = f2;
        float f8 = f3;
        while (true) {
            float f9 = (f7 + f8) / 2.0f;
            StaticLayout staticLayout = null;
            textPaint2.setTextSize(TypedValue.applyDimension(0, f9, displayMetrics));
            if (i4 != 1) {
                i2 = 1;
                staticLayout = new StaticLayout(charSequence, textPaint, (int) f6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                i3 = staticLayout.getLineCount();
            } else {
                i2 = 1;
                i3 = 1;
            }
            if (i3 <= i4) {
                if (i3 < i4) {
                    CharSequence charSequence2 = charSequence;
                } else {
                    float f10 = 0.0f;
                    if (i4 == i2) {
                        f5 = textPaint2.measureText(charSequence, 0, charSequence.length());
                    } else {
                        CharSequence charSequence3 = charSequence;
                        for (int i5 = 0; i5 < i3; i5++) {
                            if (staticLayout.getLineWidth(i5) > f10) {
                                f10 = staticLayout.getLineWidth(i5);
                            }
                        }
                        f5 = f10;
                    }
                    if (f8 - f7 < f4) {
                        return f7;
                    }
                    if (f5 <= f6) {
                        if (f5 >= f6) {
                            return f9;
                        }
                    }
                }
                f7 = f9;
            } else if (f8 - f7 < f4) {
                return f7;
            } else {
                CharSequence charSequence4 = charSequence;
            }
            f8 = f9;
        }
    }

    private static int getLineCount(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    private static int getMaxLines(TextView textView) {
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null && (transformationMethod instanceof SingleLineTransformationMethod)) {
            return 1;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        return -1;
    }

    private createBinaryFrame(TextView textView) {
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.mTextView = textView;
        this.mPaint = new TextPaint();
        setRawTextSize(textView.getTextSize());
        this.mMaxLines = getMaxLines(textView);
        this.mMinTextSize = f * 8.0f;
        this.mMaxTextSize = this.mTextSize;
        this.mPrecision = DEFAULT_PRECISION;
    }

    public createBinaryFrame addOnTextSizeChangeListener(getMax getmax) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(getmax);
        return this;
    }

    public createBinaryFrame removeOnTextSizeChangeListener(getMax getmax) {
        ArrayList<getMax> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(getmax);
        }
        return this;
    }

    public float getPrecision() {
        return this.mPrecision;
    }

    public createBinaryFrame setPrecision(float f) {
        if (this.mPrecision != f) {
            this.mPrecision = f;
            autofit();
        }
        return this;
    }

    public float getMinTextSize() {
        return this.mMinTextSize;
    }

    public createBinaryFrame setMinTextSize(float f) {
        return setMinTextSize(2, f);
    }

    public createBinaryFrame setMinTextSize(int i, float f) {
        Context context = this.mTextView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        setRawMinTextSize(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    private void setRawMinTextSize(float f) {
        if (f != this.mMinTextSize) {
            this.mMinTextSize = f;
            autofit();
        }
    }

    public float getMaxTextSize() {
        return this.mMaxTextSize;
    }

    public createBinaryFrame setMaxTextSize(float f) {
        return setMaxTextSize(2, f);
    }

    public createBinaryFrame setMaxTextSize(int i, float f) {
        Context context = this.mTextView.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        setRawMaxTextSize(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        return this;
    }

    private void setRawMaxTextSize(float f) {
        if (f != this.mMaxTextSize) {
            this.mMaxTextSize = f;
            autofit();
        }
    }

    public int getMaxLines() {
        return this.mMaxLines;
    }

    public createBinaryFrame setMaxLines(int i) {
        if (this.mMaxLines != i) {
            this.mMaxLines = i;
            autofit();
        }
        return this;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public createBinaryFrame setEnabled(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            if (z) {
                this.mTextView.addTextChangedListener(this.mTextWatcher);
                this.mTextView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
                autofit();
            } else {
                this.mTextView.removeTextChangedListener(this.mTextWatcher);
                this.mTextView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
                this.mTextView.setTextSize(0, this.mTextSize);
            }
        }
        return this;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public void setTextSize(float f) {
        setTextSize(2, f);
    }

    public void setTextSize(int i, float f) {
        if (!this.mIsAutofitting) {
            Context context = this.mTextView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            setRawTextSize(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        }
    }

    private void setRawTextSize(float f) {
        if (this.mTextSize != f) {
            this.mTextSize = f;
        }
    }

    /* access modifiers changed from: private */
    public void autofit() {
        float textSize = this.mTextView.getTextSize();
        this.mIsAutofitting = true;
        autofit(this.mTextView, this.mPaint, this.mMinTextSize, this.mMaxTextSize, this.mMaxLines, this.mPrecision);
        this.mIsAutofitting = false;
        float textSize2 = this.mTextView.getTextSize();
        if (textSize2 != textSize) {
            sendTextSizeChange(textSize2, textSize);
        }
    }

    private void sendTextSizeChange(float f, float f2) {
        ArrayList<getMax> arrayList = this.mListeners;
        if (arrayList != null) {
            Iterator<getMax> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTextSizeChange(f, f2);
            }
        }
    }

    class setMax implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private setMax() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            createBinaryFrame.this.autofit();
        }
    }

    class setMin implements View.OnLayoutChangeListener {
        private setMin() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            createBinaryFrame.this.autofit();
        }
    }
}
