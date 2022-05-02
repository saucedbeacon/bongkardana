package com.iap.ac.android.common.container.plugin;

import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.event.ContainerEventFilter;

public class BaseContainerPlugin implements IContainerPlugin {
    public boolean handleEvent(ContainerEvent containerEvent) {
        return false;
    }

    public boolean interceptorEvent(ContainerEvent containerEvent) {
        return false;
    }

    public ContainerEventFilter onPrepare(ContainerEventFilter containerEventFilter) {
        return null;
    }
}
