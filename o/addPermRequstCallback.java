package o;

final class addPermRequstCallback implements RedDotDrawable {
    private final addParameterMap getMin;

    public addPermRequstCallback(addParameterMap addparametermap) {
        this.getMin = addparametermap;
    }

    public final Object apply(Object obj) {
        return this.getMin.apply((intercept) obj);
    }
}
