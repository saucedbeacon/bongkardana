package com.iap.ac.android.common.container.plugin;

import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.event.ContainerEventFilter;

public interface IContainerPlugin {
    boolean handleEvent(ContainerEvent containerEvent);

    boolean interceptorEvent(ContainerEvent containerEvent);

    ContainerEventFilter onPrepare(ContainerEventFilter containerEventFilter);
}
