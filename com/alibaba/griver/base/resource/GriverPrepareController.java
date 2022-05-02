package com.alibaba.griver.base.resource;

import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.prepare.controller.BasePrepareController;
import com.alibaba.griver.base.resource.interceptor.GriverAppXInterceptor;
import com.alibaba.griver.base.resource.interceptor.GriverPrepareInterceptor;
import com.alibaba.griver.base.resource.utils.PrepareContextUitls;
import java.util.ArrayList;

public class GriverPrepareController extends BasePrepareController {

    /* renamed from: a  reason: collision with root package name */
    private PrepareContext f10235a;

    public GriverPrepareController(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        PrepareContextUitls.setTimeoutForContext(prepareContext);
        bindContext(prepareContext, prepareCallback);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GriverPrepareInterceptor());
        arrayList.add(new GriverAppXInterceptor());
        setInterceptors(arrayList);
        this.f10235a = prepareContext;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void moveToError(com.alibaba.ariver.resource.api.prepare.PrepareException r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getCode()
            int r1 = r0.hashCode()
            r2 = 1
            switch(r1) {
                case 48: goto L_0x0049;
                case 49: goto L_0x003f;
                case 50: goto L_0x0035;
                case 51: goto L_0x002b;
                case 52: goto L_0x0021;
                case 53: goto L_0x0017;
                case 54: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0053
        L_0x000d:
            java.lang.String r1 = "6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 4
            goto L_0x0054
        L_0x0017:
            java.lang.String r1 = "5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 0
            goto L_0x0054
        L_0x002b:
            java.lang.String r1 = "3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 2
            goto L_0x0054
        L_0x0035:
            java.lang.String r1 = "2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 5
            goto L_0x0054
        L_0x003f:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 3
            goto L_0x0054
        L_0x0049:
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 6
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00a1;
                case 2: goto L_0x008f;
                case 3: goto L_0x007d;
                case 4: goto L_0x007d;
                case 5: goto L_0x006b;
                case 6: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            r0 = r6
            goto L_0x00c4
        L_0x0059:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_prepare_unknown_error
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10000"
            r0.<init>(r3, r1)
            goto L_0x00c4
        L_0x006b:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_prepare_no_app_info
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10003"
            r0.<init>(r3, r1)
            goto L_0x00c4
        L_0x007d:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_app_id_exception
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10001"
            r0.<init>(r3, r1)
            goto L_0x00c4
        L_0x008f:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_prepare_timeout
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10010"
            r0.<init>(r3, r1)
            goto L_0x00c4
        L_0x00a1:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_prepare_unzip_failed
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10002"
            r0.<init>(r3, r1)
            goto L_0x00c4
        L_0x00b3:
            com.alibaba.ariver.resource.api.prepare.PrepareException r0 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r1 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r3 = com.alibaba.griver.base.R.string.griver_prepare_download_failed
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "10009"
            r0.<init>(r3, r1)
        L_0x00c4:
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r1 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder
            r1.<init>()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r3 = r5.context
            java.lang.String r3 = r3.getAppId()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r1 = r1.appId(r3)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r3 = r5.context
            com.alibaba.ariver.resource.api.models.AppModel r3 = r3.getAppModel()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r1 = r1.version((com.alibaba.ariver.resource.api.models.AppModel) r3)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r1 = r1.exception(r6)
            java.lang.String r3 = "prepare app failed"
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r1 = r1.message(r3)
            java.lang.String r6 = r6.getCode()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r1.code(r6)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r6.needAsynAppType(r2)
            java.util.Map r6 = r6.build()
            java.lang.String r1 = "GriverAppContainer"
            java.lang.String r3 = "mini_app_prepare_exception"
            com.alibaba.griver.base.common.monitor.GriverMonitor.error(r3, r1, r6)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r6 = r5.context
            com.alibaba.ariver.resource.api.models.AppModel r6 = r6.getAppModel()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r3 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder
            r3.<init>()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r4 = r5.context
            java.lang.String r4 = r4.getAppId()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r3 = r3.appId(r4)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r3.version((com.alibaba.ariver.resource.api.models.AppModel) r6)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r3 = r5.context
            android.os.Bundle r3 = r3.getStartParams()
            java.lang.String r4 = "url"
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r3, r4)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r6.url(r3)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r6.needAsynAppType(r2)
            java.lang.String r2 = com.alibaba.griver.base.common.env.GriverEnv.getEnvironment()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r6.env(r2)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r2 = r5.context
            android.os.Bundle r2 = r2.getStartParams()
            java.lang.String r2 = com.alibaba.griver.base.common.utils.MonitorUtils.getSourceInfoFromStartupParams(r2)
            java.lang.String r3 = "sourceInfo"
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r6 = r6.append(r3, r2)
            java.util.Map r6 = r6.build()
            java.lang.String r2 = "mini_start_app"
            com.alibaba.griver.base.common.monitor.GriverMonitor.event(r2, r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "full_link"
            r6.<init>(r1)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r1 = r5.context
            java.lang.String r1 = r1.getAppId()
            r6.append(r1)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r1 = r5.context
            long r1 = r1.getStartToken()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r1 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitor r1 = r1.getStageMonitor(r6)
            if (r1 == 0) goto L_0x017b
            java.lang.String r6 = r0.getCode()
            r1.transitToError(r6)
            goto L_0x0196
        L_0x017b:
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r1 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()
            com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor r2 = new com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor
            r2.<init>()
            r1.registerStageMonitor(r6, r2)
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r1 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitor r6 = r1.getStageMonitor(r6)
            java.lang.String r1 = r0.getCode()
            r6.transitToError(r1)
        L_0x0196:
            super.moveToError(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareCallback r6 = r5.callback
            if (r6 == 0) goto L_0x01a8
            com.alibaba.ariver.resource.api.prepare.PrepareCallback r6 = r5.callback
            com.alibaba.ariver.resource.api.prepare.PrepareContext r1 = r5.context
            com.alibaba.ariver.resource.api.prepare.PrepareData r1 = r1.getPrepareData()
            r6.prepareFail(r1, r0)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.resource.GriverPrepareController.moveToError(com.alibaba.ariver.resource.api.prepare.PrepareException):void");
    }
}
