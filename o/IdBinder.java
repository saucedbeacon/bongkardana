package o;

final class IdBinder implements RedDotDrawable {
    private final ParamBinder getMin;

    public IdBinder(ParamBinder paramBinder) {
        this.getMin = paramBinder;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((getAppxVersionInWorker) obj);
    }
}
