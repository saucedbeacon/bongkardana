package o;

public final class callLiteVMLongMethod {
    private static final long TIME_INTERVAL_MS = 3600000;

    public static long truncateTimeframe(long j) {
        return j - (j % 3600000);
    }
}
