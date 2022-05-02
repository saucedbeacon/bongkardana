package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.investment.view.HomeInvestmentView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAppLanguageExtensionImpl;
import o.GriverBridgeNotFoundExtension;
import org.jetbrains.annotations.NotNull;

public final class GriverGeoLocationExtensionImpl implements getBindingAdapter<HomeInvestmentView> {
    @InjectedFieldSignature("id.dana.investment.view.HomeInvestmentView.investmentPresenter")
    public static void length(HomeInvestmentView homeInvestmentView, GriverAppLanguageExtensionImpl.length length) {
        homeInvestmentView.investmentPresenter = length;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMultiCurrencyMoneyViewModel", "Lid/dana/investment/model/MultiCurrencyMoneyViewModel;", "Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.GriverGeoLocationExtensionImpl$2  reason: invalid class name */
    public final class AnonymousClass2 {
        @NotNull
        public static final GriverBridgeNotFoundExtension.AnonymousClass1 getMax(@NotNull isForeground isforeground) {
            Intrinsics.checkNotNullParameter(isforeground, "$this$toMultiCurrencyMoneyViewModel");
            return new GriverBridgeNotFoundExtension.AnonymousClass1(isforeground.getAmount(), isforeground.getCent(), isforeground.getCentFactor(), isforeground.getCurrency(), isforeground.getCurrencyCode(), isforeground.getCurrencyValue());
        }
    }
}
