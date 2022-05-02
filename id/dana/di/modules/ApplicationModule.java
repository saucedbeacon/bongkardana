package id.dana.di.modules;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.twilio.verify.TwilioVerifyException;
import dagger.Module;
import dagger.Provides;
import id.dana.AppLifeCycleObserver;
import id.dana.data.Network;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.toggle.locationpermission.LocationPermissionObserver;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import javax.annotation.Nullable;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.APWebViewPerformance;
import o.AbstractPriorityRunnable;
import o.AltBeacon;
import o.AndroidModel;
import o.AppMsgReceiver;
import o.AppPreDownloadCacheManager;
import o.AppxNgRuntimeChecker;
import o.BaseRenderBridgeImpl;
import o.ByteArrayPools;
import o.CornerMarkingDataProvider;
import o.CreatePromptParam;
import o.CycledLeScannerForLollipop;
import o.DebugPanelBridgeExtension;
import o.DefaultEmbedViewManager;
import o.DefaultExtensionRegistry;
import o.DefaultNativeBridge;
import o.DistinctPacketDetector;
import o.EmbedViewConstant;
import o.EmbedViewHelper;
import o.Event$1;
import o.GriverAMCSAppUpdater;
import o.GriverAppXInterceptor;
import o.GriverBaseConstants;
import o.GriverBaseManifest;
import o.GriverBottomPopupDialog;
import o.GriverEnv;
import o.GriverExecutors;
import o.GriverFileAbilityImpl;
import o.GriverHttpRequestAPIExtension;
import o.GriverKVStorage;
import o.GriverLogger;
import o.GriverPrepareInterceptor;
import o.GriverRVMonitorImpl;
import o.GriverResourceManager;
import o.GriverSecurity;
import o.GriverSecurityManager;
import o.GriverSplashFragmentExtension;
import o.GriverSwtich;
import o.GriverWebViewUtils;
import o.GriverWebviewSetting;
import o.GriverWhiteScreenStageMonitor;
import o.H5Utils;
import o.IPCParameter;
import o.MetaDataUtils;
import o.NativeCallResultPoint;
import o.NetworkUtils;
import o.NodeInstance;
import o.OneShotRunnable;
import o.OnlineResourceFetcher;
import o.OpenAPIBridgeExtension;
import o.PageContext;
import o.PageEnterPoint;
import o.PageFinishedPoint;
import o.ParamUtils;
import o.PostNotificationPoint;
import o.PrepareController;
import o.RDConstant;
import o.RVFragment;
import o.RVGroupInit;
import o.RVMain;
import o.RVOpenAuthHelper;
import o.RVTabBarImpl;
import o.RecyclerView$Adapter$StateRestorationPolicy;
import o.ReleaseWebViewPoint;
import o.RenderLoadingStatusChangePoint;
import o.ResolveExtensionInvoker;
import o.ResourceInterceptPoint;
import o.ResourcePerceptionRequestPoint;
import o.ResourceReceivedResponsePoint;
import o.ScanJob;
import o.ScanJobScheduler;
import o.SendMtopResponse;
import o.UCExist;
import o.WorkerExceptionPoint;
import o.a;
import o.addDisappearingView;
import o.apiCallIsFull;
import o.applyChanges;
import o.appxLoadFailed;
import o.authority;
import o.bindExtensionManager;
import o.c;
import o.callMode;
import o.cancelAnimation;
import o.changeTabBarStyle;
import o.checkRuntimeVersion;
import o.chooseSize;
import o.clearDetections;
import o.com_alibaba_ariver_app_api_ExtOpt$71$1;
import o.com_alibaba_ariver_app_api_ExtOpt$97$1;
import o.confirm;
import o.contains;
import o.containsAll;
import o.containsRelativeParentPath;
import o.createColorSelector;
import o.createPageContext;
import o.createViewHolder;
import o.disconnectBluetoothDevice;
import o.dispatchAttachedToWindow;
import o.dispatchDetachedFromWindow;
import o.doUpdateVisitedHistory;
import o.downloadPath;
import o.dynamicProxy;
import o.enableBackButton;
import o.endAnimation;
import o.ensureManifestFile;
import o.exitApp;
import o.findCalculatorForModelWithLock;
import o.font;
import o.fromInt;
import o.getAccessController;
import o.getAlwaysShowDiagnosticTool;
import o.getApiLevelList;
import o.getAppKey;
import o.getBackgroundFlag;
import o.getBeaconSimulator;
import o.getBluetoothName;
import o.getBluetoothState;
import o.getBuiltInZoomControls;
import o.getByteCount;
import o.getChannelId;
import o.getCharsetName;
import o.getChildCount;
import o.getCommonResources;
import o.getCursiveFontFamily;
import o.getData;
import o.getDownloadEndTime;
import o.getEngine;
import o.getFacade;
import o.getFrameMarginVertical$core;
import o.getH5AuthParams;
import o.getIPCContextManager;
import o.getId3;
import o.getIpcProxy;
import o.getItemCount;
import o.getMD5Byte;
import o.getMediaPlaybackRequiresUserGesture;
import o.getNodeExtensionMap;
import o.getOpenAuthDialog;
import o.getPageCount;
import o.getPermissionModel;
import o.getPosition;
import o.getQueryScene;
import o.getRemoteDebugUrlForDebug;
import o.getRepeatCount;
import o.getRequestedModel;
import o.getResStream;
import o.getResponseCode;
import o.getResponseString;
import o.getRuntimeVersion;
import o.getSansSerifFontFamily;
import o.getScanJobRuntimeMillis;
import o.getScheme;
import o.getShortName;
import o.getSourceInfoFromStartupParams;
import o.getStartupPerformanceStatistics;
import o.getTypeSting;
import o.getUserAgent;
import o.getWebviewConfigs;
import o.handleMessage;
import o.hasInputException;
import o.ignoreView;
import o.inferTheme;
import o.isAlipayApp;
import o.isAllowRetry;
import o.isDynamicDelivery;
import o.isExtraBeaconData;
import o.isHasPermissionFile;
import o.isItemPrefetchEnabled;
import o.isNIOEnabled;
import o.isPacketDistinct;
import o.isReceivedRemoteReady;
import o.isRemoteCallExtension;
import o.isRooted;
import o.isShortUuid;
import o.isShown;
import o.isWorkerReady;
import o.k;
import o.localIdToUrl;
import o.lock;
import o.loop;
import o.moveView;
import o.needPermissionCheck;
import o.notifyItemInserted;
import o.onAppFinish;
import o.onBatchScanResults;
import o.onBluetoothDescriptorWrite;
import o.onCallBack;
import o.onChanged;
import o.onChannelCreated;
import o.onCharacteristicChanged;
import o.onCreateWindow;
import o.onDescriptorRead;
import o.onDescriptorWrite;
import o.onDisconnect;
import o.onDisconnectAllDevices;
import o.onDownloadResult;
import o.onDrawOver;
import o.onEnteredHiddenState;
import o.onException;
import o.onFailedToRecycleView;
import o.onFormResubmission;
import o.onFragmentCreate;
import o.onGeolocationPermissionsHidePrompt;
import o.onItemRangeChanged;
import o.onItemRangeMoved;
import o.onJsConfirm;
import o.onKeyboardVisible;
import o.onNotifyCharacteristicValue;
import o.onRelease;
import o.onWebViewDestory;
import o.peekChild;
import o.playAnimation;
import o.postOnAnimation;
import o.queryLastRefreshTimestamp;
import o.registerRenderInitListener;
import o.removeAllViews;
import o.removeAndRecycleViewAt;
import o.removeCallbacks;
import o.requestBeaconData;
import o.requestInnerSync;
import o.requestPermission;
import o.resetBugMeSettings;
import o.resolveDrawable;
import o.sendMsgToServerByApp;
import o.sendStartMsg;
import o.setAllowFileAccess;
import o.setAnimation;
import o.setAppModel;
import o.setAppVersion;
import o.setAppxVersionInWorker;
import o.setDefaultFontSize;
import o.setDistanceCalculator;
import o.setDistinctPacketsDetectedPerScan;
import o.setDownloadEndTime;
import o.setEnvironment;
import o.setEventId;
import o.setExtendInfo;
import o.setFireMoment;
import o.setGoBackCallback;
import o.setHttpLinkSubResMimeList;
import o.setIncludeFiles;
import o.setMeasureSpecs;
import o.setMeasuredDimension;
import o.setMediaPlaybackRequiresUserGesture;
import o.setMfgReserved;
import o.setModel;
import o.setStateRestorationPolicy;
import o.setStorageProxy;
import o.setSupportZoom;
import o.setTabListener;
import o.setTargetExtension;
import o.setTemplateVersion;
import o.setTimeoutForContext;
import o.setTitleColor;
import o.setWorkerId;
import o.shouldApplyPermission;
import o.shouldBeKeptAsChild;
import o.shouldReMeasureChild;
import o.success;
import o.toDigit;
import o.toStringBuilder;
import o.toUuidString;
import o.toggleAllChecked;
import o.toolbarMenuClicked;
import o.tryToInjectStartupParamsAndPushWorker;
import o.unregisterAdapterDataObserver;
import o.updateListItems;
import o.uri;
import o.waitForSetup;
import o.workerType;
import o.writeShort;

@Module
public class ApplicationModule {
    private final Application setMax;

    @Singleton
    @Provides
    public AndroidModel getMax(getPermissionModel getpermissionmodel) {
        return getpermissionmodel;
    }

    @Singleton
    @Provides
    public AppMsgReceiver.AnonymousClass2 getMax(handleMessage handlemessage) {
        return handlemessage;
    }

    @Singleton
    @Provides
    public GriverAMCSAppUpdater.AnonymousClass1 getMax(writeShort writeshort) {
        return writeshort;
    }

    @Singleton
    @Provides
    public GriverAppXInterceptor.AnonymousClass1 getMax(onException onexception) {
        return onexception;
    }

    @Singleton
    @Provides
    public GriverBottomPopupDialog.AnonymousClass1 getMax(apiCallIsFull apicallisfull) {
        return apicallisfull;
    }

    @Singleton
    @Provides
    public GriverExecutors.H5SingleThreadFactory.AnonymousClass1 getMax(setTabListener settablistener) {
        return settablistener;
    }

    @Singleton
    @Provides
    public GriverRVMonitorImpl getMax(com_alibaba_ariver_app_api_ExtOpt$71$1 com_alibaba_ariver_app_api_extopt_71_1) {
        return com_alibaba_ariver_app_api_extopt_71_1;
    }

    @Singleton
    @Provides
    public GriverSplashFragmentExtension getMax(font font) {
        return font;
    }

    @Singleton
    @Provides
    public GriverSwtich getMax(Event$1 event$1) {
        return event$1;
    }

    @Singleton
    @Provides
    public GriverWebViewUtils getMax(callMode callmode) {
        return callmode;
    }

    @Singleton
    @Provides
    public H5Utils getMax(isReceivedRemoteReady isreceivedremoteready) {
        return isreceivedremoteready;
    }

    @Singleton
    @Provides
    public OpenAPIBridgeExtension.AnonymousClass1.C00041 getMax(getChannelId getchannelid) {
        return getchannelid;
    }

    @Singleton
    @Provides
    public RenderLoadingStatusChangePoint.LoadingStatusChangeListener getMax(RVFragment rVFragment) {
        return rVFragment;
    }

    @Singleton
    @Provides
    @Named("nearbyExecutor")
    public appxLoadFailed getMax(toggleAllChecked toggleallchecked) {
        return toggleallchecked;
    }

    @Singleton
    @Provides
    public clearDetections getMax(AppxNgRuntimeChecker appxNgRuntimeChecker) {
        return appxNgRuntimeChecker;
    }

    @Singleton
    @Provides
    public confirm getMax(cancelAnimation cancelanimation) {
        return cancelanimation;
    }

    @Singleton
    @Provides
    public containsRelativeParentPath getMax(setAppxVersionInWorker setappxversioninworker) {
        return setappxversioninworker;
    }

    @Singleton
    @Provides
    public downloadPath getMax(com_alibaba_ariver_app_api_ExtOpt$97$1 com_alibaba_ariver_app_api_extopt_97_1) {
        return com_alibaba_ariver_app_api_extopt_97_1;
    }

    @Singleton
    @Provides
    public enableBackButton getMax(createColorSelector createcolorselector) {
        return createcolorselector;
    }

    @Singleton
    @Provides
    public isShortUuid getMax(getDownloadEndTime getdownloadendtime) {
        return getdownloadendtime;
    }

    @Singleton
    @Provides
    public isShown getMax(DefaultNativeBridge.AnonymousClass1 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public onWebViewDestory getMax(onKeyboardVisible onkeyboardvisible) {
        return onkeyboardvisible;
    }

    @Singleton
    @Provides
    public setEnvironment getMax(createPageContext createpagecontext) {
        return createpagecontext;
    }

    @Singleton
    @Provides
    public setModel getMax(RVOpenAuthHelper.a.AnonymousClass1.C00061 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public toDigit getMax(setGoBackCallback setgobackcallback) {
        return setgobackcallback;
    }

    @Singleton
    @Provides
    public toolbarMenuClicked getMax(updateListItems updatelistitems) {
        return updatelistitems;
    }

    @Singleton
    @Provides
    public GriverBaseManifest getMin(loop loop) {
        return loop;
    }

    @Singleton
    @Provides
    public GriverKVStorage getMin(registerRenderInitListener registerrenderinitlistener) {
        return registerrenderinitlistener;
    }

    @Singleton
    @Network
    @Provides
    public ResourceReceivedResponsePoint getMin(ResourceInterceptPoint resourceInterceptPoint) {
        return resourceInterceptPoint;
    }

    @Singleton
    @Provides
    public applyChanges getMin(getRemoteDebugUrlForDebug getremotedebugurlfordebug) {
        return getremotedebugurlfordebug;
    }

    @Singleton
    @Provides
    public disconnectBluetoothDevice getMin(setDownloadEndTime setdownloadendtime) {
        return setdownloadendtime;
    }

    @Singleton
    @Provides
    public fromInt getMin(isNIOEnabled isnioenabled) {
        return isnioenabled;
    }

    @Singleton
    @Provides
    public getBeaconSimulator getMin(OneShotRunnable oneShotRunnable) {
        return oneShotRunnable;
    }

    @Singleton
    @Provides
    public getByteCount getMin(getIPCContextManager getipccontextmanager) {
        return getipccontextmanager;
    }

    @Singleton
    @Provides
    public getFacade getMin(getUserAgent getuseragent) {
        return getuseragent;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Provides
    public getStartupPerformanceStatistics getMin(PostNotificationPoint postNotificationPoint) {
        return postNotificationPoint;
    }

    @Singleton
    @Provides
    public isPacketDistinct getMin(getRuntimeVersion getruntimeversion) {
        return getruntimeversion;
    }

    @Singleton
    @Provides
    public isRooted getMin(setTargetExtension settargetextension) {
        return settargetextension;
    }

    @Singleton
    @Provides
    public localIdToUrl getMin(setEventId seteventid) {
        return seteventid;
    }

    @Singleton
    @Provides
    public onBluetoothDescriptorWrite getMin(OnlineResourceFetcher onlineResourceFetcher) {
        return onlineResourceFetcher;
    }

    @Singleton
    @Provides
    public onDescriptorWrite getMin(hasInputException hasinputexception) {
        return hasinputexception;
    }

    @Singleton
    @Provides
    public onGeolocationPermissionsHidePrompt getMin(setAnimation setanimation) {
        return setanimation;
    }

    @Singleton
    @Provides
    public requestBeaconData getMin(k kVar) {
        return kVar;
    }

    @Singleton
    @Provides
    public resetBugMeSettings getMin(setAppModel setappmodel) {
        return setappmodel;
    }

    @Singleton
    @Provides
    public setAllowFileAccess getMin(ParamUtils paramUtils) {
        return paramUtils;
    }

    @Singleton
    @Provides
    public setDistanceCalculator getMin(lock lock) {
        return lock;
    }

    @Singleton
    @Provides
    public setFireMoment getMin(DefaultExtensionRegistry defaultExtensionRegistry) {
        return defaultExtensionRegistry;
    }

    @Singleton
    @Provides
    public setMediaPlaybackRequiresUserGesture getMin(getData getdata) {
        return getdata;
    }

    @Singleton
    @Provides
    public setTimeoutForContext getMin(ResolveExtensionInvoker resolveExtensionInvoker) {
        return resolveExtensionInvoker;
    }

    @Singleton
    @Provides
    public success getMin(resolveDrawable resolvedrawable) {
        return resolvedrawable;
    }

    @Singleton
    @Provides
    public APWebViewPerformance length(CreatePromptParam.PositiveListener positiveListener) {
        return positiveListener;
    }

    @Singleton
    @Provides
    public AltBeacon.Builder length(onChannelCreated onchannelcreated) {
        return onchannelcreated;
    }

    @Singleton
    @Provides
    public GriverBaseConstants length(setTitleColor settitlecolor) {
        return settitlecolor;
    }

    @Singleton
    @Provides
    public GriverEnv length(sendMsgToServerByApp sendmsgtoserverbyapp) {
        return sendmsgtoserverbyapp;
    }

    @Singleton
    @Provides
    public GriverFileAbilityImpl length(DebugPanelBridgeExtension debugPanelBridgeExtension) {
        return debugPanelBridgeExtension;
    }

    @Singleton
    @Provides
    public GriverSecurity.AnonymousClass1 length(setWorkerId setworkerid) {
        return setworkerid;
    }

    @Singleton
    @Provides
    public GriverWhiteScreenStageMonitor length(isRemoteCallExtension isremotecallextension) {
        return isremotecallextension;
    }

    @Singleton
    @Provides
    public ScanJob.AnonymousClass1 length(getH5AuthParams geth5authparams) {
        return geth5authparams;
    }

    @Singleton
    @Provides
    @Named("friendshipthreadexecutor")
    public appxLoadFailed length(toggleAllChecked toggleallchecked) {
        return toggleallchecked;
    }

    @Singleton
    @Provides
    public getBackgroundFlag length(c.AnonymousClass3 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public getCharsetName length(EmbedViewConstant embedViewConstant) {
        return embedViewConstant;
    }

    @Singleton
    @Provides
    public getId3 length(getTypeSting gettypesting) {
        return gettypesting;
    }

    @Singleton
    @Provides
    public getRequestedModel length(RVGroupInit rVGroupInit) {
        return rVGroupInit;
    }

    @Singleton
    @Provides
    public getResponseCode length(getApiLevelList getapilevellist) {
        return getapilevellist;
    }

    @Singleton
    @Provides
    public getResponseString length(getOpenAuthDialog getopenauthdialog) {
        return getopenauthdialog;
    }

    @Singleton
    @Provides
    public getSansSerifFontFamily length(setIncludeFiles setincludefiles) {
        return setincludefiles;
    }

    @Singleton
    @Provides
    public getScanJobRuntimeMillis length(RDConstant rDConstant) {
        return rDConstant;
    }

    @Singleton
    @Provides
    public getScheme length(onEnteredHiddenState onenteredhiddenstate) {
        return onenteredhiddenstate;
    }

    @Singleton
    @Provides
    public isDynamicDelivery length(getAccessController getaccesscontroller) {
        return getaccesscontroller;
    }

    @Singleton
    @Provides
    public onCharacteristicChanged length(getWebviewConfigs getwebviewconfigs) {
        return getwebviewconfigs;
    }

    @Singleton
    @Provides
    public onDisconnectAllDevices length(setExtendInfo setextendinfo) {
        return setextendinfo;
    }

    @Singleton
    @Provides
    public onDownloadResult length(PageEnterPoint pageEnterPoint) {
        return pageEnterPoint;
    }

    @Singleton
    @Provides
    public onFormResubmission length(requestInnerSync requestinnersync) {
        return requestinnersync;
    }

    @Singleton
    @Provides
    public queryLastRefreshTimestamp length(ByteArrayPools.ByteArray4Pool byteArray4Pool) {
        return byteArray4Pool;
    }

    @Singleton
    @Provides
    public requestPermission length(contains contains) {
        return contains;
    }

    @Singleton
    @Provides
    public setDefaultFontSize length(exitApp exitapp) {
        return exitapp;
    }

    @Singleton
    @Provides
    public setDistinctPacketsDetectedPerScan length(setAppVersion setappversion) {
        return setappversion;
    }

    @Singleton
    @Provides
    public setSupportZoom length(peekChild peekchild) {
        return peekchild;
    }

    @Singleton
    @Provides
    public shouldApplyPermission length(changeTabBarStyle changetabbarstyle) {
        return changetabbarstyle;
    }

    @Singleton
    @Provides
    public shouldBeKeptAsChild length(inferTheme infertheme) {
        return infertheme;
    }

    @Singleton
    @Provides
    public CycledLeScannerForLollipop setMax(onAppFinish onappfinish) {
        return onappfinish;
    }

    @Singleton
    @Provides
    public GriverPrepareInterceptor setMax(getNodeExtensionMap getnodeextensionmap) {
        return getnodeextensionmap;
    }

    @Singleton
    @Provides
    public GriverSecurityManager setMax(isWorkerReady isworkerready) {
        return isworkerready;
    }

    @Singleton
    @Provides
    public GriverWebviewSetting.AnonymousClass1 setMax(RVMain.AnonymousClass3 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public NetworkUtils setMax(BaseRenderBridgeImpl baseRenderBridgeImpl) {
        return baseRenderBridgeImpl;
    }

    @Singleton
    @Provides
    public PageFinishedPoint setMax(playAnimation playanimation) {
        return playanimation;
    }

    @Singleton
    @Provides
    public ReleaseWebViewPoint setMax(getRepeatCount getrepeatcount) {
        return getrepeatcount;
    }

    @Singleton
    @Provides
    public appxLoadFailed setMax(toggleAllChecked toggleallchecked) {
        return toggleallchecked;
    }

    @Singleton
    @Provides
    public doUpdateVisitedHistory setMax(SendMtopResponse sendMtopResponse) {
        return sendMtopResponse;
    }

    @Singleton
    @Provides
    public dynamicProxy setMax(onFragmentCreate onfragmentcreate) {
        return onfragmentcreate;
    }

    @Singleton
    @Provides
    public getBluetoothState setMax(PrepareController.Status status) {
        return status;
    }

    @Singleton
    @Provides
    public getCommonResources setMax(AccountEntityRepository accountEntityRepository) {
        return accountEntityRepository;
    }

    @Singleton
    @Provides
    public getCursiveFontFamily setMax(AppMsgReceiver appMsgReceiver) {
        return appMsgReceiver;
    }

    @Singleton
    @Provides
    public onCreateWindow setMax(bindExtensionManager bindextensionmanager) {
        return bindextensionmanager;
    }

    @Singleton
    @Provides
    public onDescriptorRead setMax(ResourcePerceptionRequestPoint resourcePerceptionRequestPoint) {
        return resourcePerceptionRequestPoint;
    }

    @Singleton
    @Provides
    public onDisconnect setMax(setHttpLinkSubResMimeList sethttplinksubresmimelist) {
        return sethttplinksubresmimelist;
    }

    @Singleton
    @Provides
    public onJsConfirm setMax(NodeInstance nodeInstance) {
        return nodeInstance;
    }

    @Singleton
    @Provides
    public setMfgReserved setMax(containsAll containsall) {
        return containsall;
    }

    @Singleton
    @Provides
    public setStorageProxy setMax(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker) {
        return trytoinjectstartupparamsandpushworker;
    }

    @Singleton
    @Provides
    public toStringBuilder setMax(getResStream getresstream) {
        return getresstream;
    }

    @Singleton
    @Provides
    public AbstractPriorityRunnable setMin(RVTabBarImpl.AnonymousClass4 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public AppPreDownloadCacheManager.AnonymousClass1 setMin(authority authority) {
        return authority;
    }

    @Singleton
    @Provides
    public GriverLogger setMin(EmbedViewHelper embedViewHelper) {
        return embedViewHelper;
    }

    @Singleton
    @Provides
    public GriverResourceManager setMin(getIpcProxy getipcproxy) {
        return getipcproxy;
    }

    @Singleton
    @Provides
    public MetaDataUtils setMin(NativeCallResultPoint nativeCallResultPoint) {
        return nativeCallResultPoint;
    }

    @Singleton
    @Provides
    public UCExist setMin(ensureManifestFile ensuremanifestfile) {
        return ensuremanifestfile;
    }

    @Singleton
    @Provides
    public getAlwaysShowDiagnosticTool setMin(RVTabBarImpl rVTabBarImpl) {
        return rVTabBarImpl;
    }

    @Singleton
    @Provides
    public getBluetoothName setMin(isAllowRetry isallowretry) {
        return isallowretry;
    }

    @Singleton
    @Provides
    public getBuiltInZoomControls setMin(PageContext pageContext) {
        return pageContext;
    }

    @Singleton
    @Provides
    public getMD5Byte setMin(uri uri) {
        return uri;
    }

    @Singleton
    @Provides
    public getMediaPlaybackRequiresUserGesture setMin(waitForSetup waitforsetup) {
        return waitforsetup;
    }

    @Singleton
    @Provides
    public getSourceInfoFromStartupParams setMin(WorkerExceptionPoint workerExceptionPoint) {
        return workerExceptionPoint;
    }

    @Singleton
    @Provides
    public isExtraBeaconData setMin(getAppKey getappkey) {
        return getappkey;
    }

    @Singleton
    @Provides
    public onBatchScanResults setMin(checkRuntimeVersion checkruntimeversion) {
        return checkruntimeversion;
    }

    @Singleton
    @Provides
    public onNotifyCharacteristicValue setMin(setTemplateVersion settemplateversion) {
        return settemplateversion;
    }

    @Singleton
    @Provides
    public toUuidString setMin(IPCParameter.AnonymousClass1 r1) {
        return r1;
    }

    @Singleton
    @Provides
    public workerType setMin(needPermissionCheck needpermissioncheck) {
        return needpermissioncheck;
    }

    public ApplicationModule(Application application) {
        this.setMax = application;
    }

    @Singleton
    @Provides
    public Context getMax() {
        return this.setMax;
    }

    @Singleton
    @Provides
    public Application setMin() {
        return this.setMax;
    }

    @Singleton
    @Provides
    public ContentResolver setMax(Application application) {
        return application.getContentResolver();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Provides
    public PackageManager setMin(Context context) {
        return context.getPackageManager();
    }

    @Singleton
    @Nullable
    @Provides
    public RecyclerView$Adapter$StateRestorationPolicy getMax(Context context) {
        if (!CornerMarkingDataProvider.IsOverlapping()) {
            return null;
        }
        try {
            RecyclerView$Adapter$StateRestorationPolicy.setMin setmin = new RecyclerView$Adapter$StateRestorationPolicy.setMin(context);
            postOnAnimation.setMin setmin2 = new postOnAnimation.setMin();
            Context context2 = setmin.toIntRange;
            Intrinsics.checkParameterIsNotNull(context2, HummerConstants.CONTEXT);
            setmin2.setMax = context2;
            postOnAnimation.setMin setmin3 = setmin2;
            shouldReMeasureChild shouldremeasurechild = setmin.setMin;
            Intrinsics.checkParameterIsNotNull(shouldremeasurechild, "networkProvider");
            setmin3.length = shouldremeasurechild;
            postOnAnimation.setMin setmin4 = setmin3;
            onDrawOver ondrawover = setmin.getMax;
            Intrinsics.checkParameterIsNotNull(ondrawover, "keyStorage");
            setmin4.getMax = ondrawover;
            postOnAnimation.setMin setmin5 = setmin4;
            String str = setmin.getMin;
            Intrinsics.checkParameterIsNotNull(str, "url");
            setmin5.getMin = str;
            postOnAnimation.setMin setmin6 = setmin5;
            ignoreView ignoreview = setmin.setMax;
            Intrinsics.checkParameterIsNotNull(ignoreview, "authentication");
            setmin6.setMin = ignoreview;
            postOnAnimation.setMin setmin7 = setmin6;
            if (setmin7.setMax == null) {
                throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for context"), TwilioVerifyException.ErrorCode.InitializationError);
            } else if (setmin7.length == null) {
                throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for network provider"), TwilioVerifyException.ErrorCode.InitializationError);
            } else if (setmin7.getMax == null) {
                throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for key storage"), TwilioVerifyException.ErrorCode.InitializationError);
            } else if (setmin7.getMin == null) {
                throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for base url"), TwilioVerifyException.ErrorCode.InitializationError);
            } else if (setmin7.setMin != null) {
                StringBuilder sb = new StringBuilder();
                Context context3 = setmin7.setMax;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                }
                sb.append(context3.getPackageName());
                sb.append(".verify");
                String obj = sb.toString();
                shouldReMeasureChild shouldremeasurechild2 = setmin7.length;
                if (shouldremeasurechild2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("networking");
                }
                String str2 = "Illegal value for context";
                Context context4 = setmin7.setMax;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                }
                String str3 = "Illegal value for network provider";
                ignoreView ignoreview2 = setmin7.setMin;
                if (ignoreview2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authentication");
                }
                String str4 = "Illegal value for base url";
                String str5 = setmin7.getMin;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("url");
                }
                onItemRangeMoved onitemrangemoved = new onItemRangeMoved(shouldremeasurechild2, context4, ignoreview2, str5);
                Context context5 = setmin7.setMax;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                }
                SharedPreferences sharedPreferences = context5.getSharedPreferences(obj, 0);
                Context context6 = setmin7.setMax;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(".enc");
                SharedPreferences sharedPreferences2 = context6.getSharedPreferences(sb2.toString(), 0);
                Intrinsics.checkExpressionValueIsNotNull(sharedPreferences2, "encryptedSharedPreferences");
                Intrinsics.checkParameterIsNotNull(obj, "storageAlias");
                Intrinsics.checkParameterIsNotNull(sharedPreferences2, "sharedPreferences");
                createViewHolder length = getItemCount.length();
                String str6 = "Illegal value for authentication";
                setStateRestorationPolicy setstaterestorationpolicy = new setStateRestorationPolicy(new onFailedToRecycleView(obj), length);
                if (!length.getMax(obj) && sharedPreferences2.getAll().isEmpty()) {
                    setstaterestorationpolicy.setMin.getMin(setstaterestorationpolicy.getMax.getMin());
                }
                Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "sharedPreferences");
                getPosition getposition = new getPosition(onitemrangemoved, new setMeasureSpecs(sharedPreferences, new notifyItemInserted(setstaterestorationpolicy, sharedPreferences2, new unregisterAdapterDataObserver()), CollectionsKt.listOf(new addDisappearingView.getMin(new addDisappearingView(sharedPreferences)))));
                removeAllViews removeallviews = getposition;
                onDrawOver ondrawover2 = setmin7.getMax;
                if (ondrawover2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("keyStore");
                }
                Context context7 = setmin7.setMax;
                if (context7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appContext");
                }
                postOnAnimation postonanimation = new postOnAnimation(new endAnimation(removeallviews, ondrawover2, context7), getposition);
                dispatchDetachedFromWindow.setMax setmax = new dispatchDetachedFromWindow.setMax();
                Context context8 = setmin.toIntRange;
                Intrinsics.checkParameterIsNotNull(context8, HummerConstants.CONTEXT);
                setmax.setMax = context8;
                dispatchDetachedFromWindow.setMax setmax2 = setmax;
                shouldReMeasureChild shouldremeasurechild3 = setmin.setMin;
                Intrinsics.checkParameterIsNotNull(shouldremeasurechild3, "networkProvider");
                setmax2.length = shouldremeasurechild3;
                dispatchDetachedFromWindow.setMax setmax3 = setmax2;
                setMeasuredDimension setmeasureddimension = setmin.length;
                Intrinsics.checkParameterIsNotNull(setmeasureddimension, "jwtGenerator");
                setmax3.getMin = setmeasureddimension;
                dispatchDetachedFromWindow.setMax setmax4 = setmax3;
                Intrinsics.checkParameterIsNotNull(postonanimation, "factorFacade");
                setmax4.getMax = postonanimation;
                dispatchDetachedFromWindow.setMax setmax5 = setmax4;
                String str7 = setmin.getMin;
                Intrinsics.checkParameterIsNotNull(str7, "url");
                setmax5.setMin = str7;
                dispatchDetachedFromWindow.setMax setmax6 = setmax5;
                ignoreView ignoreview3 = setmin.setMax;
                Intrinsics.checkParameterIsNotNull(ignoreview3, "authentication");
                setmax6.equals = ignoreview3;
                dispatchDetachedFromWindow.setMax setmax7 = setmax6;
                if (setmax7.setMax == null) {
                    throw new TwilioVerifyException(new IllegalArgumentException(str2), TwilioVerifyException.ErrorCode.InitializationError);
                } else if (setmax7.length == null) {
                    throw new TwilioVerifyException(new IllegalArgumentException(str3), TwilioVerifyException.ErrorCode.InitializationError);
                } else if (setmax7.getMin == null) {
                    throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for JWT generator"), TwilioVerifyException.ErrorCode.InitializationError);
                } else if (setmax7.getMax == null) {
                    throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for factor provider"), TwilioVerifyException.ErrorCode.InitializationError);
                } else if (setmax7.setMin == null) {
                    throw new TwilioVerifyException(new IllegalArgumentException(str4), TwilioVerifyException.ErrorCode.InitializationError);
                } else if (setmax7.equals != null) {
                    shouldReMeasureChild shouldremeasurechild4 = setmax7.length;
                    if (shouldremeasurechild4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("networking");
                    }
                    Context context9 = setmax7.setMax;
                    if (context9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appContext");
                    }
                    ignoreView ignoreview4 = setmax7.equals;
                    if (ignoreview4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("authentication");
                    }
                    String str8 = setmax7.setMin;
                    if (str8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("url");
                    }
                    dispatchAttachedToWindow dispatchattachedtowindow = new dispatchAttachedToWindow(new onChanged(shouldremeasurechild4, context9, ignoreview4, str8));
                    isItemPrefetchEnabled isitemprefetchenabled = dispatchattachedtowindow;
                    setMeasuredDimension setmeasureddimension2 = setmax7.getMin;
                    if (setmeasureddimension2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("generator");
                    }
                    removeCallbacks removecallbacks = new removeCallbacks(isitemprefetchenabled, setmeasureddimension2);
                    postOnAnimation postonanimation2 = setmax7.getMax;
                    if (postonanimation2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("factorProvider");
                    }
                    dispatchDetachedFromWindow dispatchdetachedfromwindow = new dispatchDetachedFromWindow(removecallbacks, postonanimation2, dispatchattachedtowindow);
                    moveView.setMin setmin8 = new moveView.setMin();
                    Context context10 = setmin.toIntRange;
                    Intrinsics.checkParameterIsNotNull(context10, HummerConstants.CONTEXT);
                    setmin8.getMin = context10;
                    moveView.setMin setmin9 = setmin8;
                    shouldReMeasureChild shouldremeasurechild5 = setmin.setMin;
                    Intrinsics.checkParameterIsNotNull(shouldremeasurechild5, "networkProvider");
                    setmin9.length = shouldremeasurechild5;
                    moveView.setMin setmin10 = setmin9;
                    Intrinsics.checkParameterIsNotNull(postonanimation, "factorFacade");
                    setmin10.getMax = postonanimation;
                    moveView.setMin setmin11 = setmin10;
                    ignoreView ignoreview5 = setmin.setMax;
                    Intrinsics.checkParameterIsNotNull(ignoreview5, "authentication");
                    setmin11.setMin = ignoreview5;
                    moveView.setMin setmin12 = setmin11;
                    String str9 = setmin.getMin;
                    Intrinsics.checkParameterIsNotNull(str9, "url");
                    setmin12.setMax = str9;
                    moveView.setMin setmin13 = setmin12;
                    if (setmin13.getMin == null) {
                        throw new TwilioVerifyException(new IllegalArgumentException(str2), TwilioVerifyException.ErrorCode.InitializationError);
                    } else if (setmin13.length == null) {
                        throw new TwilioVerifyException(new IllegalArgumentException(str3), TwilioVerifyException.ErrorCode.InitializationError);
                    } else if (setmin13.setMax == null) {
                        throw new TwilioVerifyException(new IllegalArgumentException(str4), TwilioVerifyException.ErrorCode.InitializationError);
                    } else if (setmin13.getMax == null) {
                        throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for factor facade"), TwilioVerifyException.ErrorCode.InitializationError);
                    } else if (setmin13.setMin != null) {
                        shouldReMeasureChild shouldremeasurechild6 = setmin13.length;
                        if (shouldremeasurechild6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("networking");
                        }
                        Context context11 = setmin13.getMin;
                        if (context11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appContext");
                        }
                        ignoreView ignoreview6 = setmin13.setMin;
                        if (ignoreview6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("authentication");
                        }
                        String str10 = setmin13.setMax;
                        if (str10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("url");
                        }
                        removeAndRecycleViewAt getchildcount = new getChildCount(new onItemRangeChanged(shouldremeasurechild6, context11, ignoreview6, str10));
                        postOnAnimation postonanimation3 = setmin13.getMax;
                        if (postonanimation3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("factorFacade");
                        }
                        return new chooseSize(postonanimation, dispatchdetachedfromwindow, new moveView(getchildcount, postonanimation3));
                    } else {
                        throw new TwilioVerifyException(new IllegalArgumentException(str6), TwilioVerifyException.ErrorCode.InitializationError);
                    }
                } else {
                    throw new TwilioVerifyException(new IllegalArgumentException(str6), TwilioVerifyException.ErrorCode.InitializationError);
                }
            } else {
                throw new TwilioVerifyException(new IllegalArgumentException("Illegal value for authentication"), TwilioVerifyException.ErrorCode.InitializationError);
            }
        } catch (TwilioVerifyException unused) {
            return null;
        }
    }

    @Singleton
    @Provides
    public onRelease setMax(Context context) {
        return new onRelease(context);
    }

    @Singleton
    @Provides
    public AppLifeCycleObserver setMax(getFrameMarginVertical$core getframemarginvertical_core, isAlipayApp isalipayapp) {
        return new AppLifeCycleObserver(getframemarginvertical_core, isalipayapp);
    }

    @Singleton
    @Provides
    public GriverHttpRequestAPIExtension setMax() {
        return new getPageCount();
    }

    @Singleton
    @Provides
    public getShortName getMin(onCallBack oncallback) {
        return new getShortName(oncallback);
    }

    @Singleton
    @Provides
    public DistinctPacketDetector length(getQueryScene getqueryscene) {
        getqueryscene.initMixpanelEntityData();
        return getqueryscene;
    }

    @Singleton
    @Provides
    @Named("partialsync")
    public findCalculatorForModelWithLock getMin(RVGroupInit rVGroupInit) {
        return new ScanJobScheduler(rVGroupInit);
    }

    @Singleton
    @Provides
    @Named("fullsync")
    public findCalculatorForModelWithLock setMax(RVGroupInit rVGroupInit) {
        return new ScanJob(rVGroupInit);
    }

    @Singleton
    @Provides
    @Named("recurringpartialsync")
    public findCalculatorForModelWithLock setMax(isHasPermissionFile ishaspermissionfile) {
        return new ScanJobScheduler(ishaspermissionfile);
    }

    @Singleton
    @Provides
    @Named("recurringfullsync")
    public findCalculatorForModelWithLock getMin(isHasPermissionFile ishaspermissionfile) {
        return new ScanJob(ishaspermissionfile);
    }

    @Singleton
    @Provides
    public DefaultEmbedViewManager getMin(Application application, hasInputException hasinputexception, getEngine getengine) {
        sendStartMsg.getMin("Skywalker", "2.4.0");
        return new DefaultEmbedViewManager(application, hasinputexception, getengine);
    }

    @Singleton
    @Provides
    public LoginLogoutObserver getMin(a.AnonymousClass7 r2) {
        return new LoginLogoutObserver(r2);
    }

    @Singleton
    @Provides
    public LocationPermissionObserver setMin(isAlipayApp isalipayapp) {
        return new LocationPermissionObserver(isalipayapp);
    }
}
