package o;

import android.content.Context;
import id.dana.contract.globalsearch.GlobalSearchModule;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.contract.inbox.UnreadInboxModule;
import id.dana.contract.ott.OttVerifyModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.permission.PermissionStateModule;
import id.dana.contract.user.GetBalanceModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.GeofenceModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.LogoutModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.home.HomeFragment;
import id.dana.home.NewHomeFragment;
import id.dana.sendmoney.di.module.SendMoneyV2Module;
import o.AppPreDownloadManager;
import o.BLEBridgeExtension;
import o.ChooseFileBridgeExtension;
import o.ChooseImageBridgeExtension;
import o.CommonAbilityManifest;
import o.GriverBaseActivity;
import o.GriverConfig;
import o.GriverInnerAmcsLiteConfig;
import o.GriverInnerConfig;
import o.GriverManifest;
import o.GriverOpenAuthExtension;
import o.GriverResourceLoadExtension;
import o.GriverSecurity;
import o.GriverTransport;
import o.GriverWebviewSetting;
import o.H5Event;
import o.IMultiInstanceInvalidationService;
import o.INebulaPage;
import o.ImageLoader;
import o.LocationBridgeExtension;
import o.NetworkBridgeExtension;
import o.OrientationDetector;
import o.PrepareException;
import o.RenderLoadingStatusChangePoint;
import o.UcService;
import o.VersionedParcelize;
import o.ViewPager2;
import o.b;
import o.completeScroll;
import o.fakeDragBy;
import o.getAlpha;
import o.getSelectedIndex;
import o.inTransaction;
import o.onFailure;
import o.onNext;
import o.parameters;
import o.restoreState;

public final class loadSnapshotFile implements GriverResourceLoadExtension.AnonymousClass1 {
    private b.C0007b<getThemeRes> FastBitmap$CoordinateSystem;
    private b.C0007b<getGriverSectionConfig> Grayscale$Algorithm;
    private b.C0007b<onDisconnect> ICustomTabsCallback;
    private b.C0007b<getIMEI> ICustomTabsCallback$Default;
    private b.C0007b<jetifyAs> ICustomTabsCallback$Stub;
    private b.C0007b<onNext.length> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<onWebViewDestory> ICustomTabsService;
    private b.C0007b<NXH5WebViewClientAdapter> ICustomTabsService$Default;
    private b.C0007b<cannotInitUC> ICustomTabsService$Stub;
    private b.C0007b<getShareUrl> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onDownloadResult> IMediaControllerCallback;
    private b.C0007b<completeScroll.setMax> IMediaControllerCallback$Stub;
    private b.C0007b<createAllTables> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<setToolbarMenus> IMediaSession;
    private b.C0007b<isDynamicDelivery> INotificationSideChannel;
    private b.C0007b<copyBackForwardList> INotificationSideChannel$Default;
    private b.C0007b<setFireMoment> INotificationSideChannel$Stub;
    private b.C0007b<AppPreDownloadManager.AnonymousClass2> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<shouldExit> IPostMessageService;
    private b.C0007b<releaseView> IPostMessageService$Default;
    private b.C0007b<NXH5WebViewAdapter> IPostMessageService$Stub;
    private b.C0007b<getWebViewCoreSoPath> IPostMessageService$Stub$Proxy;
    private b.C0007b<setEventSource> ITrustedWebActivityCallback;
    private b.C0007b<GetAuthCode> ITrustedWebActivityCallback$Default;
    private b.C0007b<enableBackButton> ITrustedWebActivityCallback$Stub;
    private b.C0007b<setH5OverScrollListener> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<enableUCCorePreheadInit> ITrustedWebActivityService;
    private b.C0007b<ViewPager2.SavedState> ITrustedWebActivityService$Default;
    private b.C0007b<GriverWebviewSetting> ITrustedWebActivityService$Stub;
    private b.C0007b<dumpDir> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<refreshAppPreDownloadConfig> IconCompatParcelizer;
    private b.C0007b<readData> IsOverlapping;
    private b.C0007b<GriverBaseConstants> Mean$Arithmetic;
    private b.C0007b<getPerformanceTracker> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<fakeDragBy.length> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<GriverLogger> MediaBrowserCompat$MediaItem;
    private b.C0007b<isInnerApp> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<CustomPopMenuExtension> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<restoreState.getMax> MediaDescriptionCompat;
    private b.C0007b<H5ResourceHandlerUtil> MediaMetadataCompat;
    private b.C0007b<restoreState.length> MediaMetadataCompat$BitmapKey;
    private b.C0007b<toDigit> MediaMetadataCompat$LongKey;
    private b.C0007b<getSelectedIndex.setMax> MediaMetadataCompat$RatingKey;
    private b.C0007b<setPrimaryItem> MediaMetadataCompat$TextKey;
    private b.C0007b<BLETraceMonitor> RatingCompat;
    private b.C0007b<onStopBleScan> RatingCompat$StarStyle;
    private b.C0007b<setOnOptionPickListener> RatingCompat$Style;
    private b.C0007b<AppPreDownloadManager.AnonymousClass1> RemoteActionCompatParcelizer;
    private b.C0007b<ParcelImpl> addQueueItem;
    private b.C0007b<ShouldLoadUrlPoint> addQueueItemAt;
    private b.C0007b<didExitRegion> adjustVolume;
    private b.C0007b<IH5EmbedViewJSCallback> areNotificationsEnabled;
    private b.C0007b<GriverInnerAmcsLiteConfig.AnonymousClass2> asBinder;
    private b.C0007b<GriverWhiteScreenStageMonitor> asInterface;
    private b.C0007b<RequestBridgeExtension> b;
    private b.C0007b<TinyAppFileUtils> cancel;
    private b.C0007b<isLocalPath> cancelAll;
    private b.C0007b<onNext.setMin> cancelNotification;
    private b.C0007b<parseBatteryPercentage> create;
    private b.C0007b<appxLoadFailed> equals;
    private b.C0007b<setDefaultFontSize> extraCallback;
    private b.C0007b<setStorageProxy> extraCallbackWithResult;
    private b.C0007b<isKeepCallback> extraCommand;
    private b.C0007b<BLEServiceUnit> getActiveNotifications;
    private b.C0007b<NetworkBridgeExtension> getCause;
    private b.C0007b<VersionedParcelize.getMax> getDefaultImpl;
    private b.C0007b<onLoadingStatusChanged> getExtras;
    private b.C0007b<ImageLoader.AnonymousClass2> getFlags;
    private b.C0007b<ifContainsEmbedSurfaceView> getInterfaceDescriptor;
    private b.C0007b<unRegisterStatusListener> getLaunchPendingIntent;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<createWebViewForNebulaX> getMetadata;
    private final GeofenceModule getMin;
    private b.C0007b<workerType> getPackageName;
    private b.C0007b<ImageLoader.AnonymousClass1> getPlaybackState;
    private b.C0007b<onImage> getQueue;
    private b.C0007b<getOuterRootPath> getQueueTitle;
    private b.C0007b<addInitSuccessListener> getRatingType;
    private b.C0007b<getAlpha.setMax> getRepeatMode;
    private b.C0007b<downloadPath> getShuffleMode;
    private b.C0007b<GriverWebviewSetting.AnonymousClass1> getSmallIconBitmap;
    private b.C0007b<ViewPager2.OffscreenPageLimit.setMin> getSmallIconId;
    private b.C0007b<appendAll> getTag;
    private b.C0007b<toUuidString> getVolumeAttributes;
    private b.C0007b<getCommonResources> hashCode;
    private b.C0007b<OrientationDetector.OrientationListener> invoke;
    private b.C0007b<Context> invokeSuspend;
    private b.C0007b<removeInitSuccessListener> isCaptioningEnabled;
    private b.C0007b<getScheme> isInside;
    private b.C0007b<evaluateJavascript> isShuffleModeEnabledRemoved;
    private b.C0007b<GriverOpenAuthExtension.RevokeCallback> isTransportControlEnabled;
    private b.C0007b<parameters.getMin> length;
    private b.C0007b<getEmbededViewProvider> mayLaunchUrl;
    private b.C0007b<H5ServiceWorkerControllerProvider> newSession;
    private b.C0007b<keepCallback> newSessionWithExtras;
    private b.C0007b<fakeDragBy.getMin> notify;
    private b.C0007b<sendServiceWorkerPushMessage> notifyNotificationWithChannel;
    private b.C0007b<GriverMonitor> onCaptioningEnabledChanged;
    private b.C0007b<getSelectedIndex.length> onEvent;
    private b.C0007b<getRedirectUrl> onExtraCallback;
    private b.C0007b<BLEBridgeExtension.AnonymousClass6> onExtrasChanged;
    private b.C0007b<GriverSecurity.AnonymousClass1> onMessageChannelReady;
    private b.C0007b<removeJavascriptInterface> onMetadataChanged;
    private b.C0007b<GriverInnerConfig.AnonymousClass1> onNavigationEvent;
    private b.C0007b<flingScroll> onPlaybackStateChanged;
    private b.C0007b<onCharacteristicWriteCompleted> onPostMessage;
    private b.C0007b<getInvokeType> onQueueChanged;
    private b.C0007b<sendToWeb> onQueueTitleChanged;
    private b.C0007b<onConnect> onRelationshipValidationResult;
    private b.C0007b<success> onRepeatModeChanged;
    private b.C0007b<clearSslPreferences> onSessionDestroyed;
    private b.C0007b<inTransaction.getMax> onSessionReady;
    private b.C0007b<containsRelativeParentPath> onShuffleModeChanged;
    private b.C0007b<BLEBridgeExtension.TaskHandler.setMax> onShuffleModeChangedRemoved;
    private b.C0007b<fetchAppList> onTransact;
    private b.C0007b<inTransaction.getMin> onVolumeInfoChanged;
    private b.C0007b<getInternalContentView> postMessage;
    private b.C0007b<getAlpha.length> prepareFromUri;
    private b.C0007b<pageLeft> read;
    private b.C0007b<hasPageStartButNoInterceptRequest> receiveFile;
    private b.C0007b<resetTouch> registerCallbackListener;
    private b.C0007b<GriverRVTransortServiceImpl> removeQueueItem;
    private b.C0007b<H5Event.Builder> requestPostMessageChannel;
    private b.C0007b<INebulaPage.H5PageHandler> requestPostMessageChannelWithExtras;
    private b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> sendCommand;
    private b.C0007b<getSecurityExtraData> sendMediaButton;
    private b.C0007b<ifContainsEmbedView> setDefaultImpl;
    private final PermissionStateModule setMax;
    private final SendMoneyV2Module setMin;
    private b.C0007b<shouldLoad> setVolumeTo;
    private b.C0007b<parameters.setMax> toDoubleRange;
    private b.C0007b<onDescriptorWrite> toFloatRange;
    private b.C0007b<getBluetoothServices> toIntRange;
    private b.C0007b<GVViewFactory> toString;
    private b.C0007b<GriverAccount> unregisterCallbackListener;
    private b.C0007b<isCanceled> updateVisuals;
    private b.C0007b<isDispatcherOnWorkerThread> validateRelationship;
    private b.C0007b<VersionedParcelize.setMin> valueOf;
    private b.C0007b<interceptH5OptionMenuClick> values;
    private b.C0007b<H5DataProvider> warmup;
    private b.C0007b<downloadGriverInitApp> write;

    /* synthetic */ loadSnapshotFile(GetBalanceModule getBalanceModule, UnreadInboxModule unreadInboxModule, PermissionStateModule permissionStateModule, QueryPayMethodModule queryPayMethodModule, HomeInfoModule homeInfoModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, GeofenceModule geofenceModule, GlobalNetworkModule globalNetworkModule, LogoutModule logoutModule, OttVerifyModule ottVerifyModule, GlobalSearchModule globalSearchModule, SendMoneyV2Module sendMoneyV2Module, PrepareException.AnonymousClass1 r13, byte b2) {
        this(getBalanceModule, unreadInboxModule, permissionStateModule, queryPayMethodModule, homeInfoModule, bottomSheetOnBoardingModule, geofenceModule, globalNetworkModule, logoutModule, ottVerifyModule, globalSearchModule, sendMoneyV2Module, r13);
    }

    private loadSnapshotFile(GetBalanceModule getBalanceModule, UnreadInboxModule unreadInboxModule, PermissionStateModule permissionStateModule, QueryPayMethodModule queryPayMethodModule, HomeInfoModule homeInfoModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, GeofenceModule geofenceModule, GlobalNetworkModule globalNetworkModule, LogoutModule logoutModule, OttVerifyModule ottVerifyModule, GlobalSearchModule globalSearchModule, SendMoneyV2Module sendMoneyV2Module, PrepareException.AnonymousClass1 r48) {
        PrepareException.AnonymousClass1 r1 = r48;
        this.getMax = r1;
        this.setMax = permissionStateModule;
        this.setMin = sendMoneyV2Module;
        this.getMin = geofenceModule;
        this.length = isScrap.getMin(onPostShow.setMax(getBalanceModule));
        this.equals = new onNavigationEvent(r1);
        this.isInside = new invoke(r1);
        onMessageChannelReady onmessagechannelready = new onMessageChannelReady(r1);
        this.toFloatRange = onmessagechannelready;
        this.toIntRange = getBluetoothCharacteristics.create(this.equals, this.isInside, onmessagechannelready);
        this.IsOverlapping = access$1202.create(this.equals, this.isInside, this.toFloatRange);
        getMax getmax = new getMax(r1);
        this.hashCode = getmax;
        this.toString = GriverAppExtension.create(this.equals, this.isInside, getmax);
        this.values = toolbarMenusUpdated.create(this.equals, this.isInside, this.hashCode);
        b.C0007b<getThemeRes> min = isScrap.getMin(onPreShow.length(this.length, this.toIntRange, this.IsOverlapping, setAllBucketName.setMax(), this.toString, this.values));
        this.FastBitmap$CoordinateSystem = min;
        this.toDoubleRange = isScrap.getMin(returnType.setMax(getBalanceModule, min));
        this.valueOf = isScrap.getMin(ignoreParcelables.setMin(homeInfoModule));
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.Mean$Arithmetic = isOverlapping;
        this.Grayscale$Algorithm = GriverConfig.AnonymousClass1.create(this.equals, this.isInside, isOverlapping);
        length length2 = new length(r1);
        this.invokeSuspend = length2;
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(length2);
        this.invoke = max;
        this.create = getSystemInfo.setMax(max);
        this.getCause = monitorException.getMax(IMultiInstanceInvalidationService.Stub.Proxy.getMax(), setAllBucketName.setMax(), this.create);
        this.onNavigationEvent = GriverRVConfigServiceImpl.create(this.equals, this.isInside, this.Mean$Arithmetic);
        this.b = NetworkBridgeExtension.AnonymousClass1.setMin(this.getCause, getTinyLocalStorage.getMin(), readBLECharacteristicValue.getMax(), NetworkBridgeExtension.AnonymousClass2.getMin());
        onPostMessage onpostmessage = new onPostMessage(r1);
        this.ICustomTabsCallback = onpostmessage;
        this.onPostMessage = onStartBleScan.create(this.equals, this.isInside, onpostmessage);
        this.onRelationshipValidationResult = onGetBluetoothCharacteristics.create(this.equals, this.isInside, this.ICustomTabsCallback);
        this.onMessageChannelReady = new loadSnapshotFile$Mean$Arithmetic(r1);
        this.extraCallbackWithResult = new toDoubleRange(r1);
        toIntRange tointrange = new toIntRange(r1);
        this.extraCallback = tointrange;
        this.ICustomTabsCallback$Default = DeviceUtils.create(this.onMessageChannelReady, this.extraCallbackWithResult, tointrange);
        this.onTransact = getUrlCodec.setMin(getShareShortUrl.getMax(), GriverBaseActivity.Lite1.setMin());
        create create2 = new create(r1);
        this.asInterface = create2;
        setApplication create3 = setApplication.create(this.equals, this.isInside, create2);
        this.asBinder = create3;
        b.C0007b<jetifyAs> min2 = isScrap.getMin(instantiateItem.length(this.valueOf, this.Grayscale$Algorithm, this.getCause, this.onNavigationEvent, this.b, this.onPostMessage, this.onRelationshipValidationResult, this.ICustomTabsCallback$Default, this.onTransact, create3));
        this.ICustomTabsCallback$Stub = min2;
        this.getDefaultImpl = isScrap.getMin(allowSerialization.setMin(homeInfoModule, min2));
        this.ICustomTabsCallback$Stub$Proxy = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
        toFloatRange tofloatrange = new toFloatRange(r1);
        this.ICustomTabsService = tofloatrange;
        this.setDefaultImpl = INebulaPage.create(this.equals, this.isInside, tofloatrange);
        this.getInterfaceDescriptor = onReceiveValue.create(this.equals, this.isInside, this.ICustomTabsService);
        this.extraCommand = eventSource.create(this.equals, this.isInside, this.ICustomTabsService, this.toFloatRange);
        this.warmup = has.create(this.equals, this.isInside, this.ICustomTabsService);
        this.mayLaunchUrl = scriptbizLoadedAndBridgeLoaded.create(this.equals, this.isInside, this.ICustomTabsService);
        this.newSession = H5ScrollChangedCallback.create(this.equals, this.isInside, this.ICustomTabsService);
        this.newSessionWithExtras = H5Event.AnonymousClass1.create(this.ICustomTabsService);
        this.requestPostMessageChannel = H5OverScrollListener.create(this.equals, this.isInside, this.ICustomTabsService);
        this.validateRelationship = getH5page.create(this.equals, this.isInside, this.ICustomTabsService);
        this.updateVisuals = setTarget.create(this.ICustomTabsService);
        this.requestPostMessageChannelWithExtras = setHandler.create(this.equals, this.isInside, this.ICustomTabsService);
        this.postMessage = getWebChromeClient.create(this.equals, this.isInside, this.ICustomTabsService);
        this.IPostMessageService = setContainsEmbedSurfaceView.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ICustomTabsService$Default = getWebViewClient.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ICustomTabsService$Stub$Proxy = getUcVersion.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ICustomTabsService$Stub = getUCSdkVersion.create(this.equals, this.isInside, this.ICustomTabsService);
        this.receiveFile = createWebView.create(this.equals, this.isInside, this.ICustomTabsService);
        this.IPostMessageService$Default = H5Event.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ITrustedWebActivityCallback = getEventSource.create(this.ICustomTabsService);
        this.onExtraCallback = NXUcService.create(this.equals, this.isInside, this.ICustomTabsService);
        this.IPostMessageService$Stub$Proxy = getUCCoreDownloadUrl.create(this.equals, this.isInside, this.ICustomTabsService);
        this.IPostMessageService$Stub = NXH5PageAdapter.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ITrustedWebActivityService = setContainsEmbedView.create(this.equals, this.isInside, this.ICustomTabsService);
        this.ITrustedWebActivityCallback$Stub$Proxy = getWebViewIndex.create(this.equals, this.isInside, this.ICustomTabsService);
        this.areNotificationsEnabled = getSpecialRestoreView.create(this.equals, this.isInside, this.ICustomTabsService);
        setMin setmin = new setMin(r1);
        this.ITrustedWebActivityCallback$Stub = setmin;
        this.ITrustedWebActivityCallback$Default = setOptionMenu.create(setmin);
        this.notifyNotificationWithChannel = H5ServiceWorkerHook4Bridge.create(this.equals, this.isInside, this.ICustomTabsService);
        b.C0007b<BLEServiceUnit> min3 = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.ICustomTabsCallback$Stub$Proxy, this.setDefaultImpl, this.getInterfaceDescriptor, this.extraCommand, this.warmup, this.mayLaunchUrl, this.newSession, this.newSessionWithExtras, LocationBridgeExtension.AnonymousClass4.setMax(), this.requestPostMessageChannel, this.invokeSuspend, this.validateRelationship, this.updateVisuals, this.requestPostMessageChannelWithExtras, this.postMessage, this.IPostMessageService, this.ICustomTabsService$Default, this.ICustomTabsService$Stub$Proxy, this.ICustomTabsService$Stub, this.receiveFile, this.IPostMessageService$Default, this.ITrustedWebActivityCallback, this.onExtraCallback, this.IPostMessageService$Stub$Proxy, this.IPostMessageService$Stub, this.ITrustedWebActivityService, this.ITrustedWebActivityCallback$Stub$Proxy, this.areNotificationsEnabled, this.ITrustedWebActivityCallback$Default, this.notifyNotificationWithChannel));
        this.getActiveNotifications = min3;
        this.cancelNotification = isScrap.getMin(SerialContext.length(globalNetworkModule, min3));
        this.getSmallIconId = ViewPager2.ScrollState.getMin(permissionStateModule);
        invokeSuspend invokesuspend = new invokeSuspend(r1);
        this.getSmallIconBitmap = invokesuspend;
        this.ITrustedWebActivityService$Stub$Proxy = getPorts.create(this.equals, this.isInside, invokesuspend);
        WebViewSettingExtension create4 = WebViewSettingExtension.create(this.equals, this.isInside, this.getSmallIconBitmap);
        this.ITrustedWebActivityService$Stub = create4;
        this.ITrustedWebActivityService$Default = isScrap.getMin(ArrayCreatingInputMerger.setMax(this.getSmallIconId, this.ITrustedWebActivityService$Stub$Proxy, create4));
        this.notify = isScrap.getMin(isFakeDragging.getMin(queryPayMethodModule));
        loadSnapshotFile$Grayscale$Algorithm loadsnapshotfile_grayscale_algorithm = new loadSnapshotFile$Grayscale$Algorithm(r1);
        this.INotificationSideChannel = loadsnapshotfile_grayscale_algorithm;
        this.cancel = printCurrentMemory.create(this.equals, this.isInside, loadsnapshotfile_grayscale_algorithm);
        this.cancelAll = checkFileType.create(this.equals, this.isInside, this.INotificationSideChannel, this.hashCode);
        b bVar = new b(r1);
        this.INotificationSideChannel$Stub = bVar;
        this.INotificationSideChannel$Stub$Proxy = downloadPackageWithURLString.create(this.equals, this.isInside, bVar);
        this.INotificationSideChannel$Default = clearHistory.create(this.equals, this.isInside, this.extraCallback);
        this.IconCompatParcelizer = availableAppForAppId.create(this.equals, this.isInside, this.INotificationSideChannel$Stub);
        this.MediaBrowserCompat$CustomActionResultReceiver = new getMin(r1);
        this.RemoteActionCompatParcelizer = AppPreDownloadPackageManager.create(this.INotificationSideChannel$Stub);
        this.write = getAppInfoAvailableReason.create(this.equals, this.isInside, this.INotificationSideChannel$Stub);
        b.C0007b<pageLeft> min4 = isScrap.getMin(getChildRectInPagerCoordinates.setMax(this.notify, this.cancel, this.cancelAll, ChooseFileBridgeExtension.AnonymousClass2.AnonymousClass1.AnonymousClass1.setMax(), this.INotificationSideChannel$Stub$Proxy, this.INotificationSideChannel$Default, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.RemoteActionCompatParcelizer, this.newSession, this.write, this.invokeSuspend));
        this.read = min4;
        this.MediaBrowserCompat$ItemReceiver = isScrap.getMin(endDrag.getMin(queryPayMethodModule, min4));
        hashCode hashcode = new hashCode(r1);
        this.MediaBrowserCompat$MediaItem = hashcode;
        writeDebugMonitor create5 = writeDebugMonitor.create(this.equals, this.isInside, hashcode, this.ICustomTabsService);
        this.MediaBrowserCompat$MediaItem$Flags = create5;
        this.MediaBrowserCompat$SearchResultReceiver = isScrap.getMin(onSwitchToBlueTheme.length(create5, this.MediaBrowserCompat$CustomActionResultReceiver, this.invokeSuspend));
        this.MediaDescriptionCompat = isScrap.getMin(finishUpdate.getMax(unreadInboxModule));
        values values2 = new values(r1);
        this.MediaMetadataCompat$LongKey = values2;
        pathSecurityCheck create6 = pathSecurityCheck.create(this.equals, this.isInside, values2);
        this.MediaMetadataCompat = create6;
        b.C0007b<setPrimaryItem> min5 = isScrap.getMin(unregisterDataSetObserver.getMin(this.MediaDescriptionCompat, create6));
        this.MediaMetadataCompat$TextKey = min5;
        this.MediaMetadataCompat$BitmapKey = isScrap.getMin(isViewFromObject.getMax(unreadInboxModule, min5));
        this.MediaMetadataCompat$RatingKey = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        this.RatingCompat = onDeviceFound.create(this.equals, this.isInside, this.ICustomTabsCallback);
        onDisconnectBLE create7 = onDisconnectBLE.create(this.equals, this.isInside, this.ICustomTabsCallback);
        this.RatingCompat$StarStyle = create7;
        onSelected min6 = onSelected.setMin(this.MediaMetadataCompat$RatingKey, this.RatingCompat, create7);
        this.RatingCompat$Style = min6;
        this.onEvent = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min6));
        equals equals2 = new equals(r1);
        this.IMediaControllerCallback = equals2;
        this.onQueueChanged = useCancel.create(this.equals, this.isInside, equals2);
        this.onQueueTitleChanged = H5CallBack.create(this.equals, this.isInside, this.IMediaControllerCallback);
        this.onPlaybackStateChanged = setHorizontalScrollbarOverlay.create(this.equals, this.isInside, this.extraCallback);
        this.onMetadataChanged = APWebView.create(this.equals, this.isInside, this.IMediaControllerCallback);
        this.onSessionDestroyed = getHitTestResult.create(this.equals, this.isInside, this.IMediaControllerCallback);
        ObjectSerializer max2 = ObjectSerializer.getMax(geofenceModule);
        this.onShuffleModeChangedRemoved = max2;
        this.onExtrasChanged = isScrap.getMin(BLEBridgeExtension.AnonymousClass4.setMin(this.invokeSuspend, this.onQueueChanged, this.onQueueTitleChanged, this.onPlaybackStateChanged, this.onMetadataChanged, this.onSessionDestroyed, max2));
        this.onVolumeInfoChanged = isScrap.getMin(StringCodec.length(logoutModule));
        this.onCaptioningEnabledChanged = getCommonExceptionMap.create(this.equals, this.isInside, this.MediaBrowserCompat$MediaItem, this.ICustomTabsService);
        isInside isinside = new isInside(r1);
        this.onRepeatModeChanged = isinside;
        ToolbarMenuOption create8 = ToolbarMenuOption.create(isinside);
        this.IMediaSession = create8;
        b.C0007b<createAllTables> min7 = isScrap.getMin(dropAllTables.getMin(this.invokeSuspend, this.onVolumeInfoChanged, this.onCaptioningEnabledChanged, this.MediaBrowserCompat$CustomActionResultReceiver, create8));
        this.IMediaControllerCallback$Stub$Proxy = min7;
        this.onSessionReady = isScrap.getMin(getClazz.setMin(logoutModule, min7));
        this.IMediaControllerCallback$Stub = isScrap.getMin(dispatchOnPageSelected.setMin(ottVerifyModule));
        loadSnapshotFile$FastBitmap$CoordinateSystem loadsnapshotfile_fastbitmap_coordinatesystem = new loadSnapshotFile$FastBitmap$CoordinateSystem(r1);
        this.onShuffleModeChanged = loadsnapshotfile_fastbitmap_coordinatesystem;
        this.sendMediaButton = SecurityGuardUtils.create(this.equals, this.isInside, loadsnapshotfile_fastbitmap_coordinatesystem);
        setAlign create9 = setAlign.create(this.equals, this.isInside, this.hashCode);
        this.isTransportControlEnabled = create9;
        this.registerCallbackListener = isScrap.getMin(isGutterDrag.setMin(this.invokeSuspend, this.IMediaControllerCallback$Stub, this.sendMediaButton, create9));
        valueOf valueof = new valueOf(r1);
        this.sendCommand = valueof;
        this.unregisterCallbackListener = ImageLoader.create(valueof);
        this.getLaunchPendingIntent = getRenderLoadStatusCode.create(this.sendCommand);
        this.getFlags = DefaultAccoutExtension.create(this.sendCommand);
        toString tostring = new toString(r1);
        this.getPackageName = tostring;
        this.getTag = pageUrl.create(this.equals, this.isInside, tostring);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r1);
        this.getVolumeAttributes = iCustomTabsCallback;
        this.adjustVolume = didDetermineStateForRegion.create(iCustomTabsCallback);
        this.getMetadata = clearServiceWorkerCacheEnabled.create(this.sendCommand);
        this.getQueue = OutFilePathProxy.create(this.sendCommand);
        this.setVolumeTo = UcService.UCInitListener.create(this.sendCommand);
        this.getPlaybackState = ImageListener.create(this.sendCommand);
        this.getExtras = registerStatusListener.create(this.sendCommand);
        this.getRepeatMode = isScrap.getMin(NonParcelField.length(globalSearchModule));
        this.getRatingType = CommonAbilityManifest.create(this.sendCommand);
        this.getQueueTitle = GriverRVAccountServiceImpl.create(this.sendCommand);
        this.isCaptioningEnabled = CommonAbilityManifest.AnonymousClass1.create(this.sendCommand);
        this.addQueueItemAt = UcService.create(this.sendCommand);
        this.isShuffleModeEnabledRemoved = goForward.create(this.extraCallback, this.getVolumeAttributes, this.sendCommand);
        getCause getcause = new getCause(r1);
        this.getShuffleMode = getcause;
        GriverTransport.AnonymousClass1 create10 = GriverTransport.AnonymousClass1.create(this.equals, this.isInside, getcause);
        this.removeQueueItem = create10;
        b.C0007b<ParcelImpl> min8 = isScrap.getMin(VersionedParcel$ParcelException.length(this.invokeSuspend, this.unregisterCallbackListener, this.getLaunchPendingIntent, this.getFlags, this.getTag, this.adjustVolume, this.getMetadata, this.getQueue, this.setVolumeTo, this.ITrustedWebActivityCallback$Default, this.getPlaybackState, this.getExtras, this.getRepeatMode, this.getRatingType, this.getQueueTitle, this.isCaptioningEnabled, this.addQueueItemAt, this.isShuffleModeEnabledRemoved, create10));
        this.addQueueItem = min8;
        this.prepareFromUri = isScrap.getMin(ParcelField.length(globalSearchModule, min8));
    }

    private onFailure.getMin length() {
        SendMoneyV2Module sendMoneyV2Module = this.setMin;
        setDefaultFontSize updateVisuals2 = this.getMax.updateVisuals();
        if (updateVisuals2 != null) {
            return onResourceReady.getMax(sendMoneyV2Module, new BindBool(new setDataRequestNotifier(updateVisuals2), ChooseImageBridgeExtension.AnonymousClass3.setMax(this.setMin)));
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    private BLEBridgeExtension.AnonymousClass9 setMax() {
        GeofenceModule geofenceModule = this.getMin;
        Context max = this.getMax.getMax();
        if (max != null) {
            return PropertyPreFilter.getMax(geofenceModule, max);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static final class setMax {
        public GeofenceModule IsOverlapping;
        public LogoutModule equals;
        public UnreadInboxModule getMax;
        public GetBalanceModule getMin;
        public PrepareException.AnonymousClass1 hashCode;
        public BottomSheetOnBoardingModule isInside;
        public HomeInfoModule length;
        public QueryPayMethodModule setMax;
        public PermissionStateModule setMin;
        public GlobalSearchModule toDoubleRange;
        public OttVerifyModule toFloatRange;
        public GlobalNetworkModule toIntRange;
        public SendMoneyV2Module toString;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }

        public final GriverResourceLoadExtension.AnonymousClass1 setMax() {
            stopIgnoring.setMin(this.getMin, GetBalanceModule.class);
            stopIgnoring.setMin(this.getMax, UnreadInboxModule.class);
            stopIgnoring.setMin(this.setMin, PermissionStateModule.class);
            stopIgnoring.setMin(this.setMax, QueryPayMethodModule.class);
            stopIgnoring.setMin(this.length, HomeInfoModule.class);
            stopIgnoring.setMin(this.isInside, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(this.IsOverlapping, GeofenceModule.class);
            stopIgnoring.setMin(this.toIntRange, GlobalNetworkModule.class);
            stopIgnoring.setMin(this.equals, LogoutModule.class);
            stopIgnoring.setMin(this.toFloatRange, OttVerifyModule.class);
            stopIgnoring.setMin(this.toDoubleRange, GlobalSearchModule.class);
            stopIgnoring.setMin(this.toString, SendMoneyV2Module.class);
            stopIgnoring.setMin(this.hashCode, PrepareException.AnonymousClass1.class);
            return new loadSnapshotFile(this.getMin, this.getMax, this.setMin, this.setMax, this.length, this.isInside, this.IsOverlapping, this.toIntRange, this.equals, this.toFloatRange, this.toDoubleRange, this.toString, this.hashCode, (byte) 0);
        }
    }

    static class onNavigationEvent implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invoke implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.length.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class onMessageChannelReady implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMin;

        onMessageChannelReady(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.setMin.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<GriverBaseConstants> {
        private final PrepareException.AnonymousClass1 getMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBaseConstants floatRange = this.getMin.toFloatRange();
            if (floatRange != null) {
                return floatRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.length.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class onPostMessage implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMin;

        onPostMessage(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.setMin.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.setMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 getMin;

        create(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.getMin.ITrustedWebActivityCallback$Stub$Proxy();
            if (ITrustedWebActivityCallback$Stub$Proxy != null) {
                return ITrustedWebActivityCallback$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.length.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.getMax.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<GriverWebviewSetting.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWebviewSetting.AnonymousClass1 defaultImpl = this.setMin.getDefaultImpl();
            if (defaultImpl != null) {
                return defaultImpl;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class b implements b.C0007b<setFireMoment> {
        private final PrepareException.AnonymousClass1 length;

        b(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setFireMoment IsOverlapping = this.length.IsOverlapping();
            if (IsOverlapping != null) {
                return IsOverlapping;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.length.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<GriverLogger> {
        private final PrepareException.AnonymousClass1 setMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverLogger Mean$Arithmetic = this.setMax.Mean$Arithmetic();
            if (Mean$Arithmetic != null) {
                return Mean$Arithmetic;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<toDigit> {
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            toDigit extraCallback = this.getMax.extraCallback();
            if (extraCallback != null) {
                return extraCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<onDownloadResult> {
        private final PrepareException.AnonymousClass1 setMin;

        equals(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDownloadResult MediaBrowserCompat$MediaItem$Flags = this.setMin.MediaBrowserCompat$MediaItem$Flags();
            if (MediaBrowserCompat$MediaItem$Flags != null) {
                return MediaBrowserCompat$MediaItem$Flags;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<success> {
        private final PrepareException.AnonymousClass1 setMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            success MediaMetadataCompat$TextKey = this.setMax.MediaMetadataCompat$TextKey();
            if (MediaMetadataCompat$TextKey != null) {
                return MediaMetadataCompat$TextKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> {
        private final PrepareException.AnonymousClass1 length;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            RenderLoadingStatusChangePoint.LoadingStatusChangeListener sendMediaButton = this.length.sendMediaButton();
            if (sendMediaButton != null) {
                return sendMediaButton;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<workerType> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            workerType smallIconBitmap = this.setMin.getSmallIconBitmap();
            if (smallIconBitmap != null) {
                return smallIconBitmap;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class ICustomTabsCallback implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.getMin.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getCause implements b.C0007b<downloadPath> {
        private final PrepareException.AnonymousClass1 setMax;

        getCause(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            downloadPath volumeAttributes = this.setMax.getVolumeAttributes();
            if (volumeAttributes != null) {
                return volumeAttributes;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(HomeFragment homeFragment) {
        getShortName ITrustedWebActivityCallback$Default2 = this.getMax.ITrustedWebActivityCallback$Default();
        if (ITrustedWebActivityCallback$Default2 != null) {
            GriverManifest.AnonymousClass31.getMin(homeFragment, ITrustedWebActivityCallback$Default2);
            GriverManifest.AnonymousClass31.getMax(homeFragment, this.toDoubleRange.get());
            GriverManifest.AnonymousClass31.setMax(homeFragment, this.getDefaultImpl.get());
            GriverManifest.AnonymousClass31.getMin(homeFragment, this.cancelNotification.get());
            isAlipayApp onExtrasChanged2 = this.getMax.onExtrasChanged();
            if (onExtrasChanged2 != null) {
                GriverManifest.AnonymousClass31.setMin(homeFragment, onExtrasChanged2);
                GriverManifest.AnonymousClass31.setMax(homeFragment, CoroutineWorker.setMin(this.setMax, this.ITrustedWebActivityService$Default.get()));
                GriverManifest.AnonymousClass31.setMax(homeFragment, this.MediaBrowserCompat$ItemReceiver.get());
                GriverManifest.AnonymousClass31.getMin(homeFragment, this.MediaBrowserCompat$SearchResultReceiver.get());
                GriverManifest.AnonymousClass31.getMin(homeFragment, this.MediaMetadataCompat$BitmapKey.get());
                GriverManifest.AnonymousClass31.length(homeFragment, this.onEvent.get());
                GriverManifest.AnonymousClass31.setMax(homeFragment, length());
                GriverManifest.AnonymousClass31.length(homeFragment, this.onExtrasChanged.get());
                GriverManifest.AnonymousClass31.getMax(homeFragment, setMax());
                GriverManifest.AnonymousClass31.length(homeFragment, this.onSessionReady.get());
                GriverManifest.AnonymousClass31.setMax(homeFragment, this.registerCallbackListener.get());
                GriverManifest.AnonymousClass31.setMin(homeFragment, this.prepareFromUri.get());
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public final void getMax(NewHomeFragment newHomeFragment) {
        getShortName ITrustedWebActivityCallback$Default2 = this.getMax.ITrustedWebActivityCallback$Default();
        if (ITrustedWebActivityCallback$Default2 != null) {
            GriverManifest.AnonymousClass49.getMax(newHomeFragment, ITrustedWebActivityCallback$Default2);
            GriverManifest.AnonymousClass49.setMin(newHomeFragment, setMax());
            GriverManifest.AnonymousClass49.setMin(newHomeFragment, this.onExtrasChanged.get());
            GriverManifest.AnonymousClass49.getMax(newHomeFragment, this.toDoubleRange.get());
            GriverManifest.AnonymousClass49.setMax(newHomeFragment, this.cancelNotification.get());
            GriverManifest.AnonymousClass49.getMax(newHomeFragment, this.getDefaultImpl.get());
            isAlipayApp onExtrasChanged2 = this.getMax.onExtrasChanged();
            if (onExtrasChanged2 != null) {
                GriverManifest.AnonymousClass49.getMax(newHomeFragment, onExtrasChanged2);
                GriverManifest.AnonymousClass49.setMax(newHomeFragment, this.onSessionReady.get());
                GriverManifest.AnonymousClass49.getMin(newHomeFragment, this.onEvent.get());
                GriverManifest.AnonymousClass49.getMax(newHomeFragment, this.registerCallbackListener.get());
                GriverManifest.AnonymousClass49.setMin(newHomeFragment, CoroutineWorker.setMin(this.setMax, this.ITrustedWebActivityService$Default.get()));
                GriverManifest.AnonymousClass49.getMin(newHomeFragment, length());
                GriverManifest.AnonymousClass49.setMin(newHomeFragment, this.prepareFromUri.get());
                GriverManifest.AnonymousClass49.length(newHomeFragment, this.MediaBrowserCompat$ItemReceiver.get());
                GriverManifest.AnonymousClass49.getMax(newHomeFragment, this.MediaBrowserCompat$SearchResultReceiver.get());
                GriverManifest.AnonymousClass49.length(newHomeFragment, this.MediaMetadataCompat$BitmapKey.get());
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
