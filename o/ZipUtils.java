package o;

final class ZipUtils implements RedDotManager {
    private final String getMax;
    private final String getMin;
    private final String length;
    private final lock setMin;

    public ZipUtils(lock lock, String str, String str2, String str3) {
        this.setMin = lock;
        this.getMin = str;
        this.length = str2;
        this.getMax = str3;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$checkRegistration$0(this.getMin, this.length, this.getMax, (EventLog) obj);
    }
}
