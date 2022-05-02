package o;

final class setExtra implements RedDotDrawable {
    private final isKeepCallback setMax;

    public setExtra(isKeepCallback iskeepcallback) {
        this.setMax = iskeepcallback;
    }

    public final Object apply(Object obj) {
        return this.setMax.getBalanceByCountryCode((String) obj);
    }
}
