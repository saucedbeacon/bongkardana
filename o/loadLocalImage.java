package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.promoquest.model.MissionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lid/dana/promoquest/adapter/MissionSummaryAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/promoquest/views/MissionSummaryViewHolder;", "Lid/dana/promoquest/model/MissionModel;", "()V", "getCardSizeBasedOnCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class loadLocalImage extends IMultiInstanceInvalidationCallback.Stub<setSessionData, MissionModel> {
    public final /* synthetic */ void getMax(Ignore ignore, int i) {
        setSessionData setsessiondata = (setSessionData) ignore;
        Intrinsics.checkNotNullParameter(setsessiondata, "holder");
        setsessiondata.setMax((MissionModel) getMax().get(i));
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1973719990, oncanceled);
            onCancelLoad.getMin(1973719990, oncanceled);
        }
        setSessionData setsessiondata = (setSessionData) valueof;
        Intrinsics.checkNotNullParameter(setsessiondata, "holder");
        setsessiondata.setMax((MissionModel) getMax().get(i));
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setSessionData(viewGroup, getItemCount() > 1 ? 0 : 2);
    }
}
