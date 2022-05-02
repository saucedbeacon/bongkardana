package com.alipay.iap.android.f2fpay.widgets.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.iap.android.f2fpay.R;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.iap.android.f2fpay.widgets.a.a;
import com.alipay.iap.android.f2fpay.widgets.data.IF2FPaymentCodeStateChangedListener;
import com.alipay.iap.android.f2fpay.widgets.data.PaymentCodeState;

public class F2FPayCompositePaymentCodeView extends F2FPayAbstractPaymentCodeView {
    /* access modifiers changed from: private */
    public F2FPayBarcodeView h;
    /* access modifiers changed from: private */
    public F2FPayQRCodeView i;
    /* access modifiers changed from: private */
    public F2FPayRefreshButton j;
    private View k;
    private IF2FPaymentCodeStateChangedListener l = new IF2FPaymentCodeStateChangedListener() {
        public void onPaymentCodeStateChanged(PaymentCodeState paymentCodeState) {
            F2FPayCompositePaymentCodeView f2FPayCompositePaymentCodeView;
            PaymentCodeState paymentCodeState2;
            F2FPayCompositePaymentCodeView.this.j.setVisibility(paymentCodeState.isLoading() ? 4 : 0);
            PaymentCodeState paymentCodeState3 = F2FPayCompositePaymentCodeView.this.i.getPaymentCodeState();
            PaymentCodeState paymentCodeState4 = F2FPayCompositePaymentCodeView.this.h.getPaymentCodeState();
            if (paymentCodeState3.isSuccess() && paymentCodeState4.isSuccess()) {
                f2FPayCompositePaymentCodeView = F2FPayCompositePaymentCodeView.this;
                paymentCodeState2 = PaymentCodeState.Success;
            } else if (paymentCodeState3.isFailure() || paymentCodeState4.isFailure()) {
                f2FPayCompositePaymentCodeView = F2FPayCompositePaymentCodeView.this;
                paymentCodeState2 = PaymentCodeState.Failure;
            } else if (paymentCodeState3.isLoading() || paymentCodeState4.isLoading()) {
                F2FPayCompositePaymentCodeView.this.setPaymentCodeState(PaymentCodeState.Loading);
                return;
            } else {
                return;
            }
            f2FPayCompositePaymentCodeView.setPaymentCodeState(paymentCodeState2);
        }
    };

    public F2FPayCompositePaymentCodeView(Context context) {
        super(context);
        a(context);
    }

    public F2FPayCompositePaymentCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public F2FPayCompositePaymentCodeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    private void a(Context context) {
        Resources resources = getResources();
        this.d.setLoadingBkgRadius(a.a(resources, 10.0f));
        setBackgroundResource(R.drawable.iap_f2fpay_gray_background);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        F2FPayBarcodeView f2FPayBarcodeView = new F2FPayBarcodeView(context);
        this.h = f2FPayBarcodeView;
        f2FPayBarcodeView.setNeedShowLoading(false);
        this.h.setOnStateChangedListener(this.l);
        this.h.setBackgroundResource(R.drawable.iap_f2fpay_half_white_background);
        this.h.setPadding(0, a.a(resources, 15.0f), 0, a.a(resources, 15.0f));
        linearLayout.addView(this.h, new LinearLayout.LayoutParams(-1, -2));
        int color = resources.getColor(R.color.iap_f2fpay_default_background_color);
        F2FPayQRCodeView f2FPayQRCodeView = new F2FPayQRCodeView(context);
        this.i = f2FPayQRCodeView;
        f2FPayQRCodeView.setNeedShowLoading(false);
        this.i.setOnStateChangedListener(this.l);
        this.i.setBackgroundColor(color);
        this.i.setQrCodeBackgroundColor(color);
        this.i.setPadding(0, a.a(resources, 18.0f), 0, 0);
        linearLayout.addView(this.i, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        F2FPayRefreshButton f2FPayRefreshButton = new F2FPayRefreshButton(context);
        this.j = f2FPayRefreshButton;
        linearLayout.addView(f2FPayRefreshButton, new FrameLayout.LayoutParams(-1, -2));
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public void addRefreshView(View view) {
        this.k = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void generatePaymentCodeFailed() {
        super.generatePaymentCodeFailed();
        this.h.generatePaymentCodeFailed();
        this.i.generatePaymentCodeFailed();
        this.j.changeToFailureState();
    }

    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        View view = this.k;
        if (view == null) {
            a(canvas);
        } else {
            view.setVisibility(isSuccess() ? 8 : 0);
        }
    }

    public void setAutoRefreshSeconds(int i2) {
        this.j.setAutoRefreshSeconds(i2);
    }

    public void setLogo(Bitmap bitmap) {
        this.i.setLogo(bitmap);
    }

    /* access modifiers changed from: protected */
    public void setPaymentCodeBitmap(Bitmap bitmap) {
        this.h.setPaymentCodeBitmap(bitmap);
        this.i.setPaymentCodeBitmap(bitmap);
    }

    public void setRefreshButtonTextSizeInDip(int i2) {
        this.j.setTextSizeInDip(i2);
    }

    public void updatePaymentCode(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
        super.updatePaymentCode(f2FPaymentCodeInfo);
        this.h.updatePaymentCode(f2FPaymentCodeInfo);
        this.i.updatePaymentCode(f2FPaymentCodeInfo);
        this.j.changeToCompleteState();
        postInvalidate();
    }
}
