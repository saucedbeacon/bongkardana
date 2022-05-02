package o;

import android.content.DialogInterface;

final class languageId implements DialogInterface.OnShowListener {
    private final order setMax;

    public languageId(order order) {
        this.setMax = order;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.setMax.setMin();
    }
}
