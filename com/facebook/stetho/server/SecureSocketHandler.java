package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

public abstract class SecureSocketHandler implements SocketHandler {
    private final Context mContext;

    /* access modifiers changed from: protected */
    public abstract void onSecured(LocalSocket localSocket) throws IOException;

    public SecureSocketHandler(Context context) {
        this.mContext = context;
    }

    public final void onAccepted(LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            onSecured(localSocket);
        } catch (PeerAuthorizationException e) {
            StringBuilder sb = new StringBuilder("Unauthorized request: ");
            sb.append(e.getMessage());
            LogUtil.e(sb.toString());
        }
    }

    private static void enforcePermission(Context context, LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        Credentials peerCredentials = localSocket.getPeerCredentials();
        int uid = peerCredentials.getUid();
        int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.v("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
        }
        if (context.checkPermission("android.permission.DUMP", pid, uid) != 0) {
            StringBuilder sb = new StringBuilder("Peer pid=");
            sb.append(pid);
            sb.append(", uid=");
            sb.append(uid);
            sb.append(" does not have ");
            sb.append("android.permission.DUMP");
            throw new PeerAuthorizationException(sb.toString());
        }
    }
}
