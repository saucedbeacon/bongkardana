package com.iap.ac.android.container.adapter.appcontainer;

import com.alipay.mobile.h5container.api.H5BridgeContext;
import com.alipay.mobile.h5container.api.H5Event;
import com.alipay.mobile.h5container.api.H5EventFilter;
import com.alipay.mobile.h5container.api.H5SimplePlugin;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.event.ContainerEventFilter;
import com.iap.ac.android.common.container.plugin.BaseContainerPlugin;
import java.util.Iterator;

public class AppContainerPlugin extends H5SimplePlugin {
    private BaseContainerPlugin plugin;

    public AppContainerPlugin(BaseContainerPlugin baseContainerPlugin) {
        this.plugin = baseContainerPlugin;
    }

    public void onPrepare(H5EventFilter h5EventFilter) {
        ContainerEventFilter onPrepare;
        BaseContainerPlugin baseContainerPlugin = this.plugin;
        if (baseContainerPlugin == null || h5EventFilter == null || (onPrepare = baseContainerPlugin.onPrepare(new ContainerEventFilter())) == null) {
            AppContainerPlugin.super.onPrepare(h5EventFilter);
            return;
        }
        Iterator<String> actionIterator = onPrepare.actionIterator();
        while (actionIterator.hasNext()) {
            h5EventFilter.addAction(actionIterator.next());
        }
    }

    public boolean handleEvent(H5Event h5Event, H5BridgeContext h5BridgeContext) {
        if (h5Event == null) {
            return AppContainerPlugin.super.handleEvent(h5Event, h5BridgeContext);
        }
        if (this.plugin == null) {
            return AppContainerPlugin.super.handleEvent(h5Event, h5BridgeContext);
        }
        ContainerEvent containerEvent = new ContainerEvent(h5Event.getAction(), new AppContainerPresenter(h5Event, h5BridgeContext));
        containerEvent.params = ContainerUtils.fastJsonToJson(h5Event.getParam());
        return this.plugin.handleEvent(containerEvent);
    }

    public boolean interceptEvent(H5Event h5Event, H5BridgeContext h5BridgeContext) {
        if (h5Event == null) {
            return AppContainerPlugin.super.interceptEvent(h5Event, h5BridgeContext);
        }
        if (this.plugin == null) {
            return AppContainerPlugin.super.interceptEvent(h5Event, h5BridgeContext);
        }
        ContainerEvent containerEvent = new ContainerEvent(h5Event.getAction(), new AppContainerPresenter(h5Event, h5BridgeContext));
        containerEvent.params = ContainerUtils.fastJsonToJson(h5Event.getParam());
        return this.plugin.interceptorEvent(containerEvent);
    }
}
