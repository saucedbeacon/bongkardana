package androidx.core.os;

import androidx.annotation.Nullable;
import o.setNegativeButtonIcon;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((String) null);
    }

    public OperationCanceledException(@Nullable String str) {
        super(setNegativeButtonIcon.setMax(str, "The operation has been canceled."));
    }
}
