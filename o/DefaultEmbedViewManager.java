package o;

import android.app.Application;
import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.member.MemberService;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.iap.ac.android.biz.IAPConnect;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.mpm.DecodeParameter;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import id.dana.data.globalnetwork.model.GnAuthResult;
import id.dana.data.globalsearch.source.network.request.AutoCompleteRequestEntity;
import id.dana.data.globalsearch.source.network.request.SearchRequestEntity;
import id.dana.data.globalsearch.source.network.result.AutoCompleteResultEntity;
import id.dana.data.globalsearch.source.network.result.SearchResultEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.ColorSchemeModelTemplate;
import o.ThemeUtils;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class DefaultEmbedViewManager implements getStateColor {
    private final Application application;
    public final IComponent<GnAuthResult> gnAuthResultPublishSubject = IComponent.setMax();
    private final getEngine networkMiniPrograms;
    /* access modifiers changed from: private */
    public ColorSchemeModelTemplate.AnonymousClass1 paymentServiceProvider;
    private final hasInputException userEntityRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f0\u0003H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lid/dana/data/globalsearch/GlobalSearchEntityData;", "", "getAutoCompleteResult", "Lio/reactivex/Observable;", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "autoCompleteRequestEntity", "Lid/dana/data/globalsearch/source/network/request/AutoCompleteRequestEntity;", "getHistoricalSku", "Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "profileKeys", "", "", "profileKeyMaxResult", "", "getProductCode", "", "Lid/dana/data/exploredana/repository/source/network/result/ProductMappingEntityResult;", "getSearchResult", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "searchRequestEntity", "Lid/dana/data/globalsearch/source/network/request/SearchRequestEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Render {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<AutoCompleteResultEntity> getMin(@NotNull AutoCompleteRequestEntity autoCompleteRequestEntity);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<SearchResultEntity> getMin(@NotNull SearchRequestEntity searchRequestEntity);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Map<String, addDatas2Performance>> length();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<useSuperSplash> setMin(@NotNull List<String> list, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lid/dana/data/globalsearch/model/PopularSearchCache;", "", "lastFetchDate", "", "lastIndex", "", "popularSearch", "", "", "(JILjava/util/List;)V", "getLastFetchDate", "()J", "setLastFetchDate", "(J)V", "getLastIndex", "()I", "setLastIndex", "(I)V", "getPopularSearch", "()Ljava/util/List;", "setPopularSearch", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Message {
        @NotNull
        public List<String> length;
        public int setMax;
        public long setMin;

        public Message() {
            this((byte) 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return this.setMin == message.setMin && this.setMax == message.setMax && Intrinsics.areEqual((Object) this.length, (Object) message.length);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PopularSearchCache(lastFetchDate=");
            sb.append(this.setMin);
            sb.append(", lastIndex=");
            sb.append(this.setMax);
            sb.append(", popularSearch=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        public Message(long j, int i, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "popularSearch");
            this.setMin = j;
            this.setMax = i;
            this.length = list;
        }

        public /* synthetic */ Message(byte b) {
            this(-1, -1, CollectionsKt.emptyList());
        }

        public final int hashCode() {
            int hashCode = ((Long.valueOf(this.setMin).hashCode() * 31) + Integer.valueOf(this.setMax).hashCode()) * 31;
            List<String> list = this.length;
            return hashCode + (list != null ? list.hashCode() : 0);
        }
    }

    @Inject
    public DefaultEmbedViewManager(Application application2, hasInputException hasinputexception, getEngine getengine) {
        this.application = application2;
        this.userEntityRepository = hasinputexception;
        this.networkMiniPrograms = getengine;
        handleMemberInfo();
    }

    public void setResultPayment(String str, String str2) {
        PaymentResult paymentResult = new PaymentResult();
        paymentResult.setResultCode(str);
        paymentResult.setResultMessage(str2);
        getPaymentServiceProvider().setPaymentResult(paymentResult);
    }

    public void setResultPaymentWithoutCallback(String str, String str2) {
        PaymentResult paymentResult = new PaymentResult();
        paymentResult.setResultCode(str);
        paymentResult.setResultMessage(str2);
        getPaymentServiceProvider().setPaymentResultWithoutCallback(paymentResult);
    }

    @NotNull
    private ColorSchemeModelTemplate.AnonymousClass1 getPaymentServiceProvider() {
        if (this.paymentServiceProvider == null) {
            this.paymentServiceProvider = ColorSchemeModelTemplate.AnonymousClass1.getInstance();
        }
        return (ColorSchemeModelTemplate.AnonymousClass1) Objects.requireNonNull(this.paymentServiceProvider);
    }

    public void handleServicePublishSubject() {
        try {
            IComponent<getBackPerform> iComponent = this.networkMiniPrograms.length;
            Intrinsics.checkNotNullParameter(iComponent, "miniProgramPublishSubject");
            ((getEngineRouter) WalletServiceManager.getInstance().getService(DeeplinkService.class)).setMin = iComponent;
        } catch (WalletServiceManager.ServiceNotFoundException e) {
            this.gnAuthResultPublishSubject.onError(e);
            this.networkMiniPrograms.length.onError(e);
        }
    }

    private void handleMemberInfo() {
        try {
            hasInputException hasinputexception = this.userEntityRepository;
            Intrinsics.checkNotNullParameter(hasinputexception, "userEntityRepository");
            ((setBackPerform) WalletServiceManager.getInstance().getService(MemberService.class)).setMin = hasinputexception;
        } catch (WalletServiceManager.ServiceNotFoundException unused) {
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<ErrorView> getForexRate(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.create(new ThemeUtils.ColorScheme(str, str2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getForexRate$1(String str, String str2, TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        QuoteCurrency quoteCurrency = new QuoteCurrency();
        quoteCurrency.sellCurrency = str;
        quoteCurrency.buyCurrency = str2;
        IAPConnect.inquireQuote(quoteCurrency, new dispatchSendMessage(r3));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getForexRate$0(TitleBarRightButtonView.AnonymousClass2 r1, String str, ForeignExchangeQuote foreignExchangeQuote) {
        if ("SUCCESS".equalsIgnoreCase(str)) {
            r1.onNext(isTransparentTitle.map(foreignExchangeQuote));
        } else {
            r1.onNext(new ErrorView());
        }
        r1.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<ErrorView>> getListRealTimeForexRate(List<String> list, List<String> list2) {
        return TitleBarRightButtonView.AnonymousClass1.create(new findAllEmbedView(list, list2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getListRealTimeForexRate$3(List list, List list2, TitleBarRightButtonView.AnonymousClass2 r7) throws Exception {
        int size = list.size();
        releaseViews releaseviews = new releaseViews(new ArrayList(), size, r7);
        for (int i = 0; i < size; i++) {
            QuoteCurrency quoteCurrency = new QuoteCurrency();
            quoteCurrency.sellCurrency = (String) list.get(i);
            quoteCurrency.buyCurrency = (String) list2.get(i);
            IAPConnect.inquireQuote(quoteCurrency, releaseviews);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getListRealTimeForexRate$2(List list, int i, TitleBarRightButtonView.AnonymousClass2 r3, String str, ForeignExchangeQuote foreignExchangeQuote) {
        if ("SUCCESS".equalsIgnoreCase(str)) {
            list.add(isTransparentTitle.map(foreignExchangeQuote));
        } else {
            list.add(new ErrorView());
        }
        if (list.size() == i) {
            r3.onNext(list);
            r3.onComplete();
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<initUC7zSo> getForexCache(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(new initUC7zSo());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveForex(initUC7zSo inituc7zso) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getGnPaymentCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.create(new isDarkMode(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getGnPaymentCode$4(String str, final TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        IAPConnect.getPaymentCode(str, new IPaymentCodeListener() {
            public final void onPaymentCodeUpdated(String str) {
                r3.onNext(str);
                r3.onComplete();
            }

            public final void onPaymentCodeUpdateFailed(String str, String str2) {
                r3.onError(new Throwable(str));
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPaymentCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<GnAuthResult> getGlobalNetworkAuth() {
        return this.gnAuthResultPublishSubject;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearGlobalNetwork() {
        return TitleBarRightButtonView.AnonymousClass1.create(setAppConfigColorScheme.setMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearGlobalNetwork$5(TitleBarRightButtonView.AnonymousClass2 r1) throws Exception {
        try {
            IAPConnect.clear();
            r1.onNext(Boolean.TRUE);
        } catch (Exception e) {
            r1.onError(e);
        } finally {
            r1.onComplete();
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2, boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.create(new destroyView(this, str, str2, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$decodeGnQr$6(String str, String str2, boolean z, final TitleBarRightButtonView.AnonymousClass2 r5) throws Exception {
        DecodeParameter decodeParameter = new DecodeParameter();
        decodeParameter.codeValue = str;
        decodeParameter.acDecodeConfigFromServer = str2;
        if (z) {
            decodeParameter.merchantType = ACConstants.MerchantType.IS_APP;
            decodeParameter.scene = ACConstants.Scene.SOURCE_FROM_OTHER_APP;
        } else {
            decodeParameter.scene = ACConstants.Scene.SOURCE_FROM_SCAN;
        }
        IAPConnect.decode(this.application, decodeParameter, new IDecodeCallback() {
            public final void dismissLoading() {
            }

            public final void showLoading() {
            }

            public final void onResult(Result result) {
                String str = result.resultCode;
                if (!"SUCCESS".equals(result.resultCode) && !"USER_CANCEL".equals(result.resultCode)) {
                    r5.onError(new Throwable(result.resultMessage));
                    DefaultEmbedViewManager.this.paymentServiceProvider.getEmitter().onError(new Throwable(result.resultCode));
                }
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<showErrorView> getPayRequest() {
        ColorSchemeModelTemplate.AnonymousClass1 paymentServiceProvider2 = getPaymentServiceProvider();
        Objects.requireNonNull(paymentServiceProvider2);
        return TitleBarRightButtonView.AnonymousClass1.create(new clearBaseView(paymentServiceProvider2));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> openMerchantCashier() {
        return TitleBarRightButtonView.AnonymousClass1.create(new dispatchRender(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$openMerchantCashier$7(TitleBarRightButtonView.AnonymousClass2 r2) throws Exception {
        getPaymentServiceProvider().openMerchantCashier();
        r2.onNext(Boolean.TRUE);
    }
}
