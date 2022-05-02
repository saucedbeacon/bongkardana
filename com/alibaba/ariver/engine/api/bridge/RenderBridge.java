package com.alibaba.ariver.engine.api.bridge;

import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;

public interface RenderBridge {
    void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback);

    void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback, boolean z);

    SendToRenderCallback takeCallback(String str);
}
