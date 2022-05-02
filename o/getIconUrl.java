package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.social.view.FeedSharingView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.onMovedToScrapHeap;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuFeedSharingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getIconUrl extends Ignore<SettingModel> {
    public final /* synthetic */ void setMax(Object obj) {
        setBeaconParsers initFeedStatus;
        onMovedToScrapHeap onmovedtoscrapheap;
        SettingModel settingModel = (SettingModel) obj;
        super.setMax(settingModel);
        if (settingModel != null && (initFeedStatus = settingModel.getInitFeedStatus()) != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            FeedSharingView feedSharingView = (FeedSharingView) view.findViewById(resetInternal.setMax.setRotation);
            onMovedToScrapHeap.getMax getmax = onMovedToScrapHeap.getMax;
            Intrinsics.checkNotNullParameter(initFeedStatus, "initFeed");
            if (retrieveFromScrap.getMax[initFeedStatus.getStatus().ordinal()] != 1) {
                onmovedtoscrapheap = onMovedToScrapHeap.setMax.setMax;
            } else {
                onmovedtoscrapheap = initFeedStatus.getHasRestrictedContact() ? onMovedToScrapHeap.length.getMin : onMovedToScrapHeap.setMin.setMax;
            }
            feedSharingView.render(onmovedtoscrapheap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getIconUrl(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_profile_feed_sharing, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
