package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import id.dana.R;
import id.dana.nearbyrevamp.view.MaxHeightRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getSetting;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/search/viewholder/NearbyTrendingSectionViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/search/model/NearbySearchSectionModel;", "parent", "Landroid/view/ViewGroup;", "listener", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "(Landroid/view/ViewGroup;Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;)V", "bindData", "", "data", "getMaxHeight", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addPhoneContact extends Ignore<showAuthGuide> {
    @NotNull
    public static final setMin setMax = new setMin((byte) 0);
    private final getSetting.setMax getMax;

    public final /* synthetic */ void setMax(Object obj) {
        showAuthGuide showauthguide = (showAuthGuide) obj;
        if (showauthguide != null) {
            getOpenUserData getopenuserdata = new getOpenUserData();
            getopenuserdata.setMax = this.getMax;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) view.findViewById(resetInternal.setMax.setBackgroundDrawable);
            if (maxHeightRecyclerView != null) {
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f29082131165620);
                Context context2 = this.length;
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                maxHeightRecyclerView.setMaxHeight((dimensionPixelSize + context2.getResources().getDimensionPixelSize(R.dimen.f29092131165621)) * 3);
                maxHeightRecyclerView.setLayoutManager(new FlexboxLayoutManager(maxHeightRecyclerView.getContext()));
                maxHeightRecyclerView.setAdapter(getopenuserdata);
            }
            getopenuserdata.getMin(showauthguide.setMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public addPhoneContact(@NotNull ViewGroup viewGroup, @Nullable getSetting.setMax setmax) {
        super(viewGroup.getContext(), R.layout.item_nearby_trending_section, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/search/viewholder/NearbyTrendingSectionViewHolder$Companion;", "", "()V", "MAX_ROW", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
