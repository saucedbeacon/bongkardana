package o;

final class Extension implements RedDotDrawable {
    public static final Extension length = new Extension();

    public final Object apply(Object obj) {
        return description.toQrUserBankResult((description) obj);
    }
}
