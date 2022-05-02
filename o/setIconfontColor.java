package o;

import id.dana.social.di.module.ContentGroupingDetailModule;
import o.setLeftButtonUnicode;

public final class setIconfontColor implements getAdapterPosition<setLeftButtonUnicode.setMin> {
    private final ContentGroupingDetailModule setMax;

    public static setLeftButtonUnicode.setMin setMax(ContentGroupingDetailModule contentGroupingDetailModule) {
        setLeftButtonUnicode.setMin length = contentGroupingDetailModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setLeftButtonUnicode.setMin length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
