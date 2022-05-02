package o;

final class TitleBarTitleClickPoint implements RedDotManager {
    private final specToLayoutParam length;

    public TitleBarTitleClickPoint(specToLayoutParam spectolayoutparam) {
        this.length = spectolayoutparam;
    }

    public final void accept(Object obj) {
        this.length.invalidatePaymentCode((BaseGriverRpcResult) obj);
    }
}
