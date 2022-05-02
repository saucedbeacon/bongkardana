package com.alibaba.griver.base.resource.utils;

import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class PrepareContextUitls {
    public static void setTimeoutForContext(PrepareContext prepareContext) {
        long j;
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG, GriverConfigConstants.DEFAULT_APP_INFO_UPDATE);
        try {
            JSONObject parseObject = JSON.parseObject(config);
            j = (!parseObject.containsKey(GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT) || parseObject.getLong(GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT).longValue() <= 0) ? 30 : parseObject.getLong(GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT).longValue();
        } catch (Exception unused) {
            GriverLogger.e("PrepareContextUitls", "parse app info update config failed, config: ".concat(String.valueOf(config)));
            j = -1;
        }
        if (j > 0) {
            prepareContext.setTimeout(j * 1000);
        }
    }
}
