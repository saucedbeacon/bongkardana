package o;

import com.andrognito.flashbar.Flashbar;
import id.dana.pay.PayActivity;

public final class sendSizeLimitationCallback implements Flashbar.getMin {
    private final String setMin;

    public sendSizeLimitationCallback(String str) {
        this.setMin = str;
    }

    public final void setMax() {
        PayActivity.getMax(this.setMin);
    }
}
