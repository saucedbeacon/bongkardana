package com.zoloz.builder.plugin;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.h5.IH5HandlerCallback;
import com.ap.zoloz.hummer.h5.ZolozBaseH5Handler;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import com.ap.zoloz.hummer.h5.ZolozFoundationHandler;
import java.util.ArrayList;
import java.util.List;

public class ZLZCommonH5PluginImpl extends SimpleBridgeExtension {
    private static final String TAG = "ZLZCommonH5PluginImpl";
    private static List<String> list = new ArrayList();
    private final String HUMMER_FOUDATION = "hummerFoundation";
    private final String ZIM_IDENTITY = "zimIdentity";
    private final String ZOLOZ_FOUNDATION = "zolozFoundation";
    private ZolozBaseH5Handler mZolozBaseH5Handler = new ZolozBaseH5Handler();
    private ZolozEkycH5Handler mZolozEkycH5Handler = new ZolozEkycH5Handler();
    private ZolozFoundationHandler mZolozFoundationHandler = new ZolozFoundationHandler();

    public ZLZCommonH5PluginImpl() {
        HummerLogger.i(TAG, "ZLZCommonH5PluginImpl new ...");
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zimIdentity(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        identify("zimIdentity", page, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void hummerFoundation(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        identify("hummerFoundation", page, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zolozFoundation(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        identify("zolozFoundation", page, jSONObject, bridgeCallback);
    }

    private void identify(String str, Page page, JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        String string = jSONObject.getString("action");
        Activity activity = page.getPageContext().getActivity();
        AnonymousClass1 r1 = new IH5HandlerCallback() {
            public void onCompletion(JSONObject jSONObject) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
            }
        };
        if ("zolozFoundation".equals(str)) {
            this.mZolozFoundationHandler.identify(jSONObject, activity, r1);
        } else if (ZolozBaseH5Handler.ZIM_IDENTIFY_GET_META_INFO.equals(string)) {
            this.mZolozBaseH5Handler.identify(jSONObject, activity, r1);
        } else {
            this.mZolozEkycH5Handler.identify(jSONObject, activity, r1);
        }
    }
}
