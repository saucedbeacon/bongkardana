package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "()V", "onCreateViewHolder", "Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter$LocationSearchResultViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "LocationSearchResultViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OpenUserIdBridgeExtension extends IMultiInstanceInvalidationCallback.Stub<Ignore<getCreateTime>, getCreateTime> {
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new getMax(viewGroup);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter$LocationSearchResultViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "getDistanceFormatterWithoutSpace", "", "context", "Landroid/content/Context;", "distance", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends Ignore<getCreateTime> {
        public final /* synthetic */ void setMax(Object obj) {
            String str;
            getCreateTime getcreatetime = (getCreateTime) obj;
            if (getcreatetime != null) {
                View view = this.itemView;
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.updateTab);
                if (textView != null) {
                    textView.setText(getcreatetime.getName());
                }
                TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.createTabView);
                if (textView2 != null) {
                    textView2.setText(getcreatetime.getDescription());
                }
                double distanceInMeters = (double) getcreatetime.getDistanceInMeters();
                Double.isNaN(distanceInMeters);
                double d = distanceInMeters / 1000.0d;
                TextView textView3 = (TextView) view.findViewById(resetInternal.setMax.measureChildBeforeLayout);
                if (textView3 != null) {
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                    if (d >= 1.0d) {
                        str = context.getString(R.string.km_away_no_space, new Object[]{Double.valueOf(d)});
                        Intrinsics.checkNotNullExpressionValue(str, "context.getString(R.stri…_away_no_space, distance)");
                    } else {
                        str = context.getString(R.string.m_away_no_space, new Object[]{Double.valueOf(d * 1000.0d)});
                        Intrinsics.checkNotNullExpressionValue(str, "context\n                …o_space, distance * 1000)");
                    }
                    textView3.setText(str);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_location_search_result, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }
}
