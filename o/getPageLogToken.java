package o;

final class getPageLogToken implements RedDotManager {
    private final lock setMin;

    public getPageLogToken(lock lock) {
        this.setMin = lock;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$resendOtp$2((EventLog) obj);
    }
}
