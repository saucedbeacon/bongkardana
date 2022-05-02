package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.OrientationDetector;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J,\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lid/dana/bottomsheet/ServicesBottomSheetListAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/ThirdPartyService;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRequiredTypeConverters extends IMultiInstanceInvalidationCallback.Stub<Ignore<ThirdPartyService>, ThirdPartyService> {
    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i, List list) {
        Ignore ignore = (Ignore) valueof;
        Intrinsics.checkNotNullParameter(ignore, "holder");
        Intrinsics.checkNotNullParameter(list, "payloads");
        ignore.setIsRecyclable(false);
        super.onBindViewHolder(ignore, i, list);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 3) {
            ignore = new createOpenHelper(viewGroup);
        } else if (i != 5) {
            ignore = new OrientationDetector.MyOrientationEventListener(viewGroup.getContext(), viewGroup);
        } else {
            ignore = new getEnableCrop(viewGroup);
        }
        return ignore;
    }

    public getRequiredTypeConverters() {
        getMin(CollectionsKt.emptyList());
    }

    public final int getItemViewType(int i) {
        if (i < 0 || i >= getMax().size() || setMin(i) == null) {
            return 0;
        }
        int i2 = ((ThirdPartyService) setMin(i)).values;
        if (i2 != 4) {
            return i2 != 6 ? 2 : 5;
        }
        return 3;
    }
}
