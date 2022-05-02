package com.alipay.alipaysecuritysdk.apdid.rpc.service;

import com.alipay.alipaysecuritysdk.apdid.rpc.model.report.ReportRequest;
import com.alipay.alipaysecuritysdk.apdid.rpc.model.report.ReportResult;
import com.alipay.c.a.a.a.a;

public interface DeviceDataReportService {
    @a(a = "alipay.security.deviceFingerPrint.dynamicData.report")
    ReportResult reportDynamicData(ReportRequest reportRequest);

    @a(a = "alipay.security.deviceFingerPrint.staticData.report.v2")
    ReportResult reportStaticData(ReportRequest reportRequest);
}
