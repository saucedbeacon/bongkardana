package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.iap.ac.android.common.instance.IInstanceInfo;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.instance.IAPInstanceInfo;
import com.iap.ac.android.rpc.RpcProxyImpl;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.delegate.ConfigIdentifierProvider;
import com.iap.ac.config.lite.utils.ConfigUtils;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppLoadPoint;
import o.CreateDialogParam;

@Singleton
public class AppPausePoint {
    private String authCode = "125c";
    private boolean initialized;
    private final List<setMax> listeners = new ArrayList();

    public interface setMax {
        void onAmcsInitialized();
    }

    @Inject
    public AppPausePoint(Context context) {
        startAmcsService(context, "prod");
    }

    public void startAmcsService(@NonNull Context context, @NonNull String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(437789621, oncanceled);
                onCancelLoad.getMin(437789621, oncanceled);
            }
        }
        if (!this.initialized) {
            initAmcsLite(context, str);
            LoggerFactory.init(context);
            onLoadResult.monitorSyncConnectState();
            UserInfoManager.instance().addUserChangeObserver(new IAPUserChangeObserver() {
                public final void onUserChanged(IAPLoginUserInfo iAPLoginUserInfo) {
                    ConfigCenter.getInstance().refreshConfig();
                }

                public final void onUserLogin(IAPLoginUserInfo iAPLoginUserInfo) {
                    ConfigCenter.getInstance().refreshConfig();
                }

                public final void onUserLogout() {
                    ConfigCenter.getInstance().refreshConfig();
                }
            });
            if (!CreateDialogParam.Agreement.isGooglePlaySignature(context)) {
                this.authCode = "0a6a_prod";
            }
        }
    }

    private void initAmcsLite(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-214513624, oncanceled);
                onCancelLoad.getMin(-214513624, oncanceled);
            }
        }
        RpcAppInfo rpcAppInfo = new RpcAppInfo();
        rpcAppInfo.appId = "RTC2347987";
        rpcAppInfo.rpcGateWayUrl = "https://gw-dana.ebuckler.com/imgw.htm";
        rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, "default");
        rpcAppInfo.authCode = this.authCode;
        setupDeviceInfo();
        setupRpcForAmcsLite(rpcAppInfo, context);
        setupConfigCenterLite(context, str, rpcAppInfo);
        this.initialized = true;
        for (setMax onAmcsInitialized : this.listeners) {
            onAmcsInitialized.onAmcsInitialized();
        }
    }

    private void setupDeviceInfo() {
        InstanceInfo.setInstanceInfoImpl(new IInstanceInfo() {
            public final String getInstanceId(@NonNull Context context) {
                return IAPInstanceInfo.instanceId(context);
            }

            public final String getTid(@NonNull Context context) {
                return IAPInstanceInfo.tid(context);
            }
        });
    }

    private void setupSync(Context context, ConfigCenterContext configCenterContext, String str) {
        AppOnConfigurationChangedPoint.initializeSync(context, str, this.authCode);
        new AppLoadPoint.LoadResultCallback().startTrigger(configCenterContext);
    }

    private void setupRpcForAmcsLite(RpcAppInfo rpcAppInfo, Context context) {
        RpcProxyImpl instance = RpcProxyImpl.getInstance();
        instance.initialize(context, rpcAppInfo);
        RPCProxyHost.setRpcProxy(instance);
        RpcGatewayController.initGatewayController(context);
    }

    private void setupConfigCenterLite(Context context, String str, RpcAppInfo rpcAppInfo) {
        ConfigCenter instance = ConfigCenter.getInstance();
        ConfigCenterContext configCenterContext = new ConfigCenterContext(context, rpcAppInfo, str, (String) null, "default", "4B3A8BA311135", (String) null);
        configCenterContext.setIdentifierProvider(new ConfigIdentifierProvider() {
            @NonNull
            public final String getUtdId(@NonNull Context context) {
                return UTDevice.getUtdid(context);
            }

            @NonNull
            public final String getConfigUserId(@NonNull Context context) {
                String userId = UserInfoManager.instance().getUserId();
                if (TextUtils.isEmpty(userId)) {
                    return "";
                }
                return MiscUtils.md5(userId);
            }
        });
        configCenterContext.setDnsServer("223.5.5.5");
        configCenterContext.setVersion(ConfigCenterContext.SchemeVersion.V1);
        instance.initialize(configCenterContext);
        instance.refreshConfig();
        ConfigUtils.setConfigProxy();
        new AppLoadPoint.LoadResultCallback().startTrigger(configCenterContext);
        setupSync(context, configCenterContext, str);
    }

    public void addListener(@NonNull setMax setmax) {
        this.listeners.add(setmax);
    }

    public void removeListener(@NonNull setMax setmax) {
        this.listeners.remove(setmax);
    }

    public boolean isInitialized() {
        return this.initialized;
    }
}
