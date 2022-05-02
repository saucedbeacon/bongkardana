package o;

import o.b;

public final class bytes2Hex implements getAdapterPosition<H5SplitCompatUtils> {
    private final b.C0007b<toDigit> notificationCenterRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public bytes2Hex(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toDigit> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.notificationCenterRepositoryProvider = bVar3;
    }

    public final H5SplitCompatUtils get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.notificationCenterRepositoryProvider.get());
    }

    public static bytes2Hex create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toDigit> bVar3) {
        return new bytes2Hex(bVar, bVar2, bVar3);
    }

    public static H5SplitCompatUtils newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toDigit todigit) {
        return new H5SplitCompatUtils(appxloadfailed, getscheme, todigit);
    }
}
