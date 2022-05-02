package o;

import com.google.common.base.Preconditions;
import io.split.android.client.EventPropertiesProcessor;
import io.split.android.client.SplitClient;
import io.split.android.client.SplitFactory;
import io.split.android.client.dtos.Event;
import io.split.android.client.events.SplitEvent;
import io.split.android.client.impressions.ImpressionListener;
import io.split.android.client.service.synchronizer.SyncManager;
import io.split.android.client.storage.splits.SplitsStorage;
import io.split.android.client.validators.EventValidator;
import io.split.android.client.validators.TreatmentManager;
import io.split.android.client.validators.ValidationMessageLogger;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.b;

public final class getAtlasEncryptComp implements SplitClient {
    private static final int ESTIMATED_EVENT_SIZE_WITHOUT_PROPS = 1024;
    private static final double TRACK_DEFAULT_VALUE = 0.0d;
    private final getPackageValidityCheckComp mConfig;
    private final EventPropertiesProcessor mEventPropertiesProcessor;
    private final EventValidator mEventValidator;
    private final setNick mEventsManager;
    private boolean mIsClientDestroyed = false;
    private final String mMatchingKey;
    private final SplitFactory mSplitFactory;
    private final SyncManager mSyncManager;
    private final TreatmentManager mTreatmentManager;
    private final ValidationMessageLogger mValidationLogger;

    public getAtlasEncryptComp(SplitFactory splitFactory, IDataCollectionComponent iDataCollectionComponent, setTransparentForImageViewInFragment settransparentforimageviewinfragment, ImpressionListener impressionListener, b.a aVar, getPackageValidityCheckComp getpackagevaliditycheckcomp, setNick setnick, SplitsStorage splitsStorage, EventPropertiesProcessor eventPropertiesProcessor, SyncManager syncManager) {
        SplitsStorage splitsStorage2 = splitsStorage;
        Preconditions.checkNotNull(settransparentforimageviewinfragment);
        Preconditions.checkNotNull(impressionListener);
        String bucketingKey = iDataCollectionComponent.bucketingKey();
        this.mMatchingKey = (String) Preconditions.checkNotNull(iDataCollectionComponent.matchingKey());
        this.mSplitFactory = (SplitFactory) Preconditions.checkNotNull(splitFactory);
        this.mConfig = (getPackageValidityCheckComp) Preconditions.checkNotNull(getpackagevaliditycheckcomp);
        this.mEventsManager = (setNick) Preconditions.checkNotNull(setnick);
        this.mEventValidator = new setColorDiff(new bodyTitleTextType(), splitsStorage2);
        this.mValidationLogger = new setTranslucent();
        this.mTreatmentManager = new setTranslucentDiff(this.mMatchingKey, bucketingKey, new getDataCollectionComp(splitsStorage2, settransparentforimageviewinfragment), new bodyTitleTextType(), new StatusBarUtil(), aVar, impressionListener, this.mConfig, setnick);
        this.mEventPropertiesProcessor = (EventPropertiesProcessor) Preconditions.checkNotNull(eventPropertiesProcessor);
        this.mSyncManager = (SyncManager) Preconditions.checkNotNull(syncManager);
    }

    public final void destroy() {
        this.mIsClientDestroyed = true;
        this.mSplitFactory.destroy();
    }

    public final void flush() {
        this.mSplitFactory.flush();
    }

    public final boolean isReady() {
        return this.mEventsManager.eventAlreadyTriggered(SplitEvent.SDK_READY);
    }

    public final String getTreatment(String str) {
        return getTreatment(str, Collections.emptyMap());
    }

    public final String getTreatment(String str, Map<String, Object> map) {
        return this.mTreatmentManager.getTreatment(str, map, this.mIsClientDestroyed);
    }

    public final getSDKVerison getTreatmentWithConfig(String str, Map<String, Object> map) {
        return this.mTreatmentManager.getTreatmentWithConfig(str, map, this.mIsClientDestroyed);
    }

    public final Map<String, String> getTreatments(List<String> list, Map<String, Object> map) {
        return this.mTreatmentManager.getTreatments(list, map, this.mIsClientDestroyed);
    }

    public final Map<String, getSDKVerison> getTreatmentsWithConfig(List<String> list, Map<String, Object> map) {
        return this.mTreatmentManager.getTreatmentsWithConfig(list, map, this.mIsClientDestroyed);
    }

    public final void on(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt) {
        Preconditions.checkNotNull(splitEvent);
        Preconditions.checkNotNull(atlassafeencrypt);
        if (splitEvent.equals(SplitEvent.SDK_READY_FROM_CACHE) || !this.mEventsManager.eventAlreadyTriggered(splitEvent)) {
            this.mEventsManager.register(splitEvent, atlassafeencrypt);
            return;
        }
        createLoadingDialog.w(String.format("A listener was added for %s on the SDK, which has already fired and won’t be emitted again. The callback won’t be executed.", new Object[]{splitEvent.toString()}));
    }

    public final boolean track(String str, String str2) {
        return track(this.mMatchingKey, str, str2, 0.0d, (Map<String, Object>) null);
    }

    public final boolean track(String str, String str2, double d) {
        return track(this.mMatchingKey, str, str2, d, (Map<String, Object>) null);
    }

    public final boolean track(String str) {
        return track(this.mMatchingKey, this.mConfig.trafficType(), str, 0.0d, (Map<String, Object>) null);
    }

    public final boolean track(String str, double d) {
        return track(this.mMatchingKey, this.mConfig.trafficType(), str, d, (Map<String, Object>) null);
    }

    public final boolean track(String str, String str2, Map<String, Object> map) {
        return track(this.mMatchingKey, str, str2, 0.0d, map);
    }

    public final boolean track(String str, String str2, double d, Map<String, Object> map) {
        return track(this.mMatchingKey, str, str2, d, map);
    }

    public final boolean track(String str, Map<String, Object> map) {
        return track(this.mMatchingKey, this.mConfig.trafficType(), str, 0.0d, map);
    }

    public final boolean track(String str, double d, Map<String, Object> map) {
        return track(this.mMatchingKey, this.mConfig.trafficType(), str, d, map);
    }

    private boolean track(String str, String str2, String str3, double d, Map<String, Object> map) {
        boolean eventAlreadyTriggered = this.mEventsManager.eventAlreadyTriggered(SplitEvent.SDK_READY);
        if (this.mIsClientDestroyed) {
            this.mValidationLogger.e("Client has already been destroyed - no calls possible", "track");
            return false;
        }
        Event event = new Event();
        event.eventTypeId = str3;
        event.trafficTypeName = str2;
        event.key = str;
        event.value = d;
        event.timestamp = System.currentTimeMillis();
        event.properties = map;
        setTranslucentForCoordinatorLayout validate = this.mEventValidator.validate(event, eventAlreadyTriggered);
        if (validate != null) {
            if (validate.isError()) {
                this.mValidationLogger.e(validate, "track");
                return false;
            }
            this.mValidationLogger.w(validate, "track");
            event.trafficTypeName = event.trafficTypeName.toLowerCase();
        }
        getSafeTokenComp process = this.mEventPropertiesProcessor.process(event.properties);
        if (!process.isValid()) {
            return false;
        }
        event.properties = process.getProperties();
        event.setSizeInBytes(process.getSizeInBytes() + 1024);
        this.mSyncManager.pushEvent(event);
        return true;
    }
}
