package com.alibaba.griver.device.jsapi.phone;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.jsapi.phone.contact.ContactAccount;
import com.alibaba.griver.device.jsapi.phone.contact.ContactPickerCallback;
import com.alibaba.griver.device.jsapi.phone.contact.ContactUtils;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;

public class ChoosePhoneContactBridgeExtension extends SimpleBridgeExtension {
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public void contact(@BindingNode(App.class) App app, @BindingCallback final BridgeCallback bridgeCallback) {
        ContactUtils.pickFromContactsList(app, new ContactPickerCallback() {
            public void onAccountReturned(ContactAccount contactAccount) {
                RVLogger.d("ChoosePhoneContactBridgeExtension", "onAccountReturned");
                if (contactAccount != null) {
                    String name = contactAccount.getName();
                    String phoneNumber = contactAccount.getPhoneNumber();
                    if (TextUtils.isEmpty(phoneNumber)) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(10, GriverEnv.getResources().getString(R.string.griver_no_contact_permission)));
                        return;
                    }
                    StringBuilder sb = new StringBuilder("ContactAccount name");
                    sb.append(name);
                    sb.append(" phoneNumber");
                    sb.append(phoneNumber);
                    RVLogger.d("ChoosePhoneContactBridgeExtension", sb.toString());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", (Object) name);
                    jSONObject.put(UploadTaskStatusCallback.NETWORK_MOBILE, (Object) phoneNumber);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(11, GriverEnv.getResources().getString(R.string.griver_contact_is_null)));
            }
        });
    }
}
