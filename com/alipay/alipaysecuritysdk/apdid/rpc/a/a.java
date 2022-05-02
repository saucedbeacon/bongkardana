package com.alipay.alipaysecuritysdk.apdid.rpc.a;

import android.content.Context;
import com.alipay.a.a.a.a.d;
import com.alipay.a.a.a.a.w;
import com.alipay.alipaysecuritysdk.apdid.rpc.model.a.b;
import com.alipay.alipaysecuritysdk.apdid.rpc.model.report.ReportRequest;
import com.alipay.alipaysecuritysdk.apdid.rpc.model.report.ReportResult;
import com.alipay.alipaysecuritysdk.apdid.rpc.service.DeviceDataReportService;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.common.e.f;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;

public final class a implements com.alipay.alipaysecuritysdk.apdid.rpc.a {

    /* renamed from: a  reason: collision with root package name */
    DeviceDataReportService f9265a = null;
    ReportResult b = null;

    public a(Context context, String str, List<Header> list) {
        w wVar = new w();
        wVar.f9249a = str;
        wVar.c = false;
        wVar.b = list;
        this.f9265a = (DeviceDataReportService) new d(context).a(DeviceDataReportService.class, wVar);
    }

    public final b a(com.alipay.alipaysecuritysdk.apdid.rpc.model.a.a aVar) {
        if (aVar != null) {
            final ReportRequest reportRequest = new ReportRequest();
            if (aVar == null) {
                com.alipay.alipaysecuritysdk.common.c.b.b("SEC_SDK-apdid", "convert ReportRequest failed, result isn null");
                reportRequest = null;
            } else {
                reportRequest.version = aVar.i;
                reportRequest.os = e.e(aVar.f9267a);
                reportRequest.apdid = e.e(aVar.b);
                reportRequest.pubApdid = aVar.f;
                reportRequest.priApdid = aVar.g;
                reportRequest.token = e.e(aVar.c);
                reportRequest.umidToken = e.e(aVar.d);
                reportRequest.lastTime = aVar.h;
                reportRequest.dataMap = aVar.j == null ? new HashMap<>() : aVar.j;
                reportRequest.bizData = aVar.k;
                reportRequest.dynamicKey = aVar.e;
            }
            if (this.f9265a != null) {
                f.a().b(new Runnable() {
                    public final void run() {
                        try {
                            a.this.b = a.this.f9265a.reportStaticData(reportRequest);
                        } catch (Throwable th) {
                            a.this.b = new ReportResult();
                            a.this.b.success = false;
                            ReportResult reportResult = a.this.b;
                            StringBuilder sb = new StringBuilder("update static data error:");
                            sb.append(th.getMessage());
                            reportResult.resultCode = sb.toString();
                            com.alipay.alipaysecuritysdk.common.c.a.a("rpc_request", F2FPayConstants.OrderStatus.FAILED, th.getMessage());
                            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", th);
                        }
                    }
                });
                int i = 600000;
                while (this.b == null && i >= 0) {
                    Thread.sleep(50);
                    i -= 50;
                }
            }
            ReportResult reportResult = this.b;
            b bVar = new b();
            if (reportResult == null) {
                com.alipay.alipaysecuritysdk.common.c.b.b("SEC_SDK-apdid", "convert ReportResult failed, result isn null");
                return null;
            }
            bVar.f9268a = reportResult.success;
            bVar.b = reportResult.resultCode;
            bVar.c = e.e(reportResult.apdid);
            bVar.d = e.e(reportResult.token);
            bVar.e = e.e(reportResult.currentTime);
            String str = reportResult.bugTrackSwitch;
            if (!e.d(str)) {
                bVar.g = "0";
            } else if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                bVar.g = sb.toString();
            } else {
                bVar.g = "0";
            }
            bVar.h = e.e(reportResult.dynamicKey);
            bVar.i = reportResult.resultData;
            return bVar;
        }
        throw new Exception("input apdid request is null");
    }
}
