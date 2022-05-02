package o;

import android.content.Context;
import o.ByteArrayPools;
import o.b;

public final class newObject implements getAdapterPosition<ByteArrayPools.ByteArray8Pool> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<appxLoadFailed> executorProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    public newObject(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<setIsUrgentResource> bVar4) {
        this.contextProvider = bVar;
        this.apSecurityFacadeProvider = bVar2;
        this.executorProvider = bVar3;
        this.rpcConnectorProvider = bVar4;
    }

    public final ByteArrayPools.ByteArray8Pool get() {
        return newInstance(this.contextProvider.get(), this.apSecurityFacadeProvider.get(), this.executorProvider.get(), this.rpcConnectorProvider.get());
    }

    public static newObject create(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<setIsUrgentResource> bVar4) {
        return new newObject(bVar, bVar2, bVar3, bVar4);
    }

    public static ByteArrayPools.ByteArray8Pool newInstance(Context context, onAppResume onappresume, appxLoadFailed appxloadfailed, setIsUrgentResource setisurgentresource) {
        return new ByteArrayPools.ByteArray8Pool(context, onappresume, appxloadfailed, setisurgentresource);
    }
}
