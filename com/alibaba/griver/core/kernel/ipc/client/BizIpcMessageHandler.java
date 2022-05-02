package com.alibaba.griver.core.kernel.ipc.client;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.griver.base.api.GriverAsyncUpdateManager;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class BizIpcMessageHandler implements IpcMessageHandler {
    public void handleMessage(IpcMessage ipcMessage) {
        Message message = ipcMessage.bizMsg;
        Bundle data = message.getData();
        if (data == null) {
            data = new Bundle();
        }
        StringBuilder sb = new StringBuilder("receive message == ");
        sb.append(message.what);
        GriverLogger.d("BizIpcMessageHandler", sb.toString());
        if (message.what == 9002) {
            String string = data.getString("appId");
            String string2 = data.getString("updateAction");
            String string3 = data.getString("updateParam");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                GriverLogger.d("BizIpcMessageHandler", "receive action == ".concat(String.valueOf(string2)));
                GriverAsyncUpdateManager griverAsyncUpdateManager = (GriverAsyncUpdateManager) RVProxy.get(GriverAsyncUpdateManager.class);
                griverAsyncUpdateManager.setAppId(string);
                griverAsyncUpdateManager.sendToRender(string2, JSONUtils.parseObject(string3));
            }
        }
    }
}
