package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/globalsearch/adapter/RecentSearchAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/globalsearch/adapter/RecentSearchAdapter$RecentSearchViewHolder;", "", "recentRemoveClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "RecentSearchViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverExtensionDelegate extends IMultiInstanceInvalidationCallback.Stub<length, String> {
    private final Ignore.setMin setMin;

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new length(viewGroup, this.setMin);
    }

    public GriverExtensionDelegate(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "recentRemoveClickListener");
        this.setMin = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/globalsearch/adapter/RecentSearchAdapter$RecentSearchViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "", "parent", "Landroid/view/ViewGroup;", "recentRemoveClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Landroid/view/ViewGroup;Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends Ignore<String> {
        public final /* synthetic */ void setMax(Object obj) {
            String str = (String) obj;
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(399903258, oncanceled);
                onCancelLoad.getMin(399903258, oncanceled);
            }
            if (str != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.isIconfiedByDefault);
                if (textView != null) {
                    textView.setText(str);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(@NotNull ViewGroup viewGroup, @NotNull final Ignore.setMin setmin) {
            super(viewGroup.getContext(), R.layout.item_recent_search, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Intrinsics.checkNotNullParameter(setmin, "recentRemoveClickListener");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.supportShouldUpRecreateTask);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ length setMin;

                    {
                        this.setMin = r1;
                    }

                    public final void onClick(View view) {
                        setmin.length(this.setMin.getAdapterPosition());
                    }
                });
            }
        }
    }
}
