package o;

import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.imobile.network.quake.rpc.IQuakeRpc;

final class isUrgentResource implements RPCProxyHost.IRPCProxy {
    private final IQuakeRpc setMin;

    public isUrgentResource(IQuakeRpc iQuakeRpc) {
        this.setMin = iQuakeRpc;
    }

    public final Object getInterfaceProxy(Class cls) {
        return this.setMin.getRpcProxy(cls);
    }
}
