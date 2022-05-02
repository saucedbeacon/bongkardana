package o;

import id.dana.nearbyme.di.module.NearbyTrackerModule;
import o.ShareMenu;
import o.b;

public final class GriverPageAbnormalExtension implements getAdapterPosition<ShareMenu.AnonymousClass1> {
    private final NearbyTrackerModule getMin;
    private final b.C0007b<ShareMenu> length;

    private GriverPageAbnormalExtension(NearbyTrackerModule nearbyTrackerModule, b.C0007b<ShareMenu> bVar) {
        this.getMin = nearbyTrackerModule;
        this.length = bVar;
    }

    public static GriverPageAbnormalExtension setMin(NearbyTrackerModule nearbyTrackerModule, b.C0007b<ShareMenu> bVar) {
        return new GriverPageAbnormalExtension(nearbyTrackerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ShareMenu.AnonymousClass1 length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
