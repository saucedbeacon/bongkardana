package id.dana.globalnetwork.pay;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.home.view.QrRefreshNotification;
import id.dana.pay.BasePayFragment;
import id.dana.pay.PayCardInfo;
import java.util.Currency;
import java.util.Locale;
import javax.inject.Inject;
import o.FileBridgeExtension;
import o.IntRange;
import o.PrepareException;
import o.Workflow;
import o.deleteFile;
import o.fillConfigWithIncludeFile;
import o.getPageSize;
import o.hitPageLevelWhiteList;
import o.initUC7zSo;
import o.isUserInputEnabled;
import o.onNext;
import o.setWebSocketURLPrefixForDebug;
import o.stopIgnoring;
import o.updateActionSheetContent;

public class CardGnPayFragment extends BasePayFragment {
    @BindView(2131365265)
    TextView fromCurrencyText;
    private FileBridgeExtension getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    @BindView(2131364227)
    GnBarcodePayView qrBarcodePayView;
    @BindView(2131365496)
    TextView referenceText;
    @BindView(2131363616)
    ImageView rightArrowCurrency;
    private fillConfigWithIncludeFile setMin;
    @BindView(2131365635)
    TextView toCurrencyText;
    @BindView(2131365627)
    TextView tvCurrencyRp;
    @BindView(2131365268)
    TextView tvFromCurrencySymbol;

    public final int setMin() {
        return R.layout.fragment_card_gn_pay;
    }

    public final void getMax() {
        this.payQrPresenter.toIntRange();
    }

    @SuppressLint({"WrongConstant"})
    public final void setMax(boolean z) {
        super.setMax();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getParcelable("CARD_INFO") != null) {
            String str = ((PayCardInfo) arguments.getParcelable("CARD_INFO")).IsOverlapping;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            FileBridgeExtension min = deleteFile.setMin(str);
            this.getMin = min;
            int max = IntRange.setMax(getContext(), min.toIntRange);
            int max2 = IntRange.setMax(getContext(), this.getMin.length);
            this.referenceText.setTextColor(max2);
            this.fromCurrencyText.setTextColor(max2);
            this.toCurrencyText.setTextColor(max2);
            this.rightArrowCurrency.setColorFilter(max2);
            this.tvCurrencyRp.setTextColor(max2);
            this.tvFromCurrencySymbol.setTextColor(max2);
            setMax(max, max2);
            getCause();
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        if (this.setMin != null) {
            this.setMin = null;
        }
        hitPageLevelWhiteList.getMax getmax = new hitPageLevelWhiteList.getMax((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            getmax.setMin = r3;
            getmax.length = new PayQrModule(new isUserInputEnabled.length(this) {
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
            getmax.getMin = new OfflinePayModule(new setWebSocketURLPrefixForDebug(this));
            getmax.getMax = new GlobalNetworkModule(new Workflow() {
                public final void getMax(boolean z, String str) {
                    TextView textView = CardGnPayFragment.this.tvFromCurrencySymbol;
                    if (TextUtils.isEmpty(str)) {
                        str = "ID";
                    }
                    String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getSymbol();
                    if (symbol.equals("IDR")) {
                        symbol = "Rp";
                    }
                    textView.setText(symbol);
                }

                public final void setMax(initUC7zSo inituc7zso) {
                    CardGnPayFragment.this.toCurrencyText.setText(inituc7zso.getRoundedRate());
                }

                public final void getMax(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }
            });
            stopIgnoring.setMin(getmax.length, PayQrModule.class);
            stopIgnoring.setMin(getmax.getMin, OfflinePayModule.class);
            stopIgnoring.setMin(getmax.getMax, GlobalNetworkModule.class);
            stopIgnoring.setMin(getmax.setMin, PrepareException.AnonymousClass1.class);
            hitPageLevelWhiteList hitpagelevelwhitelist = new hitPageLevelWhiteList(getmax.length, getmax.getMin, getmax.getMax, getmax.setMin, (byte) 0);
            this.setMin = hitpagelevelwhitelist;
            hitpagelevelwhitelist.length(this);
            getMin(this.payQrPresenter, this.globalNetworkPresenter);
            getMin(this.payQrPresenter);
            setMax(this.offlinePayPresenter);
            this.offlinePayPresenter.setMin();
            this.globalNetworkPresenter.isInside();
            return;
        }
        throw null;
    }
}
