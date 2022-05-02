package o;

final class ToastPoint implements RedDotManager {
    private final onKeyboardVisible getMax;
    private final String getMin;
    private final String setMin;

    public ToastPoint(onKeyboardVisible onkeyboardvisible, String str, String str2) {
        this.getMax = onkeyboardvisible;
        this.setMin = str;
        this.getMin = str2;
    }

    public final void accept(Object obj) {
        this.getMax.lambda$getForexRate$1(this.setMin, this.getMin, (Throwable) obj);
    }
}
