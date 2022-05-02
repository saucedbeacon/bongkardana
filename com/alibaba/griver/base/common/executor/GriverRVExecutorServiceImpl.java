package com.alibaba.griver.base.common.executor;

import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.service.executor.RVScheduleType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class GriverRVExecutorServiceImpl implements RVExecutorService {
    public Executor getExecutor(ExecutorType executorType) {
        return GriverExecutors.getExecutor(executorType);
    }

    public ScheduledThreadPoolExecutor getScheduledExecutor() {
        return GriverExecutors.getScheduledExecutor();
    }

    public String getCurrentScheduleType() {
        return ExecutorUtils.isMainThread() ? "UI" : RVScheduleType.UNKNOW;
    }
}
