package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setH5ErrorPage extends parseFailed<Boolean, setMax> {
    private GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Inject
    public setH5ErrorPage(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super(appxloadfailed, getscheme);
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.recentRecipientRepository.saveRecentContact(setmax.toRecentContactRecipient());
    }

    public static class setMax {
        private String payeeAvatar;
        private String payeeLoginId;
        private String payeeNickname;
        private String payeeUserId;
        private int transactionCount;
        private boolean visibleInQuickSend;

        private setMax(String str, String str2, String str3, String str4, int i, boolean z) {
            this.payeeNickname = str;
            this.payeeLoginId = str2;
            this.payeeUserId = str3;
            this.payeeAvatar = str4;
            this.transactionCount = i;
            this.visibleInQuickSend = z;
        }

        public static setMax forRecentContact(String str, String str2, String str3, String str4, int i, boolean z) {
            return new setMax(str, str2, str3, str4, i, z);
        }

        /* access modifiers changed from: private */
        public unRegisterStageMonitor toRecentContactRecipient() {
            return new unRegisterStageMonitor(this.payeeUserId, this.payeeLoginId, this.payeeNickname, this.payeeAvatar, this.transactionCount, this.visibleInQuickSend);
        }
    }
}
