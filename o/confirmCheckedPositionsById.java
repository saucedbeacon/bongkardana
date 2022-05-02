package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lid/dana/social/model/FeedCommentResultModel;", "", "comments", "", "Lid/dana/social/state/ViewHolderState$Item;", "Lid/dana/social/model/FeedCommentModel;", "maxId", "", "hasNext", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getComments", "()Ljava/util/List;", "getHasNext", "()Z", "getMaxId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class confirmCheckedPositionsById {
    @NotNull
    public static final getMax getMax = new getMax((byte) 0);
    private final boolean getMin;
    @NotNull
    private final String setMax;
    @NotNull
    public final List<AUHorizontalListView.RecyclerListener.length<resurrectSelectionIfNeeded>> setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof confirmCheckedPositionsById)) {
            return false;
        }
        confirmCheckedPositionsById confirmcheckedpositionsbyid = (confirmCheckedPositionsById) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) confirmcheckedpositionsbyid.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) confirmcheckedpositionsbyid.setMax) && this.getMin == confirmcheckedpositionsbyid.getMin;
    }

    public final int hashCode() {
        List<AUHorizontalListView.RecyclerListener.length<resurrectSelectionIfNeeded>> list = this.setMin;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.setMax;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.getMin;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedCommentResultModel(comments=");
        sb.append(this.setMin);
        sb.append(", maxId=");
        sb.append(this.setMax);
        sb.append(", hasNext=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public confirmCheckedPositionsById(@NotNull List<AUHorizontalListView.RecyclerListener.length<resurrectSelectionIfNeeded>> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "comments");
        Intrinsics.checkNotNullParameter(str, "maxId");
        this.setMin = list;
        this.setMax = str;
        this.getMin = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/social/model/FeedCommentResultModel$Companion;", "", "()V", "fromFeedCommentResult", "Lid/dana/social/model/FeedCommentResultModel;", "feedCommentResult", "Lid/dana/domain/social/model/FeedCommentResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
