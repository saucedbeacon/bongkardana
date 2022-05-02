package o;

final class onStarted implements RedDotDrawable {
    private final onKeyboardVisible length;

    public onStarted(onKeyboardVisible onkeyboardvisible) {
        this.length = onkeyboardvisible;
    }

    public final Object apply(Object obj) {
        return this.length.checkGlobalNetworkMode(((Boolean) obj).booleanValue());
    }
}
