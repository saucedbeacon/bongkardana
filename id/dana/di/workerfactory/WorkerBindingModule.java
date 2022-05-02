package id.dana.di.workerfactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import id.dana.synccontact.worker.syncallcontact.SyncAllContactWorker;
import id.dana.synccontact.worker.syncnewcontact.SyncChangedContactWorker;
import o.changePxToDp;
import o.getDpFromDimension;
import o.setMerchantId;

@Module
public interface WorkerBindingModule {
    @IntoMap
    @WorkerKey(SyncChangedContactWorker.class)
    @Binds
    setMerchantId length(changePxToDp changepxtodp);

    @IntoMap
    @WorkerKey(SyncAllContactWorker.class)
    @Binds
    setMerchantId length(getDpFromDimension getdpfromdimension);
}
