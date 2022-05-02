package o;

import android.content.DialogInterface;

public final class onSwitchToWhiteTheme implements DialogInterface.OnDismissListener {
    private final CustomPopMenuExtension setMin;

    public onSwitchToWhiteTheme(CustomPopMenuExtension customPopMenuExtension) {
        this.setMin = customPopMenuExtension;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        CustomPopMenuExtension.getMax(this.setMin);
    }
}
