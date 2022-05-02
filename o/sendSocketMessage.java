package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\r\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/social/adapter/MyFeedHighlightAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/social/adapter/viewholder/MyFeedHighlightViewHolder;", "Lid/dana/social/model/MyFeedHighlightModel;", "listener", "Lid/dana/social/adapter/MyFeedHighlightListener;", "(Lid/dana/social/adapter/MyFeedHighlightListener;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "renderLoadingState", "", "()Lkotlin/Unit;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendSocketMessage extends IMultiInstanceInvalidationCallback.Stub<setDivideAutoSize, access$1702> {
    private final WebSocketBridgeCallback length;

    public final int getItemViewType(int i) {
        return R.layout.item_my_feed_highlight;
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setDivideAutoSize(viewGroup, this.length);
    }

    public sendSocketMessage(@NotNull WebSocketBridgeCallback webSocketBridgeCallback) {
        Intrinsics.checkNotNullParameter(webSocketBridgeCallback, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.length = webSocketBridgeCallback;
        setMax();
    }

    @Nullable
    public final Unit setMax() {
        access$1702 access_1702;
        Function0<Unit> function0;
        List max = getMax();
        if (max == null || (access_1702 = (access$1702) CollectionsKt.firstOrNull(max)) == null || (function0 = access_1702.getMax) == null) {
            return null;
        }
        return function0.invoke();
    }
}
