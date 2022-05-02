package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskExecutor;
import io.split.android.client.service.executor.SplitTaskFactory;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.impressions.ImpressionsMode;
import io.split.android.client.service.synchronizer.RecorderSyncHelper;
import io.split.android.client.service.synchronizer.Synchronizer;
import java.util.ArrayList;

@VisibleForTesting(otherwise = 4)
public class IStaticDataStoreComponent implements Synchronizer, SplitTaskExecutionListener {
    private String mEventsRecorderTaskId;
    private RecorderSyncHelper<Event> mEventsSyncHelper;
    private final LiteVMInstance mImpressionsCounter = new LiteVMInstance();
    private final getImpl mImpressionsObserver = new getImpl(500);
    private String mImpressionsRecorderCountTaskId;
    private String mImpressionsRecorderTaskId;
    private RecorderSyncHelper<KeyImpression> mImpressionsSyncHelper;
    private staticBinarySafeEncryptNoB64 mLoadLocalMySegmentsListener;
    private staticBinarySafeEncryptNoB64 mLoadLocalSplitsListener;
    private String mMySegmentsFetcherTaskId;
    private final getSafeCookie mMySegmentsSyncRetryTimer;
    private final getPackageValidityCheckComp mSplitClientConfig;
    private final setNick mSplitEventsManager;
    private final SplitTaskFactory mSplitTaskFactory;
    private String mSplitsFetcherTaskId;
    private final getKeyType mSplitsStorageContainer;
    private final getSafeCookie mSplitsSyncRetryTimer;
    private final getSafeCookie mSplitsUpdateRetryTimer;
    private final SplitTaskExecutor mTaskExecutor;
    private final getAppKeyByIndex mWorkManagerWrapper;

    public IStaticDataStoreComponent(@NonNull getPackageValidityCheckComp getpackagevaliditycheckcomp, @NonNull SplitTaskExecutor splitTaskExecutor, @NonNull getKeyType getkeytype, @NonNull SplitTaskFactory splitTaskFactory, @NonNull setNick setnick, @NonNull getAppKeyByIndex getappkeybyindex, @NonNull getMalDetectionComp getmaldetectioncomp) {
        this.mTaskExecutor = (SplitTaskExecutor) Preconditions.checkNotNull(splitTaskExecutor);
        this.mSplitsStorageContainer = (getKeyType) Preconditions.checkNotNull(getkeytype);
        this.mSplitClientConfig = (getPackageValidityCheckComp) Preconditions.checkNotNull(getpackagevaliditycheckcomp);
        this.mSplitEventsManager = (setNick) Preconditions.checkNotNull(setnick);
        this.mSplitTaskFactory = (SplitTaskFactory) Preconditions.checkNotNull(splitTaskFactory);
        this.mWorkManagerWrapper = (getAppKeyByIndex) Preconditions.checkNotNull(getappkeybyindex);
        this.mSplitsSyncRetryTimer = getmaldetectioncomp.create(splitTaskExecutor, 1);
        this.mSplitsUpdateRetryTimer = getmaldetectioncomp.create(splitTaskExecutor, 1);
        this.mMySegmentsSyncRetryTimer = getmaldetectioncomp.create(splitTaskExecutor, 1);
        setupListeners();
        this.mSplitsSyncRetryTimer.setTask(this.mSplitTaskFactory.createSplitsSyncTask(true), (SplitTaskExecutionListener) null);
        if (this.mSplitClientConfig.synchronizeInBackground()) {
            this.mWorkManagerWrapper.setFetcherExecutionListener(this);
            this.mWorkManagerWrapper.scheduleWork();
            return;
        }
        this.mWorkManagerWrapper.removeWork();
    }

    public void loadSplitsFromCache() {
        submitSplitLoadingTask(this.mLoadLocalSplitsListener);
    }

    public void loadMySegmentsFromCache() {
        submitMySegmentsLoadingTask(this.mLoadLocalMySegmentsListener);
    }

    public void loadAndSynchronizeSplits() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new loadLibraryAsync(this.mSplitTaskFactory.createFilterSplitsInCacheTask(), (SplitTaskExecutionListener) null));
        arrayList.add(new loadLibraryAsync(this.mSplitTaskFactory.createLoadSplitsTask(), this.mLoadLocalSplitsListener));
        arrayList.add(new loadLibraryAsync(new SplitTask() {
            @NonNull
            public final loadLibrarySync execute() {
                IStaticDataStoreComponent.this.synchronizeSplits();
                return loadLibrarySync.success(SplitTaskType.GENERIC_TASK);
            }
        }, (SplitTaskExecutionListener) null));
        this.mTaskExecutor.executeSerially(arrayList);
    }

    public void synchronizeSplits(long j) {
        this.mSplitsUpdateRetryTimer.setTask(this.mSplitTaskFactory.createSplitsUpdateTask(j), (SplitTaskExecutionListener) null);
        this.mSplitsUpdateRetryTimer.start();
    }

    public void synchronizeSplits() {
        this.mSplitsSyncRetryTimer.start();
    }

    public void synchronizeMySegments() {
        this.mMySegmentsSyncRetryTimer.setTask(this.mSplitTaskFactory.createMySegmentsSyncTask(false), (SplitTaskExecutionListener) null);
        this.mMySegmentsSyncRetryTimer.start();
    }

    public void forceMySegmentsSync() {
        this.mMySegmentsSyncRetryTimer.setTask(this.mSplitTaskFactory.createMySegmentsSyncTask(true), (SplitTaskExecutionListener) null);
        this.mMySegmentsSyncRetryTimer.start();
    }

    public synchronized void startPeriodicFetching() {
        scheduleSplitsFetcherTask();
        scheduleMySegmentsFetcherTask();
        createLoadingDialog.i("Periodic fetcher tasks scheduled");
    }

    public synchronized void stopPeriodicFetching() {
        this.mTaskExecutor.stopTask(this.mSplitsFetcherTaskId);
        this.mTaskExecutor.stopTask(this.mMySegmentsFetcherTaskId);
    }

    public void startPeriodicRecording() {
        scheduleEventsRecorderTask();
        scheduleImpressionsRecorderTask();
        scheduleImpressionsCountRecorderTask();
        createLoadingDialog.i("Peridic recording tasks scheduled");
    }

    public void stopPeriodicRecording() {
        saveImpressionsCount();
        this.mTaskExecutor.stopTask(this.mEventsRecorderTaskId);
        this.mTaskExecutor.stopTask(this.mImpressionsRecorderTaskId);
        this.mTaskExecutor.stopTask(this.mImpressionsRecorderCountTaskId);
    }

    private void setupListeners() {
        this.mEventsSyncHelper = new staticBinarySafeEncrypt(SplitTaskType.EVENTS_RECORDER, this.mSplitsStorageContainer.getEventsStorage(), this.mSplitClientConfig.eventsQueueSize(), 5242880, this.mTaskExecutor);
        this.mImpressionsSyncHelper = new staticBinarySafeEncrypt(SplitTaskType.IMPRESSIONS_RECORDER, this.mSplitsStorageContainer.getImpressionsStorage(), this.mSplitClientConfig.impressionsQueueSize(), this.mSplitClientConfig.impressionsChunkSize(), this.mTaskExecutor);
        this.mLoadLocalSplitsListener = new staticBinarySafeEncryptNoB64(this.mSplitEventsManager, SplitInternalEvent.SPLITS_LOADED_FROM_STORAGE);
        this.mLoadLocalMySegmentsListener = new staticBinarySafeEncryptNoB64(this.mSplitEventsManager, SplitInternalEvent.MY_SEGMENTS_LOADED_FROM_STORAGE);
    }

    public void pause() {
        stopPeriodicRecording();
        this.mTaskExecutor.pause();
    }

    public void resume() {
        this.mTaskExecutor.resume();
        startPeriodicRecording();
    }

    public void destroy() {
        this.mSplitsSyncRetryTimer.stop();
        this.mMySegmentsSyncRetryTimer.stop();
        this.mSplitsUpdateRetryTimer.stop();
        flush();
    }

    public void flush() {
        this.mTaskExecutor.submit(this.mSplitTaskFactory.createEventsRecorderTask(), this.mEventsSyncHelper);
        this.mTaskExecutor.submit(this.mSplitTaskFactory.createImpressionsRecorderTask(), this.mImpressionsSyncHelper);
        flushImpressionsCount();
    }

    public void pushEvent(Event event) {
        if (this.mEventsSyncHelper.pushAndCheckIfFlushNeeded(event)) {
            this.mTaskExecutor.submit(this.mSplitTaskFactory.createEventsRecorderTask(), this.mEventsSyncHelper);
        }
    }

    public void pushImpression(dynamicDecryptDDp dynamicdecryptddp) {
        dynamicDecryptDDp withPreviousTime = dynamicdecryptddp.withPreviousTime(this.mImpressionsObserver.testAndSet(dynamicdecryptddp));
        KeyImpression fromImpression = KeyImpression.fromImpression(withPreviousTime);
        if (isOptimizedImpressionsMode()) {
            this.mImpressionsCounter.inc(withPreviousTime.split(), withPreviousTime.time(), 1);
        }
        if ((!isOptimizedImpressionsMode() || shouldPushImpression(fromImpression)) && this.mImpressionsSyncHelper.pushAndCheckIfFlushNeeded(fromImpression)) {
            this.mTaskExecutor.submit(this.mSplitTaskFactory.createImpressionsRecorderTask(), this.mImpressionsSyncHelper);
        }
    }

    private void saveImpressionsCount() {
        if (isOptimizedImpressionsMode()) {
            this.mTaskExecutor.submit(this.mSplitTaskFactory.createSaveImpressionsCountTask(this.mImpressionsCounter.popAll()), (SplitTaskExecutionListener) null);
        }
    }

    private void flushImpressionsCount() {
        if (isOptimizedImpressionsMode()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new loadLibraryAsync(this.mSplitTaskFactory.createSaveImpressionsCountTask(this.mImpressionsCounter.popAll()), (SplitTaskExecutionListener) null));
            arrayList.add(new loadLibraryAsync(this.mSplitTaskFactory.createImpressionsCountRecorderTask(), (SplitTaskExecutionListener) null));
            this.mTaskExecutor.executeSerially(arrayList);
        }
    }

    private boolean isOptimizedImpressionsMode() {
        return ImpressionsMode.OPTIMIZED.equals(this.mSplitClientConfig.impressionsMode());
    }

    private void scheduleSplitsFetcherTask() {
        this.mSplitsFetcherTaskId = this.mTaskExecutor.schedule(this.mSplitTaskFactory.createSplitsSyncTask(false), (long) this.mSplitClientConfig.featuresRefreshRate(), (long) this.mSplitClientConfig.featuresRefreshRate(), (SplitTaskExecutionListener) null);
    }

    private void scheduleMySegmentsFetcherTask() {
        this.mMySegmentsFetcherTaskId = this.mTaskExecutor.schedule(this.mSplitTaskFactory.createMySegmentsSyncTask(false), (long) this.mSplitClientConfig.featuresRefreshRate(), (long) this.mSplitClientConfig.segmentsRefreshRate(), (SplitTaskExecutionListener) null);
    }

    private void scheduleEventsRecorderTask() {
        this.mEventsRecorderTaskId = this.mTaskExecutor.schedule(this.mSplitTaskFactory.createEventsRecorderTask(), 0, this.mSplitClientConfig.eventFlushInterval(), this.mEventsSyncHelper);
    }

    private void scheduleImpressionsRecorderTask() {
        this.mImpressionsRecorderTaskId = this.mTaskExecutor.schedule(this.mSplitTaskFactory.createImpressionsRecorderTask(), 0, (long) this.mSplitClientConfig.impressionsRefreshRate(), this.mImpressionsSyncHelper);
    }

    private void scheduleImpressionsCountRecorderTask() {
        if (isOptimizedImpressionsMode()) {
            this.mImpressionsRecorderCountTaskId = this.mTaskExecutor.schedule(this.mSplitTaskFactory.createImpressionsCountRecorderTask(), 0, (long) this.mSplitClientConfig.impressionsCounterRefreshRate(), (SplitTaskExecutionListener) null);
        }
    }

    private void submitSplitLoadingTask(SplitTaskExecutionListener splitTaskExecutionListener) {
        this.mTaskExecutor.submit(this.mSplitTaskFactory.createLoadSplitsTask(), splitTaskExecutionListener);
    }

    private void submitMySegmentsLoadingTask(SplitTaskExecutionListener splitTaskExecutionListener) {
        this.mTaskExecutor.submit(this.mSplitTaskFactory.createLoadMySegmentsTask(), splitTaskExecutionListener);
    }

    private boolean shouldPushImpression(KeyImpression keyImpression) {
        return keyImpression.previousTime == null || callLiteVMLongMethod.truncateTimeframe(keyImpression.previousTime.longValue()) != callLiteVMLongMethod.truncateTimeframe(keyImpression.time);
    }

    /* renamed from: o.IStaticDataStoreComponent$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$executor$SplitTaskType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.split.android.client.service.executor.SplitTaskType[] r0 = io.split.android.client.service.executor.SplitTaskType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$service$executor$SplitTaskType = r0
                io.split.android.client.service.executor.SplitTaskType r1 = io.split.android.client.service.executor.SplitTaskType.SPLITS_SYNC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$service$executor$SplitTaskType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.service.executor.SplitTaskType r1 = io.split.android.client.service.executor.SplitTaskType.MY_SEGMENTS_SYNC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IStaticDataStoreComponent.AnonymousClass4.<clinit>():void");
        }
    }

    public void taskExecuted(@NonNull loadLibrarySync loadlibrarysync) {
        int i = AnonymousClass4.$SwitchMap$io$split$android$client$service$executor$SplitTaskType[loadlibrarysync.getTaskType().ordinal()];
        if (i == 1) {
            createLoadingDialog.d("Loading split definitions updated in background");
            submitSplitLoadingTask((SplitTaskExecutionListener) null);
        } else if (i == 2) {
            createLoadingDialog.d("Loading my segments updated in background");
            submitMySegmentsLoadingTask((SplitTaskExecutionListener) null);
        }
    }
}
