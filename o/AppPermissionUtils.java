package o;

import android.content.Context;
import o.b;

public final class AppPermissionUtils implements getAdapterPosition<isNoPermissionConfigAndAllow> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public AppPermissionUtils(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        this.contextProvider = bVar;
        this.splitFacadeProvider = bVar2;
    }

    public final isNoPermissionConfigAndAllow get() {
        return newInstance(this.contextProvider.get(), this.splitFacadeProvider.get());
    }

    public static AppPermissionUtils create(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        return new AppPermissionUtils(bVar, bVar2);
    }

    public static isNoPermissionConfigAndAllow newInstance(Context context, UpdateAppCallback updateAppCallback) {
        return new isNoPermissionConfigAndAllow(context, updateAppCallback);
    }
}
