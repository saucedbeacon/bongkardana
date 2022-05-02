package id.dana.social.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/social/view/NewSocialWidgetView$setupRecyclerViewAttributes$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "canScrollVertically", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewSocialWidgetView$setupRecyclerViewAttributes$1 extends LinearLayoutManager {
    final /* synthetic */ NewSocialWidgetView setMax;

    public final boolean canScrollVertically() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewSocialWidgetView$setupRecyclerViewAttributes$1(NewSocialWidgetView newSocialWidgetView, Context context) {
        super(context, 1, false);
        this.setMax = newSocialWidgetView;
    }
}
