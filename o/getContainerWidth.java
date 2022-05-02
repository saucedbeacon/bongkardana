package o;

import o.b;

public final class getContainerWidth implements getAdapterPosition<AppUtils> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public getContainerWidth(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final AppUtils get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static getContainerWidth create(b.C0007b<UpdateAppCallback> bVar) {
        return new getContainerWidth(bVar);
    }

    public static AppUtils newInstance(UpdateAppCallback updateAppCallback) {
        return new AppUtils(updateAppCallback);
    }
}
