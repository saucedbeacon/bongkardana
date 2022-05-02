package o;

final class CallbackBinder implements RedDotManager {
    private final contains setMax;
    private final String setMin;

    public CallbackBinder(contains contains, String str) {
        this.setMax = contains;
        this.setMin = str;
    }

    public final void accept(Object obj) {
        this.setMax.lambda$sendOtp$0(this.setMin, (getJsApiDetail4TinyWithT2) obj);
    }
}
