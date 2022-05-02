package id.dana.richview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.richview.PinEntryEditText;
import java.util.Locale;
import o.IntRange;
import o.onInfo;
import o.resetInternal;
import o.setTitle;

public class PinEntryEditText extends AppCompatEditText {
    protected boolean animate = false;
    protected int animatedType = 0;
    protected float[] charBottom;
    protected Paint charPaint;
    protected float charSize;
    protected View.OnClickListener clickListener;
    protected ColorStateList colorStates = new ColorStateList(this.states, this.listColors);
    protected boolean digitSquare = false;
    protected boolean hasError = false;
    protected Paint lastCharPaint;
    protected RectF[] lineCoords;
    protected float lineStroke = 1.0f;
    protected float lineStrokeSelected = 2.0f;
    protected Paint linesPaint;
    protected int[] listColors = {-16711936, -65536, -16777216, -7829368};
    protected setMax listener;
    protected String mask = null;
    protected StringBuilder maskChars = null;
    protected int maxLength = 4;
    protected float numChars = 4.0f;
    protected getMin onPinEnteredListener = null;
    protected ColorStateList originalTextColors;
    protected Drawable pinBackground;
    private boolean setMax;
    protected String singleCharHint = null;
    protected Paint singleCharPaint;
    protected float space = 24.0f;
    protected int[][] states = {new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
    protected float textBottomPadding = 8.0f;
    protected Rect textHeight = new Rect();

    public interface getMin {
        void setMax(CharSequence charSequence);
    }

    public interface setMax {
        boolean getMin();
    }

    public PinEntryEditText(Context context) {
        super(context);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length(context, attributeSet);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void length(Context context, AttributeSet attributeSet) {
        int i;
        float f = context.getResources().getDisplayMetrics().density;
        this.lineStroke *= f;
        this.lineStrokeSelected *= f;
        this.space *= f;
        this.textBottomPadding = f * this.textBottomPadding;
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.PlaybackStateCompat, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(0, typedValue);
            this.animatedType = typedValue.data;
            this.mask = obtainStyledAttributes.getString(3);
            this.singleCharHint = obtainStyledAttributes.getString(8);
            this.lineStroke = obtainStyledAttributes.getDimension(6, this.lineStroke);
            this.lineStrokeSelected = obtainStyledAttributes.getDimension(7, this.lineStrokeSelected);
            this.space = obtainStyledAttributes.getDimension(4, this.space);
            this.textBottomPadding = obtainStyledAttributes.getDimension(9, this.textBottomPadding);
            this.digitSquare = obtainStyledAttributes.getBoolean(2, this.digitSquare);
            this.pinBackground = obtainStyledAttributes.getDrawable(1);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
            if (colorStateList != null) {
                this.colorStates = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.charPaint = new Paint(getPaint());
            this.lastCharPaint = new Paint(getPaint());
            this.singleCharPaint = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.linesPaint = paint;
            paint.setStrokeWidth(this.lineStroke);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.f4572130968910, typedValue2, true);
            this.listColors[0] = typedValue2.data;
            int i2 = -7829368;
            if (isInEditMode()) {
                i = -7829368;
            } else {
                i = IntRange.setMax(context, R.color.f19022131099797);
            }
            this.listColors[1] = i;
            if (!isInEditMode()) {
                i2 = IntRange.setMax(context, R.color.f19022131099797);
            }
            this.listColors[2] = i2;
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", SecurityConstants.KEY_MAXLENGTH, 4);
            this.maxLength = attributeIntValue;
            this.numChars = (float) attributeIntValue;
            super.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
                public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                public final void onDestroyActionMode(ActionMode actionMode) {
                }

                public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
            super.setOnClickListener(new View.OnClickListener(this) {
                private final PinEntryEditText length;

                {
                    this.length = r1;
                }

                public final void onClick(View view) {
                    PinEntryEditText.getMax(this.length, view);
                }
            });
            super.setOnLongClickListener(new View.OnLongClickListener(this) {
                private final PinEntryEditText setMax;

                {
                    this.setMax = r1;
                }

                public final boolean onLongClick(View view) {
                    return this.setMax.setMax();
                }
            });
            if (((getInputType() & 128) == 128 && TextUtils.isEmpty(this.mask)) || ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.mask))) {
                this.mask = "●";
            }
            if (!TextUtils.isEmpty(this.mask)) {
                this.maskChars = getMax();
            }
            getPaint().getTextBounds("|", 0, 1, this.textHeight);
            if (this.animatedType >= 0) {
                z = true;
            }
            this.animate = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean setMax() {
        setSelection(getText().length());
        return true;
    }

    private void setMin() {
        int i;
        float f;
        ColorStateList textColors = getTextColors();
        this.originalTextColors = textColors;
        if (textColors != null) {
            this.lastCharPaint.setColor(textColors.getDefaultColor());
            this.charPaint.setColor(this.originalTextColors.getDefaultColor());
            this.singleCharPaint.setColor(getCurrentHintTextColor());
        }
        int width = (getWidth() - ViewCompat.FastBitmap$CoordinateSystem(this)) - ViewCompat.toString(this);
        float f2 = this.space;
        if (f2 < 0.0f) {
            this.charSize = ((float) width) / ((this.numChars * 2.0f) - 1.0f);
        } else {
            float f3 = this.numChars;
            this.charSize = (((float) width) - (f2 * (f3 - 1.0f))) / f3;
        }
        float f4 = this.numChars;
        this.lineCoords = new RectF[((int) f4)];
        this.charBottom = new float[((int) f4)];
        int height = getHeight() - getPaddingBottom();
        int i2 = 1;
        if (setTitle.setMax(Locale.getDefault()) == 1) {
            i2 = -1;
            i = (int) (((float) (getWidth() - ViewCompat.toString(this))) - this.charSize);
        } else {
            i = ViewCompat.toString(this);
        }
        for (int i3 = 0; ((float) i3) < this.numChars; i3++) {
            float f5 = (float) i;
            float f6 = (float) height;
            this.lineCoords[i3] = new RectF(f5, f6, this.charSize + f5, f6);
            if (this.pinBackground != null) {
                if (this.digitSquare) {
                    this.lineCoords[i3].top = (float) getPaddingTop();
                    RectF[] rectFArr = this.lineCoords;
                    rectFArr[i3].right = rectFArr[i3].height() + f5;
                } else {
                    this.lineCoords[i3].top -= ((float) this.textHeight.height()) + (this.textBottomPadding * 2.0f);
                }
            }
            float f7 = this.space;
            if (f7 < 0.0f) {
                f = f5 + (((float) i2) * this.charSize * 2.0f);
            } else {
                f = f5 + (((float) i2) * (this.charSize + f7));
            }
            i = (int) f;
            this.charBottom[i3] = this.lineCoords[i3].bottom - this.textBottomPadding;
        }
    }

    public void setDigitSquare(boolean z) {
        this.digitSquare = z;
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setMin();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        setMax setmax;
        if (keyEvent.getAction() != 1 || i != 4 || (setmax = this.listener) == null || !setmax.getMin()) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        RectF[] rectFArr = this.lineCoords;
        if (rectFArr != null && this.animate) {
            int i4 = this.animatedType;
            if (i4 == -1) {
                invalidate();
            } else if (i3 <= i2) {
            } else {
                if (i4 == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, getPaint().getTextSize()});
                    ofFloat.setDuration(200);
                    ofFloat.setInterpolator(new OvershootInterpolator());
                    ofFloat.addUpdateListener(new onInfo(this));
                    if (getText().length() == this.maxLength && this.onPinEnteredListener != null) {
                        ofFloat.addListener(new Animator.AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                PinEntryEditText.this.onPinEnteredListener.setMax(PinEntryEditText.this.getText());
                            }
                        });
                    }
                    ofFloat.start();
                    return;
                }
                this.charBottom[i] = rectFArr[i].bottom - this.textBottomPadding;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.charBottom[i] + getPaint().getTextSize(), this.charBottom[i]});
                ofFloat2.setDuration(300);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) {
                    private final PinEntryEditText setMax;
                    private final int setMin;

                    {
                        this.setMax = r1;
                        this.setMin = r2;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PinEntryEditText.length(this.setMax, this.setMin, valueAnimator);
                    }
                });
                this.lastCharPaint.setAlpha(255);
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    private final PinEntryEditText getMin;

                    {
                        this.getMin = r1;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.getMin.lastCharPaint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                if (charSequence.length() == this.maxLength && this.onPinEnteredListener != null) {
                    animatorSet.addListener(new Animator.AnimatorListener() {
                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            PinEntryEditText.this.onPinEnteredListener.setMax(PinEntryEditText.this.getText());
                        }
                    });
                }
                animatorSet.playTogether(new Animator[]{ofFloat2, ofInt});
                animatorSet.start();
            }
        } else if (this.onPinEnteredListener != null && charSequence.length() == this.maxLength) {
            this.onPinEnteredListener.setMax(charSequence);
        }
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(int i) {
        this.maxLength = i;
        this.numChars = (float) i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxLength)});
        setMin();
        invalidate();
    }

    public void showCharacters() {
        this.setMax = true;
        invalidate();
    }

    public void hideCharacters() {
        this.setMax = false;
        invalidate();
    }

    private StringBuilder getMax() {
        if (this.maskChars == null) {
            this.maskChars = new StringBuilder();
        }
        int length = getText().length();
        while (this.maskChars.length() != length) {
            if (this.maskChars.length() < length) {
                this.maskChars.append(this.mask);
            } else {
                StringBuilder sb = this.maskChars;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.maskChars;
    }

    /* access modifiers changed from: protected */
    public void updateColorForLines(boolean z) {
        if (this.hasError) {
            this.linesPaint.setColor(this.colorStates.getColorForState(new int[]{16842914}, -7829368));
        } else if (isFocused()) {
            this.linesPaint.setStrokeWidth(this.lineStrokeSelected);
            this.linesPaint.setColor(this.colorStates.getColorForState(new int[]{16842908}, -7829368));
            if (z) {
                this.linesPaint.setColor(this.colorStates.getColorForState(new int[]{16842913}, -7829368));
            }
        } else {
            this.linesPaint.setStrokeWidth(this.lineStroke);
            this.linesPaint.setColor(this.colorStates.getColorForState(new int[]{-16842908}, -7829368));
        }
    }

    /* access modifiers changed from: protected */
    public void updateDrawableState(boolean z, boolean z2) {
        if (this.hasError) {
            this.pinBackground.setState(new int[]{16842914});
        } else if (isFocused()) {
            this.pinBackground.setState(new int[]{16842908});
            if (z2) {
                this.pinBackground.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.pinBackground.setState(new int[]{16842908, 16842912});
            }
        } else {
            this.pinBackground.setState(new int[]{-16842908});
        }
    }

    public boolean isError() {
        return this.hasError;
    }

    public void setError(boolean z) {
        this.hasError = z;
    }

    public void focus() {
        requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
    }

    public void setAnimateText(boolean z) {
        this.animate = z;
    }

    public void setOnPinEnteredListener(getMin getmin) {
        this.onPinEnteredListener = getmin;
    }

    public void setOnBackButtonListener(setMax setmax) {
        this.listener = setmax;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        CharSequence charSequence;
        float f;
        if (this.mask == null) {
            charSequence = getText();
        } else if (this.setMax) {
            charSequence = getText();
        } else {
            charSequence = getMax();
        }
        int length = charSequence.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(charSequence, 0, length, fArr);
        float f2 = 0.0f;
        String str = this.singleCharHint;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.singleCharHint, fArr2);
            for (int i = 0; i < length2; i++) {
                f2 += fArr2[i];
            }
            f = f2;
        } else {
            f = 0.0f;
        }
        int i2 = 0;
        while (((float) i2) < this.numChars) {
            boolean z = true;
            if (this.pinBackground != null) {
                updateDrawableState(i2 < length, i2 == length);
                this.pinBackground.setBounds((int) this.lineCoords[i2].left, (int) this.lineCoords[i2].top, (int) this.lineCoords[i2].right, (int) this.lineCoords[i2].bottom);
                this.pinBackground.draw(canvas);
            }
            float f3 = this.lineCoords[i2].left + (this.charSize / 2.0f);
            if (length <= i2) {
                String str2 = this.singleCharHint;
                if (str2 != null) {
                    canvas.drawText(str2, f3 - (f / 2.0f), this.charBottom[i2], this.singleCharPaint);
                }
            } else if (!this.animate || i2 != length - 1) {
                canvas.drawText(charSequence, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.charBottom[i2], this.charPaint);
            } else {
                canvas.drawText(charSequence, i2, i2 + 1, f3 - (fArr[i2] / 2.0f), this.charBottom[i2], this.lastCharPaint);
            }
            if (this.pinBackground == null) {
                if (i2 > length) {
                    z = false;
                }
                updateColorForLines(z);
                canvas.drawLine(this.lineCoords[i2].left, this.lineCoords[i2].bottom, this.lineCoords[i2].right, this.lineCoords[i2].bottom, this.linesPaint);
            }
            i2++;
        }
    }

    public static /* synthetic */ void getMax(PinEntryEditText pinEntryEditText, View view) {
        pinEntryEditText.setSelection(pinEntryEditText.getText().length());
        View.OnClickListener onClickListener = pinEntryEditText.clickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static /* synthetic */ void getMax(PinEntryEditText pinEntryEditText, ValueAnimator valueAnimator) {
        pinEntryEditText.lastCharPaint.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
        pinEntryEditText.invalidate();
    }

    public static /* synthetic */ void length(PinEntryEditText pinEntryEditText, int i, ValueAnimator valueAnimator) {
        pinEntryEditText.charBottom[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pinEntryEditText.invalidate();
    }
}
