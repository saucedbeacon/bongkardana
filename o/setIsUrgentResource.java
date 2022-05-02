package o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.timesync.TimeSyncManager;
import com.alipay.iap.android.common.timesync.component.ITimeSyncCallback;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.QuakeConfig;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.imobile.network.quake.rpc.IQuakeRpc;
import com.alipay.imobile.network.quake.rpc.QuakeRpc;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.CreateDialogParam;

@Singleton
public class setIsUrgentResource {
    private static final String APP_ID = "6CC59C4231550";
    private static final String APP_KEY = "6CC59C4231550_ANDROID";
    private static final String DEFAULT_RPC_GATEWAY_URL = "https://mgs-gw.m.dana.id/mgw.htm";
    public static final String LANGUAGE_TAG_ID = "ID";
    private static final String SIGN_AUTHCODE = "0ce8";
    private static final String SIGN_AUTHCODE_FOR_NOT_GOOGLE_PLAY = "0ce8_1";
    private static final String TENANT_ID = "FKPZXBCN";
    private static final String WORKSPACED_ID = "prod";
    /* access modifiers changed from: private */
    public final onAppResume apSecurityFacade;
    private final Context context;
    /* access modifiers changed from: private */
    public final getPerformanceTracker deviceInformationProvider;

    @Inject
    public setIsUrgentResource(Context context2, onAppResume onappresume, getPerformanceTracker getperformancetracker) {
        this.apSecurityFacade = onappresume;
        this.deviceInformationProvider = getperformancetracker;
        init(context2);
        this.context = context2;
    }

    public Context getContext() {
        return this.context;
    }

    private void init(Context context2) {
        IQuakeRpc createInstance = QuakeRpc.createInstance(context2);
        createInstance.getQuake().config(new QuakeConfig("6CC59C4231550", APP_KEY, CreateDialogParam.Agreement.isGooglePlaySignature(context2) ? SIGN_AUTHCODE : SIGN_AUTHCODE_FOR_NOT_GOOGLE_PLAY, DEFAULT_RPC_GATEWAY_URL, 4));
        Objects.requireNonNull(createInstance);
        RPCProxyHost.setRPCImplement(new isUrgentResource(createInstance));
        Quake.instance().addRequestInterceptor(new RequestInterceptor() {
            public final void afterReceiveResponse(@NonNull Request request, @NonNull NetworkResponse networkResponse) {
            }

            public final void beforeSendRequest(@NonNull Request request) {
                HashMap hashMap = new HashMap();
                hashMap.put("version", "1.0");
                hashMap.put("appId", Quake.instance().getConfig().getAppId());
                hashMap.put("X-Apdid-Token", setIsUrgentResource.this.apSecurityFacade.getApdidToken());
                hashMap.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, "prod");
                hashMap.put(HeaderConstant.HEADER_KEY_TENANT_ID, setIsUrgentResource.TENANT_ID);
                if (setIsUrgentResource.this.getLanguage().endsWith("ID")) {
                    hashMap.put("Accept-Language", setIsUrgentResource.this.getLanguage());
                }
                hashMap.put(HeaderConstant.HEADER_KEY_DID, setIsUrgentResource.this.deviceInformationProvider.getDeviceUtdId());
                request.addExternalInfo(hashMap);
            }
        });
        TimeSyncManager.getInstance(context2).syncTime((ITimeSyncCallback) null);
    }

    /* access modifiers changed from: private */
    public String getLanguage() {
        String obj = Locale.getDefault().toString();
        return obj.endsWith("ID") ? "id-ID" : obj;
    }

    public <T> T getFacade(Class<T> cls) {
        return RPCProxyHost.getInterfaceProxy(cls);
    }
}
