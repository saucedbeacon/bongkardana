package o;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo;
import java.util.concurrent.Callable;

public final class findFragmentByTag implements Callable {
    private final String length;
    private final DefaultHeartBeatInfo setMin;

    public findFragmentByTag(DefaultHeartBeatInfo defaultHeartBeatInfo, String str) {
        this.setMin = defaultHeartBeatInfo;
        this.length = str;
    }

    public final Object call() {
        return this.setMin.lambda$storeHeartBeatInfo$3(this.length);
    }
}
