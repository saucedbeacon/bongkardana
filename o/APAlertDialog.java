package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.utils.FullSyncContactWorker;
import javax.inject.Named;

public final class APAlertDialog implements getBindingAdapter<FullSyncContactWorker> {
    @InjectedFieldSignature("id.dana.social.utils.FullSyncContactWorker.syncRunner")
    @Named("fullsync")
    public static void getMin(FullSyncContactWorker fullSyncContactWorker, findCalculatorForModelWithLock findcalculatorformodelwithlock) {
        fullSyncContactWorker.syncRunner = findcalculatorformodelwithlock;
    }
}
