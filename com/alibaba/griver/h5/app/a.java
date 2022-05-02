package com.alibaba.griver.h5.app;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.resource.extensions.GriverCommonResourceProxy;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.GriverResourceManager;
import java.util.List;

public class a {
    public static void a(String str) {
        try {
            List list = (List) JSONObject.parseObject(str, new TypeReference<List<String>>() {
            }, new Feature[0]);
            if (list != null && list.size() > 0) {
                RVProxy.set(GriverCommonResourceProxy.class, new GriverH5AppInstallManager$2(list));
            }
        } catch (Exception e) {
            GriverLogger.e("GriverH5AppInstallManager", "parse common resource failed", e);
        }
    }

    public static void a(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            GriverLogger.d("GriverH5AppInstallManager", "config is null, return directly");
        } else {
            GriverExecutors.getSingleOrderThreadExecutorByName("saveConfiguration").execute(new AbstractPriorityRunnable(10) {
                public final void runTask() {
                    GriverLogger.d("GriverH5AppInstallManager", "start to install configuration");
                    GriverResourceManager.saveConfiguration(GriverResourceManager.parseAppInfoFromJSONString(JSON.toJSONString(jSONObject)), false);
                }
            });
        }
    }
}
