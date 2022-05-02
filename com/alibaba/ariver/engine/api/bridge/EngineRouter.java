package com.alibaba.ariver.engine.api.bridge;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import java.util.List;

public interface EngineRouter {

    public interface RenderInitListener {
        void onRenderInit(Render render);
    }

    void destroy();

    @Nullable
    List<Render> getRegisteredRender();

    @Nullable
    Render getRenderById(String str);

    @Nullable
    Worker getWorkerById(@Nullable String str);

    void registerRender(String str, Render render);

    void registerRenderInitListener(String str, RenderInitListener renderInitListener);

    void registerWorker(String str, Worker worker);

    void resetRenderToTop(Render render);

    void unRegisterRender(String str);

    void unRegisterWorker(String str);
}
