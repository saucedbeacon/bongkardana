package o;

import id.dana.domain.authcode.interactor.GetAuthCode;
import o.b;

public final class setOptionMenu implements getAdapterPosition<GetAuthCode> {
    private final b.C0007b<enableBackButton> repositoryProvider;

    public setOptionMenu(b.C0007b<enableBackButton> bVar) {
        this.repositoryProvider = bVar;
    }

    public final GetAuthCode get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static setOptionMenu create(b.C0007b<enableBackButton> bVar) {
        return new setOptionMenu(bVar);
    }

    public static GetAuthCode newInstance(enableBackButton enablebackbutton) {
        return new GetAuthCode(enablebackbutton);
    }
}
