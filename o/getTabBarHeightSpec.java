package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lid/dana/data/globalnetwork/source/local/PreferenceGnConfigEntityData;", "Lid/dana/data/globalnetwork/source/GnConfigEntityData;", "globalNetworkPreference", "Lid/dana/data/globalnetwork/source/local/GlobalNetworkPreference;", "(Lid/dana/data/globalnetwork/source/local/GlobalNetworkPreference;)V", "getGlobalNetworkPreference", "()Lid/dana/data/globalnetwork/source/local/GlobalNetworkPreference;", "getGnCScanBBlacklistedCountry", "Lio/reactivex/Observable;", "", "", "getGnContent", "Lid/dana/data/globalnetwork/model/GnContentResult;", "countryCode", "getGnCountriesWhitelist", "getGnCountryFlag", "getGnCountryFlagSquare", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTabBarHeightSpec implements getStateListDrawable {
    @NotNull
    private final getWidthSpec globalNetworkPreference;

    @Inject
    public getTabBarHeightSpec(@NotNull getWidthSpec getwidthspec) {
        Intrinsics.checkNotNullParameter(getwidthspec, "globalNetworkPreference");
        this.globalNetworkPreference = getwidthspec;
    }

    @NotNull
    public final getWidthSpec getGlobalNetworkPreference() {
        return this.globalNetworkPreference;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<attachPage> getGnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        TitleBarRightButtonView.AnonymousClass1<attachPage> just = TitleBarRightButtonView.AnonymousClass1.just(new attachPage((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(GnContentResult())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCountriesWhitelist() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just(this.globalNetworkPreference.getGnCountriesWhitelist());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(globalNe…nce.gnCountriesWhitelist)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlagSquare(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCScanBBlacklistedCountry() {
        throw new UnsupportedOperationException();
    }
}
