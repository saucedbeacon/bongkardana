package o;

import android.view.View;
import id.dana.globalnetwork.currency.CurrencySwitchRichView;

public final class RVBluetoothProxy implements View.OnClickListener {
    private final CurrencySwitchRichView setMin;

    public RVBluetoothProxy(CurrencySwitchRichView currencySwitchRichView) {
        this.setMin = currencySwitchRichView;
    }

    public final void onClick(View view) {
        CurrencySwitchRichView.setMin(this.setMin);
    }
}
