package o;

import id.dana.di.modules.MoreForYouModule;
import o.b;
import o.getAspectRatio;

public final class castToJavaBean implements getAdapterPosition<getAspectRatio.getMax> {
    private final MoreForYouModule getMin;
    private final b.C0007b<getQuality> length;

    public static getAspectRatio.getMax setMax(MoreForYouModule moreForYouModule, getQuality getquality) {
        getAspectRatio.getMax length2 = moreForYouModule.length(getquality);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getAspectRatio.getMax length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
