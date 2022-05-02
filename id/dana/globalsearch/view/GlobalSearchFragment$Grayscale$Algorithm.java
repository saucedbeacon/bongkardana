package id.dana.globalsearch.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$setupSeeAllHeader$2$1"}, k = 3, mv = {1, 4, 2})
final class GlobalSearchFragment$Grayscale$Algorithm extends Lambda implements Function0<Unit> {
    final /* synthetic */ GlobalSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSearchFragment$Grayscale$Algorithm(GlobalSearchFragment globalSearchFragment) {
        super(0);
        this.this$0 = globalSearchFragment;
    }

    public final void invoke() {
        GlobalSearchFragment.setMin(this.this$0, "SERVICE");
    }
}
