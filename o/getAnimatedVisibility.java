package o;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.firebase.perf.FirebasePerformance;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class getAnimatedVisibility {
    private static final String[] toDoubleRange = {"UPDATE", FirebasePerformance.HttpMethod.DELETE, "INSERT"};
    @VisibleForTesting
    public Runnable FastBitmap$CoordinateSystem;
    public volatile SupportSQLiteStatement IsOverlapping;
    public volatile boolean equals;
    public final RoomDatabase getMax;
    public AtomicBoolean getMin;
    public setContentHeight hashCode;
    length isInside;
    final String[] length;
    @NonNull
    public final HashMap<String, Integer> setMax;
    @Nullable
    public setHeaderTitleInt setMin;
    @VisibleForTesting
    @SuppressLint({"RestrictedApi"})
    public final stop<setMax, setMin> toFloatRange;
    public final getParentMenu toIntRange;
    @NonNull
    private Map<String, Set<String>> values;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public getAnimatedVisibility(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.emptyMap(), strArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public getAnimatedVisibility(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.setMin = null;
        this.getMin = new AtomicBoolean(false);
        this.equals = false;
        this.toFloatRange = new stop<>();
        this.FastBitmap$CoordinateSystem = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
                if (r11.getMax.setMin != null) goto L_0x0096;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
                r11.getMax.setMin.setMax();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
                r0.unlock();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
                if (r11.getMax.setMin != null) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
                r11.getMax.setMin.setMax();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
                if (r11.getMax.setMin != null) goto L_0x0096;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
                if (r5 == null) goto L_?;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
                if (r5.isEmpty() != false) goto L_?;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c3, code lost:
                r0 = r11.getMax.toFloatRange;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
                monitor-enter(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
                r4 = r11.getMax.toFloatRange.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
                if (r4.hasNext() == false) goto L_0x0115;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
                r6 = (o.getAnimatedVisibility.setMin) r4.next().getValue();
                r7 = r6.setMin.length;
                r9 = null;
                r8 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e7, code lost:
                if (r8 >= r7) goto L_0x010d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f5, code lost:
                if (r5.contains(java.lang.Integer.valueOf(r6.setMin[r8])) == false) goto L_0x010a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f7, code lost:
                if (r7 != 1) goto L_0x00fc;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f9, code lost:
                r9 = r6.getMax;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fc, code lost:
                if (r9 != null) goto L_0x0103;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fe, code lost:
                r9 = new java.util.HashSet(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x0103, code lost:
                r9.add(r6.setMax[r8]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x010a, code lost:
                r8 = r8 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:70:0x010d, code lost:
                if (r9 == null) goto L_0x00d0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x010f, code lost:
                r6.getMin.getMin(r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:72:0x0115, code lost:
                monitor-exit(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:73:0x0116, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x009e A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r11 = this;
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    androidx.room.RoomDatabase r0 = r0.getMax
                    java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                    r0.lock()
                    r1 = 0
                    r2 = 0
                    r3 = 1
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    boolean r4 = r4.getMin()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    if (r4 != 0) goto L_0x0027
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x0026
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    r0.setMax()
                L_0x0026:
                    return
                L_0x0027:
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    java.util.concurrent.atomic.AtomicBoolean r4 = r4.getMin     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    boolean r4 = r4.compareAndSet(r3, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    if (r4 != 0) goto L_0x0042
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x0041
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    r0.setMax()
                L_0x0041:
                    return
                L_0x0042:
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    androidx.room.RoomDatabase r4 = r4.getMax     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    boolean r4 = r4.inTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    if (r4 == 0) goto L_0x005d
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x005c
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    r0.setMax()
                L_0x005c:
                    return
                L_0x005d:
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    androidx.room.RoomDatabase r4 = r4.getMax     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    boolean r4 = r4.mWriteAheadLoggingEnabled     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    if (r4 == 0) goto L_0x0089
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    androidx.room.RoomDatabase r4 = r4.getMax     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    androidx.sqlite.db.SupportSQLiteOpenHelper r4 = r4.getOpenHelper()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    androidx.sqlite.db.SupportSQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    r4.beginTransactionNonExclusive()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                    java.util.Set r5 = r11.getMax()     // Catch:{ all -> 0x0083 }
                    r4.setTransactionSuccessful()     // Catch:{ all -> 0x0081 }
                    r4.endTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x007f, all -> 0x009e }
                    goto L_0x008d
                L_0x007f:
                    goto L_0x00b1
                L_0x0081:
                    r6 = move-exception
                    goto L_0x0085
                L_0x0083:
                    r6 = move-exception
                    r5 = r2
                L_0x0085:
                    r4.endTransaction()     // Catch:{ SQLiteException | IllegalStateException -> 0x007f, all -> 0x009e }
                    throw r6     // Catch:{ SQLiteException | IllegalStateException -> 0x007f, all -> 0x009e }
                L_0x0089:
                    java.util.Set r5 = r11.getMax()     // Catch:{ SQLiteException | IllegalStateException -> 0x00b0, all -> 0x009e }
                L_0x008d:
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x00bb
                L_0x0096:
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    r0.setMax()
                    goto L_0x00bb
                L_0x009e:
                    r1 = move-exception
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x00af
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    r0.setMax()
                L_0x00af:
                    throw r1
                L_0x00b0:
                    r5 = r2
                L_0x00b1:
                    r0.unlock()
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.setHeaderTitleInt r0 = r0.setMin
                    if (r0 == 0) goto L_0x00bb
                    goto L_0x0096
                L_0x00bb:
                    if (r5 == 0) goto L_0x011a
                    boolean r0 = r5.isEmpty()
                    if (r0 != 0) goto L_0x011a
                    o.getAnimatedVisibility r0 = o.getAnimatedVisibility.this
                    o.stop<o.getAnimatedVisibility$setMax, o.getAnimatedVisibility$setMin> r0 = r0.toFloatRange
                    monitor-enter(r0)
                    o.getAnimatedVisibility r4 = o.getAnimatedVisibility.this     // Catch:{ all -> 0x0117 }
                    o.stop<o.getAnimatedVisibility$setMax, o.getAnimatedVisibility$setMin> r4 = r4.toFloatRange     // Catch:{ all -> 0x0117 }
                    java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0117 }
                L_0x00d0:
                    boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0117 }
                    if (r6 == 0) goto L_0x0115
                    java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0117 }
                    java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x0117 }
                    java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0117 }
                    o.getAnimatedVisibility$setMin r6 = (o.getAnimatedVisibility.setMin) r6     // Catch:{ all -> 0x0117 }
                    int[] r7 = r6.setMin     // Catch:{ all -> 0x0117 }
                    int r7 = r7.length     // Catch:{ all -> 0x0117 }
                    r9 = r2
                    r8 = 0
                L_0x00e7:
                    if (r8 >= r7) goto L_0x010d
                    int[] r10 = r6.setMin     // Catch:{ all -> 0x0117 }
                    r10 = r10[r8]     // Catch:{ all -> 0x0117 }
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0117 }
                    boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x0117 }
                    if (r10 == 0) goto L_0x010a
                    if (r7 != r3) goto L_0x00fc
                    java.util.Set<java.lang.String> r9 = r6.getMax     // Catch:{ all -> 0x0117 }
                    goto L_0x010a
                L_0x00fc:
                    if (r9 != 0) goto L_0x0103
                    java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0117 }
                    r9.<init>(r7)     // Catch:{ all -> 0x0117 }
                L_0x0103:
                    java.lang.String[] r10 = r6.setMax     // Catch:{ all -> 0x0117 }
                    r10 = r10[r8]     // Catch:{ all -> 0x0117 }
                    r9.add(r10)     // Catch:{ all -> 0x0117 }
                L_0x010a:
                    int r8 = r8 + 1
                    goto L_0x00e7
                L_0x010d:
                    if (r9 == 0) goto L_0x00d0
                    o.getAnimatedVisibility$setMax r6 = r6.getMin     // Catch:{ all -> 0x0117 }
                    r6.getMin(r9)     // Catch:{ all -> 0x0117 }
                    goto L_0x00d0
                L_0x0115:
                    monitor-exit(r0)     // Catch:{ all -> 0x0117 }
                    return
                L_0x0117:
                    r1 = move-exception
                    monitor-exit(r0)
                    throw r1
                L_0x011a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getAnimatedVisibility.AnonymousClass2.run():void");
            }

            /* JADX INFO: finally extract failed */
            private Set<Integer> getMax() {
                HashSet hashSet = new HashSet();
                Cursor query = getAnimatedVisibility.this.getMax.query(new setTitleOptional("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                while (query.moveToNext()) {
                    try {
                        hashSet.add(Integer.valueOf(query.getInt(0)));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                if (!hashSet.isEmpty()) {
                    getAnimatedVisibility.this.IsOverlapping.executeUpdateDelete();
                }
                return hashSet;
            }
        };
        this.getMax = roomDatabase;
        this.isInside = new length(strArr.length);
        this.setMax = new HashMap<>();
        this.values = map2;
        this.toIntRange = new getParentMenu(this.getMax);
        int length2 = strArr.length;
        this.length = new String[length2];
        for (int i = 0; i < length2; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.setMax.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.length[i] = str.toLowerCase(Locale.US);
            } else {
                this.length[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.setMax.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.setMax;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private void length(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.length[i];
        StringBuilder sb = new StringBuilder();
        for (String append : toDoubleRange) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(append);
            sb.append("`");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private void getMin(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        supportSQLiteDatabase.execSQL(sb.toString());
        String str = this.length[i];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : toDoubleRange) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`room_table_modification_trigger_");
            sb2.append(str);
            sb2.append("_");
            sb2.append(str2);
            sb2.append("`");
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i);
            sb2.append(" AND invalidated = 0; END");
            supportSQLiteDatabase.execSQL(sb2.toString());
        }
    }

    @WorkerThread
    @SuppressLint({"RestrictedApi"})
    public final void setMax(@NonNull setMax setmax) {
        setMin length2;
        String[] length3 = length(setmax.getMin);
        int[] iArr = new int[length3.length];
        int length4 = length3.length;
        int i = 0;
        while (i < length4) {
            Integer num = this.setMax.get(length3[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(length3[i]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        setMin setmin = new setMin(setmax, iArr, length3);
        synchronized (this.toFloatRange) {
            length2 = this.toFloatRange.length(setmax, setmin);
        }
        if (length2 == null && this.isInside.setMax(iArr) && this.getMax.isOpen()) {
            length(this.getMax.getOpenHelper().getWritableDatabase());
        }
    }

    public final String[] length(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.values.containsKey(lowerCase)) {
                hashSet.addAll(this.values.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @WorkerThread
    @SuppressLint({"RestrictedApi"})
    public final void length(@NonNull setMax setmax) {
        setMin length2;
        synchronized (this.toFloatRange) {
            length2 = this.toFloatRange.length(setmax);
        }
        if (length2 != null && this.isInside.length(length2.setMin) && this.getMax.isOpen()) {
            length(this.getMax.getOpenHelper().getWritableDatabase());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin() {
        if (!this.getMax.isOpen()) {
            return false;
        }
        if (!this.equals) {
            this.getMax.getOpenHelper().getWritableDatabase();
        }
        if (!this.equals) {
            return false;
        }
        return true;
    }

    public final void length(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (!supportSQLiteDatabase.inTransaction()) {
            while (true) {
                try {
                    Lock closeLock = this.getMax.getCloseLock();
                    closeLock.lock();
                    try {
                        int[] min = this.isInside.setMin();
                        if (min == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length2 = min.length;
                        if (Build.VERSION.SDK_INT < 16 || !supportSQLiteDatabase.isWriteAheadLoggingEnabled()) {
                            supportSQLiteDatabase.beginTransaction();
                        } else {
                            supportSQLiteDatabase.beginTransactionNonExclusive();
                        }
                        for (int i = 0; i < length2; i++) {
                            int i2 = min[i];
                            if (i2 == 1) {
                                getMin(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                length(supportSQLiteDatabase, i);
                            }
                        }
                        supportSQLiteDatabase.setTransactionSuccessful();
                        supportSQLiteDatabase.endTransaction();
                        length length3 = this.isInside;
                        synchronized (length3) {
                            length3.setMax = false;
                        }
                        closeLock.unlock();
                    } catch (Throwable th) {
                        closeLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    public static class setMin {
        public final Set<String> getMax;
        public final setMax getMin;
        public final String[] setMax;
        final int[] setMin;

        setMin(setMax setmax, int[] iArr, String[] strArr) {
            this.getMin = setmax;
            this.setMin = iArr;
            this.setMax = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.setMax[0]);
                this.getMax = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.getMax = null;
        }
    }

    public static abstract class setMax {
        final String[] getMin;

        public abstract void getMin(@NonNull Set<String> set);

        public boolean setMin() {
            return false;
        }

        public setMax(@NonNull String[] strArr) {
            this.getMin = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    static class length {
        boolean getMax;
        final int[] getMin;
        final long[] length;
        boolean setMax;
        final boolean[] setMin;

        length(int i) {
            long[] jArr = new long[i];
            this.length = jArr;
            this.setMin = new boolean[i];
            this.getMin = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.setMin, false);
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.length[i];
                    this.length[i] = 1 + j;
                    if (j == 0) {
                        this.getMax = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public final boolean length(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.length[i];
                    this.length[i] = j - 1;
                    if (j == 1) {
                        this.getMax = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final int[] setMin() {
            synchronized (this) {
                if (this.getMax) {
                    if (!this.setMax) {
                        int length2 = this.length.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length2) {
                                boolean z = this.length[i] > 0;
                                if (z != this.setMin[i]) {
                                    int[] iArr = this.getMin;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.getMin[i] = 0;
                                }
                                this.setMin[i] = z;
                                i++;
                            } else {
                                this.setMax = true;
                                this.getMax = false;
                                int[] iArr2 = this.getMin;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    static class getMax extends setMax {
        final WeakReference<setMax> getMax;
        final getAnimatedVisibility setMax;

        getMax(getAnimatedVisibility getanimatedvisibility, setMax setmax) {
            super(setmax.getMin);
            this.setMax = getanimatedvisibility;
            this.getMax = new WeakReference<>(setmax);
        }

        public final void getMin(@NonNull Set<String> set) {
            setMax setmax = this.getMax.get();
            if (setmax == null) {
                this.setMax.length((setMax) this);
            } else {
                setmax.getMin(set);
            }
        }
    }
}
