package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lid/dana/social/state/MyFeedHighlightState;", "", "()V", "Disabled", "Error", "Loading", "Success", "Lid/dana/social/state/MyFeedHighlightState$Loading;", "Lid/dana/social/state/MyFeedHighlightState$Success;", "Lid/dana/social/state/MyFeedHighlightState$Error;", "Lid/dana/social/state/MyFeedHighlightState$Disabled;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class reclaimScrapViews {
    private reclaimScrapViews() {
    }

    public /* synthetic */ reclaimScrapViews(byte b) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/social/state/MyFeedHighlightState$Loading;", "Lid/dana/social/state/MyFeedHighlightState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends reclaimScrapViews {
        @NotNull
        public static final length getMax = new length();

        private length() {
            super((byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/social/state/MyFeedHighlightState$Success;", "Lid/dana/social/state/MyFeedHighlightState;", "data", "", "Lid/dana/social/model/FeedHighlightModel;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends reclaimScrapViews {
        @NotNull
        public final List<getContextMenuInfo> length;

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.length, (Object) ((setMax) obj).length);
            }
            return true;
        }

        public final int hashCode() {
            List<getContextMenuInfo> list = this.length;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(data=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull List<getContextMenuInfo> list) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(list, "data");
            this.length = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/social/state/MyFeedHighlightState$Error;", "Lid/dana/social/state/MyFeedHighlightState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends reclaimScrapViews {
        @NotNull
        public static final getMin setMin = new getMin();

        private getMin() {
            super((byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/social/state/MyFeedHighlightState$Disabled;", "Lid/dana/social/state/MyFeedHighlightState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends reclaimScrapViews {
        @NotNull
        public static final getMax setMin = new getMax();

        private getMax() {
            super((byte) 0);
        }
    }
}
