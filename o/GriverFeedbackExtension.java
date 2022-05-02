package o;

import android.content.DialogInterface;
import id.dana.dialog.DialogPermission;

final class GriverFeedbackExtension implements DialogInterface.OnDismissListener {
    private final DialogPermission.length getMax;

    public GriverFeedbackExtension(DialogPermission.length length) {
        this.getMax = length;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.getMax.onDialogDismissed();
    }
}
