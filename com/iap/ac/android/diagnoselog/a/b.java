package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.core.UserDiagnosing;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.DiagnoseTask;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.FetchMarmotConfigFacade;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.MarmotConfigRequest;
import com.iap.ac.android.diagnoselog.rpc.marmotconfig.MarmotConfigResult;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.util.Calendar;
import java.util.Date;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnLogUploadListener f11042a;
    public final /* synthetic */ Date b;
    public final /* synthetic */ DiagnoseLogContext c;

    public b(DiagnoseLogContext diagnoseLogContext, OnLogUploadListener onLogUploadListener, Date date) {
        this.c = diagnoseLogContext;
        this.f11042a = onLogUploadListener;
        this.b = date;
    }

    public void run() {
        MarmotConfigResult marmotConfigResult;
        try {
            marmotConfigResult = ((FetchMarmotConfigFacade) RPCProxyHost.getInterfaceProxy(FetchMarmotConfigFacade.class, "diagnoselog_biz")).fetchMarmotConfig(new MarmotConfigRequest());
        } catch (Exception e) {
            LoggerWrapper.w("DiagnoseLogContext", (Throwable) e);
            marmotConfigResult = null;
        }
        if (marmotConfigResult == null || !marmotConfigResult.success.booleanValue()) {
            OnLogUploadListener onLogUploadListener = this.f11042a;
            if (onLogUploadListener != null) {
                onLogUploadListener.onFinished(false, "");
                return;
            }
            return;
        }
        DiagnoseLogContext diagnoseLogContext = this.c;
        UserDiagnosing userDiagnosing = new UserDiagnosing(diagnoseLogContext.d, diagnoseLogContext.c, this.f11042a);
        Date date = this.b;
        DiagnoseTask diagnoseTask = new DiagnoseTask();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        diagnoseTask.startTime = instance.getTimeInMillis();
        instance.add(10, 24);
        diagnoseTask.endTime = instance.getTimeInMillis();
        diagnoseTask.taskId = marmotConfigResult.taskId;
        diagnoseTask.uploadUrl = marmotConfigResult.uploadUrl;
        DiagnoseTask.UploadParams uploadParams = new DiagnoseTask.UploadParams();
        diagnoseTask.uploadParams = uploadParams;
        uploadParams.OSSAccessKeyId = marmotConfigResult.OSSAccessKeyId;
        uploadParams.Signature = marmotConfigResult.Signature;
        uploadParams.key = marmotConfigResult.key;
        uploadParams.policy = marmotConfigResult.policy;
        userDiagnosing.a(JsonUtils.toJson(diagnoseTask));
    }
}
