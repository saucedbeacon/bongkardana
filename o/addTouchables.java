package o;

import id.dana.contract.payqr.AddNewCardModule;
import o.b;
import o.enableLayers;

public final class addTouchables implements getAdapterPosition<enableLayers.setMin> {
    private final b.C0007b<infoForCurrentScrollPosition> getMax;
    private final AddNewCardModule setMin;

    private addTouchables(AddNewCardModule addNewCardModule, b.C0007b<infoForCurrentScrollPosition> bVar) {
        this.setMin = addNewCardModule;
        this.getMax = bVar;
    }

    public static addTouchables length(AddNewCardModule addNewCardModule, b.C0007b<infoForCurrentScrollPosition> bVar) {
        return new addTouchables(addNewCardModule, bVar);
    }

    public final /* synthetic */ Object get() {
        enableLayers.setMin max = this.setMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
