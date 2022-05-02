package com.alibaba.ariver.kernel.ipc;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.List;
import o.PlaybackStateCompat;

public class IpcChannelManager {

    /* renamed from: a  reason: collision with root package name */
    private static IpcChannelManager f9149a;
    private static IIpcChannel b;
    private static final PlaybackStateCompat.ShuffleMode<IIpcChannel> c = new PlaybackStateCompat.ShuffleMode<>(5);
    private static final List<ClientListener> d = new ArrayList();
    private static final List<ServerReadyListener> e = new ArrayList();

    public interface ClientListener {
        void onRegister(long j, IIpcChannel iIpcChannel);

        void onUnRegister(long j);
    }

    public interface ServerReadyListener {
        void onServerReady();
    }

    public static IpcChannelManager getInstance() {
        if (f9149a == null) {
            synchronized (IpcChannelManager.class) {
                if (f9149a == null) {
                    f9149a = new IpcChannelManager();
                }
            }
        }
        return f9149a;
    }

    public void registerServerReadyListener(ServerReadyListener serverReadyListener) {
        synchronized (e) {
            e.add(serverReadyListener);
        }
    }

    public void unRegisterServerReadyListener(ServerReadyListener serverReadyListener) {
        synchronized (e) {
            e.remove(serverReadyListener);
        }
    }

    public synchronized void registerServerChannel(IIpcChannel iIpcChannel) {
        RVLogger.d("AriverKernel:IpcChannelManager", "registerServerChannel");
        b = iIpcChannel;
        synchronized (e) {
            for (ServerReadyListener onServerReady : e) {
                onServerReady.onServerReady();
            }
        }
    }

    public synchronized void unRegisterServerChannel() {
        RVLogger.d("AriverKernel:IpcChannelManager", "unRegisterServerChannel");
        b = null;
    }

    @Nullable
    public synchronized IIpcChannel getServerChannel() {
        return b;
    }

    public void registerClientListener(ClientListener clientListener) {
        synchronized (d) {
            d.add(clientListener);
        }
    }

    public void unRegisterClientListener(ClientListener clientListener) {
        synchronized (d) {
            d.remove(clientListener);
        }
    }

    public synchronized void registerClientChannel(long j, IIpcChannel iIpcChannel) {
        if (c.getMax(j, null) != null) {
            StringBuilder sb = new StringBuilder("registerClientChannel: ");
            sb.append(j);
            sb.append(" but already registered.");
            RVLogger.w("AriverKernel:IpcChannelManager", sb.toString());
            return;
        }
        RVLogger.d("AriverKernel:IpcChannelManager", "registerClientChannel: ".concat(String.valueOf(j)));
        c.setMax(j, iIpcChannel);
        synchronized (d) {
            for (ClientListener onRegister : d) {
                onRegister.onRegister(j, iIpcChannel);
            }
        }
    }

    public synchronized void unRegisterClientChannel(long j) {
        if (c.getMax(j, null) == null) {
            StringBuilder sb = new StringBuilder("unRegisterClientChannel: ");
            sb.append(j);
            sb.append(" but already unregistered.");
            RVLogger.w("AriverKernel:IpcChannelManager", sb.toString());
            return;
        }
        RVLogger.d("AriverKernel:IpcChannelManager", "unRegisterClientChannel: ".concat(String.valueOf(j)));
        ShadowNodePool.getInstance().unBindStartToken(j);
        c.getMin(j);
        synchronized (d) {
            for (ClientListener onUnRegister : d) {
                onUnRegister.onUnRegister(j);
            }
        }
    }

    @Nullable
    public synchronized IIpcChannel getClientChannel(long j) {
        return c.getMax(j, null);
    }
}
