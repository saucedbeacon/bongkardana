package o;

import id.dana.di.modules.SendMoneyExternalModule;
import o.b;
import o.notifyFail;

public final class onPageBacked implements getAdapterPosition<notifyFail.getMin> {
    private final SendMoneyExternalModule getMax;
    private final b.C0007b<onPhotoSelected> setMin;

    private onPageBacked(SendMoneyExternalModule sendMoneyExternalModule, b.C0007b<onPhotoSelected> bVar) {
        this.getMax = sendMoneyExternalModule;
        this.setMin = bVar;
    }

    public static onPageBacked setMax(SendMoneyExternalModule sendMoneyExternalModule, b.C0007b<onPhotoSelected> bVar) {
        return new onPageBacked(sendMoneyExternalModule, bVar);
    }

    public final /* synthetic */ Object get() {
        notifyFail.getMin min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
