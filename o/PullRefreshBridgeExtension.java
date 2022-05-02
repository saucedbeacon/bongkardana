package o;

import kotlin.jvm.functions.Function1;

final class PullRefreshBridgeExtension implements Function1 {
    private final restorePullToRefresh length;

    public PullRefreshBridgeExtension(restorePullToRefresh restorepulltorefresh) {
        this.length = restorepulltorefresh;
    }

    public final Object invoke(Object obj) {
        return restorePullToRefresh.length(this.length, (H5MemData) obj);
    }
}
