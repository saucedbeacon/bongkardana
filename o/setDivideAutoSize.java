package o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.social.view.FeedHighlightView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lid/dana/social/adapter/viewholder/MyFeedHighlightViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/MyFeedHighlightModel;", "parent", "Landroid/view/ViewGroup;", "listener", "Lid/dana/social/adapter/MyFeedHighlightListener;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/MyFeedHighlightListener;)V", "previousData", "getPreviousData", "()Lid/dana/social/model/MyFeedHighlightModel;", "setPreviousData", "(Lid/dana/social/model/MyFeedHighlightModel;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setDivideAutoSize extends Ignore<access$1702> {
    @Nullable
    private access$1702 getMax;

    public final /* synthetic */ void setMax(Object obj) {
        access$1702 access_1702 = (access$1702) obj;
        if (access_1702 != null && (!Intrinsics.areEqual((Object) this.getMax, (Object) access_1702))) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            FeedHighlightView feedHighlightView = (FeedHighlightView) view.findViewById(resetInternal.setMax.Experimental);
            if (feedHighlightView != null) {
                feedHighlightView.render(access_1702);
            }
            this.getMax = access_1702;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setDivideAutoSize(@NotNull ViewGroup viewGroup, @NotNull WebSocketBridgeCallback webSocketBridgeCallback) {
        super(viewGroup.getContext(), R.layout.item_my_feed_highlight, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(webSocketBridgeCallback, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        FeedHighlightView feedHighlightView = (FeedHighlightView) view.findViewById(resetInternal.setMax.Experimental);
        if (feedHighlightView != null) {
            feedHighlightView.setListener(webSocketBridgeCallback);
            feedHighlightView.setupAdapter();
        }
    }
}
