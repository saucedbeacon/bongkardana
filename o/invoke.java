package o;

import android.os.CountDownTimer;
import id.dana.lib.electronicmoney.activity.BottomSheetActivity;

public final class invoke extends CountDownTimer {
    public final /* synthetic */ BottomSheetActivity setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public invoke(BottomSheetActivity bottomSheetActivity, long j) {
        super(j, 1000);
        this.setMax = bottomSheetActivity;
    }

    public final void onFinish() {
        if (this.setMax.d == BottomSheetActivity.a.TAP_ELECTRONIC_MONEY_CARD) {
            this.setMax.a(BottomSheetActivity.a.SCAN_CARD_TIMEOUT);
        }
    }

    public final void onTick(long j) {
    }
}
