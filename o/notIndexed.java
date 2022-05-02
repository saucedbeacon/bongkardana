package o;

import android.content.DialogInterface;

final class notIndexed implements DialogInterface.OnDismissListener {
    private final order setMax;

    public notIndexed(order order) {
        this.setMax = order;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.setMax.IsOverlapping();
    }
}
