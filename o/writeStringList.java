package o;

import android.content.Context;
import o.b;

public final class writeStringList implements getAdapterPosition<writeString2> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<appxLoadFailed> executorProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    public writeStringList(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.executorProvider = bVar2;
        this.apSecurityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final writeString2 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.executorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static writeStringList create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new writeStringList(bVar, bVar2, bVar3, bVar4);
    }

    public static writeString2 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new writeString2(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
