package com.ap.zoloz.hummer.api;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.zoloz.config.ConfigCenter;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.common.AlertManager;
import com.ap.zoloz.hummer.common.ClientConfig;
import com.ap.zoloz.hummer.common.HummerContext;
import com.ap.zoloz.hummer.common.HummerCore;
import com.ap.zoloz.hummer.common.RecordManager;
import com.ap.zoloz.hummer.common.WebPageManager;
import com.ap.zoloz.hummer.rpc.RpcManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BaseFacade {
    public static final String TAG = "BaseFacade";
    private static ClientConfig mClientConfig;
    protected static boolean sIsBusy;
    public HummerContext mHummerContext;
    protected HummerCore mHummerCore;

    public void setContext(Context context) {
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.mContext = context;
            if (context != null) {
                ConfigCenter.getInstance().setApplicationContext(context.getApplicationContext());
            }
            AlertManager.getInstance().setContext(context);
            return;
        }
        HummerLogger.e("hummer context is null");
    }

    /* access modifiers changed from: protected */
    public void forceQuit() {
        HummerLogger.i("BaseFacade forceQuit");
        HummerCore hummerCore = this.mHummerCore;
        if (hummerCore != null) {
            hummerCore.forceQuit();
        }
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.forceQuit();
        }
        RecordManager.getInstance().release();
        mClientConfig = null;
    }

    /* access modifiers changed from: protected */
    public boolean parseAndSetConfig(String str) {
        if (!(this.mHummerCore == null || this.mHummerContext == null)) {
            if (mClientConfig == null) {
                mClientConfig = parseConfig(str);
            }
            ClientConfig clientConfig = mClientConfig;
            if (clientConfig != null) {
                this.mHummerContext.setClientConfig(clientConfig);
                this.mHummerContext.overwriteZStack(mClientConfig.zStack);
                ConfigCenter.getInstance().addAll((HashMap) mClientConfig.factorContext);
                HummerContext hummerContext = this.mHummerContext;
                hummerContext.add("metaInfo", HummerConstants.CONTEXT, getMetaInfo(hummerContext.mContext.getApplicationContext()));
                return true;
            }
        }
        return false;
    }

    private static ClientConfig parseConfig(String str) {
        try {
            ClientConfig clientConfig = (ClientConfig) JSON.parseObject(str, ClientConfig.class);
            if (clientConfig == null || clientConfig.factorContext == null || clientConfig.factorContext.size() == 0 || clientConfig.tasks == null || clientConfig.tasks.size() == 0 || clientConfig.clientStartIndex <= 0) {
                return null;
            }
            return clientConfig;
        } catch (Exception e) {
            HummerLogger.e(e.toString());
            return null;
        }
    }

    protected static String getAuthType(String str) {
        if (mClientConfig == null) {
            mClientConfig = parseConfig(str);
        }
        ClientConfig clientConfig = mClientConfig;
        if (clientConfig == null || !clientConfig.factorContext.containsKey(HummerConstants.AUTH_TYPE)) {
            return null;
        }
        return (String) mClientConfig.factorContext.get(HummerConstants.AUTH_TYPE);
    }

    protected static String getFlowId(String str) {
        if (mClientConfig == null) {
            mClientConfig = parseConfig(str);
        }
        ClientConfig clientConfig = mClientConfig;
        if (clientConfig == null || StringUtil.isNullorEmpty(clientConfig.flowId)) {
            return null;
        }
        return mClientConfig.flowId;
    }

    /* access modifiers changed from: protected */
    public boolean parseUIConfig(String str) {
        HummerContext hummerContext;
        HummerContext hummerContext2;
        if (!(this.mHummerCore == null || (hummerContext = this.mHummerContext) == null)) {
            byte[] assetsData = FileUtil.getAssetsData(hummerContext.mContext.getApplicationContext().getResources(), str);
            if (assetsData == null) {
                return true;
            }
            TaskUIConfig taskUIConfig = (TaskUIConfig) JSON.parseObject(new String(assetsData), TaskUIConfig.class);
            if (!(taskUIConfig == null || taskUIConfig.tasks.size() <= 0 || (hummerContext2 = this.mHummerContext) == null)) {
                hummerContext2.setTaskUIConfig(taskUIConfig);
                return true;
            }
        }
        return false;
    }

    public static String getMetaInfo(Context context) {
        ApSecurityService apSecurityService = (ApSecurityService) BioServiceManager.getLocalService(context, ApSecurityService.class);
        if (apSecurityService != null) {
            apSecurityService.setContext(context);
        }
        try {
            return JSON.toJSONString(ZIMFacade.getZimMetaInfo(context, (Map<String, Object>) null));
        } catch (Throwable th) {
            HummerLogger.e(th);
            return "";
        }
    }

    public void release() {
        ConfigCenter.getInstance().release();
        RecordManager.getInstance().triggerUpload();
        sIsBusy = false;
        AlertManager.getInstance().release();
        RpcManager.getInstance().release();
        RecordManager.getInstance().release();
        WebPageManager.getInstance().release();
        HummerCore hummerCore = this.mHummerCore;
        if (hummerCore != null) {
            hummerCore.release();
            this.mHummerCore = null;
        }
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.release();
            this.mHummerContext = null;
        }
        mClientConfig = null;
    }

    public static String getPublicKey(Context context, int i) {
        byte[] bArr;
        if (i == 0) {
            try {
                bArr = FileUtil.getAssetsData(context, "bid-log-key-public.key");
            } catch (Exception e) {
                HummerLogger.e(e.toString());
                return "";
            }
        } else {
            bArr = FileUtil.getAssetsData(context, "bid-log-key-public_t.key");
        }
        return new String(bArr);
    }

    public boolean customizePublicKey() {
        String rSAPublicKey = ConfigCenter.getInstance().getRSAPublicKey(0);
        String rSAPublicKey2 = ConfigCenter.getInstance().getRSAPublicKey(1);
        if (StringUtil.isNullorEmpty(rSAPublicKey) || StringUtil.isNullorEmpty(rSAPublicKey2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ZIMFacade.KEY_PUBLIC_KEY_PROD, rSAPublicKey);
        hashMap.put(ZIMFacade.KEY_PUBLIC_KEY_TEST, rSAPublicKey2);
        ZIMFacade.setEnv(hashMap);
        return true;
    }

    public void customizeLocale(Map<String, Object> map) {
        if (map != null && map.containsKey(HummerConstants.HUMMER_LOCALE)) {
            String str = (String) map.get(HummerConstants.HUMMER_LOCALE);
            HashMap hashMap = new HashMap();
            hashMap.put("locale", str);
            ZIMFacade.setEnv(hashMap);
            Resources resources = this.mHummerContext.mContext.getApplicationContext().getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = new Locale(str);
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public static void init(Context context) {
        ZIMFacade.install(context);
    }
}
