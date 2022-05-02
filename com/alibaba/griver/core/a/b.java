package com.alibaba.griver.core.a;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.StartupParamsUtils;
import com.alibaba.griver.core.Griver;

public class b implements IpcMessageHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f9181a = new Bundle();

    public void handleMessage(IpcMessage ipcMessage) {
        Message message = ipcMessage.bizMsg;
        Bundle data = message.getData();
        if (data == null) {
            data = this.f9181a;
        }
        int i = data.getInt(IpcMessageConstants.EXTRA_LPID);
        long j = data.getLong(RVConstants.EXTRA_START_TOKEN);
        StringBuilder sb = new StringBuilder("LiteProcessHandler received msg what: ");
        sb.append(message.what);
        sb.append(" lpid: ");
        sb.append(i);
        sb.append(" token: ");
        sb.append(j);
        RVLogger.d(IpcServerUtils.LOG_TAG, sb.toString());
        StringBuilder sb2 = new StringBuilder("LiteProcessHandler received pid: ");
        sb2.append(ipcMessage.pid);
        sb2.append(" lpid: ");
        sb2.append(ipcMessage.lpid);
        RVLogger.d(IpcServerUtils.LOG_TAG, sb2.toString());
        int i2 = message.what;
        if (i2 == 1) {
            a(j, i, ipcMessage.pid);
        } else if (i2 == 2) {
            b(j, i, ipcMessage.pid);
        } else if (i2 == 9001) {
            a(data.getString("appId"), data.getBundle("startParams"));
        }
    }

    private void a(long j, int i, int i2) {
        if (i == 0) {
            c.a().c().a(j);
            c.a().c().b(i2);
            c.a().c().c(2);
            return;
        }
        a a2 = c.a().a(i);
        if (a2 == null) {
            RVLogger.e(IpcServerUtils.LOG_TAG, "process is running, nut LiteProcess not found");
            return;
        }
        a2.c(2);
        a2.b(i2);
        a2.a(j);
        StringBuilder sb = new StringBuilder("pid: ");
        sb.append(i2);
        sb.append("is running ");
        sb.append(i);
        sb.append("process");
        RVLogger.d(IpcServerUtils.LOG_TAG, sb.toString());
    }

    private void b(long j, int i, int i2) {
        if (i == 0) {
            c.a().c().f();
            return;
        }
        a a2 = c.a().a(i);
        if (a2 == null) {
            RVLogger.e(IpcServerUtils.LOG_TAG, "process is running, nut LiteProcess not found");
        } else {
            a2.f();
        }
    }

    private void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            Griver.openApp(GriverEnv.getApplicationContext(), str, StartupParamsUtils.filterBundle(str, "", bundle, false));
        }
    }
}
