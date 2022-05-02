package id.dana.pay;

import android.os.Bundle;
import id.dana.R;
import id.dana.contract.payasset.ChangePayMethodModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.home.view.QrRefreshNotification;
import javax.inject.Inject;
import o.PrepareException;
import o.beginFakeDrag;
import o.getPageSize;
import o.getTypeFromUri;
import o.isDownloaded;
import o.isUserInputEnabled;
import o.startChooseFile;
import o.tryInjectStartParams;

public class CardQrisPayFragment extends BasePayFragment {
    @Inject
    public beginFakeDrag.setMax changePayMethodPresenter;
    private tryInjectStartParams getMin;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;

    public final int setMin() {
        return R.layout.fragment_qris_card_pay;
    }

    public static CardQrisPayFragment setMin(PayCardInfo payCardInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CARD_INFO", payCardInfo);
        CardQrisPayFragment cardQrisPayFragment = new CardQrisPayFragment();
        cardQrisPayFragment.setArguments(bundle);
        return cardQrisPayFragment;
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        super.setMax();
        if (this.getMin != null) {
            this.getMin = null;
        }
        isDownloaded.setMax setmax = new isDownloaded.setMax((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            setmax.setMax = r3;
            setmax.getMax = new PayQrModule(new isUserInputEnabled.length(this) {
                private final AnonymousClass4 getMin;

                public final void getMax() {
                }

                {
                    this.getMin = r1;
                }

                public final void getMin(String str) {
                    this.getMin.setMax(str);
                    this.getMin.getMin("SUCCESS", str);
                }

                public final void length() {
                    this.getMin.invoke();
                    this.getMin.getMin("FAILED", (String) null);
                }

                public final void setMax() {
                    this.getMin.invoke();
                    this.getMin.getMin(QrRefreshNotification.StateType.ONPAUSED, (String) null);
                }

                public final void getMin() {
                    this.getMin.invoke();
                    this.getMin.getMin(QrRefreshNotification.StateType.ONSTOPPED, (String) null);
                }

                public final void showProgress() {
                    this.getMin.valueOf();
                    this.getMin.getMin(QrRefreshNotification.StateType.SHOWPROGRESS, (String) null);
                }

                public final void dismissProgress() {
                    this.getMin.Mean$Arithmetic();
                    this.getMin.getMin(QrRefreshNotification.StateType.DISMISSPROGRESS, (String) null);
                }

                public final void onError(String str) {
                    this.getMin.invoke();
                    this.getMin.getMin("ERROR", (String) null);
                }
            });
            setmax.setMin = new OfflinePayModule(new getTypeFromUri(this));
            setmax.getMin = new ChangePayMethodModule(new startChooseFile(this));
            tryInjectStartParams min = setmax.setMin();
            this.getMin = min;
            min.length(this);
            getMin(this.payQrPresenter, this.changePayMethodPresenter, this.offlinePayPresenter);
            getMin(this.payQrPresenter);
            setMax(this.changePayMethodPresenter);
            setMax(this.offlinePayPresenter);
            this.offlinePayPresenter.setMin();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax() {
        /*
            r5 = this;
            o.isUserInputEnabled$getMax r0 = r5.payQrPresenter
            id.dana.pay.PayCardInfo r1 = r5.onNavigationEvent()
            java.lang.String r1 = r1.getMax
            int r2 = r1.hashCode()
            r3 = 1280945827(0x4c59aea3, float:5.7064076E7)
            r4 = 1
            if (r2 == r3) goto L_0x0022
            r3 = 1878720662(0x6ffb0096, float:1.5536289E29)
            if (r2 == r3) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r2 = "CREDIT_CARD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = 0
            goto L_0x002d
        L_0x0022:
            java.lang.String r2 = "DEBIT_CARD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = -1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            if (r1 == r4) goto L_0x0034
            r4 = 3
            goto L_0x0034
        L_0x0033:
            r4 = 2
        L_0x0034:
            r0.getMax((int) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.pay.CardQrisPayFragment.getMax():void");
    }
}
