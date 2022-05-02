package com.iap.ac.android.common.container.event;

import com.iap.ac.android.common.container.IContainerPresenter;
import java.util.Map;
import org.json.JSONObject;

public class ContainerEvent {
    public String action;
    public IContainerPresenter containerPresenter;
    public Map<String, Object> extras;
    public JSONObject params;

    public ContainerEvent(String str, IContainerPresenter iContainerPresenter) {
        this.action = str;
        this.containerPresenter = iContainerPresenter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContainerEvent{action='");
        sb.append(this.action);
        sb.append('\'');
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", extras=");
        sb.append(this.extras);
        sb.append(", containerPresenter=");
        sb.append(this.containerPresenter);
        sb.append('}');
        return sb.toString();
    }
}
