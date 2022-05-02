package o;

final class onFail implements RedDotDrawable {
    private final String getMin;
    private final onException length;

    public onFail(onException onexception, String str) {
        this.length = onexception;
        this.getMin = str;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$saveFreeTransferCountFromBackend$14(this.getMin, (Integer) obj);
    }
}
