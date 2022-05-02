package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class getUnknownFields extends getAppIDBytes {
    private final int setMax;

    public getUnknownFields(int i) {
        this.setMax = i;
    }

    @Nullable
    public final Object getMax(@NonNull appendFlushLog appendflushlog, @NonNull getLogEventType getlogeventtype) {
        return appendflushlog.isInside.setMax(appendflushlog.setMax, this.setMax);
    }
}
