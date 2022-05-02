package o;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import dagger.Component;
import id.dana.AppLifeCycleObserver;
import id.dana.DanaApplication;
import id.dana.base.BaseActivity;
import id.dana.data.di.ApiModule;
import id.dana.data.di.DataModule;
import id.dana.data.di.NetworkModule;
import id.dana.data.risk.riskevent.SendRiskEventReceiver;
import id.dana.di.modules.ApplicationModule;
import id.dana.di.modules.CoroutinesModule;
import id.dana.di.modules.GlobalNetworkProxyModule;
import id.dana.di.modules.MerchantReviewModule;
import id.dana.di.modules.SplitModule;
import id.dana.di.workerfactory.WorkerBindingModule;
import id.dana.domain.nearbyme.DefaultDispatcher;
import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.nearbyme.MainDispatcher;
import id.dana.initializer.FirebaseCrashlyticsInitializer;
import id.dana.nearbyme.merchantreview.CreateReviewWorker;
import id.dana.nearbyme.merchantreview.UploadImageWorker;
import id.dana.social.di.module.SocialCommonModule;
import id.dana.social.di.module.SocialWidgetModule;
import id.dana.social.utils.FullSyncContactWorker;
import id.dana.social.utils.PartialSyncContactWorker;
import id.dana.social.workmanager.SaveContactFullSyncWorker;
import id.dana.social.workmanager.SaveContactPartialSyncWorker;
import javax.inject.Singleton;
import o.APExpansion;
import o.AppPreDownloadCacheManager;
import o.GriverAMCSAppUpdater;
import o.GriverAppXInterceptor;
import o.GriverBottomPopupDialog;
import o.GriverExecutors;
import o.GriverSecurity;
import o.GriverWebviewSetting;
import o.OpenAPIBridgeExtension;
import o.RenderLoadingStatusChangePoint;
import o.ScanJob;

public final class PrepareException {
    public static PrepareException getMin;
    public final AnonymousClass1 setMax;

    @Singleton
    @Component(modules = {ApplicationModule.class, NetworkModule.class, ApiModule.class, DataModule.class, WorkerBindingModule.class, CoroutinesModule.class, MerchantReviewModule.class, GlobalNetworkProxyModule.class, SplitModule.class})
    /* renamed from: o.PrepareException$1  reason: invalid class name */
    public interface AnonymousClass1 {
        GriverPrepareInterceptor FastBitmap$CoordinateSystem();

        getCommonResources Grayscale$Algorithm();

        doUpdateVisitedHistory ICustomTabsCallback();

        GriverSwtich ICustomTabsCallback$Default();

        applyChanges ICustomTabsCallback$Stub();

        getCharsetName ICustomTabsCallback$Stub$Proxy();

        GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService();

        SendRiskEventReceiver ICustomTabsService$Default();

        setSupportZoom ICustomTabsService$Stub();

        getAppPerfKey ICustomTabsService$Stub$Proxy();

        getResponseString IMediaControllerCallback();

        toStringBuilder IMediaControllerCallback$Stub();

        GriverKVStorage IMediaControllerCallback$Stub$Proxy();

        PageFinishedPoint IMediaSession();

        GriverResourceManager INotificationSideChannel();

        GriverExecutors.H5SingleThreadFactory.AnonymousClass1 INotificationSideChannel$Default();

        DefaultEmbedViewManager INotificationSideChannel$Stub();

        OpenAPIBridgeExtension.AnonymousClass1.C00041 INotificationSideChannel$Stub$Proxy();

        AndroidModel IPostMessageService();

        GriverHttpRequestAPIExtension IPostMessageService$Default();

        setMediaPlaybackRequiresUserGesture IPostMessageService$Stub();

        AppLifeCycleObserver IPostMessageService$Stub$Proxy();

        dynamicProxy ITrustedWebActivityCallback();

        getShortName ITrustedWebActivityCallback$Default();

        CycledLeScannerForLollipop ITrustedWebActivityCallback$Stub();

        GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy();

        isRooted ITrustedWebActivityService();

        getScanJobRuntimeMillis ITrustedWebActivityService$Default();

        ScanJob.AnonymousClass1 ITrustedWebActivityService$Stub();

        onDisconnectAllDevices ITrustedWebActivityService$Stub$Proxy();

        getRequestedModel IconCompatParcelizer();

        setFireMoment IsOverlapping();

        GriverLogger Mean$Arithmetic();

        getFacade MediaBrowserCompat$CustomActionResultReceiver();

        MetaDataUtils MediaBrowserCompat$ItemReceiver();

        setModel MediaBrowserCompat$MediaItem();

        onDownloadResult MediaBrowserCompat$MediaItem$Flags();

        shouldBeKeptAsChild MediaBrowserCompat$SearchResultReceiver();

        GriverSplashFragmentExtension MediaDescriptionCompat();

        getBuiltInZoomControls MediaMetadataCompat();

        isShown MediaMetadataCompat$BitmapKey();

        onWebViewDestory MediaMetadataCompat$LongKey();

        NetworkUtils MediaMetadataCompat$RatingKey();

        success MediaMetadataCompat$TextKey();

        GriverFileAbilityImpl RatingCompat();

        APWebViewPerformance RatingCompat$StarStyle();

        GriverSecurityManager RatingCompat$Style();

        onDisconnect RemoteActionCompatParcelizer();

        setStorageProxy areNotificationsEnabled();

        getSansSerifFontFamily asBinder();

        onNotifyCharacteristicValue asInterface();

        GriverAppXInterceptor.AnonymousClass1 b();

        setEnvironment cancel();

        onBluetoothDescriptorWrite cancelAll();

        getMediaPlaybackRequiresUserGesture cancelNotification();

        getByteCount create();

        @IoDispatcher
        APExpansion.AnonymousClass1 equals();

        toDigit extraCallback();

        containsRelativeParentPath extraCallbackWithResult();

        clearDetections extraCommand();

        H5Utils getActiveNotifications();

        toolbarMenuClicked getCause();

        GriverWebviewSetting.AnonymousClass1 getDefaultImpl();

        ReleaseWebViewPoint getFlags();

        confirm getInterfaceDescriptor();

        AppPreDownloadCacheManager.AnonymousClass1 getLaunchPendingIntent();

        Context getMax();

        void getMax(DanaApplication danaApplication);

        void getMax(BaseActivity baseActivity);

        GriverEnv getMetadata();

        AUTextSizeGearGetter getMin(SocialWidgetModule socialWidgetModule);

        getScheme getMin();

        void getMin(CreateReviewWorker createReviewWorker);

        void getMin(SaveContactPartialSyncWorker saveContactPartialSyncWorker);

        isShortUuid getPackageName();

        workerType getSmallIconBitmap();

        setDistinctPacketsDetectedPerScan getSmallIconId();

        localIdToUrl getTag();

        downloadPath getVolumeAttributes();

        enableBackButton invoke();

        GriverBaseManifest invokeSuspend();

        @MainDispatcher
        APExpansion.AnonymousClass1 isInside();

        getBeaconSimulator isTransportControlEnabled();

        AUPopSupportPreemption length(SocialCommonModule socialCommonModule);

        appxLoadFailed length();

        void length(FirebaseCrashlyticsInitializer firebaseCrashlyticsInitializer);

        void length(UploadImageWorker uploadImageWorker);

        void length(FullSyncContactWorker fullSyncContactWorker);

        isPacketDistinct mayLaunchUrl();

        UCExist newSession();

        AbstractPriorityRunnable newSessionWithExtras();

        getAcquirerId notifyNotificationWithChannel();

        getBluetoothName onCaptioningEnabledChanged();

        GriverWebViewUtils onEvent();

        getCursiveFontFamily onExtraCallback();

        isAlipayApp onExtrasChanged();

        disconnectBluetoothDevice onMessageChannelReady();

        getBackgroundFlag onMetadataChanged();

        fromInt onNavigationEvent();

        queryLastRefreshTimestamp onPlaybackStateChanged();

        resetBugMeSettings onPostMessage();

        getResponseCode onQueueChanged();

        GriverSecurity.AnonymousClass1 onQueueTitleChanged();

        getMD5Byte onRelationshipValidationResult();

        UpdateAppCallback onRepeatModeChanged();

        AUAttrsConstant onSessionDestroyed();

        isExtraBeaconData onSessionReady();

        onJsConfirm onShuffleModeChanged();

        GriverRVMonitorImpl onShuffleModeChangedRemoved();

        getPerformanceTracker onTransact();

        onGeolocationPermissionsHidePrompt onVolumeInfoChanged();

        isDynamicDelivery postMessage();

        shouldApplyPermission read();

        setMfgReserved receiveFile();

        onDescriptorRead registerCallbackListener();

        GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel();

        toUuidString requestPostMessageChannelWithExtras();

        setAllowFileAccess sendCommand();

        RenderLoadingStatusChangePoint.LoadingStatusChangeListener sendMediaButton();

        setTimeoutForContext setDefaultImpl();

        Application setMax();

        ContentResolver setMin();

        void setMin(PartialSyncContactWorker partialSyncContactWorker);

        void setMin(SaveContactFullSyncWorker saveContactFullSyncWorker);

        onDescriptorWrite toDoubleRange();

        GriverBaseConstants toFloatRange();

        @DefaultDispatcher
        APExpansion.AnonymousClass1 toIntRange();

        getId3 unregisterCallbackListener();

        setDefaultFontSize updateVisuals();

        onBatchScanResults validateRelationship();

        setDistanceCalculator valueOf();

        requestPermission values();

        getAlwaysShowDiagnosticTool warmup();

        onCharacteristicChanged write();
    }

    public PrepareException(AnonymousClass1 r1) {
        this.setMax = r1;
    }
}
