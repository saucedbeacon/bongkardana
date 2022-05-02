package o;

import android.view.View;
import id.dana.sendmoney.bank.savedcard.SavedBankCardView;
import java.util.List;

public final class GriverImageLoadRequest implements View.OnClickListener {
    private final SavedBankCardView getMin;
    private final String length;
    private final List setMin;

    public GriverImageLoadRequest(SavedBankCardView savedBankCardView, String str, List list) {
        this.getMin = savedBankCardView;
        this.length = str;
        this.setMin = list;
    }

    public final void onClick(View view) {
        SavedBankCardView.setMax(this.getMin, this.length, this.setMin);
    }
}
