package o;

import id.dana.social.di.module.FriendsFeedsModule;
import o.b;
import o.setLeftButtonText;

public final class parser implements getAdapterPosition<setLeftButtonText.length> {
    private final b.C0007b<setLeftButtonIcon> getMin;
    private final FriendsFeedsModule length;

    private parser(FriendsFeedsModule friendsFeedsModule, b.C0007b<setLeftButtonIcon> bVar) {
        this.length = friendsFeedsModule;
        this.getMin = bVar;
    }

    public static parser setMax(FriendsFeedsModule friendsFeedsModule, b.C0007b<setLeftButtonIcon> bVar) {
        return new parser(friendsFeedsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonText.length max = this.length.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
