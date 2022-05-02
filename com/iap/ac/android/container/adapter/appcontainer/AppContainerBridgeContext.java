package com.iap.ac.android.container.adapter.appcontainer;

import com.alipay.mobile.h5container.api.H5BridgeContext;
import com.alipay.mobile.h5container.api.H5Event;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import org.json.JSONObject;

public class AppContainerBridgeContext extends ContainerBridgeContext {
    private H5BridgeContext h5BridgeContext;
    private H5Event mH5Event;

    public AppContainerBridgeContext(H5Event h5Event, H5BridgeContext h5BridgeContext2) {
        this.h5BridgeContext = h5BridgeContext2;
        this.mH5Event = h5Event;
    }

    public boolean sendBridgeResult(JSONObject jSONObject) {
        H5Event h5Event;
        if (this.h5BridgeContext == null || (h5Event = this.mH5Event) == null || !ContainerUtils.isActivityRunning(h5Event.getActivity())) {
            return false;
        }
        return this.h5BridgeContext.sendBridgeResult(ContainerUtils.jsonObjectToFastJson(jSONObject));
    }

    public boolean sendBridgeResult(String str, Object obj) {
        H5Event h5Event;
        if (this.h5BridgeContext == null || (h5Event = this.mH5Event) == null || !ContainerUtils.isActivityRunning(h5Event.getActivity())) {
            return false;
        }
        return this.h5BridgeContext.sendBridgeResult(str, obj);
    }
}
