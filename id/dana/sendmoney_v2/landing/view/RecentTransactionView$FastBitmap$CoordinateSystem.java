package id.dana.sendmoney_v2.landing.view;

import android.content.DialogInterface;
import kotlin.Metadata;
import o.getCurrX;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
final class RecentTransactionView$FastBitmap$CoordinateSystem implements DialogInterface.OnClickListener {
    final /* synthetic */ RecentTransactionView getMin;
    final /* synthetic */ getCurrX length;

    RecentTransactionView$FastBitmap$CoordinateSystem(RecentTransactionView recentTransactionView, getCurrX getcurrx) {
        this.getMin = recentTransactionView;
        this.length = getcurrx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            this.getMin.getBillerX2BPresenter().length(this.length);
            dialogInterface.dismiss();
        }
    }
}
