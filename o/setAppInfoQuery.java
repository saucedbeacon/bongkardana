package o;

import id.dana.data.util.download.DownloadUtil;
import java.util.concurrent.Callable;

public final class setAppInfoQuery implements Callable {
    private final String setMax;

    public setAppInfoQuery(String str) {
        this.setMax = str;
    }

    public final Object call() {
        return DownloadUtil.lambda$downloadFileFromUri$2(this.setMax);
    }
}
