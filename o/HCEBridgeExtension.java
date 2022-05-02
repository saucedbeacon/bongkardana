package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.news.viewholders.NewsFullViewHolder;
import id.dana.news.viewholders.NewsViewHolderNews;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 #2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002#$B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\bJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/news/adapter/LatestNewsAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/feeds/views/FeedsWrapperViewHolder;", "Lid/dana/feeds/model/ActivityModel;", "feedsList", "", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "maxId", "", "getMaxId", "()Ljava/lang/String;", "setMaxId", "(Ljava/lang/String;)V", "newsActions", "Lid/dana/news/adapter/LatestNewsAdapter$NewsActions;", "getItemCount", "", "getItemViewType", "position", "getNewsFeedType", "getNormalNewsViewHolder", "Lid/dana/news/viewholders/NewsViewHolderNews;", "parent", "Landroid/view/ViewGroup;", "isEmpty", "onCreateViewHolder", "viewType", "setNewsActions", "", "Companion", "NewsActions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HCEBridgeExtension extends IMultiInstanceInvalidationCallback.Stub<BLEBridgeExtension.AnonymousClass12, onProcess> {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    public boolean getMax;
    @NotNull
    public String getMin = "";
    public setMin setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/news/adapter/LatestNewsAdapter$NewsActions;", "", "onClickFeed", "", "activityModel", "Lid/dana/feeds/model/ActivityModel;", "onClickHasMore", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void setMin(@NotNull onProcess onprocess);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        BLEBridgeExtension.AnonymousClass12 r5;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-543927740, oncanceled);
            onCancelLoad.getMin(-543927740, oncanceled);
        }
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == 1) {
            NewsViewHolderNews newsViewHolderNews = new NewsViewHolderNews(viewGroup.getContext(), viewGroup);
            newsViewHolderNews.setMax = new getMin(this);
            r5 = newsViewHolderNews;
        } else if (i != 3) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            r5 = new onReceiveResult(context, viewGroup);
        } else {
            r5 = new NewsFullViewHolder(viewGroup.getContext(), viewGroup);
        }
        return r5;
    }

    public HCEBridgeExtension(@NotNull List<? extends onProcess> list) {
        Intrinsics.checkNotNullParameter(list, "feedsList");
        getMin(list);
    }

    public final boolean setMin() {
        return this.getMax;
    }

    public final int getItemCount() {
        if (getMax().size() == 0) {
            return 1;
        }
        return super.getItemCount() + (this.getMax ? 1 : 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lid/dana/feeds/model/ActivityModel;", "kotlin.jvm.PlatformType", "clickFeed", "id/dana/news/adapter/LatestNewsAdapter$getNormalNewsViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements NewsViewHolderNews.setMin {
        final /* synthetic */ HCEBridgeExtension length;

        getMin(HCEBridgeExtension hCEBridgeExtension) {
            this.length = hCEBridgeExtension;
        }

        public final void getMin(onProcess onprocess) {
            setMin max = this.length.setMin;
            if (max != null) {
                Intrinsics.checkNotNullExpressionValue(onprocess, "it");
                max.setMin(onprocess);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/news/adapter/LatestNewsAdapter$Companion;", "", "()V", "ITEM_MIN_HEIGHT_IN_DP", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final int getItemViewType(int i) {
        String str;
        onProcess onprocess = (onProcess) setMin(i);
        if (onprocess == null || (str = onprocess.toIntRange) == null) {
            str = "NORMAL";
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (str != null) {
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            if (Intrinsics.areEqual((Object) "FULL", (Object) upperCase)) {
                return 3;
            }
            return (!this.getMax || i != getItemCount() - 1) ? 1 : 2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
