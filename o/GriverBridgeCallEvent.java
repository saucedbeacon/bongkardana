package o;

import id.dana.di.modules.OauthGrantModule;
import o.b;
import o.dispatchOnPageScrolled;

public final class GriverBridgeCallEvent implements getAdapterPosition<dispatchOnPageScrolled.length> {
    private final OauthGrantModule getMax;
    private final b.C0007b<infoForPosition> getMin;

    private GriverBridgeCallEvent(OauthGrantModule oauthGrantModule, b.C0007b<infoForPosition> bVar) {
        this.getMax = oauthGrantModule;
        this.getMin = bVar;
    }

    public static GriverBridgeCallEvent setMin(OauthGrantModule oauthGrantModule, b.C0007b<infoForPosition> bVar) {
        return new GriverBridgeCallEvent(oauthGrantModule, bVar);
    }

    public final /* synthetic */ Object get() {
        dispatchOnPageScrolled.length min = this.getMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
