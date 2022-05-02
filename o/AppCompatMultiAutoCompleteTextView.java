package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AppCompatMultiAutoCompleteTextView<T> {
    private static final String setMin = setSupportBackgroundTintList.length("ConstraintTracker");
    private final Set<setTextClassifier<T>> IsOverlapping = new LinkedHashSet();
    protected final getMinWidthMinor getMax;
    protected final Context getMin;
    T length;
    private final Object setMax = new Object();

    public abstract void getMin();

    public abstract T length();

    public abstract void setMin();

    AppCompatMultiAutoCompleteTextView(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        this.getMin = context.getApplicationContext();
        this.getMax = getminwidthminor;
    }

    public final void getMin(setTextClassifier<T> settextclassifier) {
        synchronized (this.setMax) {
            if (this.IsOverlapping.add(settextclassifier)) {
                if (this.IsOverlapping.size() == 1) {
                    this.length = length();
                    setSupportBackgroundTintList.getMax();
                    getClass().getSimpleName();
                    setMin();
                }
                settextclassifier.setMax(this.length);
            }
        }
    }

    public final void length(setTextClassifier<T> settextclassifier) {
        synchronized (this.setMax) {
            if (this.IsOverlapping.remove(settextclassifier) && this.IsOverlapping.isEmpty()) {
                getMin();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.setMax
            monitor-enter(r0)
            T r1 = r3.length     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.length     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.length     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.length = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<o.setTextClassifier<T>> r1 = r3.IsOverlapping     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            o.getMinWidthMinor r1 = r3.getMax     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.getMax()     // Catch:{ all -> 0x002f }
            o.AppCompatMultiAutoCompleteTextView$3 r2 = new o.AppCompatMultiAutoCompleteTextView$3     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppCompatMultiAutoCompleteTextView.getMax(java.lang.Object):void");
    }
}
