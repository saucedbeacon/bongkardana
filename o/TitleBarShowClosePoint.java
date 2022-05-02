package o;

final class TitleBarShowClosePoint implements RedDotManager {
    private final onKeyboardVisible getMax;
    private final String setMax;

    public TitleBarShowClosePoint(onKeyboardVisible onkeyboardvisible, String str) {
        this.getMax = onkeyboardvisible;
        this.setMax = str;
    }

    public final void accept(Object obj) {
        this.getMax.lambda$saveCurrentCountryCode$0(this.setMax, (Boolean) obj);
    }
}
