package o;

import id.dana.social.di.module.FeedNotificationModule;
import o.b;
import o.setLeftButtonEnabled;

public final class getIconfontContext implements getAdapterPosition<setLeftButtonEnabled.setMin> {
    private final b.C0007b<setRightButtonIcon> setMax;
    private final FeedNotificationModule setMin;

    private getIconfontContext(FeedNotificationModule feedNotificationModule, b.C0007b<setRightButtonIcon> bVar) {
        this.setMin = feedNotificationModule;
        this.setMax = bVar;
    }

    public static getIconfontContext setMax(FeedNotificationModule feedNotificationModule, b.C0007b<setRightButtonIcon> bVar) {
        return new getIconfontContext(feedNotificationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonEnabled.setMin max = this.setMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
