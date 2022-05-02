package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ScanHelper;
import o.setLeftButtonText;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$getTopFriendsWithTimeline$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeedWithTopFriends;", "onError", "", "e", "", "onNext", "feedWithTopFriends", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLeftButtonIcon$Grayscale$Algorithm extends GriverAppVirtualHostProxy<ScanHelper.AnonymousClass1> {
    final /* synthetic */ boolean getMin;
    final /* synthetic */ setLeftButtonIcon setMin;

    setLeftButtonIcon$Grayscale$Algorithm(setLeftButtonIcon setleftbuttonicon, boolean z) {
        this.setMin = setleftbuttonicon;
        this.getMin = z;
    }

    public final /* synthetic */ void onNext(Object obj) {
        ScanHelper.AnonymousClass1 r5 = (ScanHelper.AnonymousClass1) obj;
        Intrinsics.checkNotNullParameter(r5, "feedWithTopFriends");
        this.setMin.toFloatRange = r5.getUserId();
        this.setMin.IsOverlapping = r5.getSocialFeed().getHasMore();
        this.setMin.toIntRange = r5.getSocialFeed().getMaxId();
        this.setMin.valueOf.getMax = -1;
        setLeftButtonIcon setleftbuttonicon = this.setMin;
        setleftbuttonicon.isInside = !setleftbuttonicon.isInside;
        List max = setLeftButtonIcon.setMax(this.setMin, r5.getSocialFeed());
        if (!max.isEmpty() && !r5.getTopFriends().isEmpty()) {
            setLeftButtonText.getMax length = this.setMin.toDoubleRange;
            access$3600 unused = this.setMin.valueOf;
            length.length((setLeftButtonText.setMin) new setLeftButtonText.setMin.values(access$3600.getMax(r5.getTopFriends())));
            this.setMin.toDoubleRange.length((setLeftButtonText.setMin) new setLeftButtonText.setMin.toIntRange(max));
        } else if (this.getMin) {
            this.setMin.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.toFloatRange.getMin);
        } else {
            this.setMin.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.getMin.setMax);
        }
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        super.onError(th);
        this.setMin.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.equals.getMax);
    }
}
