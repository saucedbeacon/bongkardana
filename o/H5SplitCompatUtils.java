package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class H5SplitCompatUtils extends parseFailed<bytesToHexString, getMin> {
    private toDigit notificationCenterRepository;

    @Inject
    public H5SplitCompatUtils(appxLoadFailed appxloadfailed, getScheme getscheme, toDigit todigit) {
        super(appxloadfailed, getscheme);
        this.notificationCenterRepository = todigit;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<bytesToHexString> buildUseCaseObservable(getMin getmin) {
        return this.notificationCenterRepository.markNotificationAsRead(getmin.f9913id);
    }

    public static class getMin {
        /* access modifiers changed from: private */

        /* renamed from: id  reason: collision with root package name */
        public String f9913id;

        private getMin(String str) {
            this.f9913id = str;
        }

        public static getMin forMarkNotificationAsRead(String str) {
            return new getMin(str);
        }
    }
}
