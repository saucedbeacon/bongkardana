package o;

final class makeRaw implements RedDotDrawable {
    private final onFragmentCreate getMax;
    private final int length;

    public makeRaw(onFragmentCreate onfragmentcreate, int i) {
        this.getMax = onfragmentcreate;
        this.length = i;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$onGotTransactionSuccessCount$1(this.length, (Boolean) obj);
    }
}
