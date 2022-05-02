package o;

import android.content.DialogInterface;

final class handleIntent implements DialogInterface.OnClickListener {
    private final applyOptions setMin;

    public handleIntent(applyOptions applyoptions) {
        this.setMin = applyoptions;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.setMin.length.finish();
    }
}
