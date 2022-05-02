package com.alibaba.griver.base.common.rpc;

import android.os.Build;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.iap.ac.android.common.instance.InstanceInfo;
import java.io.Serializable;

public class BaseGriverRpcRequest implements Serializable {
    private DeviceInfo deviceInfo = new DeviceInfo();

    public BaseGriverRpcRequest() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        this.deviceInfo.clientVersion = rVEnvironmentService != null ? rVEnvironmentService.getProductVersion() : "";
        this.deviceInfo.manufacturer = Build.MANUFACTURER;
        this.deviceInfo.osVersion = Build.VERSION.RELEASE;
        this.deviceInfo.osType = "Android";
        this.deviceInfo.tokenId = InstanceInfo.getInstanceId(GriverEnv.getApplicationContext());
    }

    class DeviceInfo {
        public String clientVersion;
        public String manufacturer;
        public String osType;
        public String osVersion;
        public String tokenId;

        private DeviceInfo() {
        }
    }
}
