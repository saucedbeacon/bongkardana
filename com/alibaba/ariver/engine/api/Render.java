package com.alibaba.ariver.engine.api;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.kernel.api.node.DataNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Render {
    public static final int CAPTURE_RANGE_DOCUMENT = 1;
    public static final int CAPTURE_RANGE_SCRREN = 2;
    public static final int CAPTURE_RANGE_VIEWPORT = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureRange {
    }

    void destroy();

    Activity getActivity();

    String getAppId();

    @Nullable
    Bitmap getCapture(int i);

    String getCurrentUri();

    RVEngine getEngine();

    DataNode getPage();

    int getPageId();

    RenderBridge getRenderBridge();

    String getRenderId();

    int getScrollY();

    Bundle getStartParams();

    String getUserAgent();

    View getView();

    void goBack(GoBackCallback goBackCallback);

    boolean hasTriggeredLoad();

    void init();

    boolean isDestroyed();

    void load(LoadParams loadParams);

    void onPause();

    void onResume();

    void reload();

    void runExit(ExitCallback exitCallback);

    void setScrollChangedCallback(ScrollChangedCallback scrollChangedCallback);

    void setTextSize(int i);

    void showErrorView(View view);

    void triggerSaveSnapshot();
}
