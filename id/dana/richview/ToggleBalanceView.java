package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.user.GetBalanceModule;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import java.util.Currency;
import java.util.Locale;
import javax.inject.Inject;
import o.BasePrepareStep;
import o.PrepareException;
import o.Workflow;
import o.initUC7zSo;
import o.onNext;
import o.parameters;
import o.resetInternal;
import o.setLineVisible;
import o.stopIgnoring;
import o.updateActionSheetContent;

public class ToggleBalanceView extends BaseRichView {
    @Inject
    public parameters.setMax getBalancePresenter;
    private setMin getMax;
    /* access modifiers changed from: private */
    public String getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @BindView(2131363472)
    ImageView ivHideBalance;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public boolean setMax;
    private MoneyViewModel setMin;
    @BindView(2131365163)
    TextView tvCurrency;
    @BindView(2131365290)
    TextView tvHiddenBalance;
    @BindView(2131365564)
    TextView tvShownBalance;

    public interface setMin {
        void setMin(boolean z);
    }

    public int getLayout() {
        return R.layout.view_toggle_balance;
    }

    public ToggleBalanceView(@NonNull Context context) {
        super(context);
    }

    public ToggleBalanceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToggleBalanceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ToggleBalanceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.CallSuper, 0, 0);
            try {
                this.length = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        onNext.setMin setmin = this.globalNetworkPresenter;
        if (setmin != null) {
            setmin.setMin();
        }
    }

    public void dispose() {
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.length();
        }
        super.dispose();
    }

    @OnClick({2131363472})
    public void onHideBalanceClick() {
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.getMax();
        }
    }

    private void getMin(boolean z, @ColorRes int i, @DrawableRes int i2, @DrawableRes int i3) {
        this.tvCurrency.setTextColor(getResources().getColor(i));
        this.tvShownBalance.setTextColor(getResources().getColor(i));
        this.tvHiddenBalance.setTextColor(getResources().getColor(i));
        ImageView imageView = this.ivHideBalance;
        if (!z) {
            i2 = i3;
        }
        imageView.setImageResource(i2);
    }

    public void getBalance() {
        if (this.setMax) {
            onNext.setMin setmin = this.globalNetworkPresenter;
            if (setmin != null) {
                setmin.isInside();
                return;
            }
            return;
        }
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.getMin();
        }
    }

    public MoneyViewModel getActiveBalance() {
        return this.setMin;
    }

    public void setActiveBalance(MoneyViewModel moneyViewModel) {
        this.setMin = moneyViewModel;
    }

    public void setToggleBalanceClickListener(setMin setmin) {
        this.getMax = setmin;
    }

    public void injectComponent(PrepareException.AnonymousClass1 r5) {
        BasePrepareStep.getMax getmax = new BasePrepareStep.getMax((byte) 0);
        if (r5 != null) {
            getmax.length = r5;
            getmax.getMin = new GetBalanceModule(new parameters.getMin() {
                public final void dismissProgress() {
                }

                public final void getMax() {
                }

                public final void onError(String str) {
                }

                public final void showProgress() {
                }

                public final void setMax(CurrencyAmountModel currencyAmountModel) {
                    ToggleBalanceView toggleBalanceView = ToggleBalanceView.this;
                    MoneyViewModel.length length = MoneyViewModel.length;
                    String str = null;
                    String str2 = currencyAmountModel != null ? currencyAmountModel.getMax : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (currencyAmountModel != null) {
                        str = currencyAmountModel.length;
                    }
                    if (str == null) {
                        str = "";
                    }
                    toggleBalanceView.setActiveBalance(new MoneyViewModel(str2, str, ""));
                    ToggleBalanceView.this.tvShownBalance.setText(setLineVisible.length(new CurrencyAmountModel(currencyAmountModel.getMax)));
                    TextView textView = ToggleBalanceView.this.tvCurrency;
                    String access$000 = ToggleBalanceView.this.getMin;
                    if (TextUtils.isEmpty(access$000)) {
                        access$000 = "ID";
                    }
                    String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), access$000)).getSymbol();
                    if (symbol.equals("IDR")) {
                        symbol = "Rp";
                    }
                    textView.setText(symbol);
                }

                public final void length(Boolean bool) {
                    ToggleBalanceView.access$300(ToggleBalanceView.this, bool.booleanValue(), ToggleBalanceView.this.length);
                }
            });
            getmax.setMax = new GlobalNetworkModule(new Workflow() {
                public final void setMax(boolean z, String str) {
                    String unused = ToggleBalanceView.this.getMin = str;
                    boolean unused2 = ToggleBalanceView.this.setMax = z;
                    if (str != null && !str.isEmpty() && z && ToggleBalanceView.this.globalNetworkPresenter != null) {
                        ToggleBalanceView.this.globalNetworkPresenter.setMax(str);
                        ToggleBalanceView.this.getBalancePresenter.setMin();
                    } else if (ToggleBalanceView.this.getBalancePresenter != null) {
                        ToggleBalanceView.this.getBalancePresenter.getMin();
                        ToggleBalanceView.this.getBalancePresenter.setMin();
                    }
                }

                public final void setMax(initUC7zSo inituc7zso) {
                    ToggleBalanceView.this.tvShownBalance.setText(inituc7zso.getForexAmount());
                    if (ToggleBalanceView.this.getMin != null && !ToggleBalanceView.this.getMin.isEmpty()) {
                        TextView textView = ToggleBalanceView.this.tvCurrency;
                        String access$000 = ToggleBalanceView.this.getMin;
                        if (TextUtils.isEmpty(access$000)) {
                            access$000 = "ID";
                        }
                        String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), access$000)).getSymbol();
                        if (symbol.equals("IDR")) {
                            symbol = "Rp";
                        }
                        textView.setText(symbol);
                    }
                }

                public final void getMax(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }
            });
            stopIgnoring.setMin(getmax.getMin, GetBalanceModule.class);
            stopIgnoring.setMin(getmax.setMax, GlobalNetworkModule.class);
            stopIgnoring.setMin(getmax.length, PrepareException.AnonymousClass1.class);
            new BasePrepareStep(getmax.getMin, getmax.setMax, getmax.length, (byte) 0).setMax(this);
            registerPresenter(this.getBalancePresenter, this.globalNetworkPresenter);
            return;
        }
        throw null;
    }

    static /* synthetic */ void access$300(ToggleBalanceView toggleBalanceView, boolean z, int i) {
        setMin setmin = toggleBalanceView.getMax;
        if (setmin != null) {
            setmin.setMin(z);
        }
        int i2 = 0;
        toggleBalanceView.tvShownBalance.setVisibility(z ? 0 : 8);
        TextView textView = toggleBalanceView.tvHiddenBalance;
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (i == 0) {
            toggleBalanceView.getMin(z, R.color.f24762131100430, R.drawable.ic_hide_balance, R.drawable.ic_show_balance);
        } else if (i == 1) {
            toggleBalanceView.getMin(z, R.color.f18512131099725, R.drawable.ic_hide_balance_gn, R.drawable.ic_show_balance_gn);
        }
    }
}
