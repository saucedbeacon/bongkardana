package com.alibaba.ariver.kernel.ipc;

public interface IpcMessageHandler {
    void handleMessage(IpcMessage ipcMessage);
}
