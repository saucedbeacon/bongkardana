package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

public final class restorePresenterStates {
    private static restorePresenterStates equals;
    private static final Object toIntRange = new Object();
    private final Context getMax;
    private final ArrayList<setMin> getMin = new ArrayList<>();
    private final Handler length;
    private final HashMap<BroadcastReceiver, ArrayList<getMax>> setMax = new HashMap<>();
    private final HashMap<String, ArrayList<getMax>> setMin = new HashMap<>();

    static final class getMax {
        boolean getMin;
        final BroadcastReceiver length;
        final IntentFilter setMax;
        boolean setMin;

        getMax(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.setMax = intentFilter;
            this.length = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.length);
            sb.append(" filter=");
            sb.append(this.setMax);
            if (this.getMin) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static final class setMin {
        final ArrayList<getMax> getMin;
        final Intent length;

        setMin(Intent intent, ArrayList<getMax> arrayList) {
            this.length = intent;
            this.getMin = arrayList;
        }
    }

    @NonNull
    public static restorePresenterStates length(@NonNull Context context) {
        restorePresenterStates restorepresenterstates;
        synchronized (toIntRange) {
            if (equals == null) {
                equals = new restorePresenterStates(context.getApplicationContext());
            }
            restorepresenterstates = equals;
        }
        return restorepresenterstates;
    }

    private restorePresenterStates(Context context) {
        this.getMax = context;
        this.length = new Handler(context.getMainLooper()) {
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    restorePresenterStates.this.setMax();
                }
            }
        };
    }

    public final void setMax(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.setMax) {
            getMax getmax = new getMax(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.setMax.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.setMax.put(broadcastReceiver, arrayList);
            }
            arrayList.add(getmax);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.setMin.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.setMin.put(action, arrayList2);
                }
                arrayList2.add(getmax);
            }
        }
    }

    public final void setMax(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.setMax) {
            ArrayList remove = this.setMax.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    getMax getmax = (getMax) remove.get(size);
                    getmax.getMin = true;
                    for (int i = 0; i < getmax.setMax.countActions(); i++) {
                        String action = getmax.setMax.getAction(i);
                        ArrayList arrayList = this.setMin.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                getMax getmax2 = (getMax) arrayList.get(size2);
                                if (getmax2.length == broadcastReceiver) {
                                    getmax2.getMin = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.setMin.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMin(@androidx.annotation.NonNull android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.restorePresenterStates$getMax>> r2 = r1.setMax
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            android.content.Context r3 = r1.getMax     // Catch:{ all -> 0x00c6 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00c6 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00c6 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00c6 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00c6 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00c6 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            java.util.HashMap<java.lang.String, java.util.ArrayList<o.restorePresenterStates$getMax>> r3 = r1.setMin     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00c6 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x00c3
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x0041:
            int r3 = r8.size()     // Catch:{ all -> 0x00c6 }
            if (r6 >= r3) goto L_0x0093
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00c6 }
            r5 = r3
            o.restorePresenterStates$getMax r5 = (o.restorePresenterStates.getMax) r5     // Catch:{ all -> 0x00c6 }
            boolean r3 = r5.setMin     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x005d
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r11 = 1
            r10 = r7
            goto L_0x0088
        L_0x005d:
            android.content.IntentFilter r3 = r5.setMax     // Catch:{ all -> 0x00c6 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c6 }
            if (r3 < 0) goto L_0x0088
            if (r10 != 0) goto L_0x0081
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r7.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x0082
        L_0x0081:
            r7 = r10
        L_0x0082:
            r7.add(r15)     // Catch:{ all -> 0x00c6 }
            r15.setMin = r11     // Catch:{ all -> 0x00c6 }
            goto L_0x0089
        L_0x0088:
            r7 = r10
        L_0x0089:
            int r6 = r18 + 1
            r10 = r19
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x0041
        L_0x0093:
            r10 = r7
            r11 = 1
            if (r10 == 0) goto L_0x00c3
            r3 = 0
        L_0x0098:
            int r4 = r10.size()     // Catch:{ all -> 0x00c6 }
            if (r3 >= r4) goto L_0x00aa
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00c6 }
            o.restorePresenterStates$getMax r4 = (o.restorePresenterStates.getMax) r4     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r4.setMin = r5     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00aa:
            java.util.ArrayList<o.restorePresenterStates$setMin> r3 = r1.getMin     // Catch:{ all -> 0x00c6 }
            o.restorePresenterStates$setMin r4 = new o.restorePresenterStates$setMin     // Catch:{ all -> 0x00c6 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00c6 }
            r3.add(r4)     // Catch:{ all -> 0x00c6 }
            android.os.Handler r0 = r1.length     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00c1
            android.os.Handler r0 = r1.length     // Catch:{ all -> 0x00c6 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x00c6 }
        L_0x00c1:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            return r11
        L_0x00c3:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x00ca
        L_0x00c9:
            throw r0
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restorePresenterStates.setMin(android.content.Intent):boolean");
    }

    public final void getMax(@NonNull Intent intent) {
        if (setMin(intent)) {
            setMax();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.getMin.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.getMin.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.getMin != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.length.onReceive(r10.getMax, r4.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.restorePresenterStates$getMax>> r0 = r10.setMax
            monitor-enter(r0)
            java.util.ArrayList<o.restorePresenterStates$setMin> r1 = r10.getMin     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            o.restorePresenterStates$setMin[] r2 = new o.restorePresenterStates.setMin[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<o.restorePresenterStates$setMin> r3 = r10.getMin     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<o.restorePresenterStates$setMin> r3 = r10.getMin     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<o.restorePresenterStates$getMax> r5 = r4.getMin
            int r5 = r5.size()
            r6 = 0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<o.restorePresenterStates$getMax> r7 = r4.getMin
            java.lang.Object r7 = r7.get(r6)
            o.restorePresenterStates$getMax r7 = (o.restorePresenterStates.getMax) r7
            boolean r8 = r7.getMin
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.length
            android.content.Context r8 = r10.getMax
            android.content.Intent r9 = r4.length
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0048
        L_0x0047:
            throw r1
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restorePresenterStates.setMax():void");
    }
}
