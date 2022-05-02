package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class H5SecurityUtil extends parseFailed<HexStringUtil, getMax> {
    private toDigit notificationCenterRepository;

    @Inject
    public H5SecurityUtil(appxLoadFailed appxloadfailed, getScheme getscheme, toDigit todigit) {
        super(appxloadfailed, getscheme);
        this.notificationCenterRepository = todigit;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<HexStringUtil> buildUseCaseObservable(getMax getmax) {
        return this.notificationCenterRepository.fetchInbox(getmax.pageSize, getmax.maxId, getmax.minId);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String maxId;
        /* access modifiers changed from: private */
        public String minId;
        /* access modifiers changed from: private */
        public int pageSize;

        private getMax(int i, String str, String str2) {
            this.pageSize = i;
            this.maxId = str;
            this.minId = str2;
        }

        public static getMax forFetchUserInbox(int i, String str, String str2) {
            return new getMax(i, str, str2);
        }
    }
}
