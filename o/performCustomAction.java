package o;

import android.content.DialogInterface;

final class performCustomAction implements DialogInterface.OnCancelListener {
    private final applyOptions getMin;

    public performCustomAction(applyOptions applyoptions) {
        this.getMin = applyoptions;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.getMin.length.finish();
    }
}
