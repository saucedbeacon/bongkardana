package o;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public class getActiveNotifications extends setFilterBitmap {
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new notifyNotificationWithChannel(getContext(), getTheme());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i) {
        if (dialog instanceof notifyNotificationWithChannel) {
            notifyNotificationWithChannel notifynotificationwithchannel = (notifyNotificationWithChannel) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            notifynotificationwithchannel.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
