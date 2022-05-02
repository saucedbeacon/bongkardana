package o;

import androidx.annotation.Nullable;
import com.facebook.litho.ComponentsLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class getActionList {
    @Nullable
    private final ComponentsLogger getMin;
    final Set<String> length = new HashSet();

    public getActionList(@Nullable ComponentsLogger componentsLogger) {
        this.getMin = componentsLogger;
    }

    public final boolean getMax(String str) {
        return this.length.contains(str);
    }

    /* access modifiers changed from: package-private */
    public final void setMin(isStopped isstopped) {
        if (this.length.contains(isstopped.toFloatRange)) {
            if (isstopped.isInside == null && !isstopped.toIntRange) {
                isstopped.isInside = Integer.toString(isstopped.invokeSuspend);
            }
            if (this.getMin != null) {
                getMin();
            }
            if (this.getMin != null) {
                ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.ERROR;
            }
        }
    }

    private String getMin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement fileName : stackTrace) {
            String fileName2 = fileName.getFileName();
            if (fileName2 != null) {
                boolean z = true;
                if (arrayList.isEmpty() || !((String) arrayList.get(arrayList.size() - 1)).equals(fileName2)) {
                    z = false;
                }
                if (setMin(fileName2) && !this.getMin.setMin().contains(fileName2) && !z) {
                    arrayList.add(fileName2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "Unable to determine root of duplicate key in a *Spec.java file.";
        }
        return setMax(arrayList);
    }

    private static String setMax(List<String> list) {
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        sb.append("Please look at the following spec hierarchy and make sure all sibling children components of the same type have unique keys:\n");
        int i = 1;
        for (String next : list) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("\t");
            }
            i++;
            sb.append(next);
            sb.append("\n");
        }
        return sb.toString();
    }

    private boolean setMin(String str) {
        for (String contains : this.getMin.getMin()) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
