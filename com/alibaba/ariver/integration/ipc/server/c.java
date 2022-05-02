package com.alibaba.ariver.integration.ipc.server;

import android.os.Bundle;
import android.os.Message;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.remote.RemoteCallArgs;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.ariver.kernel.ipc.ShadowNodePool;

public class c implements IpcMessageHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f8993a = new Bundle();
    private g b = null;

    public c(ExtensionManager extensionManager) {
        this.b = new g(extensionManager);
    }

    public void handleMessage(IpcMessage ipcMessage) {
        RemoteCallArgs remoteCallArgs;
        Message message = ipcMessage.bizMsg;
        Bundle data = message.getData();
        if (data == null) {
            data = this.f8993a;
        }
        int i = data.getInt(IpcMessageConstants.EXTRA_LPID);
        long j = data.getLong(RVConstants.EXTRA_START_TOKEN);
        long j2 = data.getLong(IpcMessageConstants.EXTRA_NODE_ID);
        boolean z = data.getBoolean(IpcMessageConstants.EXTRA_FROM_LITE_PROCESS);
        StringBuilder sb = new StringBuilder("ServerApiBizHandler received msg what: ");
        sb.append(message.what);
        sb.append(" lpid: ");
        sb.append(i);
        sb.append(" token: ");
        sb.append(j);
        RVLogger.d(IpcServerUtils.LOG_TAG, sb.toString());
        int i2 = message.what;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 == 6 && (remoteCallArgs = (RemoteCallArgs) BundleUtils.getParcelable(message.getData(), IpcMessageConstants.EXTRA_REMOTE_CALL_ARGS)) != null) {
                            this.b.a(remoteCallArgs);
                        }
                    } else if (z) {
                        ShadowNodePool.getInstance().onNodeExit(j2);
                    }
                } else if (z) {
                    ShadowNodePool.getInstance().bindStartToken(j, j2);
                }
            } else if (z) {
                ShadowNodePool.getInstance().bindStartToken(j, j2);
            }
        } else if (z) {
            ShadowNodePool.getInstance().unBindStartToken(j);
            ShadowNodePool.getInstance().onNodeExit(j2);
        }
    }
}
