package o;

import javax.inject.Inject;
import o.CycledLeScannerForJellyBeanMr2;
import o.TitleBarRightButtonView;

public class getWakeUpOperation extends parseFailed<CycledLeScannerForJellyBeanMr2.AnonymousClass2, Void> {
    private final setDistinctPacketsDetectedPerScan syncContactRepository;

    @Inject
    public getWakeUpOperation(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        super(appxloadfailed, getscheme);
        this.syncContactRepository = setdistinctpacketsdetectedperscan;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<CycledLeScannerForJellyBeanMr2.AnonymousClass2> buildUseCaseObservable(Void voidR) {
        return this.syncContactRepository.getLastSyncedContact();
    }
}
