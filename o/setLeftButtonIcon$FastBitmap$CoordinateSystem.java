package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setLeftButtonText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$getTimelineObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "socialFeed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLeftButtonIcon$FastBitmap$CoordinateSystem extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
    final /* synthetic */ setLeftButtonIcon getMax;

    setLeftButtonIcon$FastBitmap$CoordinateSystem(setLeftButtonIcon setleftbuttonicon) {
        this.getMax = setleftbuttonicon;
    }

    public final /* synthetic */ void onNext(Object obj) {
        getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
        Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
        this.getMax.IsOverlapping = getscancallbackintent.getHasMore();
        this.getMax.toIntRange = getscancallbackintent.getMaxId();
        this.getMax.toDoubleRange.length((setLeftButtonText.setMin) new setLeftButtonText.setMin.toIntRange(setLeftButtonIcon.setMax(this.getMax, getscancallbackintent)));
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        super.onError(th);
        this.getMax.toDoubleRange.length((setLeftButtonText.setMin) new setLeftButtonText.setMin.isInside(this.getMax.isInside));
    }
}
