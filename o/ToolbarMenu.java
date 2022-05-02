package o;

import o.b;

public final class ToolbarMenu implements getAdapterPosition<ToolbarMenuClickListener> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public ToolbarMenu(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final ToolbarMenuClickListener get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static ToolbarMenu create(b.C0007b<setDefaultFontSize> bVar) {
        return new ToolbarMenu(bVar);
    }

    public static ToolbarMenuClickListener newInstance(setDefaultFontSize setdefaultfontsize) {
        return new ToolbarMenuClickListener(setdefaultfontsize);
    }
}
