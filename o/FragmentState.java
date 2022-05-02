package o;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo;
import java.util.concurrent.ThreadFactory;

public final class FragmentState implements ThreadFactory {
    public static final FragmentState getMin = new FragmentState();

    public final Thread newThread(Runnable runnable) {
        return DefaultHeartBeatInfo.lambda$static$0(runnable);
    }
}
