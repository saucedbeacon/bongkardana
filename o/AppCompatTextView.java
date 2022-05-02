package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import java.util.Map;
import o.onCreateInputConnection;
import o.updateAppearance;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppCompatTextView implements Runnable {
    private static final String setMin = setSupportBackgroundTintList.length("EnqueueRunnable");
    public final getAutoSizeTextType getMax = new getAutoSizeTextType();
    private final setSupportAllCaps getMin;

    public AppCompatTextView(@NonNull setSupportAllCaps setsupportallcaps) {
        this.getMin = setsupportallcaps;
    }

    public final void run() {
        try {
            if (!this.getMin.setMax()) {
                if (setMax()) {
                    setTextMetricsParamsCompat.setMax(this.getMin.length.setMin, RescheduleReceiver.class, true);
                    setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.getMin.length;
                    getAutoSizeMinTextSize.setMax(setsupportcompounddrawablestintlist.getMax, setsupportcompounddrawablestintlist.setMax, setsupportcompounddrawablestintlist.getMin);
                }
                this.getMax.setMin(onCreateInputConnection.getMin);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.getMin}));
        } catch (Throwable th) {
            this.getMax.setMin(new onCreateInputConnection.length.getMax(th));
        }
    }

    @VisibleForTesting
    private boolean setMax() {
        WorkDatabase workDatabase = this.getMin.length.setMax;
        workDatabase.beginTransaction();
        try {
            boolean max = getMax(this.getMin);
            workDatabase.setTransactionSuccessful();
            return max;
        } finally {
            workDatabase.endTransaction();
        }
    }

    private static boolean setMax(@NonNull setSupportAllCaps setsupportallcaps) {
        boolean length = length(setsupportallcaps.length, setsupportallcaps.getMax, (String[]) setSupportAllCaps.setMin(setsupportallcaps).toArray(new String[0]), setsupportallcaps.setMin, setsupportallcaps.getMin);
        setsupportallcaps.toFloatRange = true;
        return length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d2 A[LOOP:7: B:119:0x01cc->B:121:0x01d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean length(o.setSupportCompoundDrawablesTintList r18, @androidx.annotation.NonNull java.util.List<? extends o.onTextChanged> r19, java.lang.String[] r20, java.lang.String r21, androidx.work.ExistingWorkPolicy r22) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r0.setMax
            r8 = 0
            if (r1 == 0) goto L_0x0016
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0016
            r9 = 1
            goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            if (r9 == 0) goto L_0x0048
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x001e:
            if (r11 >= r10) goto L_0x004b
            r15 = r1[r11]
            o.compatMeasureContentWidth r7 = r6.getMax()
            o.getInternalPopup r7 = r7.length((java.lang.String) r15)
            if (r7 != 0) goto L_0x0030
            o.setSupportBackgroundTintList.getMax()
            return r8
        L_0x0030:
            androidx.work.WorkInfo$State r7 = r7.getMin
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r15) goto L_0x0038
            r15 = 1
            goto L_0x0039
        L_0x0038:
            r15 = 0
        L_0x0039:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r15) goto L_0x0040
            r14 = 1
            goto L_0x0045
        L_0x0040:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r15) goto L_0x0045
            r13 = 1
        L_0x0045:
            int r11 = r11 + 1
            goto L_0x001e
        L_0x0048:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x004b:
            boolean r7 = android.text.TextUtils.isEmpty(r21)
            r10 = 1
            r7 = r7 ^ r10
            if (r7 == 0) goto L_0x0057
            if (r9 != 0) goto L_0x0057
            r11 = 1
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            if (r11 == 0) goto L_0x013d
            o.compatMeasureContentWidth r11 = r6.getMax()
            java.util.List r11 = r11.getMax(r2)
            boolean r15 = r11.isEmpty()
            if (r15 != 0) goto L_0x013d
            androidx.work.ExistingWorkPolicy r15 = androidx.work.ExistingWorkPolicy.APPEND
            if (r3 == r15) goto L_0x00bc
            androidx.work.ExistingWorkPolicy r15 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r15) goto L_0x0071
            goto L_0x00bc
        L_0x0071:
            androidx.work.ExistingWorkPolicy r15 = androidx.work.ExistingWorkPolicy.KEEP
            if (r3 != r15) goto L_0x0097
            java.util.Iterator r3 = r11.iterator()
        L_0x0079:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x0097
            java.lang.Object r15 = r3.next()
            o.getInternalPopup$setMax r15 = (o.getInternalPopup.setMax) r15
            androidx.work.WorkInfo$State r10 = r15.setMin
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.ENQUEUED
            if (r10 == r8) goto L_0x0095
            androidx.work.WorkInfo$State r8 = r15.setMin
            androidx.work.WorkInfo$State r10 = androidx.work.WorkInfo.State.RUNNING
            if (r8 != r10) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r8 = 0
            r10 = 1
            goto L_0x0079
        L_0x0095:
            r8 = 0
            return r8
        L_0x0097:
            o.getLastBaselineToBottomHeight$2 r3 = new o.getLastBaselineToBottomHeight$2
            r3.<init>(r2, r8)
            r3.run()
            o.compatMeasureContentWidth r3 = r6.getMax()
            java.util.Iterator r10 = r11.iterator()
        L_0x00a7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b9
            java.lang.Object r11 = r10.next()
            o.getInternalPopup$setMax r11 = (o.getInternalPopup.setMax) r11
            java.lang.String r11 = r11.getMax
            r3.getMin((java.lang.String) r11)
            goto L_0x00a7
        L_0x00b9:
            r3 = 1
            goto L_0x013e
        L_0x00bc:
            o.AppCompatRatingBar r9 = r6.length()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00c9:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0105
            java.lang.Object r15 = r11.next()
            o.getInternalPopup$setMax r15 = (o.getInternalPopup.setMax) r15
            java.lang.String r8 = r15.getMax
            boolean r8 = r9.setMax(r8)
            if (r8 != 0) goto L_0x00ff
            androidx.work.WorkInfo$State r8 = r15.setMin
            r16 = r9
            androidx.work.WorkInfo$State r9 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r8 != r9) goto L_0x00e7
            r8 = 1
            goto L_0x00e8
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            r8 = r8 & r12
            androidx.work.WorkInfo$State r9 = r15.setMin
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.FAILED
            if (r9 != r12) goto L_0x00f1
            r14 = 1
            goto L_0x00f8
        L_0x00f1:
            androidx.work.WorkInfo$State r9 = r15.setMin
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.CANCELLED
            if (r9 != r12) goto L_0x00f8
            r13 = 1
        L_0x00f8:
            java.lang.String r9 = r15.getMax
            r10.add(r9)
            r12 = r8
            goto L_0x0101
        L_0x00ff:
            r16 = r9
        L_0x0101:
            r9 = r16
            r8 = 0
            goto L_0x00c9
        L_0x0105:
            androidx.work.ExistingWorkPolicy r8 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r8) goto L_0x0131
            if (r13 != 0) goto L_0x010d
            if (r14 == 0) goto L_0x0131
        L_0x010d:
            o.compatMeasureContentWidth r3 = r6.getMax()
            java.util.List r8 = r3.getMax(r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x0119:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x012b
            java.lang.Object r9 = r8.next()
            o.getInternalPopup$setMax r9 = (o.getInternalPopup.setMax) r9
            java.lang.String r9 = r9.getMax
            r3.getMin((java.lang.String) r9)
            goto L_0x0119
        L_0x012b:
            java.util.List r10 = java.util.Collections.emptyList()
            r13 = 0
            r14 = 0
        L_0x0131:
            java.lang.Object[] r1 = r10.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x013c
            r9 = 1
            goto L_0x013d
        L_0x013c:
            r9 = 0
        L_0x013d:
            r3 = 0
        L_0x013e:
            java.util.Iterator r8 = r19.iterator()
        L_0x0142:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0205
            java.lang.Object r10 = r8.next()
            o.onTextChanged r10 = (o.onTextChanged) r10
            o.getInternalPopup r11 = r10.getMax
            if (r9 == 0) goto L_0x0167
            if (r12 != 0) goto L_0x0167
            if (r14 == 0) goto L_0x015b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r11.getMin = r15
            goto L_0x016f
        L_0x015b:
            if (r13 == 0) goto L_0x0162
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r11.getMin = r15
            goto L_0x016f
        L_0x0162:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r11.getMin = r15
            goto L_0x016f
        L_0x0167:
            boolean r15 = r11.length()
            if (r15 != 0) goto L_0x0172
            r11.toDoubleRange = r4
        L_0x016f:
            r16 = r4
            goto L_0x0178
        L_0x0172:
            r16 = r4
            r4 = 0
            r11.toDoubleRange = r4
        L_0x0178:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0188
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 25
            if (r4 > r5) goto L_0x0188
            getMin(r11)
            goto L_0x0199
        L_0x0188:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 22
            if (r4 > r5) goto L_0x0199
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = setMax(r0, r4)
            if (r4 == 0) goto L_0x0199
            getMin(r11)
        L_0x0199:
            androidx.work.WorkInfo$State r4 = r11.getMin
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
            if (r4 != r5) goto L_0x01a0
            r3 = 1
        L_0x01a0:
            o.compatMeasureContentWidth r4 = r6.getMax()
            r4.setMax((o.getInternalPopup) r11)
            if (r9 == 0) goto L_0x01c6
            int r4 = r1.length
            r5 = 0
        L_0x01ab:
            if (r5 >= r4) goto L_0x01c6
            r11 = r1[r5]
            o.AppCompatSpinner r15 = new o.AppCompatSpinner
            java.util.UUID r0 = r10.setMin
            java.lang.String r0 = r0.toString()
            r15.<init>(r0, r11)
            o.AppCompatRatingBar r0 = r6.length()
            r0.setMin((o.AppCompatSpinner) r15)
            int r5 = r5 + 1
            r0 = r18
            goto L_0x01ab
        L_0x01c6:
            java.util.Set<java.lang.String> r0 = r10.setMax
            java.util.Iterator r0 = r0.iterator()
        L_0x01cc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            o.setFirstBaselineToTopHeight r5 = r6.setMin()
            o.setPrompt r11 = new o.setPrompt
            java.util.UUID r15 = r10.setMin
            java.lang.String r15 = r15.toString()
            r11.<init>(r4, r15)
            r5.length(r11)
            goto L_0x01cc
        L_0x01eb:
            if (r7 == 0) goto L_0x01ff
            o.setDropDownWidth r0 = r6.toIntRange()
            o.setDropDownHorizontalOffset r4 = new o.setDropDownHorizontalOffset
            java.util.UUID r5 = r10.setMin
            java.lang.String r5 = r5.toString()
            r4.<init>(r2, r5)
            r0.getMax(r4)
        L_0x01ff:
            r0 = r18
            r4 = r16
            goto L_0x0142
        L_0x0205:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppCompatTextView.length(o.setSupportCompoundDrawablesTintList, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static void getMin(getInternalPopup getinternalpopup) {
        setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = getinternalpopup.toFloatRange;
        if (setdefaultactionbuttoncontentdescription.getMin() || setdefaultactionbuttoncontentdescription.getMax()) {
            String str = getinternalpopup.setMax;
            updateAppearance.getMin getmin = new updateAppearance.getMin();
            getmin.setMin(getinternalpopup.setMin.setMin);
            getmin.length.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            getinternalpopup.setMax = ConstraintTrackingWorker.class.getName();
            updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
            updateAppearance.setMax(updateappearance);
            getinternalpopup.setMin = updateappearance;
        }
    }

    private static boolean setMax(@NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @NonNull String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (getAutoSizeMaxTextSize getautosizemaxtextsize : setsupportcompounddrawablestintlist.getMin) {
                if (cls.isAssignableFrom(getautosizemaxtextsize.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    private static boolean getMax(@NonNull setSupportAllCaps setsupportallcaps) {
        List<setSupportAllCaps> list = setsupportallcaps.IsOverlapping;
        boolean z = false;
        if (list != null) {
            for (setSupportAllCaps next : list) {
                if (!next.length()) {
                    z |= getMax(next);
                } else {
                    setSupportBackgroundTintList.getMax();
                    TextUtils.join(", ", next.setMax);
                }
            }
        }
        return setMax(setsupportallcaps) | z;
    }
}
