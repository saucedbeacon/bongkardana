package com.alipay.iap.android.f2fpay.widgets.mediator;

import android.view.View;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayAbstractPaymentCodeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class F2FPayClientMediator {

    /* renamed from: a  reason: collision with root package name */
    private List<WeakReference<F2FPayAbstractPaymentCodeView>> f10675a = new ArrayList();
    /* access modifiers changed from: private */
    public F2FPaymentCodeInfo b;
    /* access modifiers changed from: private */
    public IF2FPayClient c;
    /* access modifiers changed from: private */
    public int d;

    interface a {
        void a(F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView);
    }

    public F2FPayClientMediator(IF2FPayClient iF2FPayClient) {
        this.c = iF2FPayClient;
        iF2FPayClient.addPaymentCodeCallback(new IF2FPaymentCodeCallback() {
            public void onPaymentCodeGenerateFailed() {
                F2FPaymentCodeInfo unused = F2FPayClientMediator.this.b = null;
                F2FPayClientMediator.this.a(new a() {
                    public void a(F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView) {
                        f2FPayAbstractPaymentCodeView.generatePaymentCodeFailed();
                    }
                });
            }

            public void onPaymentCodeUpdated(final F2FPaymentCodeInfo f2FPaymentCodeInfo) {
                F2FPaymentCodeInfo unused = F2FPayClientMediator.this.b = f2FPaymentCodeInfo;
                F2FPayClientMediator.this.a(new a() {
                    public void a(F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView) {
                        f2FPayAbstractPaymentCodeView.updatePaymentCode(f2FPaymentCodeInfo);
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void a() {
        this.d++;
        this.c.startRefreshTask();
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        Iterator<WeakReference<F2FPayAbstractPaymentCodeView>> it = this.f10675a.iterator();
        while (it.hasNext()) {
            F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView = (F2FPayAbstractPaymentCodeView) it.next().get();
            if (f2FPayAbstractPaymentCodeView == null) {
                it.remove();
            } else {
                aVar.a(f2FPayAbstractPaymentCodeView);
            }
        }
    }

    static /* synthetic */ int access$306(F2FPayClientMediator f2FPayClientMediator) {
        int i = f2FPayClientMediator.d - 1;
        f2FPayClientMediator.d = i;
        return i;
    }

    public void attachWithPaymentCodeView(F2FPayAbstractPaymentCodeView f2FPayAbstractPaymentCodeView) {
        if (f2FPayAbstractPaymentCodeView != null) {
            if (f2FPayAbstractPaymentCodeView.isViewAttachedToWindow()) {
                a();
            }
            f2FPayAbstractPaymentCodeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(View view) {
                    F2FPayClientMediator.this.a();
                }

                public void onViewDetachedFromWindow(View view) {
                    F2FPayClientMediator.access$306(F2FPayClientMediator.this);
                    if (F2FPayClientMediator.this.d <= 0) {
                        F2FPayClientMediator.this.c.stopRefreshTask();
                    }
                }
            });
            this.f10675a.add(new WeakReference(f2FPayAbstractPaymentCodeView));
            F2FPaymentCodeInfo f2FPaymentCodeInfo = this.b;
            if (f2FPaymentCodeInfo != null) {
                f2FPayAbstractPaymentCodeView.updatePaymentCode(f2FPaymentCodeInfo);
            }
        }
    }
}
