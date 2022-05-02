package com.alipay.plus.push.core.rpc.report;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.plus.push.core.rpc.ResultPbPB;
import com.alipay.plus.push.core.rpc.report.pb.DeviceInfoReqPbPB;

public interface DeviceReportFacade {
    @OperationType("alipay.client.yunpushcore.device.report")
    @SignCheck
    ResultPbPB report(DeviceInfoReqPbPB deviceInfoReqPbPB);
}
