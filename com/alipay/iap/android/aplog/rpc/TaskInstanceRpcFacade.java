package com.alipay.iap.android.aplog.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface TaskInstanceRpcFacade {
    @OperationType("ap.mobileprod.diagnosis.task.submit.fetchuploadlink")
    @SignCheck
    LinkRpcResult fetchuploadlink(TaskInstanceRpcRequest taskInstanceRpcRequest);

    @OperationType("ap.mobileprod.diagnosis.task.submit.report")
    @SignCheck
    BaseRpcResult report(TaskReportRpcRequest taskReportRpcRequest);
}
