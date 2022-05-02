package o;

import android.content.Context;
import id.dana.contract.globalsearch.GlobalSearchModule;
import o.GriverManifest;
import o.b;

public final class CustomVersionedParcelable implements getAdapterPosition<GriverManifest.AnonymousClass11> {
    private final b.C0007b<Context> getMax;
    private final GlobalSearchModule length;

    public static GriverManifest.AnonymousClass11 getMax(GlobalSearchModule globalSearchModule, Context context) {
        GriverManifest.AnonymousClass11 min = globalSearchModule.setMin(context);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass11 min = this.length.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
