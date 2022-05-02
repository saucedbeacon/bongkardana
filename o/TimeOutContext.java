package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0006\u0010\u000f\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lid/dana/explore/adapter/ExploreProductAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreProductWrapper;", "()V", "getItemViewType", "", "position", "hideExcessiveSku", "", "hideLoadingSkeleton", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "itemType", "showLoadingSkeleton", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TimeOutContext extends IMultiInstanceInvalidationCallback.Stub<Ignore<supportAdvertise>, supportAdvertise> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/explore/model/ExploreProductWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<supportAdvertise, Boolean> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((supportAdvertise) obj));
        }

        public final boolean invoke(supportAdvertise supportadvertise) {
            return supportadvertise.getMin == 1;
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != 1) {
            ignore = new bytesToHexStringInReverse(viewGroup);
        } else {
            ignore = new BluetoothHelper(viewGroup);
        }
        return ignore;
    }

    public final int getItemViewType(int i) {
        return ((supportAdvertise) getMax().get(i)).getMin;
    }
}
