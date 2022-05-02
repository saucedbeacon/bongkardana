package o;

final class log implements RedDotDrawable {
    private final String equals;
    private final lock getMax;
    private final String getMin;
    private final String length;
    private final String setMax;
    private final String setMin;
    private final String toFloatRange;

    public log(lock lock, String str, String str2, String str3, String str4, String str5, String str6) {
        this.getMax = lock;
        this.length = str;
        this.setMin = str2;
        this.getMin = str3;
        this.setMax = str4;
        this.equals = str5;
        this.toFloatRange = str6;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$thenRegister$17(this.length, this.setMin, this.getMin, this.setMax, this.equals, this.toFloatRange, (GriverPerformanceStages) obj);
    }
}
