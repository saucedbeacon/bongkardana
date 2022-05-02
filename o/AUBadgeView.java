package o;

import id.dana.social.di.module.FriendshipModule;
import id.dana.social.di.module.SocialCommonModule;
import o.AUHorizontalListView;
import o.b;
import o.getLeftButton;

public final class AUBadgeView implements getAdapterPosition<getLeftButton.setMax> {
    private final FriendshipModule setMin;

    private AUBadgeView(FriendshipModule friendshipModule) {
        this.setMin = friendshipModule;
    }

    public final class OnContentChangedListener implements getAdapterPosition<AUHorizontalListView.SelectionNotifier> {
        private final SocialCommonModule getMax;
        private final b.C0007b<rememberWindowAttachCount> length;

        private OnContentChangedListener(SocialCommonModule socialCommonModule, b.C0007b<rememberWindowAttachCount> bVar) {
            this.getMax = socialCommonModule;
            this.length = bVar;
        }

        public static OnContentChangedListener getMin(SocialCommonModule socialCommonModule, b.C0007b<rememberWindowAttachCount> bVar) {
            return new OnContentChangedListener(socialCommonModule, bVar);
        }

        public final /* synthetic */ Object get() {
            AUHorizontalListView.SelectionNotifier min = this.getMax.getMin(this.length.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class Style implements getAdapterPosition<DistanceConfigFetcher> {
        private final b.C0007b<RVGroup> getMax;
        private final SocialCommonModule getMin;

        private Style(SocialCommonModule socialCommonModule, b.C0007b<RVGroup> bVar) {
            this.getMin = socialCommonModule;
            this.getMax = bVar;
        }

        public static Style getMax(SocialCommonModule socialCommonModule, b.C0007b<RVGroup> bVar) {
            return new Style(socialCommonModule, bVar);
        }

        public final /* synthetic */ Object get() {
            DistanceConfigFetcher min = this.getMin.setMin(this.getMax.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static AUBadgeView setMax(FriendshipModule friendshipModule) {
        return new AUBadgeView(friendshipModule);
    }

    public final /* synthetic */ Object get() {
        getLeftButton.setMax max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
