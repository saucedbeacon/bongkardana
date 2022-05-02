package com.alibaba.ariver.app.api.activity;

public enum StartAction {
    SHOW_LOADING,
    SHOW_ERROR,
    DIRECT_START;

    public final boolean needWaitIpc() {
        return this == SHOW_LOADING;
    }
}
