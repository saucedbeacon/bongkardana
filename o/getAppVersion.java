package o;

import java.util.concurrent.Callable;

final class getAppVersion implements Callable {
    private final handleMessage length;

    public getAppVersion(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object call() {
        return this.length.lambda$getSocialMediaCategoryShare$24();
    }
}
