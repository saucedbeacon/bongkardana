package o;

import o.PrepareController;

final class moveToError implements RedDotDrawable {
    private final PrepareController.Status getMin;
    private final String setMin;

    public moveToError(PrepareController.Status status, String str) {
        this.getMin = status;
        this.setMin = str;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getPinWithVerifiedToken$0(this.setMin, (setInstallTime) obj);
    }
}
