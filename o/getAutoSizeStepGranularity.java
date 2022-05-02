package o;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o.ActivityChooserView;
import o.getSupportCompoundDrawablesTintList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getAutoSizeStepGranularity implements getAutoSizeTextAvailableSizes, hasOverlappingRendering {
    private static final String getMax = setSupportBackgroundTintList.length("Processor");
    private Map<String, getSupportCompoundDrawablesTintList> IsOverlapping = new HashMap();
    private Map<String, getSupportCompoundDrawablesTintList> equals = new HashMap();
    public final Object getMin;
    private onAttachedToWindow isInside;
    public final List<getAutoSizeTextAvailableSizes> length;
    @Nullable
    private PowerManager.WakeLock setMax;
    private Context setMin;
    private WorkDatabase toFloatRange;
    private getMinWidthMinor toIntRange;
    private Set<String> toString;
    private List<getAutoSizeMaxTextSize> values;

    public getAutoSizeStepGranularity(@NonNull Context context, @NonNull onAttachedToWindow onattachedtowindow, @NonNull getMinWidthMinor getminwidthminor, @NonNull WorkDatabase workDatabase, @NonNull List<getAutoSizeMaxTextSize> list) {
        this.setMin = context;
        this.isInside = onattachedtowindow;
        this.toIntRange = getminwidthminor;
        this.toFloatRange = workDatabase;
        this.values = list;
        this.toString = new HashSet();
        this.length = new ArrayList();
        this.setMax = null;
        this.getMin = new Object();
    }

    public final boolean getMax(@NonNull String str) {
        return setMin(str, (WorkerParameters.getMax) null);
    }

    public final boolean setMin(@NonNull String str, @Nullable WorkerParameters.getMax getmax) {
        synchronized (this.getMin) {
            if (isInside(str)) {
                setSupportBackgroundTintList.getMax();
                return false;
            }
            getSupportCompoundDrawablesTintList.length length2 = new getSupportCompoundDrawablesTintList.length(this.setMin, this.isInside, this.toIntRange, this, this.toFloatRange, str);
            length2.IsOverlapping = this.values;
            if (getmax != null) {
                length2.equals = getmax;
            }
            getSupportCompoundDrawablesTintList getsupportcompounddrawablestintlist = new getSupportCompoundDrawablesTintList(length2);
            setAttachListener<Boolean> setattachlistener = getsupportcompounddrawablestintlist.equals;
            setattachlistener.addListener(new length(this, str, setattachlistener), this.toIntRange.getMax());
            this.IsOverlapping.put(str, getsupportcompounddrawablestintlist);
            this.toIntRange.getMin().execute(getsupportcompounddrawablestintlist);
            setSupportBackgroundTintList.getMax();
            getClass().getSimpleName();
            return true;
        }
    }

    public final void getMax(@NonNull String str, @NonNull ActivityChooserView.InnerLayout innerLayout) {
        synchronized (this.getMin) {
            setSupportBackgroundTintList.getMax();
            getSupportCompoundDrawablesTintList remove = this.IsOverlapping.remove(str);
            if (remove != null) {
                if (this.setMax == null) {
                    PowerManager.WakeLock max = setTypeface.setMax(this.setMin, "ProcessorForegroundLck");
                    this.setMax = max;
                    max.acquire();
                }
                this.equals.put(str, remove);
                IntRange.length(this.setMin, onDraw.setMin(this.setMin, str, innerLayout));
            }
        }
    }

    public final boolean getMin(@NonNull String str) {
        boolean min;
        synchronized (this.getMin) {
            setSupportBackgroundTintList.getMax();
            min = getMin(str, this.equals.remove(str));
        }
        return min;
    }

    public final boolean setMax(@NonNull String str) {
        boolean min;
        synchronized (this.getMin) {
            setSupportBackgroundTintList.getMax();
            min = getMin(str, this.IsOverlapping.remove(str));
        }
        return min;
    }

    public final boolean setMin(@NonNull String str) {
        boolean min;
        synchronized (this.getMin) {
            setSupportBackgroundTintList.getMax();
            this.toString.add(str);
            getSupportCompoundDrawablesTintList remove = this.equals.remove(str);
            boolean z = remove != null;
            if (remove == null) {
                remove = this.IsOverlapping.remove(str);
            }
            min = getMin(str, remove);
            if (z) {
                setMax();
            }
        }
        return min;
    }

    public final void length(@NonNull String str) {
        synchronized (this.getMin) {
            this.equals.remove(str);
            setMax();
        }
    }

    public final boolean IsOverlapping(@NonNull String str) {
        boolean contains;
        synchronized (this.getMin) {
            contains = this.toString.contains(str);
        }
        return contains;
    }

    public final boolean isInside(@NonNull String str) {
        boolean z;
        synchronized (this.getMin) {
            if (!this.IsOverlapping.containsKey(str)) {
                if (!this.equals.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean toFloatRange(@NonNull String str) {
        boolean containsKey;
        synchronized (this.getMin) {
            containsKey = this.equals.containsKey(str);
        }
        return containsKey;
    }

    public final void getMin(@NonNull getAutoSizeTextAvailableSizes getautosizetextavailablesizes) {
        synchronized (this.getMin) {
            this.length.add(getautosizetextavailablesizes);
        }
    }

    public final void onExecuted(@NonNull String str, boolean z) {
        synchronized (this.getMin) {
            this.IsOverlapping.remove(str);
            setSupportBackgroundTintList.getMax();
            getClass().getSimpleName();
            Boolean.valueOf(z);
            for (getAutoSizeTextAvailableSizes onExecuted : this.length) {
                onExecuted.onExecuted(str, z);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|10|(1:12)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.getMin
            monitor-enter(r0)
            java.util.Map<java.lang.String, o.getSupportCompoundDrawablesTintList> r1 = r3.equals     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0028
            android.content.Context r1 = r3.setMin     // Catch:{ all -> 0x002a }
            android.content.Intent r1 = o.onDraw.setMax(r1)     // Catch:{ all -> 0x002a }
            android.content.Context r2 = r3.setMin     // Catch:{ all -> 0x0019 }
            r2.startService(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x002a }
        L_0x001c:
            android.os.PowerManager$WakeLock r1 = r3.setMax     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            android.os.PowerManager$WakeLock r1 = r3.setMax     // Catch:{ all -> 0x002a }
            r1.release()     // Catch:{ all -> 0x002a }
            r1 = 0
            r3.setMax = r1     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAutoSizeStepGranularity.setMax():void");
    }

    static class length implements Runnable {
        @NonNull
        private String getMax;
        @NonNull
        private ListenableFuture<Boolean> getMin;
        @NonNull
        private getAutoSizeTextAvailableSizes length;

        length(@NonNull getAutoSizeTextAvailableSizes getautosizetextavailablesizes, @NonNull String str, @NonNull ListenableFuture<Boolean> listenableFuture) {
            this.length = getautosizetextavailablesizes;
            this.getMax = str;
            this.getMin = listenableFuture;
        }

        public final void run() {
            boolean z;
            try {
                z = ((Boolean) this.getMin.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.length.onExecuted(this.getMax, z);
        }
    }

    private static boolean getMin(@NonNull String str, @Nullable getSupportCompoundDrawablesTintList getsupportcompounddrawablestintlist) {
        boolean z = false;
        if (getsupportcompounddrawablestintlist != null) {
            getsupportcompounddrawablestintlist.isInside = true;
            getsupportcompounddrawablestintlist.setMax();
            if (getsupportcompounddrawablestintlist.toFloatRange != null) {
                z = getsupportcompounddrawablestintlist.toFloatRange.isDone();
                getsupportcompounddrawablestintlist.toFloatRange.cancel(true);
            }
            if (getsupportcompounddrawablestintlist.getMin == null || z) {
                getInternalPopup getinternalpopup = getsupportcompounddrawablestintlist.setMax;
                setSupportBackgroundTintList.getMax();
            } else {
                getsupportcompounddrawablestintlist.getMin.stop();
            }
            setSupportBackgroundTintList.getMax();
            return true;
        }
        setSupportBackgroundTintList.getMax();
        return false;
    }
}
