package id.dana.explore.view;

import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import o.APWebViewClient;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "id/dana/explore/view/ExploreDanaFragment$orderWidget$1$1$3", "id/dana/explore/view/ExploreDanaFragment$$special$$inlined$forEach$lambda$3"}, k = 3, mv = {1, 4, 2})
final class ExploreDanaFragment$FastBitmap$CoordinateSystem implements Runnable {
    final /* synthetic */ APWebViewClient getMax;
    final /* synthetic */ LinearLayout getMin;
    final /* synthetic */ List setMax;
    final /* synthetic */ List setMin;

    ExploreDanaFragment$FastBitmap$CoordinateSystem(LinearLayout linearLayout, List list, List list2, APWebViewClient aPWebViewClient) {
        this.getMin = linearLayout;
        this.setMax = list;
        this.setMin = list2;
        this.getMax = aPWebViewClient;
    }

    public final void run() {
        this.getMin.addView((View) this.setMax.get(2));
    }
}
