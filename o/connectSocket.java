package o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.social.base.FriendshipListBaseFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUListDialog;
import o.createMask;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/social/adapter/FriendshipViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showSnackbarInterfaceInstance", "Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "(Landroidx/fragment/app/FragmentManager;Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;)V", "friendshipFragmentList", "Ljava/util/ArrayList;", "Lid/dana/social/base/FriendshipListBaseFragment;", "Lkotlin/collections/ArrayList;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "setPrimaryItem", "", "container", "Landroid/view/ViewGroup;", "instantiateItemObject", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class connectSocket extends getIntrinsicHeight {
    private final ArrayList<FriendshipListBaseFragment> getMin = new ArrayList<>();
    private final FriendshipListBaseFragment.getMax setMin;

    public final int getCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public connectSocket(@NotNull FragmentManager fragmentManager, @NotNull FriendshipListBaseFragment.getMax getmax) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(getmax, "showSnackbarInterfaceInstance");
        this.setMin = getmax;
    }

    @NotNull
    public final Fragment length(int i) {
        FriendshipListBaseFragment friendshipListBaseFragment;
        createMask.getMin getmin = createMask.getMin;
        FriendshipListBaseFragment.getMax getmax = this.setMin;
        Intrinsics.checkNotNullParameter(getmax, "ShowSnackbarInterface");
        if (i == 0) {
            friendshipListBaseFragment = new addDescriptionView(getmax);
        } else if (i != 1) {
            friendshipListBaseFragment = new AUListDialog.OnItemClickListener(getmax);
        } else {
            friendshipListBaseFragment = new AUListDialog.OnItemClickListener(getmax);
        }
        this.getMin.add(friendshipListBaseFragment);
        return friendshipListBaseFragment;
    }

    public final void setPrimaryItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(viewGroup, BranchLinkConstant.PathTarget.CONTAINER);
        Intrinsics.checkNotNullParameter(obj, "instantiateItemObject");
        super.setPrimaryItem(viewGroup, i, obj);
        int size = this.getMin.size();
        int i2 = 0;
        while (i2 < size) {
            FriendshipListBaseFragment friendshipListBaseFragment = this.getMin.get(i2);
            boolean z = i == i2;
            if (!(((RecyclerView) friendshipListBaseFragment.getMax(resetInternal.setMax.getAutoSizeMinTextSize)) == null || (recyclerView = (RecyclerView) friendshipListBaseFragment.getMax(resetInternal.setMax.getAutoSizeMinTextSize)) == null)) {
                recyclerView.setNestedScrollingEnabled(z);
            }
            i2++;
        }
        viewGroup.requestLayout();
    }
}
