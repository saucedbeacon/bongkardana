package o;

import io.split.android.client.service.executor.SplitTaskExecutor;

public class getMalDetectionComp {
    public getSafeCookie create(SplitTaskExecutor splitTaskExecutor, int i) {
        return new getSafeCookie(splitTaskExecutor, new ISafeTokenComponent(i));
    }
}
