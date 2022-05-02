package o;

import androidx.annotation.NonNull;
import o.getLogEventType;

public abstract class hasMessages {
    public abstract void setMin(@NonNull appendFlushLog appendflushlog, @NonNull DiagnoseLogAppender diagnoseLogAppender, @NonNull getLogEventType getlogeventtype);

    protected static void setMax(@NonNull appendFlushLog appendflushlog, @NonNull DiagnoseLogAppender diagnoseLogAppender, @NonNull getLogEventType.setMax setmax) {
        for (getLogEventType.setMax next : setmax.isInside()) {
            if (next.length()) {
                hasMessages length = appendflushlog.equals.length(next.getMin());
                if (length != null) {
                    length.setMin(appendflushlog, diagnoseLogAppender, next);
                } else {
                    setMax(appendflushlog, diagnoseLogAppender, next);
                }
            }
        }
    }
}
