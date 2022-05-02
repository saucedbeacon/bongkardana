package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0006\u0010\u0010\u001a\u00020\t¨\u0006\u0011"}, d2 = {"Lid/dana/explore/adapter/ExploreServiceAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/explore/model/ExploreServiceWrapper;", "()V", "getItemViewType", "", "position", "hideLoadingSkeleton", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showLoadingSkeleton", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTxPowerLevel extends IMultiInstanceInvalidationCallback.Stub<Ignore<getUUIDFromString>, getUUIDFromString> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/explore/model/ExploreServiceWrapper;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<getUUIDFromString, Boolean> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((getUUIDFromString) obj));
        }

        public final boolean invoke(getUUIDFromString getuuidfromstring) {
            return getuuidfromstring.getMax == 1;
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != 1) {
            ignore = new BeaconResult(viewGroup);
        } else {
            ignore = new closeBluetooth(viewGroup);
        }
        return ignore;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ getTxPowerLevel getMin;

        length(getTxPowerLevel gettxpowerlevel) {
            this.getMin = gettxpowerlevel;
        }

        public final void length(int i) {
            this.getMin.setMin(i);
        }
    }

    public final void getMax(@NotNull Ignore<getUUIDFromString> ignore, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-98539645, oncanceled);
            onCancelLoad.getMin(-98539645, oncanceled);
        }
        Intrinsics.checkNotNullParameter(ignore, "holder");
        ignore.setMin(new length(this));
        super.onBindViewHolder(ignore, i);
    }

    public final int getItemViewType(int i) {
        return ((getUUIDFromString) getMax().get(i)).getMax;
    }
}
