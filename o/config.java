package o;

import id.dana.contract.user.GetPocketInfoModule;
import o.getDialogLayout;

public final class config implements getAdapterPosition<getDialogLayout.getMax> {
    private final GetPocketInfoModule length;

    private config(GetPocketInfoModule getPocketInfoModule) {
        this.length = getPocketInfoModule;
    }

    public static config length(GetPocketInfoModule getPocketInfoModule) {
        return new config(getPocketInfoModule);
    }

    public final /* synthetic */ Object get() {
        getDialogLayout.getMax length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
