package o;

final class attachButtonsLayout implements RedDotDrawable {
    public static final attachButtonsLayout getMin = new attachButtonsLayout();

    public final Object apply(Object obj) {
        return ((attach) obj).getKycLevel();
    }
}
