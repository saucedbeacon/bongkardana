package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0006\u0010\u0017\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/search/model/NearbySearchSectionModel;", "()V", "listener", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "getListener", "()Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "setListener", "(Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;)V", "addTrendingSection", "", "sectionItemModel", "", "Lid/dana/nearbyrevamp/search/model/NearbySearchItemModel;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeTrendingSection", "NearbySectionListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSetting extends IMultiInstanceInvalidationCallback.Stub<Ignore<showAuthGuide>, showAuthGuide> {
    @Nullable
    public setMax length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "", "onKeywordClicked", "", "keyword", "", "tag", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMin(@NotNull String str, @NotNull String str2);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new addPhoneContact(viewGroup, this.length);
    }

    public getSetting() {
        getMin(new ArrayList());
    }

    public final int getItemViewType(int i) {
        return ((showAuthGuide) getMax().get(i)).getMax.getValue();
    }
}
