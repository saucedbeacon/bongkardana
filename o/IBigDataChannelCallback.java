package o;

import java.util.concurrent.Callable;

final class IBigDataChannelCallback implements Callable {
    private final String getMin;
    private final onReceiveData length;

    public IBigDataChannelCallback(onReceiveData onreceivedata, String str) {
        this.length = onreceivedata;
        this.getMin = str;
    }

    public final Object call() {
        return this.length.lambda$getReferralConfig$0(this.getMin);
    }
}
