package o;

import javax.inject.Inject;

public final class sendHttp {
    private static int setMin;
    private final broadcastInvalidation length;

    @Inject
    public sendHttp(broadcastInvalidation broadcastinvalidation) {
        this.length = broadcastinvalidation;
    }

    public static int getMin(int i) {
        int i2 = setMin + i;
        setMin = i2;
        return i2;
    }
}
