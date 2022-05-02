package com.alipay.iap.android.f2fpay.widgets.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayAsyncTask;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.widgets.a.a;
import com.alipay.iap.android.f2fpay.widgets.activity.F2FPayFullscreenDisplayActivity;
import com.alipay.iap.android.f2fpay.widgets.data.BarCodeConfiguration;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeState;
import com.alipay.imobile.magenerator.api.IAPMaGenerator;
import java.util.Arrays;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class F2FPayBarcodeView extends F2FPayAbstractPaymentCodeView {
    /* access modifiers changed from: private */
    public BarCodeConfiguration h = new BarCodeConfiguration();
    private int i;
    private Paint j = new Paint();
    private Rect k = new Rect();
    private Rect l = new Rect();
    private Rect m = new Rect();
    private Rect n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private Bitmap f10682o;
    private int[] p;
    /* access modifiers changed from: private */
    public int q;
    /* access modifiers changed from: private */
    public int r;

    public F2FPayBarcodeView(Context context) {
        super(context);
        g();
    }

    public F2FPayBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public F2FPayBarcodeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        g();
    }

    private int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        return mode == 0 ? i2 : (mode == 1073741824 || mode == Integer.MIN_VALUE) ? View.MeasureSpec.getSize(i3) : i2;
    }

    private void d(Canvas canvas) {
        this.j.setColor(this.h.hintColor);
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        canvas.drawRect(this.m, this.j);
        canvas.drawRect(this.n, this.j);
    }

    private void e(Canvas canvas) {
        LoggerWrapper.i(F2FPayConstants.TAG, "drawBarCode");
        if (this.f10682o != null) {
            this.j.setTypeface(this.h.textTypeface);
            this.j.setTextSize((float) this.h.textSize);
            this.j.setColor(this.h.textColor);
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            canvas.drawBitmap(this.f10682o, this.l, this.k, (Paint) null);
            if (this.p != null) {
                LoggerWrapper.i(F2FPayConstants.TAG, "onDraw draw number text");
                int ascent = (int) ((((float) this.k.bottom) - this.j.ascent()) + ((float) this.h.gapBetweenBarcodeAndNumber));
                int i2 = 0;
                while (true) {
                    int[] iArr = this.p;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        int i4 = i2 * this.h.perGroupLengthOfText;
                        int i5 = this.h.perGroupLengthOfText;
                        if (i2 == this.p.length - 1) {
                            i5 = this.c.length() - (this.h.perGroupLengthOfText * (this.p.length - 1));
                        }
                        canvas.drawText(this.c, i4, i4 + i5, (float) i3, (float) ascent, this.j);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void g() {
        Resources resources = getResources();
        this.i = a.a(resources, 20.0f);
        this.h.groupGap = a.a(resources, 10.0f);
        this.h.textSize = a.a(resources, 16.0f);
        this.h.gapBetweenBarcodeAndNumber = a.a(resources, 3.0f);
        if (getResources().getDisplayMetrics().densityDpi < 320) {
            this.h.textSize = a.a(resources, 14.0f);
        }
    }

    private void h() {
        StringBuilder sb = new StringBuilder("calculateSizeOfPaymentCode:");
        sb.append(this.c);
        sb.append(",mBarCodeBitmap");
        sb.append(this.f10682o);
        LoggerWrapper.i(F2FPayConstants.TAG, sb.toString());
        if (!TextUtils.isEmpty(this.c) && this.k.width() > 0) {
            int length = this.c.length();
            if (this.h.perGroupLengthOfText <= 0) {
                this.h.perGroupLengthOfText = length;
            }
            int length2 = this.c.length() / this.h.perGroupLengthOfText;
            this.p = new int[length2];
            int i2 = this.h.groupGap * (length2 - 1);
            this.j.setTypeface(this.h.textTypeface);
            this.j.setTextSize((float) this.h.textSize);
            int width = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - (i2 + ((int) this.j.measureText(this.c)))) / 2;
            float measureText = ((float) this.h.groupGap) + (this.j.measureText(this.c) / ((float) length2));
            int i3 = 0;
            while (true) {
                int[] iArr = this.p;
                if (i3 < iArr.length) {
                    iArr[i3] = (int) (((float) width) + (((float) i3) * measureText));
                    i3++;
                } else {
                    StringBuilder sb2 = new StringBuilder("calculateSizeOfPaymentCode result:");
                    sb2.append(Arrays.toString(this.p));
                    LoggerWrapper.i(F2FPayConstants.TAG, sb2.toString());
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        a(F2FPayFullscreenDisplayActivity.a.Barcode, this.c, this.f10682o, this.h);
    }

    /* access modifiers changed from: protected */
    public void b() {
        int width = getWidth();
        int height = getHeight();
        if (!TextUtils.isEmpty(this.c) && width > 0 && height > 0) {
            F2FPayAsyncTask.asyncTask(new F2FPayAsyncTask.F2FPayRunner<Bitmap>() {
                public Bitmap execute() throws Exception {
                    LoggerWrapper.i(F2FPayConstants.TAG, "generate bar code in work thread.");
                    return IAPMaGenerator.getInstance().encodeAsBarCode(F2FPayBarcodeView.this.c, F2FPayBarcodeView.this.q, F2FPayBarcodeView.this.r, F2FPayBarcodeView.this.h.paymentCodeColor, F2FPayBarcodeView.this.h.backgroundColor);
                }

                public void onFailure(IAPError iAPError) {
                    super.onFailure(iAPError);
                    LoggerWrapper.e(F2FPayConstants.TAG, String.format("encode BarCode FAILED! message = %s", new Object[]{iAPError.errorMessage}));
                }

                public void onSuccess(Bitmap bitmap) {
                    super.onSuccess(bitmap);
                    if (bitmap != null) {
                        F2FPayBarcodeView.this.setPaymentCodeBitmap(bitmap);
                    }
                }
            });
        }
    }

    public BarCodeConfiguration getConfiguration() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f10682o;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSuccess()) {
            e(canvas);
        } else if (!this.b) {
            d(canvas);
        } else if (isLoading()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!z) {
            h();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int a2 = a(375, i2);
        int paddingLeft = (a2 - getPaddingLeft()) - getPaddingRight();
        float f = (float) getResources().getDisplayMetrics().densityDpi;
        float f2 = 2.559055f * f;
        float f3 = f * 0.39370078f;
        float f4 = (float) paddingLeft;
        if (f2 > f4) {
            f2 = f4;
        }
        int round = Math.round(f2 - (((f2 / 187.0f) * 10.0f) * 2.0f));
        this.q = round;
        float f5 = ((float) round) * 0.25f;
        int round2 = f3 < f5 ? Math.round(f5) : Math.round(f3);
        this.r = round2;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i3);
            this.r = (i4 - getPaddingTop()) - getPaddingBottom();
            if (this.h.isDisplayTextOfPaymentCode) {
                int i5 = this.r - this.h.textSize;
                this.r = i5;
                this.r = i5 - this.h.gapBetweenBarcodeAndNumber;
            }
        } else {
            if (this.h.isDisplayTextOfPaymentCode) {
                round2 = round2 + this.h.textSize + this.h.gapBetweenBarcodeAndNumber;
            }
            i4 = getPaddingTop() + getPaddingBottom() + round2;
        }
        int i6 = this.q;
        int i7 = (paddingLeft - i6) / 2;
        int i8 = i6 + ((paddingLeft - i6) / 2);
        this.k.set(i7, 0, i8, this.r);
        Rect rect = this.m;
        int i9 = this.i;
        rect.set(i9 + i7, 0, i8 - i9, this.r);
        int i10 = this.k.bottom + this.h.gapBetweenBarcodeAndNumber;
        this.j.setTypeface(this.h.textTypeface);
        this.j.setTextSize((float) this.h.textSize);
        this.j.setAntiAlias(true);
        Rect rect2 = this.n;
        int i11 = this.i;
        rect2.set(i7 + i11, i10, i8 - i11, (int) (((float) i10) + this.j.getTextSize()));
        setMeasuredDimension(a2, i4);
    }

    public void setBarcodeBackgroundColor(int i2) {
        this.h.backgroundColor = i2;
    }

    public void setBarcodeColor(int i2) {
        this.h.paymentCodeColor = i2;
    }

    public void setConfiguration(BarCodeConfiguration barCodeConfiguration) {
        if (barCodeConfiguration != null) {
            this.h = barCodeConfiguration;
            h();
        }
    }

    public void setDisplayNumberOfPaymentCode(boolean z) {
        this.h.isDisplayTextOfPaymentCode = z;
        requestLayout();
    }

    public void setGapBetweenBarcodeAndNumberInDip(int i2) {
        this.h.gapBetweenBarcodeAndNumber = a.a(getResources(), (float) i2);
        requestLayout();
    }

    public void setGroupGapInDip(int i2) {
        this.h.groupGap = a.a(getResources(), (float) i2);
        h();
    }

    public void setNumberTextColor(int i2) {
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(771191685, oncanceled);
            onCancelLoad.getMin(771191685, oncanceled);
        }
        this.h.textColor = i2;
    }

    public void setNumberTextSizeInDip(int i2) {
        this.h.textSize = a.a(getResources(), (float) i2);
        h();
    }

    public void setNumberTextTypeface(Typeface typeface) {
        this.h.textTypeface = typeface;
    }

    /* access modifiers changed from: protected */
    public void setPaymentCodeBitmap(Bitmap bitmap) {
        this.f10682o = bitmap;
        if (bitmap != null) {
            this.l.set(0, 0, bitmap.getWidth(), this.f10682o.getHeight());
        }
        h();
        setPaymentCodeState(PaymentCodeState.Success);
        invalidate();
    }

    public void setPerGroupLengthOfNumber(int i2) {
        this.h.perGroupLengthOfText = i2;
        h();
    }
}
