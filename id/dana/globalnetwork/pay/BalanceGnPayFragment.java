package id.dana.globalnetwork.pay;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.contract.payasset.ChangePayMethodModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.contract.user.GetUserInfoModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.home.view.QrRefreshNotification;
import id.dana.pay.BasePayFragment;
import id.dana.richview.ToggleBalanceView;
import id.dana.tracker.mixpanel.TopupSource;
import java.util.Currency;
import java.util.Locale;
import javax.inject.Inject;
import o.CustomPopMenuExtension;
import o.PhotoView;
import o.PrepareException;
import o.Workflow;
import o.addLauncherParamResourcePackage;
import o.beginFakeDrag;
import o.deleteSnapshot;
import o.dispatchOnCancelled;
import o.evaluate;
import o.getMaxTextureSize;
import o.getPagePerfKey;
import o.getPageSize;
import o.getShortName;
import o.initRect;
import o.initUC7zSo;
import o.isUserInputEnabled;
import o.layoutChildWithAnchor;
import o.onCancelLoad;
import o.onCanceled;
import o.onNext;
import o.parseBehavior;
import o.setAutoDismissEnabled$core;
import o.setUseAmcsLite;
import o.startChooseFile;
import o.stopIgnoring;
import o.updateActionSheetContent;
import o.updateCornerMarking;

public class BalanceGnPayFragment extends BasePayFragment {
    /* access modifiers changed from: private */
    public String IsOverlapping;
    @Inject
    public beginFakeDrag.setMax changePayMethodPresenter;
    /* access modifiers changed from: package-private */
    @BindView(2131362392)
    public ConstraintLayout clGnCardInfo;
    @Inject
    public getShortName dynamicUrlWrapper;
    private String getMin;
    @Inject
    public setAutoDismissEnabled$core.setMin getUserInfoPresenter;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter isInside;
    @BindView(2131363452)
    ImageView ivFlag;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    @BindView(2131364227)
    GnBarcodePayView qrBarcodePayView;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    private addLauncherParamResourcePackage setMin;
    @BindView(2131364782)
    ToggleBalanceView tbvPayContent;
    @BindView(2131365635)
    TextView toCurrencyText;
    private boolean toIntRange;
    @BindView(2131365268)
    TextView tvFromCurrencySymbol;

    public final int setMin() {
        return R.layout.fragment_balance_gn_pay;
    }

    public static BalanceGnPayFragment getMin(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("balance_key", str);
        BalanceGnPayFragment balanceGnPayFragment = new BalanceGnPayFragment();
        balanceGnPayFragment.setArguments(bundle);
        return balanceGnPayFragment;
    }

    public void onResume() {
        super.onResume();
        if (this.toIntRange) {
            this.toIntRange = false;
            this.qrBarcodePayView.resetQrCode();
            setAutoDismissEnabled$core.setMin setmin = this.getUserInfoPresenter;
            if (setmin != null) {
                setmin.getMax();
            }
            Grayscale$Algorithm();
        }
    }

    public final void getMax() {
        this.payQrPresenter.toIntRange();
    }

    public final void equals() {
        this.payQrPresenter.getMax(this.getMin);
        length("BALANCE", "BALANCE");
    }

    public final void setMax(boolean z) {
        super.setMax();
        try {
            this.getMin = getArguments().getString("balance_key");
        } catch (Exception unused) {
            if (z) {
                this.qrBarcodePayView.disableCode();
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, "Error get balance pay");
            }
        }
        if (z && TextUtils.isEmpty(this.getMin)) {
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
        setAutoDismissEnabled$core.setMin setmin = this.getUserInfoPresenter;
        if (setmin != null) {
            setmin.getMax();
        }
        super.o_();
    }

    @OnClick({2131364230})
    public void onClickTopup() {
        String str;
        if (this.dynamicUrlWrapper != null) {
            if (this.globalNetworkPresenter.getMin(this.IsOverlapping)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.dynamicUrlWrapper.getTopupUrl(TopupSource.DANA_PAY));
                sb.append("&countryCode=");
                sb.append(this.IsOverlapping);
                str = sb.toString();
            } else {
                str = this.dynamicUrlWrapper.getTopupUrl(TopupSource.DANA_PAY);
            }
            DanaH5.startContainerFullUrl(str);
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        if (this.setMin != null) {
            this.setMin = null;
        }
        deleteSnapshot.getMax getmax = new deleteSnapshot.getMax((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            getmax.toFloatRange = r3;
            getmax.setMax = new OfflinePayModule(new getPageSize.getMin() {
                public final void dismissProgress() {
                }

                public final void onError(String str) {
                }

                public final void showProgress() {
                }

                public final void length(Boolean bool) {
                    BalanceGnPayFragment.this.setMax(bool.booleanValue());
                }
            });
            getmax.getMax = new PayQrModule(new isUserInputEnabled.length(this) {
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
            getmax.length = new GetUserInfoModule(new setAutoDismissEnabled$core.getMax() {
                public final void length(getPagePerfKey getpageperfkey) {
                }

                public final void showProgress() {
                    if (!BalanceGnPayFragment.this.values()) {
                        BalanceGnPayFragment.this.qrBarcodePayView.startRefresh();
                    }
                }

                public final void dismissProgress() {
                    if (!BalanceGnPayFragment.this.values()) {
                        BalanceGnPayFragment.this.qrBarcodePayView.stopRefresh();
                    }
                }

                public final void onError(String str) {
                    if (!BalanceGnPayFragment.this.values()) {
                        BalanceGnPayFragment.this.qrBarcodePayView.invalidCode();
                    }
                }
            });
            getmax.setMin = new ChangePayMethodModule(new startChooseFile(this));
            getmax.getMin = new GlobalNetworkModule(new Workflow() {
                public final void setMax(boolean z, String str) {
                    String unused = BalanceGnPayFragment.this.IsOverlapping = str;
                    BalanceGnPayFragment.this.globalNetworkPresenter.setMax(str);
                    BalanceGnPayFragment.this.globalNetworkPresenter.isInside(str);
                }

                public final void getMax(boolean z, String str) {
                    int length = str != null ? str.length() : 0;
                    int max = dispatchOnCancelled.setMax(length);
                    if (length != max) {
                        onCanceled oncanceled = new onCanceled(length, max, 1);
                        onCancelLoad.setMax(-1579529075, oncanceled);
                        onCancelLoad.getMin(-1579529075, oncanceled);
                    }
                    TextView textView = BalanceGnPayFragment.this.tvFromCurrencySymbol;
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
                    BalanceGnPayFragment.this.toCurrencyText.setText(inituc7zso.getRoundedRate());
                    BalanceGnPayFragment.this.globalNetworkPresenter.equals();
                }

                public final void getMax(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }

                public final void setMin(boolean z) {
                    if (z) {
                        BalanceGnPayFragment balanceGnPayFragment = BalanceGnPayFragment.this;
                        BalanceGnPayFragment.setMax(balanceGnPayFragment, balanceGnPayFragment.clGnCardInfo);
                    }
                }

                public final void setMax(String str) {
                    BalanceGnPayFragment.setMin(BalanceGnPayFragment.this, str);
                }
            });
            stopIgnoring.setMin(getmax.getMax, PayQrModule.class);
            stopIgnoring.setMin(getmax.length, GetUserInfoModule.class);
            stopIgnoring.setMin(getmax.setMax, OfflinePayModule.class);
            stopIgnoring.setMin(getmax.setMin, ChangePayMethodModule.class);
            stopIgnoring.setMin(getmax.getMin, GlobalNetworkModule.class);
            stopIgnoring.setMin(getmax.toFloatRange, PrepareException.AnonymousClass1.class);
            deleteSnapshot deletesnapshot = new deleteSnapshot(getmax.getMax, getmax.length, getmax.setMax, getmax.setMin, getmax.getMin, getmax.toFloatRange, (byte) 0);
            this.setMin = deletesnapshot;
            deletesnapshot.getMax(this);
            getMin(this.payQrPresenter, this.getUserInfoPresenter, this.changePayMethodPresenter, this.offlinePayPresenter, this.globalNetworkPresenter);
            getMin(this.payQrPresenter);
            setMax(this.offlinePayPresenter);
            setMax(this.changePayMethodPresenter);
            this.offlinePayPresenter.setMin();
            this.globalNetworkPresenter.setMin();
            this.globalNetworkPresenter.getMin();
            this.globalNetworkPresenter.isInside();
            return;
        }
        throw null;
    }

    static /* synthetic */ void setMax(BalanceGnPayFragment balanceGnPayFragment, setUseAmcsLite setuseamcslite) {
        if (setuseamcslite != null && balanceGnPayFragment.isInside == null) {
            initRect initrect = new initRect(balanceGnPayFragment.getMax);
            initrect.toString = setuseamcslite;
            balanceGnPayFragment.isInside = ((initRect) ((initRect) ((initRect) initrect.setMin((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)))).length(false)).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    PhotoView.PhotoInter unused = BalanceGnPayFragment.this.isInside = null;
                    BalanceGnPayFragment.this.globalNetworkPresenter.IsOverlapping();
                }
            })).length();
        }
    }

    static /* synthetic */ void setMin(BalanceGnPayFragment balanceGnPayFragment, String str) {
        balanceGnPayFragment.ivFlag.setImageResource(0);
        if (!TextUtils.isEmpty(str)) {
            ((updateCornerMarking) Glide.getMax(balanceGnPayFragment.getContext())).setMax(str).setMax(evaluate.setMin).getMax(new parseBehavior<Drawable>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    return false;
                }

                public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return length((Drawable) obj);
                }

                private boolean length(Drawable drawable) {
                    BalanceGnPayFragment.this.ivFlag.setImageDrawable(drawable);
                    return true;
                }
            }).setMax();
        }
    }
}
