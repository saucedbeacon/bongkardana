package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import id.dana.data.tracker.TrackerDataKey;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import o.TitleBarRightButtonView;
import o.b;
import o.c;
import org.json.JSONObject;

public final class com_alibaba_ariver_app_api_ExtOpt$100$1 implements getAdapterPosition<c.AnonymousClass1> {
    private final b.C0007b<b.AnonymousClass8> bokuApiProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public com_alibaba_ariver_app_api_ExtOpt$100$1(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<b.AnonymousClass8> bVar4, b.C0007b<Context> bVar5, b.C0007b<getPerformanceTracker> bVar6) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.bokuApiProvider = bVar4;
        this.contextProvider = bVar5;
        this.deviceInformationProvider = bVar6;
    }

    public final c.AnonymousClass1 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.bokuApiProvider.get(), this.contextProvider.get(), this.deviceInformationProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$100$1 create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<b.AnonymousClass8> bVar4, b.C0007b<Context> bVar5, b.C0007b<getPerformanceTracker> bVar6) {
        return new com_alibaba_ariver_app_api_ExtOpt$100$1(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static c.AnonymousClass1 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, b.AnonymousClass8 r11, Context context, getPerformanceTracker getperformancetracker) {
        return new b.AnonymousClass10(setisurgentresource, appxloadfailed, onappresume, r11, context, getperformancetracker) {
            private static final String PHONE_NUMBER = "PHONE_NUMBER";
            private static final Integer REQUEST_NETWORK_TIMEOUT = 3000;
            private final b.AnonymousClass8 bokuApi;
            private final Context context;
            private final getPerformanceTracker deviceInformationProvider;
            private HttpURLConnection httpURLConnection;
            private JSONObject jsonObject = new JSONObject();

            {
                this.bokuApi = r4;
                this.context = r5;
                this.deviceInformationProvider = r6;
            }

            public TitleBarRightButtonView.AnonymousClass1<Boolean> getBokuSilentOTP(String str, String str2) {
                return invokeGetBokuSilentOtp(str, str2, 3).map(new com_alibaba_ariver_app_api_ExtOpt$102$1(this, str2));
            }

            public TitleBarRightButtonView.AnonymousClass1<Boolean> getBokuSilentOTPWithMobileNetwork(String str, String str2) {
                try {
                    trackBokuRequest(str2, Boolean.TRUE);
                    return initConnectivityManager(new URL(str), str2);
                } catch (MalformedURLException unused) {
                    return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
                }
            }

            public TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$66$1> getBokuUrl(String str, String str2) {
                com_alibaba_ariver_app_api_ExtOpt$67$1 com_alibaba_ariver_app_api_extopt_67_1 = new com_alibaba_ariver_app_api_ExtOpt$67$1();
                com_alibaba_ariver_app_api_extopt_67_1.setConsentId(getConsentID());
                com_alibaba_ariver_app_api_extopt_67_1.setPhoneNumber(str);
                com_alibaba_ariver_app_api_extopt_67_1.envInfo = generateMobileEnvInfo();
                if (str2.equals("Registration")) {
                    com_alibaba_ariver_app_api_extopt_67_1.setUserIdType("PHONE_NUMBER");
                }
                return wrapper(new com_alibaba_ariver_app_api_ExtOpt$103$1(com_alibaba_ariver_app_api_extopt_67_1));
            }

            private TitleBarRightButtonView.AnonymousClass1<getAppenderManager<Void>> invokeGetBokuSilentOtp(String str, String str2, Integer num) {
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                trackBokuRequest(str2, Boolean.FALSE);
                return this.bokuApi.getBokuSilentOTP(str).timeout((long) REQUEST_NETWORK_TIMEOUT.intValue(), TimeUnit.MILLISECONDS).flatMap(new com_alibaba_ariver_app_api_ExtOpt$101$1(this, valueOf, str2));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$invokeGetBokuSilentOtp$2(Integer num, String str, getAppenderManager getappendermanager) throws Exception {
                String locationUrlHeader = getLocationUrlHeader(getappendermanager);
                if (locationUrlHeader.isEmpty()) {
                    return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new Exception("location url is empty"));
                }
                if (getappendermanager.getMin.getMax != 302 || num.intValue() <= 0) {
                    return TitleBarRightButtonView.AnonymousClass1.just(getappendermanager);
                }
                return invokeGetBokuSilentOtp(locationUrlHeader, str, num);
            }

            private String getConsentID() {
                getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
                if (getperformancetracker != null) {
                    return getperformancetracker.getDeviceUUID().replaceAll("-", "");
                }
                return "";
            }

            @TargetApi(26)
            private TitleBarRightButtonView.AnonymousClass1<Boolean> initConnectivityManager(URL url, String str) {
                TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new com_alibaba_ariver_app_api_ExtOpt$104$1(this, url, str, (ConnectivityManager) this.context.getSystemService("connectivity"), new NetworkRequest.Builder().addCapability(12).addTransportType(0).build()));
                if (min instanceof getSecondFloorView) {
                    return ((getSecondFloorView) min).setMax();
                }
                setTitleLoading settitleloading = new setTitleLoading(min);
                RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
                return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$initConnectivityManager$3(final URL url, final String str, ConnectivityManager connectivityManager, NetworkRequest networkRequest, final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r6) throws Exception {
                connectivityManager.requestNetwork(networkRequest, new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        try {
                            r6.onSuccess(Boolean.valueOf(AnonymousClass1.this.connectToBokuUrl(url, network, str) == 200));
                        } catch (IOException unused) {
                            r6.onSuccess(Boolean.FALSE);
                        }
                    }

                    public final void onUnavailable() {
                        r6.onSuccess(Boolean.FALSE);
                    }
                }, REQUEST_NETWORK_TIMEOUT.intValue());
            }

            /* access modifiers changed from: private */
            public int connectToBokuUrl(URL url, Network network, String str) throws IOException {
                String str2;
                HttpURLConnection createConnectionObject = createConnectionObject(network, url);
                this.httpURLConnection = createConnectionObject;
                createConnectionObject.connect();
                String valueOf = String.valueOf(this.httpURLConnection.getResponseCode());
                if (this.httpURLConnection.getResponseMessage() == null) {
                    str2 = "";
                } else {
                    str2 = this.httpURLConnection.getResponseMessage();
                }
                trackBokuUrlCalled(str, valueOf, str2);
                if (this.httpURLConnection.getResponseCode() == 302) {
                    return handleMovedTempResponseCode(network);
                }
                return this.httpURLConnection.getResponseCode();
            }

            private int handleMovedTempResponseCode(Network network) throws IOException {
                HttpURLConnection createConnectionObject = createConnectionObject(network, new URL(this.httpURLConnection.getHeaderField("location")));
                this.httpURLConnection = createConnectionObject;
                createConnectionObject.connect();
                return this.httpURLConnection.getResponseCode();
            }

            @TargetApi(26)
            private HttpURLConnection createConnectionObject(Network network, URL url) throws IOException {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) network.openConnection(url);
                httpURLConnection2.setConnectTimeout(REQUEST_NETWORK_TIMEOUT.intValue());
                httpURLConnection2.setReadTimeout(REQUEST_NETWORK_TIMEOUT.intValue());
                return httpURLConnection2;
            }

            private void trackBokuRequest(String str, Boolean bool) {
                if (!TextUtils.isEmpty(str)) {
                    setExtras.track(this.context, TrackerDataKey.Event.CARRIER_IDENTIFICATION_REQUEST, getRequestApps.addTrackerProperties(this.jsonObject, TrackerDataKey.Event.CARRIER_IDENTIFICATION_REQUEST, str, bool.booleanValue(), "", ""));
                }
            }

            private void trackBokuUrlCalled(String str, String str2, String str3) {
                setExtras.track(this.context, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_CALLED, getRequestApps.addTrackerProperties(this.jsonObject, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_CALLED, str, false, str2, str3));
            }

            public Class<b.AnonymousClass7> getFacadeClass() {
                return b.AnonymousClass7.class;
            }

            private String getLocationUrlHeader(getAppenderManager<Void> getappendermanager) {
                String length = getappendermanager.getMin.toIntRange.length("Location");
                String length2 = getappendermanager.getMin.toIntRange.length("location");
                if (length == null || length.isEmpty()) {
                    return (length2 == null || length2.isEmpty()) ? "" : length2;
                }
                return length;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ Boolean lambda$getBokuSilentOTP$0(String str, getAppenderManager getappendermanager) throws Exception {
                String str2;
                String valueOf = String.valueOf(getappendermanager.getMin.getMax);
                if (getappendermanager.getMin.length == null) {
                    str2 = "";
                } else {
                    str2 = getappendermanager.getMin.length;
                }
                trackBokuUrlCalled(str, valueOf, str2);
                return Boolean.valueOf(getappendermanager.getMin.getMax == 200);
            }
        };
    }
}
