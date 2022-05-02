package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.dismissPopupMenus;
import o.drawableStateChanged;
import o.expandItemActionView;
import o.getAnimatedVisibility;
import o.getTabContainer;
import o.isInOverlayMode;
import o.onInterceptTouchEvent;
import o.onLayout;
import o.setContentHeight;
import o.setHeaderInternal;
import o.setHeaderTitleInt;
import o.setHeaderView;
import o.setOverrideVisibleItems;
import o.setPrimaryBackground;
import o.setTitleOptional;
import o.setTransitioning;
import o.setupAnimatorToVisibility;
import o.skipToQueueItem;
import o.verifyDrawable;

public abstract class RoomDatabase {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    @Nullable
    private setHeaderTitleInt mAutoCloser;
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public List<length> mCallbacks;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    @Deprecated
    public volatile SupportSQLiteDatabase mDatabase;
    private final getAnimatedVisibility mInvalidationTracker = createInvalidationTracker();
    private SupportSQLiteOpenHelper mOpenHelper;
    private Executor mQueryExecutor;
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private Executor mTransactionExecutor;
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();
    public boolean mWriteAheadLoggingEnabled;

    public static abstract class getMax {
    }

    public interface getMin {
    }

    public static abstract class length {
        public void length(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract getAnimatedVisibility createInvalidationTracker();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(setOverrideVisibleItems setoverridevisibleitems);

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    @Nullable
    public <T> T getTypeConverter(@NonNull Class<T> cls) {
        return this.mTypeConverters.get(cls);
    }

    @CallSuper
    public void init(@NonNull setOverrideVisibleItems setoverridevisibleitems) {
        SupportSQLiteOpenHelper createOpenHelper = createOpenHelper(setoverridevisibleitems);
        this.mOpenHelper = createOpenHelper;
        setTransitioning settransitioning = (setTransitioning) unwrapOpenHelper(setTransitioning.class, createOpenHelper);
        if (settransitioning != null) {
            settransitioning.setMax = setoverridevisibleitems;
        }
        setHeaderInternal setheaderinternal = (setHeaderInternal) unwrapOpenHelper(setHeaderInternal.class, this.mOpenHelper);
        if (setheaderinternal != null) {
            setHeaderTitleInt setheadertitleint = setheaderinternal.setMin;
            this.mAutoCloser = setheadertitleint;
            getAnimatedVisibility getanimatedvisibility = this.mInvalidationTracker;
            getanimatedvisibility.setMin = setheadertitleint;
            getanimatedvisibility.setMin.getMax = new setupAnimatorToVisibility(getanimatedvisibility);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (setoverridevisibleitems.toFloatRange == JournalMode.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.mOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.mCallbacks = setoverridevisibleitems.setMax;
        this.mQueryExecutor = setoverridevisibleitems.IsOverlapping;
        this.mTransactionExecutor = new onInterceptTouchEvent(setoverridevisibleitems.values);
        this.mAllowMainThreadQueries = setoverridevisibleitems.toIntRange;
        this.mWriteAheadLoggingEnabled = z;
        if (setoverridevisibleitems.toDoubleRange) {
            getAnimatedVisibility getanimatedvisibility2 = this.mInvalidationTracker;
            getanimatedvisibility2.hashCode = new setContentHeight(setoverridevisibleitems.getMin, setoverridevisibleitems.length, getanimatedvisibility2, getanimatedvisibility2.getMax.getQueryExecutor());
        }
        Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
        BitSet bitSet = new BitSet();
        for (Map.Entry next : requiredTypeConverters.entrySet()) {
            Class cls = (Class) next.getKey();
            Iterator it = ((List) next.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls2 = (Class) it.next();
                    int size = setoverridevisibleitems.equals.size() - 1;
                    while (true) {
                        if (size < 0) {
                            size = -1;
                            break;
                        } else if (cls2.isAssignableFrom(setoverridevisibleitems.equals.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (size >= 0) {
                        this.mTypeConverters.put(cls2, setoverridevisibleitems.equals.get(size));
                    } else {
                        StringBuilder sb = new StringBuilder("A required type converter (");
                        sb.append(cls2);
                        sb.append(") for ");
                        sb.append(cls.getCanonicalName());
                        sb.append(" is missing in the database configuration.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        int size2 = setoverridevisibleitems.equals.size() - 1;
        while (size2 >= 0) {
            if (bitSet.get(size2)) {
                size2--;
            } else {
                Object obj = setoverridevisibleitems.equals.get(size2);
                StringBuilder sb2 = new StringBuilder("Unexpected type converter ");
                sb2.append(obj);
                sb2.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    @Nullable
    private <T> T unwrapOpenHelper(Class<T> cls, T t) {
        while (!cls.isInstance(t)) {
            if (!(t instanceof setHeaderView)) {
                return null;
            }
            t = ((setHeaderView) t).setMin();
        }
        return t;
    }

    @NonNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    public boolean isOpen() {
        setHeaderTitleInt setheadertitleint = this.mAutoCloser;
        if (setheadertitleint != null) {
            return setheadertitleint.getMin();
        }
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|(1:12)|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r6 = this;
            boolean r0 = r6.isOpen()
            if (r0 == 0) goto L_0x004b
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.mCloseLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            o.getAnimatedVisibility r1 = r6.mInvalidationTracker     // Catch:{ all -> 0x0046 }
            o.setContentHeight r2 = r1.hashCode     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x003d
            o.setContentHeight r2 = r1.hashCode     // Catch:{ all -> 0x0046 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.toIntRange     // Catch:{ all -> 0x0046 }
            r4 = 0
            r5 = 1
            boolean r3 = r3.compareAndSet(r4, r5)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x003a
            o.getAnimatedVisibility r3 = r2.getMax     // Catch:{ all -> 0x0046 }
            o.getAnimatedVisibility$setMax r4 = r2.setMax     // Catch:{ all -> 0x0046 }
            r3.length((o.getAnimatedVisibility.setMax) r4)     // Catch:{ all -> 0x0046 }
            androidx.room.IMultiInstanceInvalidationService r3 = r2.equals     // Catch:{ RemoteException -> 0x0033 }
            if (r3 == 0) goto L_0x0033
            androidx.room.IMultiInstanceInvalidationCallback r4 = r2.IsOverlapping     // Catch:{ RemoteException -> 0x0033 }
            int r5 = r2.length     // Catch:{ RemoteException -> 0x0033 }
            r3.unregisterCallback(r4, r5)     // Catch:{ RemoteException -> 0x0033 }
        L_0x0033:
            android.content.Context r3 = r2.getMin     // Catch:{ all -> 0x0046 }
            android.content.ServiceConnection r2 = r2.toFloatRange     // Catch:{ all -> 0x0046 }
            r3.unbindService(r2)     // Catch:{ all -> 0x0046 }
        L_0x003a:
            r2 = 0
            r1.hashCode = r2     // Catch:{ all -> 0x0046 }
        L_0x003d:
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r6.mOpenHelper     // Catch:{ all -> 0x0046 }
            r1.close()     // Catch:{ all -> 0x0046 }
            r0.unlock()
            return
        L_0x0046:
            r1 = move-exception
            r0.unlock()
            throw r1
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.close():void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @NonNull
    public Cursor query(@NonNull String str, @Nullable Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().query((SupportSQLiteQuery) new setTitleOptional(str, objArr));
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (CancellationSignal) null);
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery, @Nullable CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery);
        }
        return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
    }

    public SupportSQLiteStatement compileStatement(@NonNull String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().compileStatement(str);
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        setHeaderTitleInt setheadertitleint = this.mAutoCloser;
        if (setheadertitleint == null) {
            internalBeginTransaction();
        } else {
            setheadertitleint.getMin(new drawableStateChanged(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$beginTransaction$0(SupportSQLiteDatabase supportSQLiteDatabase) {
        internalBeginTransaction();
        return null;
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.length(writableDatabase);
        if (Build.VERSION.SDK_INT < 16 || !writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransaction();
        } else {
            writableDatabase.beginTransactionNonExclusive();
        }
    }

    @Deprecated
    public void endTransaction() {
        setHeaderTitleInt setheadertitleint = this.mAutoCloser;
        if (setheadertitleint == null) {
            internalEndTransaction();
        } else {
            setheadertitleint.getMin(new verifyDrawable(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$endTransaction$1(SupportSQLiteDatabase supportSQLiteDatabase) {
        internalEndTransaction();
        return null;
    }

    private void internalEndTransaction() {
        this.mOpenHelper.getWritableDatabase().endTransaction();
        if (!inTransaction()) {
            getAnimatedVisibility getanimatedvisibility = this.mInvalidationTracker;
            if (getanimatedvisibility.getMin.compareAndSet(false, true)) {
                if (getanimatedvisibility.setMin != null) {
                    getanimatedvisibility.setMin.length();
                }
                getanimatedvisibility.getMax.getQueryExecutor().execute(getanimatedvisibility.FastBitmap$CoordinateSystem);
            }
        }
    }

    @NonNull
    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    @NonNull
    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(@NonNull Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public <V> V runInTransaction(@NonNull Callable<V> callable) {
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            endTransaction();
            return call;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }

    public void internalInitInvalidationTracker(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        getAnimatedVisibility getanimatedvisibility = this.mInvalidationTracker;
        synchronized (getanimatedvisibility) {
            if (!getanimatedvisibility.equals) {
                supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                getanimatedvisibility.length(supportSQLiteDatabase);
                getanimatedvisibility.IsOverlapping = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                getanimatedvisibility.equals = true;
            }
        }
    }

    @NonNull
    public getAnimatedVisibility getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().inTransaction();
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        public final JournalMode resolve(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)) == null || isLowRamDevice(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }

        private static boolean isLowRamDevice(@NonNull ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }
    }

    public static class setMax<T extends RoomDatabase> {
        private getMax FastBitmap$CoordinateSystem;
        private TimeUnit Grayscale$Algorithm;
        private Set<Integer> ICustomTabsCallback;
        public boolean IsOverlapping;
        private long Mean$Arithmetic = -1;
        private String create;
        public Set<Integer> equals;
        private Callable<InputStream> getCause;
        public ArrayList<length> getMax;
        public boolean getMin;
        private Executor hashCode;
        private boolean invoke;
        private final setMin invokeSuspend;
        private final String isInside;
        public JournalMode length;
        private File onNavigationEvent;
        public Executor setMax;
        public SupportSQLiteOpenHelper.length setMin;
        private final Context toDoubleRange;
        private final Class<T> toFloatRange;
        public boolean toIntRange;
        private getMin toString;
        private Executor valueOf;
        private List<Object> values;

        public setMax(@NonNull Context context, @NonNull Class<T> cls, @Nullable String str) {
            this.toDoubleRange = context;
            this.toFloatRange = cls;
            this.isInside = str;
            this.length = JournalMode.AUTOMATIC;
            this.IsOverlapping = true;
            this.invokeSuspend = new setMin();
        }

        @NonNull
        public final setMax<T> setMax(@NonNull onLayout... onlayoutArr) {
            if (this.ICustomTabsCallback == null) {
                this.ICustomTabsCallback = new HashSet();
            }
            for (onLayout onlayout : onlayoutArr) {
                this.ICustomTabsCallback.add(Integer.valueOf(onlayout.setMax));
                this.ICustomTabsCallback.add(Integer.valueOf(onlayout.length));
            }
            this.invokeSuspend.getMax(onlayoutArr);
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        @NonNull
        public final T getMin() {
            Executor executor;
            if (this.toDoubleRange == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.toFloatRange != null) {
                if (this.setMax == null && this.valueOf == null) {
                    Executor max = skipToQueueItem.setMax();
                    this.valueOf = max;
                    this.setMax = max;
                } else {
                    Executor executor2 = this.setMax;
                    if (executor2 != null && this.valueOf == null) {
                        this.valueOf = executor2;
                    } else if (this.setMax == null && (executor = this.valueOf) != null) {
                        this.setMax = executor;
                    }
                }
                Set<Integer> set = this.ICustomTabsCallback;
                if (!(set == null || this.equals == null)) {
                    for (Integer next : set) {
                        if (this.equals.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(next)));
                        }
                    }
                }
                expandItemActionView expanditemactionview = this.setMin;
                if (expanditemactionview == null) {
                    expanditemactionview = new isInOverlayMode();
                }
                long j = this.Mean$Arithmetic;
                if (j > 0) {
                    if (this.isInside != null) {
                        expanditemactionview = new expandItemActionView(expanditemactionview, new setHeaderTitleInt(j, this.Grayscale$Algorithm, this.valueOf));
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                if (!(this.create == null && this.onNavigationEvent == null && this.getCause == null)) {
                    if (this.isInside != null) {
                        int i = 0;
                        int i2 = (this.create == null ? 0 : 1) + (this.onNavigationEvent == null ? 0 : 1);
                        if (this.getCause != null) {
                            i = 1;
                        }
                        if (i2 + i == 1) {
                            expanditemactionview = new getTabContainer(this.create, this.onNavigationEvent, this.getCause, expanditemactionview);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
                getMin getmin = this.toString;
                dismissPopupMenus dismisspopupmenus = getmin != null ? new dismissPopupMenus(expanditemactionview, getmin, this.hashCode) : expanditemactionview;
                Context context = this.toDoubleRange;
                setOverrideVisibleItems setoverridevisibleitems = new setOverrideVisibleItems(context, this.isInside, dismisspopupmenus, this.invokeSuspend, this.getMax, this.getMin, this.length.resolve(context), this.setMax, this.valueOf, this.invoke, this.IsOverlapping, this.toIntRange, this.equals, this.create, this.onNavigationEvent, this.getCause, this.FastBitmap$CoordinateSystem, this.values);
                T t = (RoomDatabase) setPrimaryBackground.setMin(this.toFloatRange, RoomDatabase.DB_IMPL_SUFFIX);
                t.init(setoverridevisibleitems);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    public static class setMin {
        private HashMap<Integer, TreeMap<Integer, onLayout>> setMin = new HashMap<>();

        public final void getMax(@NonNull onLayout... onlayoutArr) {
            for (onLayout onlayout : onlayoutArr) {
                int i = onlayout.setMax;
                int i2 = onlayout.length;
                TreeMap treeMap = this.setMin.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    this.setMin.put(Integer.valueOf(i), treeMap);
                }
                treeMap.get(Integer.valueOf(i2));
                treeMap.put(Integer.valueOf(i2), onlayout);
            }
        }

        public final List<onLayout> length(List<onLayout> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.setMin.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add((onLayout) treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
