package o;

import o.b;

public final class AuthDialogProxy implements getAdapterPosition<getOpenAuthDialog> {
    private final b.C0007b<getOrigin> userConfigRepositoryProvider;

    public AuthDialogProxy(b.C0007b<getOrigin> bVar) {
        this.userConfigRepositoryProvider = bVar;
    }

    public final getOpenAuthDialog get() {
        return newInstance(this.userConfigRepositoryProvider.get());
    }

    public static AuthDialogProxy create(b.C0007b<getOrigin> bVar) {
        return new AuthDialogProxy(bVar);
    }

    public static getOpenAuthDialog newInstance(getOrigin getorigin) {
        return new getOpenAuthDialog(getorigin);
    }
}
