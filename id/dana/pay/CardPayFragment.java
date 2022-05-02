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
import o.isDownloaded;
import o.isUserInputEnabled;
import o.sendLackPermissionCallback;
import o.startChooseFile;
import o.tryInjectStartParams;

public class CardPayFragment extends BasePayFragment {
    @Inject
    public beginFakeDrag.setMax changePayMethodPresenter;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    private tryInjectStartParams setMin;

    public final int setMin() {
        return R.layout.fragment_card_pay;
    }

    public static CardPayFragment setMin(PayCardInfo payCardInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CARD_INFO", payCardInfo);
        CardPayFragment cardPayFragment = new CardPayFragment();
        cardPayFragment.setArguments(bundle);
        return cardPayFragment;
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        super.setMax();
        if (this.setMin != null) {
            this.setMin = null;
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
            setmax.setMin = new OfflinePayModule(new sendLackPermissionCallback(this));
            setmax.getMin = new ChangePayMethodModule(new startChooseFile(this));
            tryInjectStartParams min = setmax.setMin();
            this.setMin = min;
            min.getMin(this);
            getMin(this.payQrPresenter, this.changePayMethodPresenter, this.offlinePayPresenter);
            getMin(this.payQrPresenter);
            setMax(this.changePayMethodPresenter);
            setMax(this.offlinePayPresenter);
            this.offlinePayPresenter.setMin();
            return;
        }
        throw null;
    }
}
