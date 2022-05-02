package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface GriverPrepareInterceptor {
    TitleBarRightButtonView.AnonymousClass1<AnonymousClass1.AnonymousClass1> getDecodedQrBarcode(String str, String str2, boolean z);

    TitleBarRightButtonView.AnonymousClass1<AnonymousClass1> getSplitBillQr(List<setExtraBeaconDataTracker> list, String str);

    TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> getTransferBankQr(getScanJobIntervalMillis getscanjobintervalmillis);

    TitleBarRightButtonView.AnonymousClass1<AnonymousClass1> getTransferQr(boolean z, String str, String str2, int i);

    TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> getUserBankQr(getLastScanStartTimeMillis getlastscanstarttimemillis);

    TitleBarRightButtonView.AnonymousClass1<AnonymousClass1> getUserQr(boolean z, String str, int i);

    TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedQrH5Container();
}
