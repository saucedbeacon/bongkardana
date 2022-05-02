package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setSupportButtonTintMode implements getAutoSizeTextAvailableSizes {
    static final String getMin = setSupportBackgroundTintList.length("SystemAlarmDispatcher");
    @Nullable
    public setMax FastBitmap$CoordinateSystem;
    final setSupportButtonTintList IsOverlapping;
    final Handler equals;
    final getMinWidthMinor getMax;
    final setSupportCompoundDrawablesTintList isInside;
    final ButtonBarLayout length;
    final Context setMax;
    final getAutoSizeStepGranularity setMin;
    final List<Intent> toFloatRange;
    Intent toIntRange;

    public interface setMax {
        void onAllCommandsCompleted();
    }

    public setSupportButtonTintMode(@NonNull Context context) {
        this(context, (byte) 0);
    }

    @VisibleForTesting
    private setSupportButtonTintMode(@NonNull Context context, byte b) {
        this.setMax = context.getApplicationContext();
        this.IsOverlapping = new setSupportButtonTintList(this.setMax);
        this.length = new ButtonBarLayout();
        setSupportCompoundDrawablesTintList length2 = setSupportCompoundDrawablesTintList.length(context);
        this.isInside = length2;
        this.setMin = length2.toIntRange;
        this.getMax = this.isInside.length;
        getAutoSizeStepGranularity getautosizestepgranularity = this.setMin;
        synchronized (getautosizestepgranularity.getMin) {
            getautosizestepgranularity.length.add(this);
        }
        this.toFloatRange = new ArrayList();
        this.toIntRange = null;
        this.equals = new Handler(Looper.getMainLooper());
    }

    public final void setMin() {
        setSupportBackgroundTintList.getMax();
        getAutoSizeStepGranularity getautosizestepgranularity = this.setMin;
        synchronized (getautosizestepgranularity.getMin) {
            getautosizestepgranularity.length.remove(this);
        }
        ButtonBarLayout buttonBarLayout = this.length;
        if (!buttonBarLayout.getMax.isShutdown()) {
            buttonBarLayout.getMax.shutdownNow();
        }
        this.FastBitmap$CoordinateSystem = null;
    }

    public final void onExecuted(@NonNull String str, boolean z) {
        this.equals.post(new getMin(this, setSupportButtonTintList.length(this.setMax, str, z), 0));
    }

    @MainThread
    public final boolean getMax(@NonNull Intent intent, int i) {
        setSupportBackgroundTintList.getMax();
        Integer.valueOf(i);
        if (this.equals.getLooper().getThread() == Thread.currentThread()) {
            String action = intent.getAction();
            boolean z = false;
            if (TextUtils.isEmpty(action)) {
                setSupportBackgroundTintList.getMax();
                return false;
            } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && setMax("ACTION_CONSTRAINTS_CHANGED")) {
                return false;
            } else {
                intent.putExtra("KEY_START_ID", i);
                synchronized (this.toFloatRange) {
                    if (!this.toFloatRange.isEmpty()) {
                        z = true;
                    }
                    this.toFloatRange.add(intent);
                    if (!z) {
                        length();
                    }
                }
                return true;
            }
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    static class setMin implements Runnable {
        private final setSupportButtonTintMode getMax;

        setMin(@NonNull setSupportButtonTintMode setsupportbuttontintmode) {
            this.getMax = setsupportbuttontintmode;
        }

        public final void run() {
            setSupportButtonTintMode setsupportbuttontintmode = this.getMax;
            setSupportBackgroundTintList.getMax();
            if (setsupportbuttontintmode.equals.getLooper().getThread() == Thread.currentThread()) {
                synchronized (setsupportbuttontintmode.toFloatRange) {
                    if (setsupportbuttontintmode.toIntRange != null) {
                        setSupportBackgroundTintList.getMax();
                        Intent intent = setsupportbuttontintmode.toIntRange;
                        if (setsupportbuttontintmode.toFloatRange.remove(0).equals(setsupportbuttontintmode.toIntRange)) {
                            setsupportbuttontintmode.toIntRange = null;
                        } else {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                    }
                    setCompoundDrawablesRelative min = setsupportbuttontintmode.getMax.getMin();
                    if (!setsupportbuttontintmode.IsOverlapping.setMax() && setsupportbuttontintmode.toFloatRange.isEmpty() && !min.length()) {
                        setSupportBackgroundTintList.getMax();
                        if (setsupportbuttontintmode.FastBitmap$CoordinateSystem != null) {
                            setsupportbuttontintmode.FastBitmap$CoordinateSystem.onAllCommandsCompleted();
                        }
                    } else if (!setsupportbuttontintmode.toFloatRange.isEmpty()) {
                        setsupportbuttontintmode.length();
                    }
                }
                return;
            }
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    static class getMin implements Runnable {
        private final int getMax;
        private final setSupportButtonTintMode length;
        private final Intent setMax;

        getMin(@NonNull setSupportButtonTintMode setsupportbuttontintmode, @NonNull Intent intent, int i) {
            this.length = setsupportbuttontintmode;
            this.setMax = intent;
            this.getMax = i;
        }

        public final void run() {
            this.length.getMax(this.setMax, this.getMax);
        }
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public final void length() {
        if (this.equals.getLooper().getThread() == Thread.currentThread()) {
            PowerManager.WakeLock max = setTypeface.setMax(this.setMax, "ProcessCommand");
            try {
                max.acquire();
                this.isInside.length.length(new Runnable() {
                    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b1, code lost:
                        r1 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
                        r4.endTransaction();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b5, code lost:
                        throw r1;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0248, code lost:
                        r1 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:74:0x024a, code lost:
                        throw r1;
                     */
                    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:35:0x0152, B:59:0x01c7, B:84:0x02b1] */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x02b1 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r11 = this;
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            java.util.List<android.content.Intent> r0 = r0.toFloatRange
                            monitor-enter(r0)
                            o.setSupportButtonTintMode r1 = o.setSupportButtonTintMode.this     // Catch:{ all -> 0x02e2 }
                            o.setSupportButtonTintMode r2 = o.setSupportButtonTintMode.this     // Catch:{ all -> 0x02e2 }
                            java.util.List<android.content.Intent> r2 = r2.toFloatRange     // Catch:{ all -> 0x02e2 }
                            r3 = 0
                            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x02e2 }
                            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x02e2 }
                            r1.toIntRange = r2     // Catch:{ all -> 0x02e2 }
                            monitor-exit(r0)     // Catch:{ all -> 0x02e2 }
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            android.content.Intent r0 = r0.toIntRange
                            if (r0 == 0) goto L_0x02e1
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            android.content.Intent r0 = r0.toIntRange
                            java.lang.String r0 = r0.getAction()
                            o.setSupportButtonTintMode r1 = o.setSupportButtonTintMode.this
                            android.content.Intent r1 = r1.toIntRange
                            java.lang.String r2 = "KEY_START_ID"
                            int r1 = r1.getIntExtra(r2, r3)
                            o.setSupportBackgroundTintList.getMax()
                            java.lang.String r2 = o.setSupportButtonTintMode.getMin
                            o.setSupportButtonTintMode r2 = o.setSupportButtonTintMode.this
                            android.content.Intent r2 = r2.toIntRange
                            java.lang.Integer.valueOf(r1)
                            o.setSupportButtonTintMode r2 = o.setSupportButtonTintMode.this
                            android.content.Context r2 = r2.setMax
                            r4 = 2
                            java.lang.Object[] r5 = new java.lang.Object[r4]
                            r5[r3] = r0
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                            r6 = 1
                            r5[r6] = r0
                            java.lang.String r0 = "%s (%s)"
                            java.lang.String r0 = java.lang.String.format(r0, r5)
                            android.os.PowerManager$WakeLock r0 = o.setTypeface.setMax(r2, r0)
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r2 = o.setSupportButtonTintMode.getMin     // Catch:{ all -> 0x02b1 }
                            r0.acquire()     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r2 = o.setSupportButtonTintMode.this     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintList r2 = r2.IsOverlapping     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r5 = o.setSupportButtonTintMode.this     // Catch:{ all -> 0x02b1 }
                            android.content.Intent r5 = r5.toIntRange     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r7 = o.setSupportButtonTintMode.this     // Catch:{ all -> 0x02b1 }
                            java.lang.String r8 = r5.getAction()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r9 = "ACTION_CONSTRAINTS_CHANGED"
                            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r9 == 0) goto L_0x010c
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            o.setButtonDrawable r3 = new o.setButtonDrawable     // Catch:{ all -> 0x02b1 }
                            android.content.Context r2 = r2.getMax     // Catch:{ all -> 0x02b1 }
                            r3.<init>(r2, r1, r7)     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r1 = r3.setMax     // Catch:{ all -> 0x02b1 }
                            o.setSupportCompoundDrawablesTintList r1 = r1.isInside     // Catch:{ all -> 0x02b1 }
                            androidx.work.impl.WorkDatabase r1 = r1.setMax     // Catch:{ all -> 0x02b1 }
                            o.compatMeasureContentWidth r1 = r1.getMax()     // Catch:{ all -> 0x02b1 }
                            java.util.List r1 = r1.getMax()     // Catch:{ all -> 0x02b1 }
                            android.content.Context r2 = r3.getMax     // Catch:{ all -> 0x02b1 }
                            androidx.work.impl.background.systemalarm.ConstraintProxy.updateAll(r2, r1)     // Catch:{ all -> 0x02b1 }
                            o.getTextClassifier r2 = r3.setMin     // Catch:{ all -> 0x02b1 }
                            r2.getMax(r1)     // Catch:{ all -> 0x02b1 }
                            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x02b1 }
                            int r4 = r1.size()     // Catch:{ all -> 0x02b1 }
                            r2.<init>(r4)     // Catch:{ all -> 0x02b1 }
                            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b1 }
                            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02b1 }
                        L_0x00a4:
                            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x02b1 }
                            if (r6 == 0) goto L_0x00cc
                            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x02b1 }
                            o.getInternalPopup r6 = (o.getInternalPopup) r6     // Catch:{ all -> 0x02b1 }
                            java.lang.String r7 = r6.getMax     // Catch:{ all -> 0x02b1 }
                            long r8 = r6.getMin()     // Catch:{ all -> 0x02b1 }
                            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                            if (r10 < 0) goto L_0x00a4
                            boolean r8 = r6.setMin()     // Catch:{ all -> 0x02b1 }
                            if (r8 == 0) goto L_0x00c8
                            o.getTextClassifier r8 = r3.setMin     // Catch:{ all -> 0x02b1 }
                            boolean r7 = r8.setMin(r7)     // Catch:{ all -> 0x02b1 }
                            if (r7 == 0) goto L_0x00a4
                        L_0x00c8:
                            r2.add(r6)     // Catch:{ all -> 0x02b1 }
                            goto L_0x00a4
                        L_0x00cc:
                            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x02b1 }
                        L_0x00d0:
                            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02b1 }
                            if (r2 == 0) goto L_0x0105
                            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02b1 }
                            o.getInternalPopup r2 = (o.getInternalPopup) r2     // Catch:{ all -> 0x02b1 }
                            java.lang.String r2 = r2.getMax     // Catch:{ all -> 0x02b1 }
                            android.content.Context r4 = r3.getMax     // Catch:{ all -> 0x02b1 }
                            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x02b1 }
                            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r6 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
                            r5.<init>(r4, r6)     // Catch:{ all -> 0x02b1 }
                            java.lang.String r4 = "ACTION_DELAY_MET"
                            r5.setAction(r4)     // Catch:{ all -> 0x02b1 }
                            java.lang.String r4 = "KEY_WORKSPEC_ID"
                            r5.putExtra(r4, r2)     // Catch:{ all -> 0x02b1 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r2 = r3.setMax     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode$getMin r4 = new o.setSupportButtonTintMode$getMin     // Catch:{ all -> 0x02b1 }
                            o.setSupportButtonTintMode r6 = r3.setMax     // Catch:{ all -> 0x02b1 }
                            int r7 = r3.length     // Catch:{ all -> 0x02b1 }
                            r4.<init>(r6, r5, r7)     // Catch:{ all -> 0x02b1 }
                            android.os.Handler r2 = r2.equals     // Catch:{ all -> 0x02b1 }
                            r2.post(r4)     // Catch:{ all -> 0x02b1 }
                            goto L_0x00d0
                        L_0x0105:
                            o.getTextClassifier r1 = r3.setMin     // Catch:{ all -> 0x02b1 }
                            r1.length()     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x010c:
                            java.lang.String r9 = "ACTION_RESCHEDULE"
                            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r9 == 0) goto L_0x0121
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02b1 }
                            o.setSupportCompoundDrawablesTintList r1 = r7.isInside     // Catch:{ all -> 0x02b1 }
                            r1.getMin()     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x0121:
                            android.os.Bundle r9 = r5.getExtras()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r10 = "KEY_WORKSPEC_ID"
                            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ all -> 0x02b1 }
                            boolean r9 = o.setSupportButtonTintList.getMax((android.os.Bundle) r9, (java.lang.String[]) r10)     // Catch:{ all -> 0x02b1 }
                            if (r9 != 0) goto L_0x0136
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x0136:
                            java.lang.String r9 = "ACTION_SCHEDULE_WORK"
                            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r9 == 0) goto L_0x01b6
                            android.os.Bundle r3 = r5.getExtras()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r4 = "KEY_WORKSPEC_ID"
                            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x02b1 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            o.setSupportCompoundDrawablesTintList r4 = r7.isInside     // Catch:{ all -> 0x02b1 }
                            androidx.work.impl.WorkDatabase r4 = r4.setMax     // Catch:{ all -> 0x02b1 }
                            r4.beginTransaction()     // Catch:{ all -> 0x02b1 }
                            o.compatMeasureContentWidth r5 = r4.getMax()     // Catch:{ all -> 0x01b1 }
                            o.getInternalPopup r5 = r5.length((java.lang.String) r3)     // Catch:{ all -> 0x01b1 }
                            if (r5 != 0) goto L_0x0164
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x01b1 }
                        L_0x015f:
                            r4.endTransaction()     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x0164:
                            androidx.work.WorkInfo$State r6 = r5.getMin     // Catch:{ all -> 0x01b1 }
                            boolean r6 = r6.isFinished()     // Catch:{ all -> 0x01b1 }
                            if (r6 == 0) goto L_0x0170
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x01b1 }
                            goto L_0x015f
                        L_0x0170:
                            long r8 = r5.getMin()     // Catch:{ all -> 0x01b1 }
                            boolean r5 = r5.setMin()     // Catch:{ all -> 0x01b1 }
                            if (r5 != 0) goto L_0x0188
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x01b1 }
                            java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01b1 }
                            android.content.Context r1 = r2.getMax     // Catch:{ all -> 0x01b1 }
                            o.setSupportCompoundDrawablesTintList r2 = r7.isInside     // Catch:{ all -> 0x01b1 }
                            o.AppCompatCheckBox.getMax(r1, r2, r3, r8)     // Catch:{ all -> 0x01b1 }
                            goto L_0x01ad
                        L_0x0188:
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x01b1 }
                            java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01b1 }
                            android.content.Context r5 = r2.getMax     // Catch:{ all -> 0x01b1 }
                            o.setSupportCompoundDrawablesTintList r6 = r7.isInside     // Catch:{ all -> 0x01b1 }
                            o.AppCompatCheckBox.getMax(r5, r6, r3, r8)     // Catch:{ all -> 0x01b1 }
                            android.content.Context r2 = r2.getMax     // Catch:{ all -> 0x01b1 }
                            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x01b1 }
                            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r5 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
                            r3.<init>(r2, r5)     // Catch:{ all -> 0x01b1 }
                            java.lang.String r2 = "ACTION_CONSTRAINTS_CHANGED"
                            r3.setAction(r2)     // Catch:{ all -> 0x01b1 }
                            o.setSupportButtonTintMode$getMin r2 = new o.setSupportButtonTintMode$getMin     // Catch:{ all -> 0x01b1 }
                            r2.<init>(r7, r3, r1)     // Catch:{ all -> 0x01b1 }
                            android.os.Handler r1 = r7.equals     // Catch:{ all -> 0x01b1 }
                            r1.post(r2)     // Catch:{ all -> 0x01b1 }
                        L_0x01ad:
                            r4.setTransactionSuccessful()     // Catch:{ all -> 0x01b1 }
                            goto L_0x015f
                        L_0x01b1:
                            r1 = move-exception
                            r4.endTransaction()     // Catch:{ all -> 0x02b1 }
                            throw r1     // Catch:{ all -> 0x02b1 }
                        L_0x01b6:
                            java.lang.String r9 = "ACTION_DELAY_MET"
                            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r9 == 0) goto L_0x024b
                            android.os.Bundle r5 = r5.getExtras()     // Catch:{ all -> 0x02b1 }
                            java.lang.Object r8 = r2.length     // Catch:{ all -> 0x02b1 }
                            monitor-enter(r8)     // Catch:{ all -> 0x02b1 }
                            java.lang.String r9 = "KEY_WORKSPEC_ID"
                            java.lang.String r5 = r5.getString(r9)     // Catch:{ all -> 0x0248 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0248 }
                            java.util.Map<java.lang.String, o.getAutoSizeTextAvailableSizes> r9 = r2.setMin     // Catch:{ all -> 0x0248 }
                            boolean r9 = r9.containsKey(r5)     // Catch:{ all -> 0x0248 }
                            if (r9 != 0) goto L_0x0243
                            o.AppCompatEditText r9 = new o.AppCompatEditText     // Catch:{ all -> 0x0248 }
                            android.content.Context r10 = r2.getMax     // Catch:{ all -> 0x0248 }
                            r9.<init>(r10, r1, r5, r7)     // Catch:{ all -> 0x0248 }
                            java.util.Map<java.lang.String, o.getAutoSizeTextAvailableSizes> r1 = r2.setMin     // Catch:{ all -> 0x0248 }
                            r1.put(r5, r9)     // Catch:{ all -> 0x0248 }
                            android.content.Context r1 = r9.length     // Catch:{ all -> 0x0248 }
                            java.lang.String r2 = "%s (%s)"
                            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0248 }
                            java.lang.String r5 = r9.getMin     // Catch:{ all -> 0x0248 }
                            r4[r3] = r5     // Catch:{ all -> 0x0248 }
                            int r3 = r9.setMax     // Catch:{ all -> 0x0248 }
                            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0248 }
                            r4[r6] = r3     // Catch:{ all -> 0x0248 }
                            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ all -> 0x0248 }
                            android.os.PowerManager$WakeLock r1 = o.setTypeface.setMax(r1, r2)     // Catch:{ all -> 0x0248 }
                            r9.IsOverlapping = r1     // Catch:{ all -> 0x0248 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0248 }
                            android.os.PowerManager$WakeLock r1 = r9.IsOverlapping     // Catch:{ all -> 0x0248 }
                            java.lang.String r1 = r9.getMin     // Catch:{ all -> 0x0248 }
                            android.os.PowerManager$WakeLock r1 = r9.IsOverlapping     // Catch:{ all -> 0x0248 }
                            r1.acquire()     // Catch:{ all -> 0x0248 }
                            o.setSupportButtonTintMode r1 = r9.getMax     // Catch:{ all -> 0x0248 }
                            o.setSupportCompoundDrawablesTintList r1 = r1.isInside     // Catch:{ all -> 0x0248 }
                            androidx.work.impl.WorkDatabase r1 = r1.setMax     // Catch:{ all -> 0x0248 }
                            o.compatMeasureContentWidth r1 = r1.getMax()     // Catch:{ all -> 0x0248 }
                            java.lang.String r2 = r9.getMin     // Catch:{ all -> 0x0248 }
                            o.getInternalPopup r1 = r1.length((java.lang.String) r2)     // Catch:{ all -> 0x0248 }
                            if (r1 != 0) goto L_0x0220
                            r9.setMax()     // Catch:{ all -> 0x0248 }
                            goto L_0x0246
                        L_0x0220:
                            boolean r2 = r1.setMin()     // Catch:{ all -> 0x0248 }
                            r9.toIntRange = r2     // Catch:{ all -> 0x0248 }
                            boolean r2 = r9.toIntRange     // Catch:{ all -> 0x0248 }
                            if (r2 != 0) goto L_0x0239
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0248 }
                            java.lang.String r1 = r9.getMin     // Catch:{ all -> 0x0248 }
                            java.lang.String r1 = r9.getMin     // Catch:{ all -> 0x0248 }
                            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0248 }
                            r9.getMin(r1)     // Catch:{ all -> 0x0248 }
                            goto L_0x0246
                        L_0x0239:
                            o.getTextClassifier r2 = r9.setMin     // Catch:{ all -> 0x0248 }
                            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0248 }
                            r2.getMax(r1)     // Catch:{ all -> 0x0248 }
                            goto L_0x0246
                        L_0x0243:
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x0248 }
                        L_0x0246:
                            monitor-exit(r8)     // Catch:{ all -> 0x0248 }
                            goto L_0x029c
                        L_0x0248:
                            r1 = move-exception
                            monitor-exit(r8)     // Catch:{ all -> 0x02b1 }
                            throw r1     // Catch:{ all -> 0x02b1 }
                        L_0x024b:
                            java.lang.String r4 = "ACTION_STOP_WORK"
                            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r4 == 0) goto L_0x0277
                            android.os.Bundle r1 = r5.getExtras()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r4 = "KEY_WORKSPEC_ID"
                            java.lang.String r1 = r1.getString(r4)     // Catch:{ all -> 0x02b1 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            o.setSupportCompoundDrawablesTintList r4 = r7.isInside     // Catch:{ all -> 0x02b1 }
                            o.getMinWidthMinor r5 = r4.length     // Catch:{ all -> 0x02b1 }
                            o.setTextFuture r6 = new o.setTextFuture     // Catch:{ all -> 0x02b1 }
                            r6.<init>(r4, r1, r3)     // Catch:{ all -> 0x02b1 }
                            r5.length(r6)     // Catch:{ all -> 0x02b1 }
                            android.content.Context r2 = r2.getMax     // Catch:{ all -> 0x02b1 }
                            o.setSupportCompoundDrawablesTintList r4 = r7.isInside     // Catch:{ all -> 0x02b1 }
                            o.AppCompatCheckBox.getMax(r2, r4, r1)     // Catch:{ all -> 0x02b1 }
                            r7.onExecuted(r1, r3)     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x0277:
                            java.lang.String r3 = "ACTION_EXECUTION_COMPLETED"
                            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x02b1 }
                            if (r3 == 0) goto L_0x0299
                            android.os.Bundle r3 = r5.getExtras()     // Catch:{ all -> 0x02b1 }
                            java.lang.String r4 = "KEY_WORKSPEC_ID"
                            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x02b1 }
                            java.lang.String r5 = "KEY_NEEDS_RESCHEDULE"
                            boolean r3 = r3.getBoolean(r5)     // Catch:{ all -> 0x02b1 }
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                            java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02b1 }
                            r2.onExecuted(r4, r3)     // Catch:{ all -> 0x02b1 }
                            goto L_0x029c
                        L_0x0299:
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02b1 }
                        L_0x029c:
                            o.setSupportBackgroundTintList.getMax()
                            java.lang.String r1 = o.setSupportButtonTintMode.getMin
                            r0.release()
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            o.setSupportButtonTintMode$setMin r1 = new o.setSupportButtonTintMode$setMin
                            r1.<init>(r0)
                            android.os.Handler r0 = r0.equals
                            r0.post(r1)
                            return
                        L_0x02b1:
                            o.setSupportBackgroundTintList.getMax()     // Catch:{ all -> 0x02cb }
                            java.lang.String r1 = o.setSupportButtonTintMode.getMin     // Catch:{ all -> 0x02cb }
                            o.setSupportBackgroundTintList.getMax()
                            java.lang.String r1 = o.setSupportButtonTintMode.getMin
                            r0.release()
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            o.setSupportButtonTintMode$setMin r1 = new o.setSupportButtonTintMode$setMin
                            r1.<init>(r0)
                            android.os.Handler r0 = r0.equals
                            r0.post(r1)
                            return
                        L_0x02cb:
                            r1 = move-exception
                            o.setSupportBackgroundTintList.getMax()
                            java.lang.String r2 = o.setSupportButtonTintMode.getMin
                            r0.release()
                            o.setSupportButtonTintMode r0 = o.setSupportButtonTintMode.this
                            o.setSupportButtonTintMode$setMin r2 = new o.setSupportButtonTintMode$setMin
                            r2.<init>(r0)
                            android.os.Handler r0 = r0.equals
                            r0.post(r2)
                            throw r1
                        L_0x02e1:
                            return
                        L_0x02e2:
                            r1 = move-exception
                            monitor-exit(r0)
                            goto L_0x02e6
                        L_0x02e5:
                            throw r1
                        L_0x02e6:
                            goto L_0x02e5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.setSupportButtonTintMode.AnonymousClass2.run():void");
                    }
                });
            } finally {
                max.release();
            }
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    private boolean setMax(@NonNull String str) {
        if (this.equals.getLooper().getThread() == Thread.currentThread()) {
            synchronized (this.toFloatRange) {
                for (Intent action : this.toFloatRange) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            }
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
}
