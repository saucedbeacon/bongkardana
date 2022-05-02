package o;

import o.b;

public final class ToolbarMenuOption implements getAdapterPosition<setToolbarMenus> {
    private final b.C0007b<success> repositoryProvider;

    public ToolbarMenuOption(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final setToolbarMenus get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static ToolbarMenuOption create(b.C0007b<success> bVar) {
        return new ToolbarMenuOption(bVar);
    }

    public static setToolbarMenus newInstance(success success) {
        return new setToolbarMenus(success);
    }
}
