package o;

import android.content.Context;
import o.b;

public final class showToggleButton implements getAdapterPosition<ConsoleViewCreateCallback> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<isDebugPanelExists> productInfoFacadeProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public showToggleButton(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<isDebugPanelExists> bVar5) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.productInfoFacadeProvider = bVar5;
    }

    public final ConsoleViewCreateCallback get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.productInfoFacadeProvider.get());
    }

    public static showToggleButton create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<isDebugPanelExists> bVar5) {
        return new showToggleButton(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static ConsoleViewCreateCallback newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, isDebugPanelExists isdebugpanelexists) {
        return new ConsoleViewCreateCallback(setisurgentresource, appxloadfailed, onappresume, context, isdebugpanelexists);
    }
}
