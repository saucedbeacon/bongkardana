package o;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0006\b\u0000\u0010\u000f\u0018\u00012\u0006\u0010\u0010\u001a\u00020\rH\b¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lid/dana/base/BaseFragmentPagerStateAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Lid/dana/base/BaseFragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "getCount", "", "getFragmentAs", "T", "position", "(I)Ljava/lang/Object;", "getItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class onInvalidation extends onLevelChange {
    @NotNull
    public List<? extends FtsOptions$Order> length;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onInvalidation(@NotNull FragmentManager fragmentManager, @NotNull List<? extends FtsOptions$Order> list) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(list, "fragments");
        this.length = list;
    }

    @NotNull
    /* renamed from: length */
    public FtsOptions$Order getMax(int i) {
        return (FtsOptions$Order) this.length.get(i);
    }

    public int getCount() {
        return this.length.size();
    }
}
