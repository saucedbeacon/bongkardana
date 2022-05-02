package o;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/challenge/ChallengeFragmentStateAdapter;", "Lid/dana/base/BaseFragmentPagerStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Lid/dana/base/BaseFragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class compileStatement extends onInvalidation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public compileStatement(@NotNull FragmentManager fragmentManager, @NotNull List<? extends FtsOptions$Order> list) {
        super(fragmentManager, list);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(list, "fragments");
    }
}
