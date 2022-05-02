package com.alibaba.ariver.kernel.api.scheduler;

import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;

public interface Schedulable {
    void setExecutorFactory(RVExecutorService rVExecutorService);
}
