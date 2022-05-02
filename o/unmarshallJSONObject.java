package o;

final class unmarshallJSONObject implements RedDotDrawable {
    private final ExecutorType getMax;

    public unmarshallJSONObject(ExecutorType executorType) {
        this.getMax = executorType;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((ShadowNodePool) obj);
    }
}
