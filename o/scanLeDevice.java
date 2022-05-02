package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class scanLeDevice extends parseFailed<Boolean, Void> {
    private final setDistinctPacketsDetectedPerScan syncContactRepository;

    @Inject
    public scanLeDevice(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        super(appxloadfailed, getscheme);
        this.syncContactRepository = setdistinctpacketsdetectedperscan;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.syncContactRepository.isSyncProcessCompleted();
    }
}
