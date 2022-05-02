package o;

import id.dana.di.modules.GContainerModule;
import o.b;
import o.negativeButton;

public final class parseStackTraceElement implements getAdapterPosition<negativeButton.Cdefault> {
    private final GContainerModule getMin;
    private final b.C0007b<GriverShareSchemeExtension> setMax;
    private final b.C0007b<GriverCreateDialogParam> setMin;

    private parseStackTraceElement(GContainerModule gContainerModule, b.C0007b<GriverShareSchemeExtension> bVar, b.C0007b<GriverCreateDialogParam> bVar2) {
        this.getMin = gContainerModule;
        this.setMax = bVar;
        this.setMin = bVar2;
    }

    public static parseStackTraceElement getMin(GContainerModule gContainerModule, b.C0007b<GriverShareSchemeExtension> bVar, b.C0007b<GriverCreateDialogParam> bVar2) {
        return new parseStackTraceElement(gContainerModule, bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        negativeButton.Cdefault min = this.getMin.getMin(this.setMax.get(), this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
