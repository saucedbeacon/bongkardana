package com.iap.ac.android.container.adapter.griver;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.MonitorUtils;
import com.iap.ac.android.mpm.interceptor.jsapi.TradePayPlugin;
import java.net.URLEncoder;
import o.getTabbarModel;
import org.json.JSONObject;

public class MonitorUtil {
    private static final String TAG = "MonitorUtil";

    public static void monitorTradePay(BridgeInterceptor.InterceptContext interceptContext, JSONObject jSONObject) {
        MonitorMap.Builder handleTradePayMonitor = handleTradePayMonitor(interceptContext);
        if (handleTradePayMonitor != null) {
            if (jSONObject.isNull("error")) {
                handleTradePayMonitor.append("status", "success");
            } else {
                handleTradePayMonitor.append("status", "error");
            }
            try {
                handleTradePayMonitor.append("result", URLEncoder.encode(JSON.toJSONString(jSONObject), getTabbarModel.ENC));
            } catch (Exception e) {
                GriverLogger.e(TAG, "encode result failed", e);
            }
            GriverMonitor.event(GriverMonitorConstants.EVENT_TRADE_PAY, "GriverAppContainer", handleTradePayMonitor.build());
        }
    }

    public static void monitorTradePayStart(BridgeInterceptor.InterceptContext interceptContext) {
        MonitorMap.Builder handleTradePayMonitor = handleTradePayMonitor(interceptContext);
        if (handleTradePayMonitor != null) {
            GriverMonitor.event(GriverMonitorConstants.EVENT_TRADE_PAY_START, "GriverAppContainer", handleTradePayMonitor.build());
        }
    }

    private static MonitorMap.Builder handleTradePayMonitor(BridgeInterceptor.InterceptContext interceptContext) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        Page page = interceptContext.page;
        App app = page.getApp();
        builder.appId(app.getAppId()).version(app).url(page.getOriginalURI());
        builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app.getStartParams()));
        builder.env(GriverEnv.getEnvironment());
        com.alibaba.fastjson.JSONObject jSONObject = interceptContext.jsParameters;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("tradeNO");
        String string2 = jSONObject.getString(TradePayPlugin.PAYMENT_URL);
        String string3 = jSONObject.getString("orderStr");
        if (!TextUtils.isEmpty(string2)) {
            builder.append("tradeType", TradePayPlugin.PAYMENT_URL).append("tradeInfo", string2);
        } else if (!TextUtils.isEmpty(string3)) {
            builder.append("tradeType", "orderStr").append("tradeInfo", string3);
        } else if (TextUtils.isEmpty(string)) {
            return null;
        } else {
            builder.append("tradeType", "tradeNO").append("tradeInfo", string);
        }
        return builder;
    }
}
