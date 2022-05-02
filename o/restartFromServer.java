package o;

final class restartFromServer implements RedDotDrawable {
    private final handleMessage setMax;

    public restartFromServer(handleMessage handlemessage) {
        this.setMax = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getReferralPageConfig$16((String) obj);
    }
}
