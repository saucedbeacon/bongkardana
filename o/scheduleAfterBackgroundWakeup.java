package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class scheduleAfterBackgroundWakeup extends parseFailed<setLastScanStartTimeMillis, getMin> {
    private final getScanJobRuntimeMillis splitBillRepository;

    @Inject
    public scheduleAfterBackgroundWakeup(appxLoadFailed appxloadfailed, getScheme getscheme, getScanJobRuntimeMillis getscanjobruntimemillis) {
        super(appxloadfailed, getscheme);
        this.splitBillRepository = getscanjobruntimemillis;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<setLastScanStartTimeMillis> buildUseCaseObservable(getMin getmin) {
        return this.splitBillRepository.getSplitBillDetail(getmin.splitBillId);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public String splitBillId;

        private getMin(String str) {
            this.splitBillId = str;
        }

        public static getMin forSplitBillId(String str) {
            return new getMin(str);
        }
    }
}
