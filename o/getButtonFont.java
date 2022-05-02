package o;

import id.dana.contract.user.GetUserInfoModule;
import o.b;
import o.setAutoDismissEnabled$core;

public final class getButtonFont implements getAdapterPosition<setAutoDismissEnabled$core.setMin> {
    private final GetUserInfoModule getMin;
    private final b.C0007b<setBodyFont$core> length;

    private getButtonFont(GetUserInfoModule getUserInfoModule, b.C0007b<setBodyFont$core> bVar) {
        this.getMin = getUserInfoModule;
        this.length = bVar;
    }

    public static getButtonFont setMax(GetUserInfoModule getUserInfoModule, b.C0007b<setBodyFont$core> bVar) {
        return new getButtonFont(getUserInfoModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setAutoDismissEnabled$core.setMin length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
