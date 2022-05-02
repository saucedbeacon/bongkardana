package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class getAppIDBytes extends hasMessages {
    @Nullable
    public abstract Object getMax(@NonNull appendFlushLog appendflushlog, @NonNull getLogEventType getlogeventtype);

    public final void setMin(@NonNull appendFlushLog appendflushlog, @NonNull DiagnoseLogAppender diagnoseLogAppender, @NonNull getLogEventType getlogeventtype) {
        Object max = getMax(appendflushlog, getlogeventtype);
        if (max != null) {
            DiagnoseLogAppender.getMax(diagnoseLogAppender, max, getlogeventtype.setMin(), getlogeventtype.setMax());
        }
    }
}
