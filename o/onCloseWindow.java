package o;

import o.b;

public final class onCloseWindow implements getAdapterPosition<onShowCustomView> {
    private final b.C0007b<onCreateWindow> repositoryProvider;

    public onCloseWindow(b.C0007b<onCreateWindow> bVar) {
        this.repositoryProvider = bVar;
    }

    public final onShowCustomView get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static onCloseWindow create(b.C0007b<onCreateWindow> bVar) {
        return new onCloseWindow(bVar);
    }

    public static onShowCustomView newInstance(onCreateWindow oncreatewindow) {
        return new onShowCustomView(oncreatewindow);
    }
}
