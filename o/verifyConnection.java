package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.social.model.ReactionCountModel;
import id.dana.social.view.fragment.ActivityReactionsListFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0012J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/social/adapter/ActivityReactionsViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V", "activityReactionsListFragments", "Ljava/util/ArrayList;", "Lid/dana/social/view/fragment/ActivityReactionsListFragment;", "Lkotlin/collections/ArrayList;", "reactionCountModelList", "Lid/dana/social/model/ReactionCountModel;", "addViewPagerComponents", "", "params", "Lid/dana/social/adapter/ActivityReactionsViewPagerAdapter$Params;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getTabView", "Landroid/view/View;", "setPrimaryItem", "container", "Landroid/view/ViewGroup;", "instantiateItemObject", "", "Params", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class verifyConnection extends getIntrinsicHeight {
    public final ArrayList<ActivityReactionsListFragment> getMax = new ArrayList<>();
    public final ArrayList<ReactionCountModel> getMin = new ArrayList<>();
    public final Context setMin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public verifyConnection(@NotNull FragmentManager fragmentManager, @Nullable Context context) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.setMin = context;
    }

    @NotNull
    public final Fragment length(int i) {
        ActivityReactionsListFragment activityReactionsListFragment = this.getMax.get(i);
        Intrinsics.checkNotNullExpressionValue(activityReactionsListFragment, "activityReactionsListFragments[position]");
        return activityReactionsListFragment;
    }

    public final int getCount() {
        return this.getMax.size();
    }

    public final void setPrimaryItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, BranchLinkConstant.PathTarget.CONTAINER);
        Intrinsics.checkNotNullParameter(obj, "instantiateItemObject");
        super.setPrimaryItem(viewGroup, i, obj);
        int size = this.getMax.size();
        int i2 = 0;
        while (i2 < size) {
            ActivityReactionsListFragment activityReactionsListFragment = this.getMax.get(i2);
            boolean z = i == i2;
            RecyclerView recyclerView = (RecyclerView) activityReactionsListFragment.setMin(resetInternal.setMax.getSupportBackgroundTintMode);
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(z);
            }
            i2++;
        }
        viewGroup.requestLayout();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lid/dana/social/adapter/ActivityReactionsViewPagerAdapter$Params;", "", "activityId", "", "reactionCountModel", "Lid/dana/social/model/ReactionCountModel;", "kindName", "(Ljava/lang/String;Lid/dana/social/model/ReactionCountModel;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "getKindName", "setKindName", "getReactionCountModel", "()Lid/dana/social/model/ReactionCountModel;", "setReactionCountModel", "(Lid/dana/social/model/ReactionCountModel;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        public ReactionCountModel getMin;
        @NotNull
        public String setMax;
        @NotNull
        public String setMin;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return Intrinsics.areEqual((Object) this.setMax, (Object) length.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) length.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) length.setMin);
        }

        public final int hashCode() {
            String str = this.setMax;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ReactionCountModel reactionCountModel = this.getMin;
            int hashCode2 = (hashCode + (reactionCountModel != null ? reactionCountModel.hashCode() : 0)) * 31;
            String str2 = this.setMin;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(activityId=");
            sb.append(this.setMax);
            sb.append(", reactionCountModel=");
            sb.append(this.getMin);
            sb.append(", kindName=");
            sb.append(this.setMin);
            sb.append(")");
            return sb.toString();
        }

        public length(@NotNull String str, @NotNull ReactionCountModel reactionCountModel, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(reactionCountModel, "reactionCountModel");
            Intrinsics.checkNotNullParameter(str2, "kindName");
            this.setMax = str;
            this.getMin = reactionCountModel;
            this.setMin = str2;
        }
    }
}
