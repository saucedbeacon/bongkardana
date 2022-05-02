package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/explore/popularplaces/adapter/PopularPlacesAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/explore/popularplaces/adapter/PopularPlacesAdapter$PopularPlacesViewHolder;", "Lid/dana/explore/popularplaces/model/ExplorePopularPlacesConfigModel;", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "PopularPlacesViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class rollbackFixBoolean extends IMultiInstanceInvalidationCallback.Stub<setMin, safeParseInt> {
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMin(viewGroup);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u0007*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\r"}, d2 = {"Lid/dana/explore/popularplaces/adapter/PopularPlacesAdapter$PopularPlacesViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/popularplaces/model/ExplorePopularPlacesConfigModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "loadImage", "Lde/hdodenhof/circleimageview/CircleImageView;", "logoUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends Ignore<safeParseInt> {
        public final /* synthetic */ void setMax(Object obj) {
            safeParseInt safeparseint = (safeParseInt) obj;
            Intrinsics.checkNotNullParameter(safeparseint, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            CircleImageView circleImageView = (CircleImageView) view.findViewById(resetInternal.setMax.invalidateDrawable);
            if (circleImageView != null) {
                String str = safeparseint.getMin;
                if (str != null) {
                    Intrinsics.checkNotNullExpressionValue(((updateCornerMarking) Glide.getMax(circleImageView.getContext())).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.skeleton_popular_places).setMin((int) R.drawable.skeleton_popular_places).length((ImageView) circleImageView), "GlideApp.with(context)\n …              .into(this)");
                } else {
                    circleImageView.setImageResource(R.drawable.skeleton_popular_places);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_popular_places, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }
}
