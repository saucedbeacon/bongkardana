package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.Split;
import io.split.android.client.service.executor.SplitTaskFactory;
import java.util.List;
import o.IInitializeComponent;
import o.IMalDetect;
import o.LiteVMParamType;

public final class getSGPluginInfo implements SplitTaskFactory {
    private final setNick mEventsManager;
    private final unregisterInitFinishListener mSplitApiFacade;
    private final getPackageValidityCheckComp mSplitClientConfig;
    private final String mSplitsFilterQueryString;
    private final getKeyType mSplitsStorageContainer;
    private final IOpenSDKComponent mSplitsSyncHelper = new IOpenSDKComponent(this.mSplitApiFacade.getSplitFetcher(), this.mSplitsStorageContainer.getSplitsStorage(), new noCaptchaForwardAuth());

    public getSGPluginInfo(@NonNull getPackageValidityCheckComp getpackagevaliditycheckcomp, @NonNull unregisterInitFinishListener unregisterinitfinishlistener, @NonNull getKeyType getkeytype, @Nullable String str, setNick setnick) {
        this.mSplitClientConfig = (getPackageValidityCheckComp) Preconditions.checkNotNull(getpackagevaliditycheckcomp);
        this.mSplitApiFacade = (unregisterInitFinishListener) Preconditions.checkNotNull(unregisterinitfinishlistener);
        this.mSplitsStorageContainer = (getKeyType) Preconditions.checkNotNull(getkeytype);
        this.mSplitsFilterQueryString = str;
        this.mEventsManager = setnick;
    }

    public final isSoValid createEventsRecorderTask() {
        return new isSoValid(this.mSplitApiFacade.getEventsRecorder(), this.mSplitsStorageContainer.getEventsStorage(), new IInitializeComponent.IInitFinishListener(this.mSplitClientConfig.eventsPerPush()));
    }

    public final getBizId createImpressionsRecorderTask() {
        return new getBizId(this.mSplitApiFacade.getImpressionsRecorder(), this.mSplitsStorageContainer.getImpressionsStorage(), new callLiteVMVoidMethod(this.mSplitClientConfig.impressionsPerPush(), 150));
    }

    public final checkEnvAndFiles createSplitsSyncTask(boolean z) {
        return new checkEnvAndFiles(this.mSplitsSyncHelper, this.mSplitsStorageContainer.getSplitsStorage(), z, this.mSplitClientConfig.cacheExpirationInSeconds(), this.mSplitsFilterQueryString, this.mEventsManager);
    }

    public final initNoCaptcha createMySegmentsSyncTask(boolean z) {
        return new initNoCaptcha(this.mSplitApiFacade.getMySegmentsFetcher(), this.mSplitsStorageContainer.getMySegmentsStorage(), z, this.mEventsManager);
    }

    public final LiteVMParamType.PARAM_TYPE createLoadMySegmentsTask() {
        return new LiteVMParamType.PARAM_TYPE(this.mSplitsStorageContainer.getMySegmentsStorage());
    }

    public final INoCaptchaComponent createLoadSplitsTask() {
        return new INoCaptchaComponent(this.mSplitsStorageContainer.getSplitsStorage());
    }

    public final putNoCaptchaTraceRecord createSplitKillTask(Split split) {
        return new putNoCaptchaTraceRecord(this.mSplitsStorageContainer.getSplitsStorage(), split, this.mEventsManager);
    }

    public final IMalDetect.ICallBack createMySegmentsUpdateTask(List<String> list) {
        return new IMalDetect.ICallBack(this.mSplitsStorageContainer.getMySegmentsStorage(), list, this.mEventsManager);
    }

    public final isTokenExisted createSplitsUpdateTask(long j) {
        return new isTokenExisted(this.mSplitsSyncHelper, this.mSplitsStorageContainer.getSplitsStorage(), j, this.mEventsManager);
    }

    public final onDetection createFilterSplitsInCacheTask() {
        return new onDetection(this.mSplitsStorageContainer.getPersistentSplitsStorage(), new getUMIDComp().group(this.mSplitClientConfig.syncConfig().getFilters()), this.mSplitsFilterQueryString);
    }

    public final IInitializeComponent createCleanUpDatabaseTask(long j) {
        return new IInitializeComponent(this.mSplitsStorageContainer.getEventsStorage(), this.mSplitsStorageContainer.getImpressionsStorage(), j);
    }

    public final LiteVMParamType createSaveImpressionsCountTask(List<reloadLiteVMInstance> list) {
        return new LiteVMParamType(this.mSplitsStorageContainer.getImpressionsCountStorage(), list);
    }

    public final destroyLiteVMInstance createImpressionsCountRecorderTask() {
        return new destroyLiteVMInstance(this.mSplitApiFacade.getImpressionsCountRecorder(), this.mSplitsStorageContainer.getImpressionsCountStorage());
    }
}
