package com.alibaba.ariver.resource.api.prepare;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.resource.api.models.AppModel;

public class PrepareCallbackParam {
    public StartAction action;
    @Nullable
    public AppModel appInfo;
    public boolean needWaitIpc;
    @Nullable
    public Bundle sceneParams;
    @Nullable
    public Bundle startParams;

    public PrepareCallbackParam(PrepareContext prepareContext) {
        this.appInfo = prepareContext.getAppModel();
        this.startParams = prepareContext.getStartParams();
        this.sceneParams = prepareContext.getSceneParams();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrepareCallbackParam{, needWaitIpc=");
        sb.append(this.needWaitIpc);
        sb.append(", action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}
