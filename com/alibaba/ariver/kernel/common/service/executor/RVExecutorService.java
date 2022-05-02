package com.alibaba.ariver.kernel.common.service.executor;

import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public interface RVExecutorService extends Proxiable {
    String getCurrentScheduleType();

    Executor getExecutor(ExecutorType executorType);

    ScheduledThreadPoolExecutor getScheduledExecutor();
}
