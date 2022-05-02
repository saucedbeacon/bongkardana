package o;

import android.content.Context;
import o.AppMsgReceiver;
import o.b;

public final class setRequestApps implements getAdapterPosition<getQueryScene> {
    private final b.C0007b<AppMsgReceiver.AnonymousClass2> configEntityDataProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setQueryScene> mixpanelPreferencesProvider;

    public setRequestApps(b.C0007b<Context> bVar, b.C0007b<setQueryScene> bVar2, b.C0007b<AppMsgReceiver.AnonymousClass2> bVar3) {
        this.contextProvider = bVar;
        this.mixpanelPreferencesProvider = bVar2;
        this.configEntityDataProvider = bVar3;
    }

    public final getQueryScene get() {
        return newInstance(this.contextProvider.get(), this.mixpanelPreferencesProvider.get(), this.configEntityDataProvider.get());
    }

    public static setRequestApps create(b.C0007b<Context> bVar, b.C0007b<setQueryScene> bVar2, b.C0007b<AppMsgReceiver.AnonymousClass2> bVar3) {
        return new setRequestApps(bVar, bVar2, bVar3);
    }

    public static getQueryScene newInstance(Context context, setQueryScene setqueryscene, AppMsgReceiver.AnonymousClass2 r3) {
        return new getQueryScene(context, setqueryscene, r3);
    }
}
