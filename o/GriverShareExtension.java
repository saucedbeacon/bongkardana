package o;

import o.b;

public final class GriverShareExtension implements getAdapterPosition<getToolbarMenus> {
    private final b.C0007b<success> repositoryProvider;

    public GriverShareExtension(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final getToolbarMenus get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static GriverShareExtension create(b.C0007b<success> bVar) {
        return new GriverShareExtension(bVar);
    }

    public static getToolbarMenus newInstance(success success) {
        return new getToolbarMenus(success);
    }
}
