package o;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import o.onCreateInputConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class getLastBaselineToBottomHeight implements Runnable {
    public final getAutoSizeTextType length = new getAutoSizeTextType();

    /* access modifiers changed from: package-private */
    public abstract void getMin();

    public void run() {
        try {
            getMin();
            this.length.setMin(onCreateInputConnection.getMin);
        } catch (Throwable th) {
            this.length.setMin(new onCreateInputConnection.length.getMax(th));
        }
    }

    static void setMin(setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, String str) {
        WorkDatabase workDatabase = setsupportcompounddrawablestintlist.setMax;
        compatMeasureContentWidth max = workDatabase.getMax();
        AppCompatRatingBar length2 = workDatabase.length();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State floatRange = max.toFloatRange(str2);
            if (!(floatRange == WorkInfo.State.SUCCEEDED || floatRange == WorkInfo.State.FAILED)) {
                max.setMin(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(length2.setMin(str2));
        }
        setsupportcompounddrawablestintlist.toIntRange.setMin(str);
        for (getAutoSizeMaxTextSize max2 : setsupportcompounddrawablestintlist.getMin) {
            max2.setMax(str);
        }
    }
}
