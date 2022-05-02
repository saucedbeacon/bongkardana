package o;

final class CommonAppExitExtension implements RedDotDrawable {
    private final setStartParams length;

    public CommonAppExitExtension(setStartParams setstartparams) {
        this.length = setstartparams;
    }

    public final Object apply(Object obj) {
        return this.length.transform((IpcCallClientHelper) obj);
    }
}
