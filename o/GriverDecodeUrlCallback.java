package o;

import id.dana.di.modules.OauthModule;
import o.b;
import o.onAnimationEnd;

public final class GriverDecodeUrlCallback implements getAdapterPosition<onAnimationEnd.getMin> {
    private final OauthModule getMin;
    private final b.C0007b<getStrokeAlpha> length;

    private GriverDecodeUrlCallback(OauthModule oauthModule, b.C0007b<getStrokeAlpha> bVar) {
        this.getMin = oauthModule;
        this.length = bVar;
    }

    public static GriverDecodeUrlCallback setMax(OauthModule oauthModule, b.C0007b<getStrokeAlpha> bVar) {
        return new GriverDecodeUrlCallback(oauthModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onAnimationEnd.getMin min = this.getMin.setMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
