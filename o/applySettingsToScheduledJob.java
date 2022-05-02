package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class applySettingsToScheduledJob extends parseFailed<setLastScanStartTimeMillis, setMin> {
    private final getScanJobRuntimeMillis splitBillRepository;

    @Inject
    public applySettingsToScheduledJob(appxLoadFailed appxloadfailed, getScheme getscheme, getScanJobRuntimeMillis getscanjobruntimemillis) {
        super(appxloadfailed, getscheme);
        this.splitBillRepository = getscanjobruntimemillis;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<setLastScanStartTimeMillis> buildUseCaseObservable(setMin setmin) {
        return this.splitBillRepository.getPayerSplitBillDetail(setmin.splitBillId);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String splitBillId;

        private setMin(String str) {
            this.splitBillId = str;
        }

        public static setMin forSplitBillId(String str) {
            return new setMin(str);
        }
    }
}
