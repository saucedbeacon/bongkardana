package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.workmanager.EventsRecorderWorker;
import io.split.android.client.service.workmanager.ImpressionsRecorderWorker;
import io.split.android.client.service.workmanager.MySegmentsSyncWorker;
import io.split.android.client.service.workmanager.SplitsSyncWorker;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o.setDefaultActionButtonContentDescription;
import o.setTextAppearance;
import o.updateAppearance;

@VisibleForTesting(otherwise = 4)
public class getAppKeyByIndex {
    private final String mApiKey;
    private final setDefaultActionButtonContentDescription mConstraints = buildConstraints();
    private final String mDatabaseName;
    private WeakReference<SplitTaskExecutionListener> mFetcherExecutionListener;
    private final String mKey;
    private final Set<String> mShouldLoadFromLocal = new HashSet();
    private final getPackageValidityCheckComp mSplitClientConfig;
    /* access modifiers changed from: private */
    public final setTextSize mWorkManager;

    public getAppKeyByIndex(@NonNull setTextSize settextsize, @NonNull getPackageValidityCheckComp getpackagevaliditycheckcomp, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.mWorkManager = (setTextSize) Preconditions.checkNotNull(settextsize);
        this.mDatabaseName = (String) Preconditions.checkNotNull(str2);
        this.mSplitClientConfig = (getPackageValidityCheckComp) Preconditions.checkNotNull(getpackagevaliditycheckcomp);
        this.mApiKey = (String) Preconditions.checkNotNull(str);
        this.mKey = (String) Preconditions.checkNotNull(str3);
    }

    public void setFetcherExecutionListener(SplitTaskExecutionListener splitTaskExecutionListener) {
        this.mFetcherExecutionListener = new WeakReference<>(splitTaskExecutionListener);
    }

    public void removeWork() {
        this.mWorkManager.getMax(SplitTaskType.SPLITS_SYNC.toString());
        this.mWorkManager.getMax(SplitTaskType.MY_SEGMENTS_SYNC.toString());
        this.mWorkManager.getMax(SplitTaskType.EVENTS_RECORDER.toString());
        this.mWorkManager.getMax(SplitTaskType.IMPRESSIONS_RECORDER.toString());
        WeakReference<SplitTaskExecutionListener> weakReference = this.mFetcherExecutionListener;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public void scheduleWork() {
        scheduleWork(SplitTaskType.SPLITS_SYNC.toString(), SplitsSyncWorker.class, buildSplitSyncInputData());
        scheduleWork(SplitTaskType.MY_SEGMENTS_SYNC.toString(), MySegmentsSyncWorker.class, buildMySegmentsSyncInputData());
        scheduleWork(SplitTaskType.EVENTS_RECORDER.toString(), EventsRecorderWorker.class, buildEventsRecorderInputData());
        scheduleWork(SplitTaskType.IMPRESSIONS_RECORDER.toString(), ImpressionsRecorderWorker.class, buildImpressionsRecorderInputData());
    }

    private void scheduleWork(String str, Class<? extends ListenableWorker> cls, updateAppearance updateappearance) {
        setTextAppearance.getMin getmin = new setTextAppearance.getMin(cls, this.mSplitClientConfig.backgroundSyncPeriod(), TimeUnit.MINUTES);
        getmin.setMin.setMin = buildInputData(updateappearance);
        setTextAppearance.getMin getmin2 = (setTextAppearance.getMin) getmin.getMax();
        getmin2.setMin.toFloatRange = this.mConstraints;
        this.mWorkManager.length(str, ExistingPeriodicWorkPolicy.REPLACE, (setTextAppearance) ((setTextAppearance.getMin) ((setTextAppearance.getMin) getmin2.getMax()).setMax(15, TimeUnit.MINUTES)).setMin());
        observeWorkState(cls.getCanonicalName());
    }

    private void observeWorkState(final String str) {
        createLoadingDialog.d("Adding work manager observer for request id ".concat(String.valueOf(str)));
        IStaticKeyEncryptComponent.runInMainThread(new Runnable() {
            public void run() {
                getAppKeyByIndex.this.mWorkManager.getMin(str).getMax(needsDividerBefore.setMin(), new onMeasure<List<WorkInfo>>() {
                    public final void onChanged(@Nullable List<WorkInfo> list) {
                        if (list != null) {
                            for (WorkInfo next : list) {
                                StringBuilder sb = new StringBuilder("Work manager task: ");
                                sb.append(next.setMax);
                                sb.append(", state: ");
                                sb.append(next.getMin.toString());
                                createLoadingDialog.d(sb.toString());
                                getAppKeyByIndex.this.updateTaskStatus(next);
                            }
                        }
                    }
                });
            }
        });
    }

    private updateAppearance buildInputData(updateAppearance updateappearance) {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("databaseName", this.mDatabaseName);
        getmin.length.put("apiKey", this.mApiKey);
        getmin.length.put("eventsEndpoint", this.mSplitClientConfig.eventsEndpoint());
        if (updateappearance != null) {
            getmin.setMin(updateappearance.setMin);
        }
        updateAppearance updateappearance2 = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance2);
        return updateappearance2;
    }

    /* access modifiers changed from: private */
    public void updateTaskStatus(WorkInfo workInfo) {
        SplitTaskType taskTypeFromTags;
        if (this.mFetcherExecutionListener != null && workInfo != null && workInfo.setMax != null && WorkInfo.State.ENQUEUED.equals(workInfo.getMin) && (taskTypeFromTags = taskTypeFromTags(workInfo.setMax)) != null) {
            if (!this.mShouldLoadFromLocal.contains(taskTypeFromTags.toString())) {
                StringBuilder sb = new StringBuilder("Avoiding update for ");
                sb.append(taskTypeFromTags.toString());
                createLoadingDialog.d(sb.toString());
                this.mShouldLoadFromLocal.add(taskTypeFromTags.toString());
                return;
            }
            SplitTaskExecutionListener splitTaskExecutionListener = this.mFetcherExecutionListener.get();
            if (splitTaskExecutionListener != null) {
                StringBuilder sb2 = new StringBuilder("Updating for ");
                sb2.append(taskTypeFromTags.toString());
                createLoadingDialog.d(sb2.toString());
                splitTaskExecutionListener.taskExecuted(loadLibrarySync.success(taskTypeFromTags));
            }
        }
    }

    private SplitTaskType taskTypeFromTags(Set<String> set) {
        if (set.contains(SplitsSyncWorker.class.getCanonicalName())) {
            return SplitTaskType.SPLITS_SYNC;
        }
        if (set.contains(MySegmentsSyncWorker.class.getCanonicalName())) {
            return SplitTaskType.MY_SEGMENTS_SYNC;
        }
        return null;
    }

    private updateAppearance buildSplitSyncInputData() {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("splitCacheExpiration", Long.valueOf(this.mSplitClientConfig.cacheExpirationInSeconds()));
        getmin.length.put("endpoint", this.mSplitClientConfig.endpoint());
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance);
        return buildInputData(updateappearance);
    }

    private updateAppearance buildMySegmentsSyncInputData() {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("endpoint", this.mSplitClientConfig.endpoint());
        getmin.length.put("key", this.mKey);
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance);
        return buildInputData(updateappearance);
    }

    private updateAppearance buildEventsRecorderInputData() {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("endpoint", this.mSplitClientConfig.eventsEndpoint());
        getmin.length.put("eventsPerPush", Integer.valueOf(this.mSplitClientConfig.eventsPerPush()));
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance);
        return buildInputData(updateappearance);
    }

    private updateAppearance buildImpressionsRecorderInputData() {
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("endpoint", this.mSplitClientConfig.eventsEndpoint());
        getmin.length.put("impressionsPerPush", Integer.valueOf(this.mSplitClientConfig.impressionsPerPush()));
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance);
        return buildInputData(updateappearance);
    }

    private setDefaultActionButtonContentDescription buildConstraints() {
        NetworkType networkType;
        setDefaultActionButtonContentDescription.getMax getmax = new setDefaultActionButtonContentDescription.getMax();
        if (this.mSplitClientConfig.backgroundSyncWhenBatteryWifiOnly()) {
            networkType = NetworkType.UNMETERED;
        } else {
            networkType = NetworkType.CONNECTED;
        }
        getmax.setMin = networkType;
        getmax.getMax = this.mSplitClientConfig.backgroundSyncWhenBatteryNotLow();
        return new setDefaultActionButtonContentDescription(getmax);
    }
}
