package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.j256.ormlite.field.FieldType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private boolean fillWindowForwardOnly;
    private Map<String, Integer> mColumnNameMap;
    private String[] mColumns;
    /* access modifiers changed from: private */
    public int mCount = -1;
    /* access modifiers changed from: private */
    public int mCursorState;
    private int mCursorWindowCapacity;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    private int mInitialRead;
    /* access modifiers changed from: private */
    public ReentrantLock mLock;
    /* access modifiers changed from: private */
    public int mMaxRead;
    protected MainThreadNotificationHandler mNotificationHandler;
    /* access modifiers changed from: private */
    public boolean mPendingData;
    /* access modifiers changed from: private */
    public SQLiteQuery mQuery;
    private Throwable mStackTrace;

    public void setFillWindowForwardOnly(boolean z) {
        this.fillWindowForwardOnly = z;
    }

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    final class QueryThread implements Runnable {
        private final int mThreadState;

        QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            if (SQLiteCursor.this.mNotificationHandler != null) {
                SQLiteCursor.this.mNotificationHandler.sendEmptyMessage(1);
                boolean unused = SQLiteCursor.this.mPendingData = false;
                return;
            }
            boolean unused2 = SQLiteCursor.this.mPendingData = true;
        }

        public final void run() {
            CursorWindow access$100 = SQLiteCursor.this.mWindow;
            Process.setThreadPriority(Process.myTid(), 10);
            while (true) {
                if (SQLiteCursor.this.mLock == null) {
                    ReentrantLock unused = SQLiteCursor.this.mLock = new ReentrantLock(true);
                }
                SQLiteCursor.this.mLock.lock();
                if (SQLiteCursor.this.mCursorState != this.mThreadState) {
                    SQLiteCursor.this.mLock.unlock();
                    return;
                }
                try {
                    int fillWindow = SQLiteCursor.this.mQuery.fillWindow(access$100, SQLiteCursor.this.mMaxRead, SQLiteCursor.this.mCount);
                    if (fillWindow == 0) {
                        SQLiteCursor.this.mLock.unlock();
                        return;
                    } else if (fillWindow == -1) {
                        int unused2 = SQLiteCursor.this.mCount = SQLiteCursor.this.mCount + SQLiteCursor.this.mMaxRead;
                        sendMessage();
                    } else {
                        int unused3 = SQLiteCursor.this.mCount = fillWindow;
                        sendMessage();
                        SQLiteCursor.this.mLock.unlock();
                        return;
                    }
                } catch (Exception unused4) {
                    return;
                } finally {
                    SQLiteCursor.this.mLock.unlock();
                }
            }
        }
    }

    protected static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mCursorWindowCapacity = 0;
        this.fillWindowForwardOnly = false;
        this.mMaxRead = Integer.MAX_VALUE;
        this.mInitialRead = Integer.MAX_VALUE;
        this.mCursorState = 0;
        this.mLock = null;
        this.mPendingData = false;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int columnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCountLocked];
            for (int i = 0; i < columnCountLocked; i++) {
                String columnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = columnNameLocked;
                if (FieldType.FOREIGN_ID_FIELD_SUFFIX.equals(columnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public boolean onMove(int i, int i2) {
        if (this.mWindow != null && i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    private void fillWindow(int i) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            String str = this.mEditTable;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mColumns[this.mRowIdColumnIndex]);
            sb.append("=?");
            sQLiteDatabase.delete(str, sb.toString(), new String[]{this.mCurrentRowID.toString()});
            z = true;
        } catch (SQLException unused) {
            z = false;
        }
        try {
            int i = this.mPos;
            requery();
            moveToPosition(i);
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    /* JADX INFO: finally extract failed */
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sb = new StringBuilder(128);
                for (Map.Entry entry : this.mUpdatedRows.entrySet()) {
                    Map map2 = (Map) entry.getValue();
                    Long l = (Long) entry.getKey();
                    if (l == null || map2 == null) {
                        StringBuilder sb2 = new StringBuilder("null rowId or values found! rowId = ");
                        sb2.append(l);
                        sb2.append(", values = ");
                        sb2.append(map2);
                        throw new IllegalStateException(sb2.toString());
                    } else if (map2.size() != 0) {
                        long longValue = l.longValue();
                        Iterator it = map2.entrySet().iterator();
                        sb.setLength(0);
                        StringBuilder sb3 = new StringBuilder("UPDATE ");
                        sb3.append(this.mEditTable);
                        sb3.append(" SET ");
                        sb.append(sb3.toString());
                        Object[] objArr = new Object[map2.size()];
                        int i = 0;
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            sb.append((String) entry2.getKey());
                            sb.append("=?");
                            objArr[i] = entry2.getValue();
                            if (it.hasNext()) {
                                sb.append(", ");
                            }
                            i++;
                        }
                        StringBuilder sb4 = new StringBuilder(" WHERE ");
                        sb4.append(this.mColumns[this.mRowIdColumnIndex]);
                        sb4.append('=');
                        sb4.append(longValue);
                        sb.append(sb4.toString());
                        sb.append(';');
                        this.mDatabase.execSQL(sb.toString(), objArr);
                        this.mDatabase.rowUpdated(this.mEditTable, longValue);
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th) {
                this.mDatabase.endTransaction();
                throw th;
            }
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            this.mQuery.requery();
            queryThreadUnlock();
            this.mDatabase.unlock();
            return super.requery();
        } catch (Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    public int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }
}
