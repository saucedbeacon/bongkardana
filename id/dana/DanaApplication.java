package id.dana;

import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.emoji.text.EmojiCompat;
import androidx.multidex.MultiDexApplication;
import com.alibaba.griver.api.common.webview.GriverUserAgentExtension;
import com.alibaba.griver.base.common.bridge.GriverAppLanguageExtension;
import com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.exception.ServerException;
import com.alipay.imobile.network.quake.exception.TimeoutException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.play.core.missingsplits.MissingSplitsManagerFactory;
import dagger.Lazy;
import id.dana.appshortcut.DanaAppShortcut;
import id.dana.danah5.extension.DanaGriverAppLanguageExtension;
import id.dana.danah5.extension.DanaGriverUserAgentExtension;
import id.dana.danah5.httprequest.HttpRequestExtension;
import id.dana.data.di.ApiModule;
import id.dana.data.di.BranchModule;
import id.dana.data.di.DataModule;
import id.dana.data.di.NetworkModule;
import id.dana.di.modules.ApplicationModule;
import id.dana.di.modules.GlobalNetworkProxyModule;
import id.dana.di.modules.SplitModule;
import id.dana.initializer.FirebaseCrashlyticsInitializer;
import id.dana.oauth.activity.OauthGrantActivity;
import id.dana.social.di.module.SocialCommonModule;
import id.dana.tracker.constant.TrackerType;
import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.UndeliverableException;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.AUAttrsConstant;
import o.AUPopSupportPreemption;
import o.BlurProcess;
import o.CornerMarkingData;
import o.DistinctPacketDetector;
import o.EmojiImageSpan;
import o.EventPoint;
import o.GriverDecodeUrl;
import o.GriverProgressBar;
import o.IconfontInterface;
import o.LocationBridgeExtension;
import o.LogCustomizeControl;
import o.PrepareException;
import o.RedDotDrawable;
import o.ScreenBrightnessBridgeExtension;
import o.SecuritySignature;
import o.StackBlurManager;
import o.UpdateAppCallback;
import o.UseExperimental;
import o.VisitUrlPoint;
import o.WheelView;
import o.addFlags;
import o.addIntentOptions;
import o.clearPayload;
import o.createToggleButton;
import o.dismissBadgeView;
import o.dispatchOnCancelled;
import o.downloadPlugins;
import o.getBLETraceMonitor;
import o.getPerformanceTracker;
import o.getSecureSignatureComp;
import o.getTypeface;
import o.getTypefaceByCat;
import o.getVisibility;
import o.hasCornerMarking;
import o.hideProgress;
import o.isAdapterPositionUnknown;
import o.isAttachedToTransitionOverlay;
import o.isTmpDetached;
import o.judgeRes;
import o.onAppPause;
import o.onAttachedToWindow;
import o.onCancelLoad;
import o.onCanceled;
import o.onInput;
import o.onShowCustomView;
import o.sendStartMsg;
import o.setFavoriteBtnVisibility;
import o.setFlags;
import o.setHeaderViewHeight;
import o.setOverlayMode;
import o.setRefreshAnimation;
import o.setRefreshOffset;
import o.setStateOff;
import o.setTitleFont$core;
import o.stopIgnoring;
import o.switchFavoriteIconFont;
import o.updateActionSheetContent;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.Nullable;

public class DanaApplication extends MultiDexApplication implements onAttachedToWindow.getMax {
    @Inject
    public VisitUrlPoint apLogFacade;
    @Inject
    public AppLifeCycleObserver appLifeCycleObserver;
    @Inject
    public isAttachedToTransitionOverlay applicationOrientationCallback;
    @Inject
    public Lazy<DanaGriverAppLanguageExtension> danaGriverAppLanguageExtension;
    @Inject
    public Lazy<DanaGriverUserAgentExtension> danaGriverUserAgentExtension;
    @Inject
    public DanaLocalBroadcastReceiver danaLocalBroadcastReceiver;
    @Inject
    public Lazy<getPerformanceTracker> deviceInformationProvider;
    private OauthGrantActivity equals;
    @Inject
    public Lazy<EventPoint> getLatestSubdivision;
    private Boolean getMax;
    private PrepareException.AnonymousClass1 getMin;
    @Inject
    public Lazy<GriverDecodeUrl.length> globalNetworkProxyPresenter;
    @Inject
    public Lazy<HttpRequestExtension> httpRequestExtension;
    @Inject
    public onAppPause iapPushFacade;
    @Nullable
    private AUAttrsConstant length;
    @Inject
    public Lazy<DistinctPacketDetector> mixpanel;
    @Inject
    public Lazy<onShowCustomView> openH5Lazy;
    private setOverlayMode setMax;
    @Nullable
    private AUPopSupportPreemption setMin;
    @Inject
    public Lazy<UpdateAppCallback> splitFacade;
    @Inject
    public Lazy<EmojiImageSpan> splitObservant;

    public static /* synthetic */ void setMax() {
    }

    public Boolean getHomeRevamp() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1552849414 == (max = dispatchOnCancelled.getMax(applicationContext, 1552849414)))) {
            onCanceled oncanceled = new onCanceled(1552849414, max, 512);
            onCancelLoad.setMax(1552849414, oncanceled);
            onCancelLoad.getMin(1552849414, oncanceled);
        }
        Boolean bool = this.getMax;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void setHomeRevamp(Boolean bool) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-353150140, oncanceled);
            onCancelLoad.getMin(-353150140, oncanceled);
        }
        this.getMax = bool;
    }

    public OauthGrantActivity getOauthGrantActivity() {
        return this.equals;
    }

    public void setOauthGrantActivity(OauthGrantActivity oauthGrantActivity) {
        this.equals = oauthGrantActivity;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        addIntentOptions.getMax((Context) this);
        StackBlurManager.toIntRange();
    }

    public void onCreate() {
        int length2;
        int min;
        if (!MissingSplitsManagerFactory.create(this).disableAppIfMissingRequiredSplits()) {
            super.onCreate();
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-564766215, oncanceled);
                onCancelLoad.getMin(-564766215, oncanceled);
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null && !(defaultUncaughtExceptionHandler instanceof setTitleFont$core)) {
                Thread.setDefaultUncaughtExceptionHandler(new setTitleFont$core(defaultUncaughtExceptionHandler, this));
            }
            if (SecuritySignature.setMax == null) {
                isTmpDetached istmpdetached = isTmpDetached.length;
                if (!SecuritySignature.ICustomTabsCallback) {
                    SecuritySignature.setMax = istmpdetached;
                } else {
                    throw new IllegalStateException("Plugins can't be changed anymore");
                }
            }
            this.setMax = setOverlayMode.setMax(this);
            AnonymousClass3 r1 = new LogCustomizeControl.getMin() {
                public final void getMax(int i) {
                }
            };
            if (r1 != LogCustomizeControl.setMin) {
                synchronized (LogCustomizeControl.getMax) {
                    LogCustomizeControl.getMax.add(r1);
                    List<LogCustomizeControl.getMin> list = LogCustomizeControl.getMax;
                    LogCustomizeControl.length = (LogCustomizeControl.getMin[]) list.toArray(new LogCustomizeControl.getMin[list.size()]);
                }
                sendStartMsg.getMin("Skywalker", "2.4.0");
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(-294604665, oncanceled2);
                    onCancelLoad.getMin(-294604665, oncanceled2);
                }
                if (this.getMin == null) {
                    downloadPlugins.length playbackState = downloadPlugins.getPlaybackState();
                    playbackState.getMin = new ApplicationModule(this);
                    playbackState.setMin = new NetworkModule(false);
                    playbackState.length = new ApiModule();
                    playbackState.getMax = new BranchModule(false);
                    playbackState.equals = new GlobalNetworkProxyModule(addFlags.setMax);
                    playbackState.toIntRange = new SplitModule();
                    stopIgnoring.setMin(playbackState.getMin, ApplicationModule.class);
                    stopIgnoring.setMin(playbackState.setMin, NetworkModule.class);
                    if (playbackState.length == null) {
                        playbackState.length = new ApiModule();
                    }
                    if (playbackState.setMax == null) {
                        playbackState.setMax = new DataModule();
                    }
                    stopIgnoring.setMin(playbackState.getMax, BranchModule.class);
                    stopIgnoring.setMin(playbackState.equals, GlobalNetworkProxyModule.class);
                    if (playbackState.toIntRange == null) {
                        playbackState.toIntRange = new SplitModule();
                    }
                    this.getMin = new downloadPlugins(playbackState.getMin, playbackState.setMin, playbackState.length, playbackState.setMax, playbackState.getMax, playbackState.equals, playbackState.toIntRange, (byte) 0);
                }
                this.getMin.getMax(this);
                PrepareException.AnonymousClass1 r0 = this.getMin;
                if (PrepareException.getMin == null) {
                    PrepareException.getMin = new PrepareException(r0);
                }
                this.setMax.getMax(FirebaseCrashlyticsInitializer.class, new HashSet());
                Context applicationContext = getApplicationContext();
                try {
                    WheelView.AnonymousClass2.setMax(this.appLifeCycleObserver);
                } catch (Exception e) {
                    updateActionSheetContent.e("LifecycleOwner", e.getMessage());
                }
                registerActivityLifecycleCallbacks(this.applicationOrientationCallback);
                try {
                    ProviderInstaller.installIfNeeded(this);
                } catch (GooglePlayServicesRepairableException e2) {
                    GoogleApiAvailability.getInstance().showErrorNotification((Context) this, e2.getConnectionStatusCode());
                } catch (GooglePlayServicesNotAvailableException unused) {
                    updateActionSheetContent.e("UpdateProvider", "Failed to update security provider");
                }
                this.iapPushFacade.initPushManager();
                BlurProcess.setMax(this.mixpanel.get(), this.deviceInformationProvider.get());
                setFavoriteBtnVisibility min2 = setFavoriteBtnVisibility.setMin(new clearPayload(this, applicationContext));
                hasCornerMarking min3 = getSecureSignatureComp.setMin();
                setRefreshAnimation.getMax(min3, "scheduler is null");
                dismissBadgeView setheaderviewheight = new setHeaderViewHeight(min2, min3);
                RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
                if (redDotDrawable != null) {
                    setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setheaderviewheight);
                }
                hasCornerMarking length3 = hideProgress.length();
                setRefreshAnimation.getMax(length3, "scheduler is null");
                setFavoriteBtnVisibility setrefreshoffset = new setRefreshOffset(setheaderviewheight, length3);
                RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
                if (redDotDrawable2 != null) {
                    setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setrefreshoffset);
                }
                setrefreshoffset.getMax((switchFavoriteIconFont) new switchFavoriteIconFont() {
                    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
                    }

                    public final void onComplete() {
                        setStateOff.setMax(DanaApplication.this.deviceInformationProvider.get().getDeviceUtdId());
                        DanaLocalBroadcastReceiver.registerLocalBroadCastRecevier(DanaApplication.this.getApplicationContext(), DanaApplication.this.danaLocalBroadcastReceiver);
                    }

                    public final void onError(@NonNull Throwable th) {
                        setStateOff.setMax(DanaApplication.this.deviceInformationProvider.get().getDeviceUtdId());
                        DanaLocalBroadcastReceiver.registerLocalBroadCastRecevier(DanaApplication.this.getApplicationContext(), DanaApplication.this.danaLocalBroadcastReceiver);
                        LocationBridgeExtension.setMin(DanaApplication.class.getSimpleName(), th.getMessage(), th);
                    }
                });
                HashMap hashMap = new HashMap();
                hashMap.put(GriverHttpRequestAPIExtension.class, this.httpRequestExtension);
                hashMap.put(GriverAppLanguageExtension.class, this.danaGriverAppLanguageExtension);
                hashMap.put(GriverUserAgentExtension.class, this.danaGriverUserAgentExtension);
                getBLETraceMonitor.setMax(this, this.globalNetworkProxyPresenter, this.openH5Lazy, this.getLatestSubdivision.get(), hashMap);
                EmojiCompat.setMax(new createToggleButton(this, new UseExperimental(getString(R.string.font_req_provider_authority), getString(R.string.font_req_provider_package), getString(R.string.font_req_query))).getMin(true).getMax(new EmojiCompat.length() {
                    public final void getMax() {
                        updateActionSheetContent.i("FontRequestEmojiCompatConfig", "onInitialized");
                    }

                    public final void setMin(@androidx.annotation.Nullable Throwable th) {
                        updateActionSheetContent.e("FontRequestEmojiCompatConfig", "onFailed");
                    }
                }));
                Context baseContext = getBaseContext();
                Context applicationContext2 = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
                    onCanceled oncanceled3 = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(-1540555294, oncanceled3);
                    onCancelLoad.getMin(-1540555294, oncanceled3);
                }
                onInput.getDefault().register(this);
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
                ScreenBrightnessBridgeExtension.getMin(true);
                DanaAppShortcut.getMin((Context) this);
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(659906196, oncanceled);
            onCancelLoad.getMin(659906196, oncanceled);
        }
        super.onConfigurationChanged(configuration);
        this.splitFacade.get();
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        String obj = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "Locale.getDefault().toString()");
        UpdateAppCallback.getMin("locale", obj);
        sendStartMsg.getMin("Skywalker", "2.4.0");
    }

    public PrepareException.AnonymousClass1 getApplicationComponent() {
        return this.getMin;
    }

    public AUPopSupportPreemption getSocialCommonComponent() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(470216807, oncanceled);
            onCancelLoad.getMin(470216807, oncanceled);
        }
        if (this.setMin == null) {
            getVisibility.length length2 = getVisibility.setMax;
            Intrinsics.checkNotNullParameter(this, "danaApplication");
            AUPopSupportPreemption length3 = getApplicationComponent().length(new SocialCommonModule(new getVisibility.length.C0009length()));
            Intrinsics.checkNotNullExpressionValue(length3, "danaApplication.applicat…         ))\n            )");
            this.setMin = length3;
        }
        return this.setMin;
    }

    public AUAttrsConstant getRestrictedContactComponent() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-871336517, oncanceled);
            onCancelLoad.getMin(-871336517, oncanceled);
        }
        if (this.length == null) {
            IconfontInterface.setMax setmax = IconfontInterface.length;
            Intrinsics.checkNotNullParameter(this, "danaApplication");
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            new SocialCommonModule(new IconfontInterface.setMax.C0003setMax());
            AUAttrsConstant onSessionDestroyed = applicationComponent.onSessionDestroyed();
            Intrinsics.checkNotNullExpressionValue(onSessionDestroyed, "danaApplication.applicat…         })\n            )");
            this.length = onSessionDestroyed;
        }
        return this.length;
    }

    public int getNetworkType() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            if (connectivityManager == null) {
                return 10;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType();
            }
            return 10;
        } catch (Exception unused) {
            return 0;
        }
    }

    @androidx.annotation.NonNull
    public onAttachedToWindow getWorkManagerConfiguration() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1658485470, oncanceled);
            onCancelLoad.getMin(-1658485470, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1658485470, oncanceled2);
            onCancelLoad.getMin(-1658485470, oncanceled2);
        }
        onAttachedToWindow.length length3 = new onAttachedToWindow.length();
        length3.getMax = this.getMin.notifyNotificationWithChannel();
        length3.isInside = 3;
        return new onAttachedToWindow(length3);
    }

    @Subscribe
    public void onReceiveGnAuthSpecialMerchantMessageEvent(length length2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-54888259, oncanceled);
            onCancelLoad.getMin(-54888259, oncanceled);
        }
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.getMin()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.setMin(length2.setMin);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.setMax(length2.getMin);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension4 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.setMin(false);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension5 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.getMin(false);
            if (getOauthGrantActivity() != null) {
                getOauthGrantActivity().readLinkPropertiesGoogleAc();
            } else {
                startActivity(OauthGrantActivity.createOauthGrantLoadingIntent(this).addFlags(268435456));
            }
        }
    }

    public static class length {
        final String getMin;
        final String setMin;

        public length(String str, String str2) {
            this.getMin = str;
            this.setMin = str2;
        }
    }

    public static /* synthetic */ void setMin(Throwable th) {
        if (th instanceof UndeliverableException) {
            th = th.getCause();
        }
        if (!(th instanceof ServerException) && !(th instanceof TimeoutException) && !(th instanceof ClientException) && !(th instanceof InterruptedException)) {
            if ((th instanceof NullPointerException) || (th instanceof IllegalArgumentException)) {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            } else if (th instanceof IllegalStateException) {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static /* synthetic */ List getMax(DanaApplication danaApplication, Context context) {
        int length2;
        int min;
        String currentTrackerId = danaApplication.deviceInformationProvider.get().getCurrentTrackerId();
        if (TextUtils.isEmpty(currentTrackerId)) {
            currentTrackerId = danaApplication.deviceInformationProvider.get().getDeviceUtdId();
        }
        Context baseContext = danaApplication.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1834481210, oncanceled);
            onCancelLoad.getMin(-1834481210, oncanceled);
        }
        getTypefaceByCat.setMin setmin = new getTypefaceByCat.setMin();
        setmin.getMax = context;
        setmin.setMax = currentTrackerId;
        setmin.length = BlurProcess.setMax();
        setmin.equals = BlurProcess.length();
        return judgeRes.getMin(new getTypefaceByCat(setmin, (byte) 0), danaApplication.deviceInformationProvider.get(), TrackerType.APPSFLYER, TrackerType.BRANCH, TrackerType.MIXPANEL);
    }

    public static /* synthetic */ void getMax(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((getTypeface) it.next()).getMax();
        }
    }

    public static /* synthetic */ Void setMin(DanaApplication danaApplication, Context context) {
        int length2;
        danaApplication.splitObservant.get();
        danaApplication.globalNetworkProxyPresenter.get().getMax();
        setFlags setflags = new setFlags(danaApplication, context);
        Context baseContext = danaApplication.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(167637405, oncanceled);
            onCancelLoad.getMin(167637405, oncanceled);
        }
        CornerMarkingData.length(setflags, isAdapterPositionUnknown.getMin);
        return null;
    }
}
