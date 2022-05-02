package o;

import android.content.Context;
import o.b;

public final class onReceivedMessage implements getAdapterPosition<IEmbedPerformanceReporter> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onReceivedMessage(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<getPerformanceTracker> bVar5) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.deviceInformationProvider = bVar5;
    }

    public final IEmbedPerformanceReporter get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.deviceInformationProvider.get());
    }

    public static onReceivedMessage create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<getPerformanceTracker> bVar5) {
        return new onReceivedMessage(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static IEmbedPerformanceReporter newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, getPerformanceTracker getperformancetracker) {
        return new IEmbedPerformanceReporter(setisurgentresource, appxloadfailed, onappresume, context, getperformancetracker);
    }
}
