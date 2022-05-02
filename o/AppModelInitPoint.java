package o;

final class AppModelInitPoint implements RedDotDrawable {
    public static final AppModelInitPoint length = new AppModelInitPoint();

    public final Object apply(Object obj) {
        return ((setTemplateConfig) obj).getBalance();
    }
}
