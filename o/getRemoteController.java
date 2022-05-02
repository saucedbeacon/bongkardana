package o;

final class getRemoteController implements RedDotDrawable {
    private final getServiceBeans getMin;

    public getRemoteController(getServiceBeans getservicebeans) {
        this.getMin = getservicebeans;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((RVMain) obj);
    }
}
