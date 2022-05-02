package o;

import id.dana.domain.globalnetwork.CountryCode;
import java.util.Map;
import o.TitleBarRightButtonView;

public final class getTitleBarHeightSpec implements PageShowPoint {
    private final getWidthSpec globalNetworkPreference;

    public final PageContainer doGnConsult(Map<String, String> map, String str) {
        return null;
    }

    public getTitleBarHeightSpec(getWidthSpec getwidthspec) {
        this.globalNetworkPreference = getwidthspec;
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.isGlobalNetworkEnabled()));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode() {
        return getSelectedCountryCode().map(new getPageHeightSpec(CountryCode.JAPAN));
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.globalNetworkPreference.getSelectedCountryCode());
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByCloudLocation(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just("");
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getSelectedCountryCode() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.globalNetworkPreference.getCountryCode());
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveSelectedCountryCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveCountryCode(str)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getOriginCountryCode() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.globalNetworkPreference.getOriginCountryCode());
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountryCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveOriginCountryCode(str)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getGnWelcomingFirstTime() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.getGnWelcomeFirstTime()));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnWelcomingFirstTime(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveGnWelcomeFirstTime(z)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getAlipayConnectServiceFirstTime() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.getAlipayConnectServiceFirstTime()));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveAlipayConnectServiceFirstTime(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveAlipayConnectServiceFirstTime(z)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getGnPayQrTooltip() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.getGnPayQrTooltipFirstTime()));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPayQrTooltip(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveGnPayQrTooltipFirstTime(z)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountryCode(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.globalNetworkPreference.saveCurrentCountryCode(str)));
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountryCode() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.globalNetworkPreference.getCurrentCountryCode());
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just("");
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }
}
