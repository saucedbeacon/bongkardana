package o;

final class RemoteBridgeExtensionInvoker implements RedDotManager {
    private final RemoteCallbackPool getMax;

    public RemoteBridgeExtensionInvoker(RemoteCallbackPool remoteCallbackPool) {
        this.getMax = remoteCallbackPool;
    }

    public final void accept(Object obj) {
        RemoteCallbackPool.setMin(this.getMax, (com_alibaba_ariver_app_api_ExtOpt$69$1) obj);
    }
}
