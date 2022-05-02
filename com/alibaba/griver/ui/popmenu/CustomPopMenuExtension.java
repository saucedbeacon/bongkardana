package com.alibaba.griver.ui.popmenu;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.LinkedList;

public class CustomPopMenuExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void setCustomPopMenu(@BindingNode(Page.class) Page page, @BindingParam(name = {"menus"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        if (jSONArray == null || jSONArray.size() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("menuIconUrl");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    if (linkedList.contains(string)) {
                        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Duplicated item name is not allowed."));
                        return;
                    }
                    linkedList.add(string);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", (Object) string);
                    jSONObject2.put("menuIconUrl", (Object) string2);
                    jSONArray2.add(jSONObject2);
                }
            }
        }
        if (jSONArray2.size() > 0) {
            page.setData(JSONArray.class, jSONArray2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", (Object) Boolean.TRUE);
            bridgeCallback.sendJSONResponse(jSONObject3);
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
    }
}
