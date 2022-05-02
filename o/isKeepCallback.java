package o;

import java.util.Currency;
import java.util.Locale;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class isKeepCallback extends getItemAtIndex<initUC7zSo, String> {
    private static final double DEFAULT_CURRENCY_RATE = 1.0d;
    private static final String INDONESIA_COUNTRY_CODE = "ID";
    private static final String INDONESIA_CURRENCY = "IDR";
    private final onWebViewDestory globalNetworkRepository;
    private final onDescriptorWrite userRepository;

    @Inject
    public isKeepCallback(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> buildUseCaseObservable(String str) {
        if (str == null || str.isEmpty()) {
            return this.globalNetworkRepository.getSelectedCountryCode().flatMap(new setExtra(this));
        }
        return getBalanceByCountryCode(str);
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getBalanceByCountryCode(String str) {
        if (!str.isEmpty() && !"ID".equals(str)) {
            return getForexCache(INDONESIA_CURRENCY, getForeignCurrency(str));
        }
        initUC7zSo inituc7zso = new initUC7zSo();
        inituc7zso.setCurrency(INDONESIA_CURRENCY);
        inituc7zso.setRate(1.0d);
        return getBalance(inituc7zso);
    }

    private TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2) {
        return this.globalNetworkRepository.getForexCache(str, str2).onErrorResumeNext(getForexRate(str, str2)).flatMap(new setIsSyncJsApi(this, str, str2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getForexCache$0(String str, String str2, initUC7zSo inituc7zso) throws Exception {
        return isForexInvalid(inituc7zso) ? getForexRate(str, str2) : getBalance(inituc7zso);
    }

    private TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexRate(String str, String str2) {
        return this.globalNetworkRepository.getForexRate(str, str2).flatMap(new isSyncJsApi(this));
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getBalance(initUC7zSo inituc7zso) {
        return this.userRepository.getSingleBalance().flatMap(new extra(this, inituc7zso));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getBalance$1(initUC7zSo inituc7zso, stopBleScan stopblescan) throws Exception {
        inituc7zso.setAmount(stopblescan.getAmount());
        this.globalNetworkRepository.saveForex(inituc7zso).subscribe();
        return TitleBarRightButtonView.AnonymousClass1.just(inituc7zso);
    }

    private boolean isForexInvalid(initUC7zSo inituc7zso) {
        return inituc7zso == null || inituc7zso.shouldRefreshForex();
    }

    private String getForeignCurrency(String str) {
        return Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), str)).getCurrencyCode();
    }
}
