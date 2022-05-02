package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class CycledLeScannerForJellyBeanMr2 extends parseFailed<Boolean, setMin> {
    private final setDistinctPacketsDetectedPerScan syncContactRepository;

    @Inject
    public CycledLeScannerForJellyBeanMr2(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        super(appxloadfailed, getscheme);
        this.syncContactRepository = setdistinctpacketsdetectedperscan;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMin setmin) {
        return this.syncContactRepository.syncOneContact(setmin.phoneNumber);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String phoneNumber;

        private setMin(String str) {
            this.phoneNumber = str;
        }

        public static setMin forSyncOneContact(String str) {
            return new setMin(str);
        }
    }
}
