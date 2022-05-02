package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getScheduledScanJobsEnabled extends parseFailed<getServiceUuidEndOffset, setMax> {
    private final fromInt sendMoneyRepository;

    @Inject
    public getScheduledScanJobsEnabled(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        super(appxloadfailed, getscheme);
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getServiceUuidEndOffset> buildUseCaseObservable(setMax setmax) {
        return this.sendMoneyRepository.sendMoney(setmax.payAmount, setmax.payCurrency, setmax.payeeAvatar, setmax.payeeNickname, setmax.payeeLoginId, setmax.payeeUserId, setmax.comment, setmax.share, setmax.payMethod);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public String comment;
        /* access modifiers changed from: private */
        public String payAmount;
        /* access modifiers changed from: private */
        public String payCurrency;
        /* access modifiers changed from: private */
        public String payMethod;
        /* access modifiers changed from: private */
        public String payeeAvatar;
        /* access modifiers changed from: private */
        public String payeeLoginId;
        /* access modifiers changed from: private */
        public String payeeNickname;
        /* access modifiers changed from: private */
        public String payeeUserId;
        /* access modifiers changed from: private */
        public boolean share;

        private setMax() {
        }

        public static setMax forSendMoney() {
            return new setMax();
        }

        public setMax currencyAmount(String str, String str2) {
            this.payAmount = str;
            this.payCurrency = str2;
            return this;
        }

        public setMax payeeDetail(String str, String str2, String str3, String str4) {
            this.payeeAvatar = str;
            this.payeeNickname = str2;
            this.payeeLoginId = str3;
            this.payeeUserId = str4;
            return this;
        }

        public setMax additionalInfo(String str, boolean z, String str2) {
            this.comment = str;
            this.share = z;
            this.payMethod = str2;
            return this;
        }
    }
}
