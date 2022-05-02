package o;

import android.view.View;
import id.dana.lib.electronicmoney.activity.BottomSheetActivity;

public final class values implements View.OnClickListener {
    public final /* synthetic */ BottomSheetActivity setMax;

    public values(BottomSheetActivity bottomSheetActivity) {
        this.setMax = bottomSheetActivity;
    }

    public final void onClick(View view) {
        this.setMax.a(BottomSheetActivity.a.TAP_ELECTRONIC_MONEY_CARD);
    }
}
