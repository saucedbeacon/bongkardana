package o;

import o.b;

public final class setColor implements getAdapterPosition<setMenus> {
    private final b.C0007b<toolbarMenuClicked> announcementRepositoryProvider;

    public setColor(b.C0007b<toolbarMenuClicked> bVar) {
        this.announcementRepositoryProvider = bVar;
    }

    public final setMenus get() {
        return newInstance(this.announcementRepositoryProvider.get());
    }

    public static setColor create(b.C0007b<toolbarMenuClicked> bVar) {
        return new setColor(bVar);
    }

    public static setMenus newInstance(toolbarMenuClicked toolbarmenuclicked) {
        return new setMenus(toolbarmenuclicked);
    }
}
