package o;

import androidx.annotation.NonNull;
import o.getLogEventType;

public final class hasAppID extends hasMessages {
    public final void setMin(@NonNull appendFlushLog appendflushlog, @NonNull DiagnoseLogAppender diagnoseLogAppender, @NonNull getLogEventType getlogeventtype) {
        int i;
        Object obj;
        if (getlogeventtype.IsOverlapping()) {
            getLogEventType.setMax equals = getlogeventtype.equals();
            boolean equals2 = "ol".equals(equals.getMin());
            boolean equals3 = "ul".equals(equals.getMin());
            if (equals2 || equals3) {
                int i2 = 0;
                getLogEventType.setMax setmax = equals;
                while (true) {
                    setmax = setmax.toIntRange();
                    if (setmax == null) {
                        break;
                    } else if ("ul".equals(setmax.getMin()) || "ol".equals(setmax.getMin())) {
                        i2++;
                    }
                }
                int i3 = 1;
                for (getLogEventType.setMax next : equals.isInside()) {
                    setMax(appendflushlog, diagnoseLogAppender, next);
                    if ("li".equals(next.getMin())) {
                        if (equals2) {
                            i = i3 + 1;
                            obj = appendflushlog.isInside.length(appendflushlog.setMax, i3);
                        } else {
                            i = i3;
                            obj = appendflushlog.isInside.setMin(appendflushlog.setMax, i2);
                        }
                        DiagnoseLogAppender.getMax(diagnoseLogAppender, obj, next.setMin(), next.setMax());
                        i3 = i;
                    }
                }
            }
        }
    }
}
