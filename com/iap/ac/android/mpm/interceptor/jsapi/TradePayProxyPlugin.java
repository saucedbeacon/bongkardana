package com.iap.ac.android.mpm.interceptor.jsapi;

import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.js.AlipayJSAPI;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;

public class TradePayProxyPlugin extends TradePayPlugin {
    public static final String TAG = "TradePayProxyPlugin";
    public static final String TRADE_PAY = "tradePayAC";

    @AlipayJSAPI(api = "tradePayAC")
    public void api(Map<String, String> map, IContainerPresenter iContainerPresenter, ContainerBridgeContext containerBridgeContext) {
        ACLog.d(TAG, "api tradePayAC");
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_interceptor_jsapi").addParams("action", TRADE_PAY).addParams("params", (Object) map).event();
        super.api(map, iContainerPresenter, containerBridgeContext);
    }

    public Class<? extends BaseJSPlugin> getJSPluginClass() {
        return TradePayProxyPlugin.class;
    }
}
