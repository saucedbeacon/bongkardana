package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getErrorUrl extends parseFailed<Boolean, length> {
    private setTimeoutForContext recentContactRepository;

    @Inject
    public getErrorUrl(appxLoadFailed appxloadfailed, getScheme getscheme, setTimeoutForContext settimeoutforcontext) {
        super(appxloadfailed, getscheme);
        this.recentContactRepository = settimeoutforcontext;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(length length2) {
        return this.recentContactRepository.saveDanaUserContact(length2.userId, length2.phoneNumber);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String phoneNumber;
        /* access modifiers changed from: private */
        public String userId;

        private length(String str, String str2) {
            this.userId = str;
            this.phoneNumber = str2;
        }

        public static length forSaveDanaUserContact(String str, String str2) {
            return new length(str, str2);
        }
    }
}
