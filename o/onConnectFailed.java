package o;

final class onConnectFailed implements RedDotDrawable {
    private final RDConstant setMin;

    public onConnectFailed(RDConstant rDConstant) {
        this.setMin = rDConstant;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$updateLocalHistories$7((Boolean) obj);
    }
}
