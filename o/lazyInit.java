package o;

import id.dana.social.di.module.FriendshipModule;
import o.b;
import o.getLeftButton;

public final class lazyInit implements getAdapterPosition<getLeftButton.getMin> {
    private final b.C0007b<fillActiveViews> getMin;
    private final FriendshipModule setMin;

    private lazyInit(FriendshipModule friendshipModule, b.C0007b<fillActiveViews> bVar) {
        this.setMin = friendshipModule;
        this.getMin = bVar;
    }

    public static lazyInit getMax(FriendshipModule friendshipModule, b.C0007b<fillActiveViews> bVar) {
        return new lazyInit(friendshipModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getLeftButton.getMin max = this.setMin.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
