package o;

final class CustomCLObjectInputStream implements RedDotDrawable {
    private final getIpcProxy getMax;
    private final double getMin;
    private final Integer length;
    private final double setMax;
    private final Integer setMin;

    public CustomCLObjectInputStream(getIpcProxy getipcproxy, Integer num, double d, double d2, Integer num2) {
        this.getMax = getipcproxy;
        this.length = num;
        this.getMin = d;
        this.setMax = d2;
        this.setMin = num2;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getPromoAdsObservableBasedOnDistanceThreshold$4(this.length, this.getMin, this.setMax, this.setMin, (Boolean) obj);
    }
}
