package o;

final class Binder implements RedDotDrawable {
    private final ParamBinder setMax;

    public Binder(ParamBinder paramBinder) {
        this.setMax = paramBinder;
    }

    public final Object apply(Object obj) {
        return this.setMax.transform((getJsApiDetail4TinyWithT2) obj);
    }
}
