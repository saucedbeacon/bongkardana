package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.workmanager.SaveContactPartialSyncWorker;
import javax.inject.Named;

public final class setCustomLayout implements getBindingAdapter<SaveContactPartialSyncWorker> {
    @InjectedFieldSignature("id.dana.social.workmanager.SaveContactPartialSyncWorker.syncRunner")
    @Named("recurringpartialsync")
    public static void setMax(SaveContactPartialSyncWorker saveContactPartialSyncWorker, findCalculatorForModelWithLock findcalculatorformodelwithlock) {
        saveContactPartialSyncWorker.syncRunner = findcalculatorformodelwithlock;
    }
}
