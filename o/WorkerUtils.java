package o;

final class WorkerUtils implements RedDotDrawable {
    private final getAccessController getMin;

    public WorkerUtils(getAccessController getaccesscontroller) {
        this.getMin = getaccesscontroller;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$queryPayMethod$1((RVMain) obj);
    }
}
