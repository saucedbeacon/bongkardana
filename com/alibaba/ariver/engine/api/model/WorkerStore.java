package com.alibaba.ariver.engine.api.model;

import java.util.HashSet;
import java.util.Set;

public final class WorkerStore {
    public final Set<String> dynamicLoadedPlugins = new HashSet();
    public boolean hasReceivedRegisterWorker = false;
    public String workerId;
}
