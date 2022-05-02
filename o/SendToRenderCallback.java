package o;

import o.RemoteCallbackPool;

final class SendToRenderCallback implements RemoteCallbackPool.getMin {
    private final RemoteCallbackPool getMin;

    public SendToRenderCallback(RemoteCallbackPool remoteCallbackPool) {
        this.getMin = remoteCallbackPool;
    }

    public final void setMax(boolean z) {
        RemoteCallbackPool.getMax(this.getMin, z);
    }
}
