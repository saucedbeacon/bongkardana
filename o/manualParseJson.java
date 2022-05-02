package o;

import o.b;

public final class manualParseJson implements getAdapterPosition<getAppLaunchParams> {
    private final b.C0007b<getPages> localErrorConfigEntityDataProvider;
    private final b.C0007b<getPageLaunchParams> networkErrorConfigEntityDataProvider;

    public manualParseJson(b.C0007b<getPageLaunchParams> bVar, b.C0007b<getPages> bVar2) {
        this.networkErrorConfigEntityDataProvider = bVar;
        this.localErrorConfigEntityDataProvider = bVar2;
    }

    public final getAppLaunchParams get() {
        return newInstance(this.networkErrorConfigEntityDataProvider.get(), this.localErrorConfigEntityDataProvider.get());
    }

    public static manualParseJson create(b.C0007b<getPageLaunchParams> bVar, b.C0007b<getPages> bVar2) {
        return new manualParseJson(bVar, bVar2);
    }

    public static getAppLaunchParams newInstance(getPageLaunchParams getpagelaunchparams, getPages getpages) {
        return new getAppLaunchParams(getpagelaunchparams, getpages);
    }
}
