package o;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo;
import java.util.concurrent.Callable;

public final class FragmentManager$LaunchedFragmentInfo implements Callable {
    private final DefaultHeartBeatInfo getMax;

    public FragmentManager$LaunchedFragmentInfo(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.getMax = defaultHeartBeatInfo;
    }

    public final Object call() {
        return this.getMax.lambda$getAndClearStoredHeartBeatInfo$2();
    }
}
