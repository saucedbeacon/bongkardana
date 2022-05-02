package com.alibaba.griver.base.api;

public interface INebulaPage {

    public interface H5PageHandler {
        boolean shouldExit();
    }

    H5EmbededViewProvider getEmbededViewProvider();

    Object getExtra(String str);

    boolean ifContainsEmbedSurfaceView();

    boolean ifContainsEmbedView();

    void setContainsEmbedSurfaceView(boolean z);

    void setContainsEmbedView(boolean z);

    void setExtra(String str, Object obj);

    void setHandler(H5PageHandler h5PageHandler);
}
