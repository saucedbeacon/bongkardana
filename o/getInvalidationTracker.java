package o;

import kotlin.jvm.internal.Intrinsics;
import o.ShareRecyclerAdapter;

public final class getInvalidationTracker implements getBindingAdapter<internalBeginTransaction> {
    public static void setMin(internalBeginTransaction internalbegintransaction, ShareRecyclerAdapter.ShareViewHolder shareViewHolder) {
        Intrinsics.checkNotNullParameter(shareViewHolder, "userInfoMapper");
        internalbegintransaction.getMax = shareViewHolder;
    }
}
