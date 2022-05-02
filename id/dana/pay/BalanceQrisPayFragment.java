package id.dana.pay;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.contract.payasset.ChangePayMethodModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.contract.user.GetUserInfoModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.home.view.QrRefreshNotification;
import id.dana.pay.view.BasePayView;
import id.dana.richview.ToggleBalanceView;
import id.dana.tracker.mixpanel.TopupSource;
import javax.inject.Inject;
import o.CustomPopMenuExtension;
import o.FragmentStateAdapter$5;
import o.PrepareException;
import o.WheelView;
import o.beginFakeDrag;
import o.dispatchOnCancelled;
import o.getPagePerfKey;
import o.getPageSize;
import o.getShortName;
import o.installPlugins;
import o.isUserInputEnabled;
import o.onCancelLoad;
import o.onCanceled;
import o.setAutoDismissEnabled$core;
import o.startChooseFile;
import o.toReqMode;
import o.updateActionSheetContent;

public class BalanceQrisPayFragment extends BasePayFragment {
    @Inject
    public beginFakeDrag.setMax changePayMethodPresenter;
    @Inject
    public getShortName dynamicUrlWrapper;
    /* access modifiers changed from: private */
    public boolean equals;
    private toReqMode getMin;
    @Inject
    public FragmentStateAdapter$5.setMin getPaymentResultPresenter;
    @Inject
    public setAutoDismissEnabled$core.setMin getUserInfoPresenter;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @BindView(2131364221)
    TextView payIdView;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    @BindView(2131364227)
    BasePayView qrBarcodePayView;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    private String setMin;
    @BindView(2131364782)
    ToggleBalanceView tbvPayContent;

    public final int setMin() {
        return R.layout.fragment_qris_balance_pay;
    }

    public static BalanceQrisPayFragment length(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("balance_key", str);
        BalanceQrisPayFragment balanceQrisPayFragment = new BalanceQrisPayFragment();
        balanceQrisPayFragment.setArguments(bundle);
        return balanceQrisPayFragment;
    }

    public void onResume() {
        super.onResume();
        if (this.equals) {
            this.equals = false;
            this.qrBarcodePayView.resetQrCode();
            ToggleBalanceView toggleBalanceView = this.tbvPayContent;
            if (toggleBalanceView != null) {
                toggleBalanceView.getBalance();
            }
            setAutoDismissEnabled$core.setMin setmin = this.getUserInfoPresenter;
            if (setmin != null) {
                setmin.getMax();
            }
            Grayscale$Algorithm();
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax() {
        this.payQrPresenter.getMax(3);
    }

    /* access modifiers changed from: protected */
    public final void equals() {
        this.payQrPresenter.getMax(this.setMin);
        length("BALANCE", "BALANCE");
    }

    /* access modifiers changed from: protected */
    public final void setMax(boolean z) {
        super.setMax();
        try {
            this.setMin = getArguments().getString("balance_key");
        } catch (Exception unused) {
            if (z) {
                this.qrBarcodePayView.disableCode();
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, "Error get balance pay");
            }
        }
        if (z && TextUtils.isEmpty(this.setMin)) {
            this.qrBarcodePayView.disableCode();
        }
    }

    public final void toDoubleRange() {
        super.toDoubleRange();
        setAutoDismissEnabled$core.setMin setmin = this.getUserInfoPresenter;
        if (setmin != null) {
            setmin.setMin();
        }
        super.IsOverlapping();
    }

    public final void FastBitmap$CoordinateSystem() {
        super.FastBitmap$CoordinateSystem();
        ToggleBalanceView toggleBalanceView = this.tbvPayContent;
        if (toggleBalanceView != null) {
            toggleBalanceView.getBalance();
        }
        setAutoDismissEnabled$core.setMin setmin = this.getUserInfoPresenter;
        if (setmin != null) {
            setmin.getMax();
        }
        super.o_();
    }

    @OnClick({2131364230})
    public void onClickTopup() {
        DanaH5.startContainerFullUrl(this.dynamicUrlWrapper.getTopupUrl(TopupSource.DANA_PAY));
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        if (this.getMin != null) {
            this.getMin = null;
        }
        installPlugins.getMin getmin = new installPlugins.getMin((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            getmin.IsOverlapping = r3;
            getmin.length = new GetPaymentResultModule(new FragmentStateAdapter$5.getMax() {
                public final void dismissProgress() {
                }

                public final void getMin(String str) {
                    int length = str != null ? str.length() : 0;
                    int max = dispatchOnCancelled.setMax(length);
                    if (length != max) {
                        onCanceled oncanceled = new onCanceled(length, max, 1);
                        onCancelLoad.setMax(-227679361, oncanceled);
                        onCancelLoad.getMin(-227679361, oncanceled);
                    }
                }

                public final void onError(String str) {
                }

                public final void setMin(String str) {
                }

                public final void showProgress() {
                }

                public final void setMin(String str, String str2) {
                    boolean unused = BalanceQrisPayFragment.this.equals = true;
                }
            });
            getmin.setMin = new OfflinePayModule(new getPageSize.getMin() {
                public final void dismissProgress() {
                }

                public final void onError(String str) {
                }

                public final void showProgress() {
                }

                public final void length(Boolean bool) {
                    BalanceQrisPayFragment.this.setMax(bool.booleanValue());
                }
            });
            getmin.setMax = new PayQrModule(new isUserInputEnabled.length(this) {
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
            getmin.getMax = new GetUserInfoModule(new setAutoDismissEnabled$core.getMax() {
                public final void length(getPagePerfKey getpageperfkey) {
                    BalanceQrisPayFragment.this.payIdView.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(getpageperfkey.setMin, false));
                }

                public final void showProgress() {
                    if (!BalanceQrisPayFragment.this.values()) {
                        BalanceQrisPayFragment.this.qrBarcodePayView.startRefresh();
                    }
                }

                public final void dismissProgress() {
                    if (!BalanceQrisPayFragment.this.values()) {
                        BalanceQrisPayFragment.this.qrBarcodePayView.stopRefresh();
                    }
                }

                public final void onError(String str) {
                    if (!BalanceQrisPayFragment.this.values()) {
                        BalanceQrisPayFragment.this.qrBarcodePayView.invalidCode();
                    }
                }
            });
            getmin.getMin = new ChangePayMethodModule(new startChooseFile(this));
            toReqMode min = getmin.setMin();
            this.getMin = min;
            min.getMax(this);
            getMin(this.getPaymentResultPresenter, this.payQrPresenter, this.getUserInfoPresenter, this.changePayMethodPresenter, this.offlinePayPresenter);
            getMin(this.payQrPresenter);
            setMax(this.offlinePayPresenter);
            setMax(this.changePayMethodPresenter);
            this.offlinePayPresenter.setMin();
            this.getPaymentResultPresenter.length();
            return;
        }
        throw null;
    }
}
