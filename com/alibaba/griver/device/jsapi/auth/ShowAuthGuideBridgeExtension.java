package com.alibaba.griver.device.jsapi.auth;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.extension.PermissionGuildePoint;
import com.alibaba.fastjson.JSONObject;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsCategories;
import java.util.HashSet;
import java.util.Set;

@Keep
public class ShowAuthGuideBridgeExtension extends SimpleBridgeExtension {
    private static final Set<String> AUTH_GUIDE_AUTHTYPE;
    private static final String TAG = "ShowAuthGuideBridgeExtension";

    static {
        HashSet hashSet = new HashSet();
        AUTH_GUIDE_AUTHTYPE = hashSet;
        hashSet.add("SELFSTARTING");
        AUTH_GUIDE_AUTHTYPE.add("ADDRESSBOOK");
        AUTH_GUIDE_AUTHTYPE.add(RequestPermissionsCategories.CAMERA);
        AUTH_GUIDE_AUTHTYPE.add("PHOTO");
        AUTH_GUIDE_AUTHTYPE.add("LBS");
        AUTH_GUIDE_AUTHTYPE.add("LBSSERVICE");
        AUTH_GUIDE_AUTHTYPE.add(RequestPermissionsCategories.NOTIFICATION);
        AUTH_GUIDE_AUTHTYPE.add(RequestPermissionsCategories.MICROPHONE);
        AUTH_GUIDE_AUTHTYPE.add("SHINFO");
        AUTH_GUIDE_AUTHTYPE.add("SHORTCUT");
        AUTH_GUIDE_AUTHTYPE.add("BACKGROUNDER");
        AUTH_GUIDE_AUTHTYPE.add("LBSSERVICE");
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void showAuthGuide(@BindingParam({"issue"}) String str, @BindingParam({"source"}) String str2, @BindingParam({"option"}) String str3, @BindingParam({"authType"}) String str4, @BindingParam({"bizType"}) String str5, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str4) || page == null || !AUTH_GUIDE_AUTHTYPE.contains(str4) || TextUtils.isEmpty(str5)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        RVLogger.d(TAG, "showAuthGuide bizType = ".concat(String.valueOf(str5)));
        boolean startPermissionGuide = ExtensionPoint.as(PermissionGuildePoint.class).node(page.getApp()).create().startPermissionGuide(str4, str5);
        RVLogger.d(TAG, "showAuthGuide, isShown: ".concat(String.valueOf(startPermissionGuide)));
        jSONObject.put("shown", (Object) Boolean.valueOf(startPermissionGuide));
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
