package com.alipay.mobile.verifyidentity.uitools.verification;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alipay.mobile.verifyidentity.uitools.R;
import com.alipay.mobile.verifyidentity.uitools.verification.VerificationAction;

public class VerificationCodeEditText extends EditText implements VerificationAction, TextWatcher {
    private static final int OTP_HALF_DISPLAY_STYLE = 1021;
    private int codeMargin4;
    private int codeMargin6;
    private final float codeMarginFor4;
    private final float codeMarginFor6;
    private float density;
    /* access modifiers changed from: private */
    public Handler handler;
    private int inputStyle;
    private float leftRightMarginFor4;
    private float leftRightMarginFor6;
    private int mBottomLineCursorColor;
    private Paint mBottomLineCursorPaint;
    private float mBottomLineHeight;
    private int mBottomNormalColor;
    private Paint mBottomNormalPaint;
    private int mBottomSelectedColor;
    private Paint mBottomSelectedPaint;
    private int mCurrentPosition;
    private int mEachRectLength;
    private int mFigures;
    private Paint mNormalBackgroundPaint;
    private int mSelectedBackgroundColor;
    private Paint mSelectedBackgroundPaint;
    private int mVerCodeMargin;
    private int margin4;
    private int margin6;
    private VerificationAction.OnVerificationCodeChangedListener onCodeChangedListener;
    /* access modifiers changed from: private */
    public boolean showCursor;
    private int widthResult;

    public void setInputStyle(int i) {
        this.inputStyle = i;
        if (i == 1021) {
            setBottomUnselectedColor(getColor(R.color.black_text));
            setBottomLineCursorColor(getColor(R.color.black_text));
            setBottomLineHeight(dp2px(2));
            this.margin6 = dp2px(88);
            setCodeLeftAndRightWidth();
            setVerCodeMargin(8);
        }
    }

    public VerificationCodeEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public VerificationCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerificationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.leftRightMarginFor4 = 47.36f;
        this.leftRightMarginFor6 = 18.35f;
        this.codeMarginFor4 = 10.24f;
        this.codeMarginFor6 = 8.62f;
        this.mCurrentPosition = 0;
        this.mEachRectLength = 0;
        this.showCursor = true;
        this.handler = null;
        this.inputStyle = -1;
        initAttrs(attributeSet);
        setBackgroundColor(getResources().getColor(17170445));
        initPaint();
        setFocusableInTouchMode(true);
        super.addTextChangedListener(this);
    }

    public void setBottomLineCursorColor(int i) {
        this.mBottomLineCursorColor = i;
        this.mBottomLineCursorPaint.setColor(i);
        invalidate();
    }

    public void setBottomUnselectedColor(int i) {
        this.mBottomNormalColor = i;
        this.mBottomNormalPaint.setColor(i);
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mSelectedBackgroundPaint = paint;
        paint.setColor(this.mSelectedBackgroundColor);
        Paint paint2 = new Paint();
        this.mNormalBackgroundPaint = paint2;
        paint2.setColor(getColor(17170445));
        this.mBottomSelectedPaint = new Paint();
        this.mBottomNormalPaint = new Paint();
        this.mBottomLineCursorPaint = new Paint();
        this.mBottomSelectedPaint.setColor(this.mBottomSelectedColor);
        this.mBottomNormalPaint.setColor(this.mBottomNormalColor);
        this.mBottomLineCursorPaint.setColor(this.mBottomLineCursorColor);
        this.mBottomSelectedPaint.setStrokeWidth(this.mBottomLineHeight);
        this.mBottomNormalPaint.setStrokeWidth(this.mBottomLineHeight);
        this.mBottomLineCursorPaint.setStrokeWidth(this.mBottomLineHeight);
        AnonymousClass1 r0 = new Handler() {
            public void dispatchMessage(Message message) {
                super.dispatchMessage(message);
                VerificationCodeEditText verificationCodeEditText = VerificationCodeEditText.this;
                boolean unused = verificationCodeEditText.showCursor = !verificationCodeEditText.showCursor;
                VerificationCodeEditText.this.invalidate();
                VerificationCodeEditText.this.handler.sendEmptyMessageDelayed(0, 500);
            }
        };
        this.handler = r0;
        r0.sendEmptyMessageDelayed(0, 500);
    }

    private void initAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.VerCodeEditText);
        this.mFigures = obtainStyledAttributes.getInteger(R.styleable.VerCodeEditText_figures, 6);
        this.mVerCodeMargin = (int) obtainStyledAttributes.getDimension(R.styleable.VerCodeEditText_verCodeMargin, (float) dp2px(10));
        this.mBottomSelectedColor = obtainStyledAttributes.getColor(R.styleable.VerCodeEditText_bottomLineSelectedColor, getColor(R.color.gravy_light));
        this.mBottomLineCursorColor = obtainStyledAttributes.getColor(R.styleable.VerCodeEditText_bottomLineCursorColor, getColor(R.color.high_light));
        this.mBottomNormalColor = obtainStyledAttributes.getColor(R.styleable.VerCodeEditText_bottomLineNormalColor, getColor(R.color.gravy_light));
        this.mBottomLineHeight = obtainStyledAttributes.getDimension(R.styleable.VerCodeEditText_bottomLineHeight, (float) dp2px(1));
        this.mSelectedBackgroundColor = obtainStyledAttributes.getColor(R.styleable.VerCodeEditText_selectedBackgroundColor, getColor(17170445));
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
        float f = getResources().getDisplayMetrics().density;
        this.density = f;
        this.margin4 = (int) ((this.leftRightMarginFor4 * f) + 0.5f);
        this.margin6 = (int) ((this.leftRightMarginFor6 * f) + 0.5f);
        this.codeMargin4 = (int) ((10.24f * f) + 0.5f);
        this.codeMargin6 = (int) ((f * 8.62f) + 0.5f);
    }

    public final void setCursorVisible(boolean z) {
        super.setCursorVisible(true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.widthResult = 0;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            this.widthResult = size;
        } else {
            this.widthResult = getScreenWidth(getContext());
        }
        int i3 = this.widthResult;
        int i4 = this.mVerCodeMargin;
        int i5 = this.mFigures;
        this.mEachRectLength = (i3 - (i4 * (i5 - 1))) / i5;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.mEachRectLength;
        }
        setMeasuredDimension(this.widthResult, size2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        requestFocus();
        setSelection(getText().length());
        showKeyBoard(getContext());
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        this.mCurrentPosition = getText().length();
        int paddingLeft = (this.mEachRectLength - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        for (int i = 0; i < this.mFigures; i++) {
            canvas.save();
            int i2 = (paddingLeft * i) + (this.mVerCodeMargin * i);
            int i3 = paddingLeft + i2;
            if (i == this.mCurrentPosition) {
                canvas.drawRect((float) i2, 0.0f, (float) i3, (float) measuredHeight, this.mSelectedBackgroundPaint);
            } else {
                canvas.drawRect((float) i2, 0.0f, (float) i3, (float) measuredHeight, this.mNormalBackgroundPaint);
            }
            canvas.restore();
        }
        String obj = getText().toString();
        for (int i4 = 0; i4 < obj.length(); i4++) {
            canvas.save();
            float f2 = (float) ((paddingLeft * i4) + (this.mVerCodeMargin * i4) + (paddingLeft / 2));
            TextPaint paint = getPaint();
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(getCurrentTextColor());
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            if (this.inputStyle == 1021) {
                paint.setFakeBoldText(true);
            }
            if (this.inputStyle != 1021) {
                f = (((((float) measuredHeight) - fontMetrics.bottom) + fontMetrics.top) / 2.0f) - fontMetrics.top;
            } else {
                f = ((((((float) measuredHeight) - fontMetrics.bottom) + fontMetrics.top) * 100.0f) / 99.0f) - fontMetrics.top;
            }
            canvas.drawText(String.valueOf(obj.charAt(i4)), f2, f, paint);
            canvas.restore();
        }
        Canvas canvas2 = canvas;
        if (this.inputStyle != 1021 && this.showCursor) {
            canvas.save();
            float f3 = (float) paddingLeft;
            int i5 = measuredHeight / 6;
            Canvas canvas3 = canvas;
            canvas3.drawLine(((((float) obj.length()) + 0.5f) * f3) + ((float) (obj.length() * this.mVerCodeMargin)), (float) i5, (f3 * (((float) obj.length()) + 0.5f)) + ((float) (obj.length() * this.mVerCodeMargin)), (float) (i5 * 5), this.mBottomLineCursorPaint);
            canvas.restore();
        }
        for (int i6 = 0; i6 < this.mFigures; i6++) {
            canvas.save();
            float f4 = ((float) measuredHeight) - (this.mBottomLineHeight / 2.0f);
            int i7 = (paddingLeft * i6) + (this.mVerCodeMargin * i6);
            int i8 = paddingLeft + i7;
            int i9 = this.mCurrentPosition;
            if (i6 < i9) {
                if (this.inputStyle != 1021) {
                    canvas.drawLine((float) i7, f4, (float) i8, f4, this.mBottomSelectedPaint);
                }
            } else if (i6 == i9) {
                canvas.drawLine((float) i7, f4, (float) i8, f4, this.mBottomLineCursorPaint);
            } else {
                canvas.drawLine((float) i7, f4, (float) i8, f4, this.mBottomNormalPaint);
            }
            canvas.restore();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        VerificationAction.OnVerificationCodeChangedListener onVerificationCodeChangedListener = this.onCodeChangedListener;
        if (onVerificationCodeChangedListener != null) {
            onVerificationCodeChangedListener.onVerCodeChanged(getText(), i, i2, i3);
        }
    }

    public void afterTextChanged(Editable editable) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        if (getText().length() == this.mFigures) {
            VerificationAction.OnVerificationCodeChangedListener onVerificationCodeChangedListener = this.onCodeChangedListener;
            if (onVerificationCodeChangedListener != null) {
                onVerificationCodeChangedListener.onInputCompleted(getText());
            }
        } else if (getText().length() > this.mFigures) {
            getText().delete(this.mFigures, getText().length());
        }
    }

    private void adjustMargin() {
        int i = this.mFigures;
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = this.margin4;
                layoutParams2.rightMargin = this.margin4;
                setLayoutParams(layoutParams);
            } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.leftMargin = this.margin4;
                layoutParams3.rightMargin = this.margin4;
                setLayoutParams(layoutParams);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams4.leftMargin = this.margin4;
                layoutParams4.rightMargin = this.margin4;
                setLayoutParams(layoutParams);
            }
        } else if (i == 6) {
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.leftMargin = this.margin6;
                layoutParams6.rightMargin = this.margin6;
                setLayoutParams(layoutParams5);
            } else if (layoutParams5 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams7.leftMargin = this.margin6;
                layoutParams7.rightMargin = this.margin6;
                setLayoutParams(layoutParams5);
            } else if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams8.leftMargin = this.margin6;
                layoutParams8.rightMargin = this.margin6;
                setLayoutParams(layoutParams5);
            }
        }
    }

    private void adjustVerCodeMargin() {
        int i = this.mFigures;
        if (i == 4) {
            this.mVerCodeMargin = this.codeMargin4;
        } else if (i == 6) {
            this.mVerCodeMargin = this.codeMargin6;
        }
    }

    public void setFigures(int i) {
        this.mFigures = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        adjustMargin();
        adjustVerCodeMargin();
        postInvalidate();
    }

    public void setVerCodeMargin(int i) {
        this.mVerCodeMargin = i;
        postInvalidate();
    }

    public void setCodeLeftAndRightWidth() {
        adjustMargin();
        adjustVerCodeMargin();
        postInvalidate();
    }

    public void setInputSize() {
        int i = this.widthResult;
        int i2 = this.mVerCodeMargin;
        int i3 = this.mFigures;
        this.mEachRectLength = (i - (i2 * (i3 - 1))) / i3;
        postInvalidate();
    }

    public void setBottomSelectedColor(int i) {
        this.mBottomSelectedColor = getColor(i);
        postInvalidate();
    }

    public void setBottomNormalColor(int i) {
        this.mBottomSelectedColor = getColor(i);
        postInvalidate();
    }

    public void setSelectedBackgroundColor(int i) {
        this.mSelectedBackgroundColor = getColor(i);
        postInvalidate();
    }

    public void setBottomLineHeight(int i) {
        float f = (float) i;
        this.mBottomLineHeight = f;
        this.mBottomSelectedPaint.setStrokeWidth(f);
        this.mBottomNormalPaint.setStrokeWidth(this.mBottomLineHeight);
        this.mBottomLineCursorPaint.setStrokeWidth(this.mBottomLineHeight);
        postInvalidate();
    }

    public void setOnVerificationCodeChangedListener(VerificationAction.OnVerificationCodeChangedListener onVerificationCodeChangedListener) {
        this.onCodeChangedListener = onVerificationCodeChangedListener;
    }

    private int getColor(int i) {
        return getResources().getColor(i);
    }

    private int dp2px(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public void showKeyBoard(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this, 2);
    }

    public void hideKeyBoard(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }
}
