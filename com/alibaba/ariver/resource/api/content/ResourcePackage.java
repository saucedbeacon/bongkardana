package com.alibaba.ariver.resource.api.content;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.engine.api.resources.Resource;
import java.util.Set;

public interface ResourcePackage {
    void add(Resource resource);

    String appId();

    int count();

    Resource get(@NonNull ResourceQuery resourceQuery);

    boolean isPrepareDone();

    Set<String> keySet();

    boolean needWaitForSetup();

    void reload();

    void remove(String str);

    void setup(boolean z);

    void teardown();

    String version();

    @WorkerThread
    void waitForParse();

    @WorkerThread
    void waitForSetup();
}
