package o;

import id.dana.di.modules.SavedBankModule;
import o.b;
import o.onSuccess;

public final class pageDestroy implements getAdapterPosition<onSuccess.length> {
    private final SavedBankModule setMax;
    private final b.C0007b<IWorkManagerImplCallback> setMin;

    private pageDestroy(SavedBankModule savedBankModule, b.C0007b<IWorkManagerImplCallback> bVar) {
        this.setMax = savedBankModule;
        this.setMin = bVar;
    }

    public static pageDestroy getMax(SavedBankModule savedBankModule, b.C0007b<IWorkManagerImplCallback> bVar) {
        return new pageDestroy(savedBankModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onSuccess.length min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
