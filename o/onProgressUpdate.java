package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onProgressUpdate extends parseFailed<Boolean, setMax> {
    private final getScanJobRuntimeMillis splitBillRepository;

    @Inject
    public onProgressUpdate(appxLoadFailed appxloadfailed, getScheme getscheme, getScanJobRuntimeMillis getscanjobruntimemillis) {
        super(appxloadfailed, getscheme);
        this.splitBillRepository = getscanjobruntimemillis;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.splitBillRepository.closePayers(setmax.closePayerList, setmax.splitBillId);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public List<String> closePayerList;
        /* access modifiers changed from: private */
        public String splitBillId;

        private setMax(List<String> list, String str) {
            this.closePayerList = list;
            this.splitBillId = str;
        }

        public static setMax forClosePayers(List<String> list, String str) {
            return new setMax(list, str);
        }
    }
}
