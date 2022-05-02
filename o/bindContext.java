package o;

final class bindContext implements RedDotDrawable {
    private final handleMessage setMin;

    public bindContext(handleMessage handlemessage) {
        this.setMin = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getNearbyAutoSearchConfig$13((Throwable) obj);
    }
}
