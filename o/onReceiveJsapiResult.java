package o;

final class onReceiveJsapiResult implements RedDotManager {
    private final onWebViewDestory length;

    public onReceiveJsapiResult(onWebViewDestory onwebviewdestory) {
        this.length = onwebviewdestory;
    }

    public final void accept(Object obj) {
        this.length.savePaymentCode((String) obj);
    }
}
