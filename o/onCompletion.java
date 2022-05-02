package o;

import id.dana.nearbyme.di.module.OtherStoreListModule;
import o.b;
import o.distanceInfluenceForSnapDuration;

public final class onCompletion implements getAdapterPosition<distanceInfluenceForSnapDuration.getMax> {
    private final b.C0007b<dataSetChanged> getMax;
    private final OtherStoreListModule setMin;

    public static distanceInfluenceForSnapDuration.getMax setMin(OtherStoreListModule otherStoreListModule, dataSetChanged datasetchanged) {
        distanceInfluenceForSnapDuration.getMax max = otherStoreListModule.getMax(datasetchanged);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        distanceInfluenceForSnapDuration.getMax max = this.setMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
