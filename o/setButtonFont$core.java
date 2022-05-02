package o;

import android.content.Context;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.griver.api.common.GriverEvent;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.common.page.GriverInterceptUrlEvent;
import com.alibaba.griver.api.common.page.GriverPageHelperEvent;
import com.alibaba.griver.api.common.view.GriverTitleBarEvent;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alipay.iap.android.lbs.LBSLocation;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.zoloz.builder.plugin.ZLZCommonH5PluginImpl;
import dagger.Lazy;
import id.dana.R;
import id.dana.danah5.DanaH5Injector$mockConfigProxy$1;
import id.dana.danah5.akulaku.AkuDeviceInfoBridge;
import id.dana.danah5.akulaku.AkuLocationGuideBridge;
import id.dana.danah5.akulaku.LocationInfoBridge;
import id.dana.danah5.bca.BcaOneKlikEventHandler;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.danah5.bottomsheet.BottomSheetBridge;
import id.dana.danah5.checksendevent.CheckSendEventBridge;
import id.dana.danah5.customdialog.CustomDialogBridge;
import id.dana.danah5.customnotificationsound.CustomNotificationSoundBridge;
import id.dana.danah5.customredirectto.CutomRedirectToBridge;
import id.dana.danah5.deeplink.DeeplinkCatcherEventHandler;
import id.dana.danah5.deeplink.scanQr.OpenScanQrBridge;
import id.dana.danah5.easteregg.EasterEggsEventHandler;
import id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge;
import id.dana.danah5.getconfigforh5.GetConfigForH5Bridge;
import id.dana.danah5.getonlineconfig.GetOnlineConfigBridge;
import id.dana.danah5.globalnetwork.GlobalNetworkBridge;
import id.dana.danah5.location.GetLocationNameBridge;
import id.dana.danah5.locationpicker.MapsUtilityBridge;
import id.dana.danah5.nfcutility.NfcUtilityBridge;
import id.dana.danah5.ocrreceipt.OCRReceiptBridge;
import id.dana.danah5.ocrreceipt.UploadLocalImageBridge;
import id.dana.danah5.openallshop.OpenAllShopBridge;
import id.dana.danah5.openapp.OpenNativeAppBridge;
import id.dana.danah5.opennearbyme.OpenNearbyMeBridge;
import id.dana.danah5.referralengagement.ShowReferralEngagementDialogBridge;
import id.dana.danah5.screenshot.ScreenshotBridge;
import id.dana.danah5.sendevent.SendEventBridge;
import id.dana.danah5.share.ShareBridge;
import id.dana.danah5.showagreement.ShowAgreementBridge;
import id.dana.danah5.tooltip.TooltipBridge;
import id.dana.danah5.twilioverifysecurityproduct.TwilioVerifySecurityProductBridge;
import id.dana.data.ProductFlavor;
import id.dana.lib.drawbitmap.DrawBitmapBridge;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInformationBridge;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.ILocationListener;
import id.dana.lib.gcontainer.app.bridge.downloadfile.DownloadFileBridge;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge;
import id.dana.lib.gcontainer.app.bridge.launchothersapp.DirectMessageBridge;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsBridge;
import id.dana.plugin.bca.BcaIntegrationKitDevBridge;
import id.dana.plugin.bca.BcaIntegrationKitProdBridge;
import id.dana.plugin.bca.H5ActionJsApi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EventPoint;
import o.WheelView;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J4\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00130\u0010H\u0007J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J,\u0010\u0017\u001a\u00020\f2\"\u0010\u000f\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00130\u0010H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/danah5/DanaH5Injector;", "", "()V", "GET_CITY_NAME_TIMEOUT_IN_SECONDS", "", "getLatestSubdivision", "Lid/dana/domain/geocode/interactor/GetLatestSubdivision;", "detectFakeGpsAndGpsService", "", "context", "Landroid/content/Context;", "implementLocationListener", "", "initView", "inject", "extensions", "", "Ljava/lang/Class;", "Lcom/alibaba/griver/api/common/GriverExtension;", "Ldagger/Lazy;", "mockConfigProxy", "provideBridges", "provideEventHandler", "provideExtension", "provideGeocodeGetLatestSubdivision", "registerBridgeListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setButtonFont$core {
    private static final long GET_CITY_NAME_TIMEOUT_IN_SECONDS = 1;
    @NotNull
    public static final setButtonFont$core INSTANCE = new setButtonFont$core();
    private static EventPoint getLatestSubdivision;

    private setButtonFont$core() {
    }

    @JvmStatic
    public static final void inject(@NotNull EventPoint eventPoint, @NotNull Map<Class<? extends GriverExtension>, ? extends Lazy<? extends GriverExtension>> map) {
        Intrinsics.checkNotNullParameter(eventPoint, "getLatestSubdivision");
        Intrinsics.checkNotNullParameter(map, "extensions");
        INSTANCE.initView();
        INSTANCE.provideGeocodeGetLatestSubdivision(eventPoint);
        INSTANCE.provideBridges();
        INSTANCE.provideEventHandler();
        INSTANCE.provideExtension(map);
        INSTANCE.registerBridgeListener();
        INSTANCE.mockConfigProxy();
    }

    private final void provideGeocodeGetLatestSubdivision(EventPoint eventPoint) {
        getLatestSubdivision = eventPoint;
    }

    private final void mockConfigProxy() {
        GriverConfig.setConfigProxy(new DanaH5Injector$mockConfigProxy$1());
    }

    private final void initView() {
        getClipboard max = WindowBridgeExtension.AnonymousClass1.setMax();
        max.getMin = R.color.f19022131099797;
        max.setMin.length = 17170443;
        max.length.getMin = R.drawable.btn_arrow_left;
        max.length.setMin = 17170443;
        max.getMax.setMin = false;
        max.getMax.setMax = 17170443;
    }

    private final void provideExtension(Map<Class<? extends GriverExtension>, ? extends Lazy<? extends GriverExtension>> map) {
        for (Map.Entry next : map.entrySet()) {
            Class cls = (Class) next.getKey();
            GriverExtension griverExtension = (GriverExtension) ((Lazy) next.getValue()).get();
            if (griverExtension != null) {
                WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends GriverExtension>) cls, griverExtension);
            }
        }
    }

    private final void provideEventHandler() {
        WindowBridgeExtension.AnonymousClass1 r0 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMin((Class<? extends Scope>) Page.class, (Class<? extends GriverEvent>) DeeplinkCatcherEventHandler.class, (List<? extends Class<? extends GriverEvent>>) ArraysKt.toList((T[]) new Class[]{GriverPageHelperEvent.class, GriverInterceptUrlEvent.class}));
        WindowBridgeExtension.AnonymousClass1 r1 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMin((Class<? extends Scope>) Page.class, (Class<? extends GriverEvent>) EasterEggsEventHandler.class, (List<? extends Class<? extends GriverEvent>>) ArraysKt.toList((T[]) new Class[]{GriverTitleBarEvent.class, GriverInterceptUrlEvent.class}));
        WindowBridgeExtension.AnonymousClass1 r12 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMin((Class<? extends Scope>) Page.class, (Class<? extends GriverEvent>) BcaOneKlikEventHandler.class, (List<? extends Class<? extends GriverEvent>>) ArraysKt.toList((T[]) new Class[]{GriverTitleBarEvent.class, GriverInterceptUrlEvent.class}));
    }

    private final void provideBridges() {
        WindowBridgeExtension.AnonymousClass1 r0 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) CheckSendEventBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.CHECK_SEND_EVENT}));
        WindowBridgeExtension.AnonymousClass1 r02 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) CustomDialogBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"customDialog"}));
        WindowBridgeExtension.AnonymousClass1 r03 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) SendEventBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.SEND_EVENT}));
        WindowBridgeExtension.AnonymousClass1 r04 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) GetConfigForH5Bridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"getConfigForH5"}));
        WindowBridgeExtension.AnonymousClass1 r05 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) CustomNotificationSoundBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"customNotificationSound"}));
        WindowBridgeExtension.AnonymousClass1 r06 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) BioUtilityBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"bioUtility"}));
        WindowBridgeExtension.AnonymousClass1 r07 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) GlobalNetworkBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"forex"}));
        WindowBridgeExtension.AnonymousClass1 r08 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) TooltipBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"tooltip"}));
        WindowBridgeExtension.AnonymousClass1 r09 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) AkuDeviceInfoBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"getAkuDeviceInfo"}));
        WindowBridgeExtension.AnonymousClass1 r010 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) AkuLocationGuideBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"locationPermissionGuide"}));
        WindowBridgeExtension.AnonymousClass1 r011 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) LocationInfoBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"getLocationInfo"}));
        WindowBridgeExtension.AnonymousClass1 r012 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) GetOnlineConfigBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"getOnlineConfig"}));
        WindowBridgeExtension.AnonymousClass1 r013 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) OCRReceiptBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"recognizeTextMerchantReceipt"}));
        WindowBridgeExtension.AnonymousClass1 r014 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) UploadLocalImageBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"uploadLocalImage"}));
        WindowBridgeExtension.AnonymousClass1 r015 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ScreenshotBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.SCREENSHOT}));
        WindowBridgeExtension.AnonymousClass1 r016 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ZLZCommonH5PluginImpl.class, (List<String>) ArraysKt.toList((T[]) new String[]{"zolozFoundation", "hummerFoundation", "zimIdentity"}));
        WindowBridgeExtension.AnonymousClass1 r017 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ShareBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"share", H5ActionJSApi.SHARE_FILE}));
        WindowBridgeExtension.AnonymousClass1 r018 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) RequestPermissionsBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.REQUEST_PERMISSIONS}));
        WindowBridgeExtension.AnonymousClass1 r019 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ImagePickerBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.IMAGE_PICKER}));
        WindowBridgeExtension.AnonymousClass1 r020 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) DrawBitmapBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{DrawBitmapBridge.JSAPI_ACTION}));
        WindowBridgeExtension.AnonymousClass1 r021 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) DownloadFileBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.DOWNLOAD_FILE, H5ActionJSApi.DOWNLOAD}));
        WindowBridgeExtension.AnonymousClass1 r022 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) DeviceInformationBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.GET_DEVICE_INFO}));
        WindowBridgeExtension.AnonymousClass1 r023 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) DirectMessageBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJSApi.DIRECT_MESSAGE}));
        WindowBridgeExtension.AnonymousClass1 r024 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) OpenNativeAppBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"openNativeApp"}));
        WindowBridgeExtension.AnonymousClass1 r025 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) OpenAllShopBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"openAllShop"}));
        WindowBridgeExtension.AnonymousClass1 r026 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) OpenNearbyMeBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"openNearbyMe"}));
        WindowBridgeExtension.AnonymousClass1 r027 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) CutomRedirectToBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"customRedirectTo"}));
        WindowBridgeExtension.AnonymousClass1 r028 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) MapsUtilityBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"mapUtility"}));
        int hashCode = "production".hashCode();
        if (hashCode == -318354310 ? !"production".equals(ProductFlavor.PREPROD) : hashCode != 1753018553 || !"production".equals("production")) {
            WindowBridgeExtension.AnonymousClass1 r029 = WindowBridgeExtension.AnonymousClass1.getMin;
            WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) BcaIntegrationKitDevBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJsApi.BCA_ONEKLIK}));
        } else {
            WindowBridgeExtension.AnonymousClass1 r030 = WindowBridgeExtension.AnonymousClass1.getMin;
            WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) BcaIntegrationKitProdBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{H5ActionJsApi.BCA_ONEKLIK}));
        }
        WindowBridgeExtension.AnonymousClass1 r031 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) OpenScanQrBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"openQRScanner"}));
        WindowBridgeExtension.AnonymousClass1 r032 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) BottomSheetBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"bottomSheet"}));
        WindowBridgeExtension.AnonymousClass1 r033 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) NfcUtilityBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"nfcUtility"}));
        WindowBridgeExtension.AnonymousClass1 r034 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) GetLocationNameBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"locationName"}));
        WindowBridgeExtension.AnonymousClass1 r035 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ShowAgreementBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"showAgreement"}));
        WindowBridgeExtension.AnonymousClass1 r036 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) FaceVerificationEnablementBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"faceVerificationEnablement"}));
        WindowBridgeExtension.AnonymousClass1 r037 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) TwilioVerifySecurityProductBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"twilioVerifySecurityProduct"}));
        WindowBridgeExtension.AnonymousClass1 r038 = WindowBridgeExtension.AnonymousClass1.getMin;
        WindowBridgeExtension.AnonymousClass1.setMax((Class<? extends BridgeExtension>) ShowReferralEngagementDialogBridge.class, (List<String>) ArraysKt.toList((T[]) new String[]{"showReferralEngagementDialog"}));
    }

    private final void registerBridgeListener() {
        implementLocationListener();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Gps;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getLatestLocation"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements ILocationListener {
        public static final getMax INSTANCE = new getMax();

        getMax() {
        }

        public final DeviceInfo.Gps getLatestLocation(Context context) {
            DeviceInfo.Gps gps = new DeviceInfo.Gps((String) null, (String) null, 0, 0, (String) null, 31, (DefaultConstructorMarker) null);
            LBSLocation latestLocation = handlePushWindow.getLatestLocation(context);
            Intrinsics.checkNotNullExpressionValue(latestLocation, "LbsFacade.getLatestLocation(context)");
            setButtonFont$core setbuttonfont_core = setButtonFont$core.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            gps.setCityName(setbuttonfont_core.detectFakeGpsAndGpsService(context));
            gps.setLatitude(String.valueOf(latestLocation.getLatitude()));
            gps.setLongitude(String.valueOf(latestLocation.getLongitude()));
            gps.setTime(latestLocation.getTime());
            gps.setError(latestLocation.getErrorCode());
            return gps;
        }
    }

    private final void implementLocationListener() {
        DeviceInformationBridge.setMax setmax = DeviceInformationBridge.Companion;
        DeviceInformationBridge.setMax.setMax(getMax.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final String detectFakeGpsAndGpsService(Context context) {
        EventPoint eventPoint = getLatestSubdivision;
        if (eventPoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getLatestSubdivision");
        }
        GriverPerformanceStages griverPerformanceStages = (GriverPerformanceStages) eventPoint.execute(new EventPoint.setMin(GET_CITY_NAME_TIMEOUT_IN_SECONDS));
        return (griverPerformanceStages.getIndoSubdivisions().isMockLocation() || !WheelView.ScrollerTask.length(context)) ? "" : griverPerformanceStages.getIndoSubdivisions().getCityName();
    }
}
