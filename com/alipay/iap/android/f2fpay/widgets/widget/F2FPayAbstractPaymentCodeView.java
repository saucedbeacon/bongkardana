package com.alipay.iap.android.f2fpay.widgets.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.iap.android.f2fpay.widgets.a.b;
import com.alipay.iap.android.f2fpay.widgets.activity.F2FPayFullscreenDisplayActivity;
import com.alipay.iap.android.f2fpay.widgets.data.IF2FPaymentCodeStateChangedListener;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeConfiguration;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeState;

public abstract class F2FPayAbstractPaymentCodeView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected Context f10680a;
    protected boolean b = true;
    protected String c;
    protected RefreshLoadingDrawHelper d;
    protected IF2FPaymentCodeStateChangedListener e;
    protected PaymentCodeState f = PaymentCodeState.Failure;
    protected Mediator g;
    private boolean h = false;

    public interface Mediator {
        void refreshPaymentCode(int i);
    }

    public F2FPayAbstractPaymentCodeView(Context context) {
        super(context);
        a(context);
    }

    public F2FPayAbstractPaymentCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public F2FPayAbstractPaymentCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.f10680a = context;
        this.d = new RefreshLoadingDrawHelper(this);
        setWillNotDraw(false);
        d();
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (F2FPayAbstractPaymentCodeView.this.isSuccess()) {
                    F2FPayAbstractPaymentCodeView.this.a();
                } else if (F2FPayAbstractPaymentCodeView.this.isFailure()) {
                    F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView = F2FPayAbstractPaymentCodeView.this;
                    f2FPayAbstractPaymentCodeView.requestRefresh(f2FPayAbstractPaymentCodeView.b);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        if (isSuccess() || !this.b) {
            return;
        }
        if (isLoading()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void a(F2FPayFullscreenDisplayActivity.a aVar, String str, Bitmap bitmap, PaymentCodeConfiguration paymentCodeConfiguration) {
        Intent intent = new Intent(this.f10680a, F2FPayFullscreenDisplayActivity.class);
        intent.putExtra("DISPLAY_PATTERN", aVar);
        intent.putExtra("PAYMENT_CODE", str);
        intent.putExtra(aVar == F2FPayFullscreenDisplayActivity.a.QRCode ? "QR_CODE_CONFIGURATION" : "BARCODE_CONFIGURATION", paymentCodeConfiguration);
        this.f10680a.startActivity(intent);
        Context context = this.f10680a;
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public void b(Canvas canvas) {
        this.d.drawLoading(canvas);
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.d.calculatePosition();
    }

    /* access modifiers changed from: protected */
    public void c(Canvas canvas) {
        this.d.drawRefresh(canvas);
    }

    /* access modifiers changed from: protected */
    public void d() {
        Context context = this.f10680a;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            b.a(window, 0.8f);
            b.a(window);
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.d.startLoading();
    }

    /* access modifiers changed from: protected */
    public void f() {
        this.d.cancelLoading();
    }

    public void generatePaymentCodeFailed() {
        setPaymentCodeState(PaymentCodeState.Failure);
        if (this.b) {
            f();
        }
        postInvalidate();
    }

    public PaymentCodeState getPaymentCodeState() {
        return this.f;
    }

    public boolean isFailure() {
        return this.f == PaymentCodeState.Failure;
    }

    public boolean isLoading() {
        return this.f == PaymentCodeState.Loading;
    }

    public boolean isNeedShowLoading() {
        return this.b;
    }

    public boolean isSuccess() {
        return this.f == PaymentCodeState.Success;
    }

    public boolean isViewAttachedToWindow() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        if (isLoading() && this.b) {
            e();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = false;
        if (this.b) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (this.b) {
                c();
            }
            b();
        }
    }

    public void requestRefresh(boolean z) {
        setPaymentCodeState(PaymentCodeState.Loading);
        if (z) {
            this.d.startLoading();
        }
        Mediator mediator = this.g;
        if (mediator != null) {
            mediator.refreshPaymentCode(0);
        }
    }

    public void setMediator(Mediator mediator) {
        this.g = mediator;
    }

    public void setNeedShowLoading(boolean z) {
        this.b = z;
        if (!z) {
            f();
        } else {
            c();
        }
    }

    public void setOnStateChangedListener(IF2FPaymentCodeStateChangedListener iF2FPaymentCodeStateChangedListener) {
        this.e = iF2FPaymentCodeStateChangedListener;
    }

    public void setPaymentCodeAndBitmap(String str, Bitmap bitmap) {
        if (!TextUtils.equals(this.c, str)) {
            this.c = str;
            if (bitmap != null) {
                setPaymentCodeBitmap(bitmap);
                setPaymentCodeState(PaymentCodeState.Success);
                return;
            }
            b();
            setPaymentCodeState(PaymentCodeState.Loading);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void setPaymentCodeBitmap(Bitmap bitmap);

    public void setPaymentCodeState(PaymentCodeState paymentCodeState) {
        if (paymentCodeState != this.f) {
            this.f = paymentCodeState;
            if (isSuccess()) {
                f();
            }
            IF2FPaymentCodeStateChangedListener iF2FPaymentCodeStateChangedListener = this.e;
            if (iF2FPaymentCodeStateChangedListener != null) {
                iF2FPaymentCodeStateChangedListener.onPaymentCodeStateChanged(this.f);
            }
        }
    }

    public void updatePaymentCode(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
        StringBuilder sb = new StringBuilder("updatePaymentCode: ");
        sb.append(System.currentTimeMillis());
        LoggerWrapper.i(F2FPayConstants.TAG, sb.toString());
        if (f2FPaymentCodeInfo != null && !TextUtils.equals(this.c, f2FPaymentCodeInfo.paymentCode)) {
            this.c = f2FPaymentCodeInfo.paymentCode;
            b();
        }
    }
}
