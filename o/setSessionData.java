package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.promoquest.model.MissionModel;
import id.dana.promoquest.views.MissionCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/promoquest/views/MissionSummaryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/promoquest/model/MissionModel;", "parent", "Landroid/view/ViewGroup;", "size", "", "(Landroid/view/ViewGroup;I)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSessionData extends Ignore<MissionModel> {
    private final int getMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setSessionData(@NotNull ViewGroup viewGroup, int i) {
        super(viewGroup.getContext(), R.layout.view_item_mission_card, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = i;
    }

    /* renamed from: getMax */
    public final void setMax(@Nullable MissionModel missionModel) {
        View view = this.itemView;
        if (view != null) {
            MissionCardView missionCardView = (MissionCardView) view;
            missionCardView.setSize(this.getMax);
            missionCardView.setMission(missionModel);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.promoquest.views.MissionCardView");
    }
}
