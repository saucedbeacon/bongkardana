package com.zoloz.builder.service;

import android.text.TextUtils;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.config.ConfigCenter;
import com.zoloz.builder.buildconfig.AppUtils;
import com.zoloz.rpc.RpcConfig;
import com.zoloz.rpc.RpcProxyUtil;
import com.zoloz.rpc.encryption.EncryptionRPCService;
import com.zoloz.rpc.pb.PbInvocationHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RpcServiceProxy extends EncryptionRPCService {
    public static final String TAG = "RpcServiceProxy";
    private static Map<String, Object> config = new HashMap();
    private static String mRemoteUrl;
    private String customGW = null;

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        String remoteUrl = RpcConfig.getInstance().getRemoteUrl();
        this.customGW = remoteUrl;
        if (!TextUtils.isEmpty(remoteUrl)) {
            mRemoteUrl = this.customGW;
        }
        RpcConfig.getInstance().setConnectTimeout(10000);
        RpcConfig.getInstance().setReadTimeout(30000);
        RpcConfig.getInstance().setWorkspaceId((String) config.get("WORKSPACE_ID"));
        RpcConfig.getInstance().setAppId((String) config.get("APP_ID"));
        if (bioServiceManager != null && AppUtils.isDebug(bioServiceManager.getBioApplicationContext())) {
            RpcConfig.needCatchRpc = true;
        }
    }

    public <T> T getEncryptionRpcProxy(Class<T> cls) {
        RpcConfig.getInstance().setWorkspaceId((String) config.get("WORKSPACE_ID"));
        RpcConfig.getInstance().setAppId((String) config.get("APP_ID"));
        PbInvocationHandler pbInvocationHandler = new PbInvocationHandler();
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, pbInvocationHandler);
    }

    public <T> T getRpcProxy(Class<T> cls) {
        RpcConfig.getInstance().setWorkspaceId((String) config.get("WORKSPACE_ID"));
        RpcConfig.getInstance().setAppId((String) config.get("APP_ID"));
        if (!cls.getName().equals("com.zoloz.zhub.common.factor.facade.HummerH5Facade")) {
            return super.getRpcProxy(cls);
        }
        InvocationHandler buildRpcImpl = buildRpcImpl(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, buildRpcImpl);
    }

    public String getPublicKey() {
        return ConfigCenter.getInstance().getRSAPublicKey();
    }

    public String getMid() {
        Object frameworkValue = ConfigCenter.getInstance().getFrameworkValue("merchantId");
        if (frameworkValue == null) {
            return "";
        }
        return String.valueOf(frameworkValue);
    }

    public void setRemoteUrl(String str) {
        String str2 = this.customGW;
        if (str2 == null || str2.startsWith("http")) {
            RpcConfig.getInstance().setRemoteUrl(str);
        } else if (str != null) {
            try {
                str = str.replace(new URL(str).getHost(), this.customGW);
            } catch (MalformedURLException unused) {
            }
            RpcConfig.getInstance().setRemoteUrl(str);
        } else {
            RpcConfig.getInstance().setRemoteUrl(mRemoteUrl);
        }
    }

    public void setExtProperties(Map<String, Object> map) {
        config.putAll(map);
    }

    private InvocationHandler buildRpcImpl(Class cls) {
        return new RpcProxyUtil().buildProxyObj(cls, this.mContext);
    }
}
