package o;

import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lid/dana/social/constant/FeedContentType;", "", "()V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onTabClick {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/constant/FeedContentType$Companion;", "", "()V", "FEED_NOTIFICATION_COMMENT", "", "FEED_NOTIFICATION_REACTION", "getNotifBadgeBasedOnContentType", "", "contentType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        public static int getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "contentType");
            int hashCode = str.hashCode();
            if (hashCode == -1620093156) {
                return str.equals("FEED_NOTIFICATION_REACTION") ? R.drawable.ic_feed_notif_saymoji_20dp : R.drawable.bg_circle_transparent;
            }
            if (hashCode == 2034500332 && str.equals("FEED_NOTIFICATION_COMMENT")) {
                return R.drawable.ic_feed_notif_comment_20dp;
            }
            return R.drawable.bg_circle_transparent;
        }
    }
}
