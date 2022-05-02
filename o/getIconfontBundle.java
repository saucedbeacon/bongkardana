package o;

import id.dana.social.di.module.FeedNotificationModule;
import o.setLeftButtonEnabled;

public final class getIconfontBundle implements getAdapterPosition<setLeftButtonEnabled.length> {
    private final FeedNotificationModule getMin;

    private getIconfontBundle(FeedNotificationModule feedNotificationModule) {
        this.getMin = feedNotificationModule;
    }

    public static getIconfontBundle getMin(FeedNotificationModule feedNotificationModule) {
        return new getIconfontBundle(feedNotificationModule);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonEnabled.length max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
