package o;

import android.app.Application;
import android.content.Intent;
import com.alibaba.griver.api.common.GriverExtension;
import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import com.alipay.imobile.network.quake.exception.ServerException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.iap.ac.android.biz.IAPConnect;
import com.iap.ac.android.biz.common.callback.InitCallback;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.InitErrorCode;
import com.iap.ac.android.biz.common.proxy.HttpTransporter;
import com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import dagger.Lazy;
import id.dana.danah5.DanaH5;
import id.dana.data.ProductFlavor;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.miniprogram.provider.OauthServiceProvider;
import id.dana.onboarding.splash.SplashActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ColorSchemeModelTemplate;
import o.GriverDecodeUrl;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J`\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00100\u0017H\u0007J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010 \u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/globalnetwork/AlipayConnectHelper;", "", "()V", "DEV", "", "MPM", "OAUTH_PREPARE", "PROD", "getOfflinePaymentEnv", "initialize", "", "application", "Landroid/app/Application;", "networkProxyEnable", "", "globalNetworkProxyPresenterLazy", "Ldagger/Lazy;", "Lid/dana/globalnetworkproxy/GlobalNetworkProxyContract$Presenter;", "openH5Lazy", "Lid/dana/domain/danah5/interactor/OpenH5;", "getLatestSubdivision", "Lid/dana/domain/geocode/interactor/GetLatestSubdivision;", "extensions", "", "Ljava/lang/Class;", "Lcom/alibaba/griver/api/common/GriverExtension;", "processAcCashierPaymentSession", "httpRequest", "Lcom/iap/ac/android/common/rpc/model/HttpRequest;", "exception", "Lcom/alipay/imobile/network/quake/exception/ServerException;", "redirectToLoginFlow", "registerServiceProviders", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBLETraceMonitor {
    @NotNull
    public static final getBLETraceMonitor setMax = new getBLETraceMonitor();

    private getBLETraceMonitor() {
    }

    @JvmStatic
    public static final void setMax(@NotNull Application application, @NotNull Lazy<GriverDecodeUrl.length> lazy, @NotNull Lazy<onShowCustomView> lazy2, @NotNull EventPoint eventPoint, @NotNull Map<Class<? extends GriverExtension>, ? extends Lazy<? extends GriverExtension>> map) {
        Intrinsics.checkNotNullParameter(application, MimeTypes.BASE_TYPE_APPLICATION);
        Intrinsics.checkNotNullParameter(lazy, "globalNetworkProxyPresenterLazy");
        Intrinsics.checkNotNullParameter(lazy2, "openH5Lazy");
        Intrinsics.checkNotNullParameter(eventPoint, "getLatestSubdivision");
        Intrinsics.checkNotNullParameter(map, "extensions");
        InitConfig initConfig = new InitConfig();
        initConfig.pay = null;
        initConfig.userAgent = getBLEConnectMaxTimeout.length(sendStartMsg.setMax());
        initConfig.envType = (Intrinsics.areEqual((Object) "production", (Object) "production") || Intrinsics.areEqual((Object) ProductFlavor.PREPROD, (Object) "production")) ? "PROD" : "DEV";
        initConfig.networkProxy = new getMax(lazy.get(), application);
        try {
            WalletServiceManager.getInstance().registerServices(OauthServiceProvider.class, ColorSchemeModelTemplate.AnonymousClass1.class, getNode.class, setBackPerform.class, getEngineRouter.class);
            BaseService service = WalletServiceManager.getInstance().getService(OAuthService.class);
            if (service != null) {
                OauthServiceProvider oauthServiceProvider = (OauthServiceProvider) service;
                DefaultEmbedViewManager defaultEmbedViewManager = oauthServiceProvider.remoteGnPaymentEntityData;
                if (defaultEmbedViewManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("remoteGnPaymentEntityData");
                }
                oauthServiceProvider.setMin = defaultEmbedViewManager.gnAuthResultPublishSubject;
                DefaultEmbedViewManager defaultEmbedViewManager2 = oauthServiceProvider.remoteGnPaymentEntityData;
                if (defaultEmbedViewManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("remoteGnPaymentEntityData");
                }
                defaultEmbedViewManager2.handleServicePublishSubject();
                IAPConnect.init(application, initConfig, new getMin(application, lazy2, eventPoint, map));
                if (!Intrinsics.areEqual((Object) initConfig.envType, (Object) "PROD")) {
                    IAPSslPinner.INSTANCE.disableSslPinning();
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.miniprogram.provider.OauthServiceProvider");
        } catch (Exception unused) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<no name provided>", "Lcom/iap/ac/android/common/rpc/model/HttpResponse;", "it", "Lcom/iap/ac/android/common/rpc/model/HttpRequest;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements HttpTransporter {
        final /* synthetic */ GriverDecodeUrl.length getMin;
        final /* synthetic */ Application setMin;

        getMax(GriverDecodeUrl.length length, Application application) {
            this.getMin = length;
            this.setMin = application;
        }

        /* access modifiers changed from: private */
        @Nullable
        /* renamed from: setMin */
        public HttpResponse sendHttpRequest(@NotNull HttpRequest httpRequest) {
            String str = "";
            Intrinsics.checkNotNullParameter(httpRequest, "it");
            HttpResponse httpResponse = null;
            boolean z = false;
            try {
                GriverDecodeUrl.length length = this.getMin;
                Map<String, String> map = httpRequest.headers;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                String str2 = httpRequest.data;
                if (str2 == null) {
                    str2 = str;
                }
                httpResponse = length.setMin(map, str2);
            } catch (ServerException e) {
                String str3 = httpRequest.data;
                if ((str3 != null ? StringsKt.contains$default((CharSequence) str3, (CharSequence) "prepare", false, 2, (Object) null) : false) && e.getCode() == 2000) {
                    z = true;
                }
                getBLETraceMonitor getbletracemonitor = getBLETraceMonitor.setMax;
                getBLETraceMonitor.setMax(httpRequest, e);
            }
            if (z) {
                getBLETraceMonitor getbletracemonitor2 = getBLETraceMonitor.setMax;
                getBLETraceMonitor.setMin(this.setMin);
            }
            if (!z) {
                return httpResponse;
            }
            GriverDecodeUrl.length length2 = this.getMin;
            Map<String, String> map2 = httpRequest.headers;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            String str4 = httpRequest.data;
            if (str4 != null) {
                str = str4;
            }
            return length2.setMin(map2, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"id/dana/globalnetwork/AlipayConnectHelper$initialize$2", "Lcom/iap/ac/android/biz/common/callback/InitCallback;", "onFailure", "", "initErrorCode", "Lcom/iap/ac/android/biz/common/model/InitErrorCode;", "errorMessage", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements InitCallback {
        final /* synthetic */ EventPoint getMax;
        final /* synthetic */ Application getMin;
        final /* synthetic */ Map length;
        final /* synthetic */ Lazy setMin;

        getMin(Application application, Lazy lazy, EventPoint eventPoint, Map map) {
            this.getMin = application;
            this.setMin = lazy;
            this.getMax = eventPoint;
            this.length = map;
        }

        public final void onSuccess() {
            DanaH5.initialize(this.getMin, this.setMin);
            WindowBridgeExtension.AnonymousClass1.getMin(this.getMin);
            setButtonFont$core.inject(this.getMax, this.length);
            setIsRecyclable.getMax().onNext(Boolean.TRUE);
        }

        public final void onFailure(@NotNull InitErrorCode initErrorCode, @NotNull String str) {
            Intrinsics.checkNotNullParameter(initErrorCode, "initErrorCode");
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, "onInitializeFailed errorMessage == ".concat(String.valueOf(str)));
        }
    }

    public static final /* synthetic */ void setMax(HttpRequest httpRequest, ServerException serverException) {
        String str = httpRequest.data;
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "mpm.code.scan", false, 2, (Object) null) && serverException.getCode() == 2000) {
            getStartDelay.IsOverlapping.setMin().toIntRange = Boolean.TRUE;
        }
    }

    public static final /* synthetic */ void setMin(Application application) {
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.setMin()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.getMax(true);
            Intent intent = new Intent(application.getBaseContext(), SplashActivity.class);
            intent.setFlags(268435456);
            application.getBaseContext().startActivity(intent);
        }
        while (true) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.setMin()) {
                Thread.sleep(1000);
            } else {
                return;
            }
        }
    }
}
