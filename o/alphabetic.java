package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class alphabetic implements getAdapterPosition<toolbarMenuClicked> {
    private final ApplicationModule length;
    private final b.C0007b<updateListItems> setMax;

    private alphabetic(ApplicationModule applicationModule, b.C0007b<updateListItems> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static alphabetic length(ApplicationModule applicationModule, b.C0007b<updateListItems> bVar) {
        return new alphabetic(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        toolbarMenuClicked max = this.length.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
