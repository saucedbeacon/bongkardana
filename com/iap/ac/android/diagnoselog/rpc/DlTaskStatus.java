package com.iap.ac.android.diagnoselog.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface DlTaskStatus {
    @OperationType("ap.chameleon.dl.update.task.status")
    @SignCheck
    UpdateTaskStatusRes updateTaskStatus(UpdateTaskStatusReq updateTaskStatusReq);
}
