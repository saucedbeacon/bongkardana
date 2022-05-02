package com.iap.ac.android.biz.common.internal.foundation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FoundationProxy {
    public static Map<String, FoundationProxy> d = new HashMap();
    public static final Map<String, String> e;

    /* renamed from: a  reason: collision with root package name */
    public NetworkType f9680a = NetworkType.NETWORK_TYPE_ACRPC;
    public String b;
    public CommonConfig c;

    public enum NetworkType {
        NETWORK_TYPE_ACRPC,
        NETWORK_TYPE_PROXY,
        NETWORK_TYPE_EXTERNAL
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e = linkedHashMap;
        linkedHashMap.put(RegionFoundationProxy.COMPONENT_LOG, "com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade");
        e.put("userInfo", "com.iap.ac.android.biz.common.internal.foundation.facade.UserInfoFacade");
        e.put("instanceId", "com.iap.ac.android.biz.common.internal.foundation.facade.InstanceInfoFacade");
        e.put("network", "com.iap.ac.android.biz.common.internal.foundation.facade.NetworkFacade");
        e.put("amcs", "com.iap.ac.android.biz.common.internal.foundation.facade.AmcsFacade");
        e.put("gradient", "com.iap.ac.android.biz.common.internal.foundation.facade.GradientFacade");
        e.put("diagnoseLog", "com.iap.ac.android.biz.common.internal.foundation.facade.DiagnoseLogFacade");
    }

    public FoundationProxy(String str) {
        this.b = str;
    }

    public static synchronized FoundationProxy getInstance(String str) {
        FoundationProxy foundationProxy;
        synchronized (FoundationProxy.class) {
            foundationProxy = d.get(str);
            if (foundationProxy == null) {
                foundationProxy = new FoundationProxy(str);
                d.put(str, foundationProxy);
            }
        }
        return foundationProxy;
    }

    public final void a(String str, Context context, String str2, CommonConfig commonConfig) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls = Class.forName(str);
        cls.getDeclaredMethod("initComponent", new Class[]{Context.class, String.class, CommonConfig.class}).invoke(cls.newInstance(), new Object[]{context, str2, commonConfig});
    }

    public String getGateWayUrl() {
        CommonConfig commonConfig = this.c;
        if (commonConfig != null) {
            return commonConfig.gatewayUrl;
        }
        return null;
    }

    public NetworkType getNetworkType() {
        return this.f9680a;
    }

    public void init(Context context, CommonConfig commonConfig) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(e.keySet());
        init(context, commonConfig, linkedHashSet);
    }

    public void setNetworkType(@NonNull NetworkType networkType) {
        this.f9680a = networkType;
    }

    public void init(Context context, CommonConfig commonConfig, Set<String> set) {
        this.c = commonConfig;
        if (commonConfig != null && set != null) {
            for (String str : set) {
                try {
                    a(e.get(str), context, this.b, commonConfig);
                } catch (Exception e2) {
                    ACLog.e(Constants.TAG, "init exception:".concat(String.valueOf(e2)));
                }
            }
        }
    }
}
