package o;

import o.NetworkUtils;
import o.b;

public final class getDetailNetwork implements getAdapterPosition<NetworkUtils.NetworkDetailCallback> {
    private final b.C0007b<setFireMoment> paymentRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getDetailNetwork(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.paymentRepositoryProvider = bVar3;
    }

    public final NetworkUtils.NetworkDetailCallback get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.paymentRepositoryProvider.get());
    }

    public static getDetailNetwork create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        return new getDetailNetwork(bVar, bVar2, bVar3);
    }

    public static NetworkUtils.NetworkDetailCallback newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        return new NetworkUtils.NetworkDetailCallback(appxloadfailed, getscheme, setfiremoment);
    }
}
