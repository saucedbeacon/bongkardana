package o;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.synccontact.worker.BaseSyncContactWorker;
import java.util.Collections;
import o.setBackgroundDrawable;
import o.setDefaultActionButtonContentDescription;

public class getApFromDimen {
    private static final String setMax = getApFromDimen.class.getSimpleName();

    public final boolean setMin(Context context) {
        return length(context, "sync_all_contact_worker");
    }

    public final boolean setMax(Context context) {
        return length(context, "sync_changed_contact_worker");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A[Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean length(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = ":onError"
            java.lang.String r1 = "[ContactSync]"
            o.setTextSize r5 = o.setTextSize.getMax((android.content.Context) r5)     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            com.google.common.util.concurrent.ListenableFuture r5 = r5.setMin(r6)     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            java.lang.Object r5 = r5.get()     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
        L_0x0016:
            boolean r6 = r5.hasNext()     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            if (r6 == 0) goto L_0x007a
            java.lang.Object r6 = r5.next()     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            androidx.work.WorkInfo r6 = (androidx.work.WorkInfo) r6     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.RUNNING     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            androidx.work.WorkInfo$State r3 = r6.getMin     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            boolean r2 = r2.equals(r3)     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            if (r2 != 0) goto L_0x0036
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            androidx.work.WorkInfo$State r6 = r6.getMin     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            boolean r6 = r2.equals(r6)     // Catch:{ ExecutionException -> 0x005d, InterruptedException -> 0x0038, IllegalStateException -> 0x007a }
            if (r6 == 0) goto L_0x0016
        L_0x0036:
            r5 = 1
            return r5
        L_0x0038:
            r5 = move-exception
            java.lang.String r6 = setMax
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            o.updateActionSheetContent.e(r6, r0, r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L_0x007a
        L_0x005d:
            r5 = move-exception
            java.lang.String r6 = setMax
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            o.updateActionSheetContent.e(r6, r0, r5)
        L_0x007a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getApFromDimen.length(android.content.Context, java.lang.String):boolean");
    }

    public final void setMax(Context context, String str, Class<? extends BaseSyncContactWorker> cls) {
        int length;
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (length = str.length()) == (min = dispatchOnCancelled.setMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1689629583, oncanceled);
            onCancelLoad.getMin(1689629583, oncanceled);
        }
        setDefaultActionButtonContentDescription.getMax getmax = new setDefaultActionButtonContentDescription.getMax();
        getmax.getMin = false;
        getmax.getMax = true;
        getmax.setMin = NetworkType.CONNECTED;
        setBackgroundDrawable.getMin getmin = new setBackgroundDrawable.getMin(cls);
        getmin.setMin.toFloatRange = new setDefaultActionButtonContentDescription(getmax);
        setBackgroundDrawable.getMin getmin2 = (setBackgroundDrawable.getMin) getmin.getMax();
        getmin2.getMax.add(str);
        try {
            setTextSize.getMax(context).getMin(str, ExistingWorkPolicy.REPLACE, Collections.singletonList((setBackgroundDrawable) ((setBackgroundDrawable.getMin) getmin2.getMax()).setMin())).setMin();
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
            sb.append(getClass().getName());
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(e.getMessage());
            updateActionSheetContent.exception(obj, DanaLogConstants.ExceptionType.CONTACT_SYNC_EXCEPTION, sb2.toString());
        }
    }
}
