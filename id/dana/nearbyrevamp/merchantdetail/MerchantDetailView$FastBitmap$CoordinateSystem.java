package id.dana.nearbyrevamp.merchantdetail;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
final class MerchantDetailView$FastBitmap$CoordinateSystem implements View.OnClickListener {
    final /* synthetic */ MerchantDetailView getMax;
    final /* synthetic */ Function0 setMax;

    MerchantDetailView$FastBitmap$CoordinateSystem(MerchantDetailView merchantDetailView, Function0 function0) {
        this.getMax = merchantDetailView;
        this.setMax = function0;
    }

    public final void onClick(View view) {
        this.getMax.smoothScrollToTop();
        this.getMax.showErrorState(false);
        this.setMax.invoke();
    }
}
