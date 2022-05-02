package o;

final class scene implements RedDotDrawable {
    private final getOrigin getMin;
    private final onConnectedSuccessful setMin;

    public scene(getOrigin getorigin, onConnectedSuccessful onconnectedsuccessful) {
        this.getMin = getorigin;
        this.setMin = onconnectedsuccessful;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$saveUserConfigLocalFirst$4(this.setMin, (Boolean) obj);
    }
}
