package o;

import id.dana.domain.homeinfo.ServiceName;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getSHA1 extends parseFailed<imageQuality, getMax> {
    private getCharsetName pushNotificationRepository;

    private String formatConnectionType(int i) {
        return i != 0 ? i != 1 ? i != 6 ? i != 7 ? i != 9 ? i != 17 ? "Others" : "Vpn" : "Ethernet" : "Bluetooth" : "Wimax" : "Wifi" : ServiceName.MOBILE_RECHARGE;
    }

    @Inject
    public getSHA1(appxLoadFailed appxloadfailed, getScheme getscheme, getCharsetName getcharsetname) {
        super(appxloadfailed, getscheme);
        this.pushNotificationRepository = getcharsetname;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<imageQuality> buildUseCaseObservable(getMax getmax) {
        return this.pushNotificationRepository.reportDevice(getmax.token, getmax.imsi, getmax.imei, formatConnectionType(getmax.connectType));
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public int connectType;
        /* access modifiers changed from: private */
        public String imei;
        /* access modifiers changed from: private */
        public String imsi;
        /* access modifiers changed from: private */
        public String token;

        private getMax(String str, String str2, String str3, int i) {
            this.token = str;
            this.imei = str2;
            this.imsi = str3;
            this.connectType = i;
        }

        public static getMax forReportDevice(String str, String str2, String str3, int i) {
            return new getMax(str, str2, str3, i);
        }
    }
}
