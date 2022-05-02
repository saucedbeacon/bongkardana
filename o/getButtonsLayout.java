package o;

import java.util.concurrent.Callable;
import o.PackageDownloadRequest;

final class getButtonsLayout implements Callable {
    private final PackageDownloadRequest.AnonymousClass1 getMin;

    public getButtonsLayout(PackageDownloadRequest.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final Object call() {
        return Boolean.valueOf(this.getMin.getBalanceVisibility());
    }
}
