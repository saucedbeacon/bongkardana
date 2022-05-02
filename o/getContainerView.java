package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.utils.PartialSyncContactWorker;
import javax.inject.Named;

public final class getContainerView implements getBindingAdapter<PartialSyncContactWorker> {
    @InjectedFieldSignature("id.dana.social.utils.PartialSyncContactWorker.syncRunner")
    @Named("partialsync")
    public static void setMin(PartialSyncContactWorker partialSyncContactWorker, findCalculatorForModelWithLock findcalculatorformodelwithlock) {
        partialSyncContactWorker.syncRunner = findcalculatorformodelwithlock;
    }
}
