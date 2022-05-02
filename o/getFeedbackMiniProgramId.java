package o;

import android.content.DialogInterface;
import id.dana.dialog.DialogPermission;

final class getFeedbackMiniProgramId implements DialogInterface.OnDismissListener {
    private final DialogPermission.length length;

    public getFeedbackMiniProgramId(DialogPermission.length length2) {
        this.length = length2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.length.onDialogDismissed();
    }
}
