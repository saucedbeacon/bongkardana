package com.alipay.iap.android.f2fpay.widgets.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayAsyncTask;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.widgets.activity.F2FPayFullscreenDisplayActivity;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeState;
import com.alipay.iap.android.f2fpay.widgets.data.QRCodeConfiguration;
import com.alipay.imobile.magenerator.api.IAPMaGenerator;

public class F2FPayQRCodeView extends F2FPayAbstractPaymentCodeView {
    public static final int DEFAULT_SIZE = 300;
    /* access modifiers changed from: private */
    public int h;
    private Bitmap i;
    private ImageView j;
    /* access modifiers changed from: private */
    public QRCodeConfiguration k = new QRCodeConfiguration();

    public F2FPayQRCodeView(Context context) {
        super(context);
        a(context);
    }

    public F2FPayQRCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public F2FPayQRCodeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    private void a(Context context) {
        ImageView imageView = new ImageView(context);
        this.j = imageView;
        addView(imageView);
    }

    /* access modifiers changed from: protected */
    public void a() {
        a(F2FPayFullscreenDisplayActivity.a.QRCode, this.c, this.i, this.k);
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!TextUtils.isEmpty(this.c) && this.h > 0) {
            LoggerWrapper.i(F2FPayConstants.TAG, "refreshPaymentCodeBitmap");
            F2FPayAsyncTask.asyncTask(new F2FPayAsyncTask.F2FPayRunner<Bitmap>() {
                public Bitmap execute() throws Exception {
                    LoggerWrapper.i(F2FPayConstants.TAG, "generate qr code in work thread.");
                    int min = Math.min(300, F2FPayQRCodeView.this.h);
                    return F2FPayQRCodeView.this.k.logo != null ? IAPMaGenerator.getInstance().encodeQRAsBitmap(F2FPayQRCodeView.this.c, F2FPayQRCodeView.this.k.logo, min, F2FPayQRCodeView.this.k.paymentCodeColor, F2FPayQRCodeView.this.k.backgroundColor) : IAPMaGenerator.getInstance().encodeQRAsBitmap(F2FPayQRCodeView.this.c, min, F2FPayQRCodeView.this.k.paymentCodeColor, F2FPayQRCodeView.this.k.backgroundColor);
                }

                public void onFailure(IAPError iAPError) {
                    super.onFailure(iAPError);
                    LoggerWrapper.e(F2FPayConstants.TAG, String.format("encode BarCode FAILED! message = %s", new Object[]{iAPError.errorMessage}));
                }

                public void onSuccess(Bitmap bitmap) {
                    super.onSuccess(bitmap);
                    if (bitmap != null) {
                        F2FPayQRCodeView.this.setPaymentCodeBitmap(bitmap);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingLeft = getPaddingLeft() + 300 + getPaddingRight();
        int paddingTop = getPaddingTop() + 300 + getPaddingBottom();
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            paddingTop = size2;
        }
        int min = Math.min((paddingLeft - getPaddingLeft()) - getPaddingRight(), (paddingTop - getPaddingTop()) - getPaddingBottom());
        this.h = min;
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(size, min) + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(size2, this.h) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.width = (paddingLeft - getPaddingLeft()) - getPaddingRight();
        layoutParams.height = (paddingTop - getPaddingTop()) - getPaddingBottom();
        layoutParams.gravity = 17;
        this.j.setLayoutParams(layoutParams);
    }

    public void setConfiguration(QRCodeConfiguration qRCodeConfiguration) {
        if (qRCodeConfiguration != null) {
            this.k = qRCodeConfiguration;
            b();
        }
    }

    public void setLogo(Bitmap bitmap) {
        this.k.logo = bitmap;
        b();
    }

    /* access modifiers changed from: protected */
    public void setPaymentCodeBitmap(Bitmap bitmap) {
        LoggerWrapper.i(F2FPayConstants.TAG, "setPaymentCodeBitmap");
        this.i = bitmap;
        setPaymentCodeState(PaymentCodeState.Success);
        this.j.setImageBitmap(bitmap);
        postInvalidate();
    }

    public void setQrCodeBackgroundColor(int i2) {
        this.k.backgroundColor = i2;
        b();
    }

    public void setQrCodeColor(int i2) {
        this.k.paymentCodeColor = i2;
        b();
    }
}
