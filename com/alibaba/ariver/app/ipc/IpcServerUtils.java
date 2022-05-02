package com.alibaba.ariver.app.ipc;

import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import java.util.ArrayList;
import java.util.List;
import o.PlaybackStateCompat;

public class IpcServerUtils {
    public static final String LOG_TAG = "AriverInt:IpcServer";

    /* renamed from: a  reason: collision with root package name */
    private static final PlaybackStateCompat.ShuffleMode<List<Message>> f8962a = new PlaybackStateCompat.ShuffleMode<>();

    public static void flushMessages(long j) {
        int i;
        IIpcChannel clientChannel = IpcChannelManager.getInstance().getClientChannel(j);
        synchronized (f8962a) {
            List<Message> max = f8962a.getMax(j, null);
            if (max == null) {
                i = 0;
            } else {
                i = max.size();
            }
            StringBuilder sb = new StringBuilder("flushMessages: ");
            sb.append(j);
            sb.append(" msgSize: ");
            sb.append(i);
            RVLogger.d(LOG_TAG, sb.toString());
            if (max != null) {
                for (Message a2 : max) {
                    a(clientChannel, IpcMessageConstants.BIZ_APP, a2);
                }
            }
            f8962a.getMin(j);
        }
    }

    public static void removeToken(long j) {
        f8962a.getMin(j);
    }

    public static void addStubToClient(String str, long j, String str2, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString(IpcMessageConstants.EXTRA_STUB_NAME, str2);
        bundle.putLong(IpcMessageConstants.EXTRA_STUB_TS, j2);
        sendMsgToClient(str, j, 12, bundle);
    }

    public static void addAttrToClient(String str, long j, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(IpcMessageConstants.EXTRA_STUB_NAME, str2);
        bundle.putString(IpcMessageConstants.EXTRA_ATTR_VALUE, str3);
        sendMsgToClient(str, j, 16, bundle);
    }

    public static void sendMsgToClient(String str, long j, int i, @Nullable Bundle bundle) {
        sendMsgToClient(str, j, i, IpcMessageConstants.BIZ_APP, bundle);
    }

    public static void sendMsgToClient(String str, long j, int i, String str2, @Nullable Bundle bundle) {
        if (i == 4) {
            StringBuilder sb = new StringBuilder("send SERVER_MSG_FORCE_FINISH with stack: ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.w(LOG_TAG, sb.toString());
        }
        Message message = new Message();
        message.what = i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(IpcServerUtils.class.getClassLoader());
        bundle.putString("appId", str);
        bundle.putLong(RVConstants.EXTRA_START_TOKEN, j);
        message.setData(bundle);
        IIpcChannel clientChannel = IpcChannelManager.getInstance().getClientChannel(j);
        if (clientChannel == null) {
            StringBuilder sb2 = new StringBuilder("sendMsgToClient (pending) ");
            sb2.append(i);
            sb2.append(" token: ");
            sb2.append(j);
            RVLogger.d(LOG_TAG, sb2.toString());
            a(j, message);
            return;
        }
        StringBuilder sb3 = new StringBuilder("sendMsgToClient (direct) ");
        sb3.append(i);
        sb3.append(" token: ");
        sb3.append(j);
        RVLogger.d(LOG_TAG, sb3.toString());
        a(clientChannel, str2, message);
    }

    private static void a(long j, Message message) {
        synchronized (f8962a) {
            List max = f8962a.getMax(j, null);
            if (max == null) {
                max = new ArrayList();
                f8962a.setMax(j, max);
            }
            max.add(message);
        }
    }

    private static void a(IIpcChannel iIpcChannel, String str, Message message) {
        if (iIpcChannel != null) {
            IpcMessage ipcMessage = new IpcMessage();
            ipcMessage.biz = str;
            ipcMessage.bizMsg = message;
            try {
                iIpcChannel.sendMessage(ipcMessage);
            } catch (RemoteException e) {
                StringBuilder sb = new StringBuilder("IpcMsgServer send error ");
                sb.append(Log.getStackTraceString(e));
                RVLogger.e(LOG_TAG, sb.toString());
            }
        }
    }
}
