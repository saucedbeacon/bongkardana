package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import o.EncryptAppender;
import o.MasExceptionLogPB;
import o.getLogEventType;

public final class getDescriptor extends MasExceptionLogPB.MasExceptionLog {
    final Map<String, hasMessages> getMin;

    public getDescriptor(@NonNull Map<String, hasMessages> map) {
        this.getMin = map;
    }

    public final void getMax(@NonNull final appendFlushLog appendflushlog, @NonNull final DiagnoseLogAppender diagnoseLogAppender, @NonNull EncryptAppender encryptAppender) {
        int i;
        if (!appendflushlog.setMin()) {
            i = -1;
        } else {
            i = diagnoseLogAppender.length();
        }
        encryptAppender.length(i, new EncryptAppender.getMax<getLogEventType.setMin>() {
            public final void getMax(@NonNull List<getLogEventType.setMin> list) {
                for (getLogEventType.setMin next : list) {
                    if (next.length()) {
                        getDescriptor getdescriptor = getDescriptor.this;
                        hasMessages hasmessages = getdescriptor.getMin.get(next.getMin());
                        if (hasmessages != null) {
                            hasmessages.setMin(appendflushlog, diagnoseLogAppender, next);
                        }
                    }
                }
            }
        });
        encryptAppender.getMax(i, new EncryptAppender.getMax<getLogEventType.setMax>() {
            public final void getMax(@NonNull List<getLogEventType.setMax> list) {
                for (getLogEventType.setMax next : list) {
                    if (next.length()) {
                        getDescriptor getdescriptor = getDescriptor.this;
                        hasMessages hasmessages = getdescriptor.getMin.get(next.getMin());
                        if (hasmessages != null) {
                            hasmessages.setMin(appendflushlog, diagnoseLogAppender, next);
                        } else {
                            getMax(next.isInside());
                        }
                    }
                }
            }
        });
        encryptAppender.setMin();
    }

    @Nullable
    public final hasMessages length(@NonNull String str) {
        return this.getMin.get(str);
    }
}
