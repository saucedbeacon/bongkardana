package com.iap.ac.android.acs.plugin.biz.region.foundation;

import android.content.Context;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RegionFoundationProxy {
    public static final String COMPONENT_LOG = "log";
    public static final String COMPONENT_NETWORK = "network";
    public static final String COMPONENT_USER_INFO = "userInfo";
    private static final Map<String, String> SUPPORTED_COMPONENT_MAP;
    private static RegionFoundationProxy proxy;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SUPPORTED_COMPONENT_MAP = linkedHashMap;
        linkedHashMap.put(COMPONENT_LOG, "com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade");
        SUPPORTED_COMPONENT_MAP.put("userInfo", "com.iap.ac.android.acs.plugin.biz.region.foundation.facade.RegionUserInfoFacade");
        SUPPORTED_COMPONENT_MAP.put("network", "com.iap.ac.android.biz.common.internal.foundation.facade.NetworkFacade");
    }

    public static synchronized RegionFoundationProxy getInstance() {
        RegionFoundationProxy regionFoundationProxy;
        synchronized (RegionFoundationProxy.class) {
            if (proxy == null) {
                proxy = new RegionFoundationProxy();
            }
            regionFoundationProxy = proxy;
        }
        return regionFoundationProxy;
    }

    public void init(Context context, CommonConfig commonConfig) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(SUPPORTED_COMPONENT_MAP.keySet());
        init(context, commonConfig, linkedHashSet);
    }

    public void init(Context context, CommonConfig commonConfig, Set<String> set) {
        if (commonConfig != null && set != null) {
            for (String str : set) {
                try {
                    invokeInitComponent(SUPPORTED_COMPONENT_MAP.get(str), context, "region_biz", commonConfig);
                } catch (Exception e) {
                    ACLog.e(Constants.TAG, "init exception:".concat(String.valueOf(e)));
                }
            }
        }
    }

    private void invokeInitComponent(String str, Context context, String str2, CommonConfig commonConfig) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> cls = Class.forName(str);
        cls.getDeclaredMethod("initComponent", new Class[]{Context.class, String.class, CommonConfig.class}).invoke(cls.newInstance(), new Object[]{context, str2, commonConfig});
    }
}
