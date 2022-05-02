package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class dumpBackgroundScanResultQueue extends parseFailed<List<setLastScanStartTimeMillis>, length> {
    private final getScanJobRuntimeMillis splitBillRepository;

    @Inject
    public dumpBackgroundScanResultQueue(appxLoadFailed appxloadfailed, getScheme getscheme, getScanJobRuntimeMillis getscanjobruntimemillis) {
        super(appxloadfailed, getscheme);
        this.splitBillRepository = getscanjobruntimemillis;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<setLastScanStartTimeMillis>> buildUseCaseObservable(length length2) {
        return this.splitBillRepository.getSplitBillHistories(length2.pageNum);
    }

    public static class length {
        /* access modifiers changed from: private */
        public int pageNum;

        private length(int i) {
            this.pageNum = i;
        }

        public static length forPageNum(int i) {
            return new length(i);
        }
    }
}
