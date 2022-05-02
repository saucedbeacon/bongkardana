package o;

import java.util.Map;
import o.TitleBarRightButtonView;

public interface PageShowPoint {
    TitleBarRightButtonView.AnonymousClass1<String> decodeGnQr(String str, String str2);

    PageContainer doGnConsult(Map<String, String> map, String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> getAlipayConnectServiceFirstTime();

    TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByCloudLocation(String str);

    TitleBarRightButtonView.AnonymousClass1<String> getCountryCodeByLocation(String str);

    TitleBarRightButtonView.AnonymousClass1<String> getCurrentCountryCode();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getGnPayQrTooltip();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getGnWelcomingFirstTime();

    TitleBarRightButtonView.AnonymousClass1<String> getOriginCountryCode();

    TitleBarRightButtonView.AnonymousClass1<String> getSelectedCountryCode();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled();

    TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode();

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveAlipayConnectServiceFirstTime(boolean z);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentCountryCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnPayQrTooltip(boolean z);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveGnWelcomingFirstTime(boolean z);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveOriginCountryCode(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveSelectedCountryCode(String str);
}
