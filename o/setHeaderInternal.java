package o;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class setHeaderInternal implements SupportSQLiteOpenHelper, setHeaderView {
    @NonNull
    private final getMax getMax;
    @NonNull
    private final SupportSQLiteOpenHelper getMin;
    @NonNull
    public final setHeaderTitleInt setMin;

    setHeaderInternal(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull setHeaderTitleInt setheadertitleint) {
        this.getMin = supportSQLiteOpenHelper;
        this.setMin = setheadertitleint;
        if (setheadertitleint.getMin == null) {
            setheadertitleint.getMin = supportSQLiteOpenHelper;
        }
        this.getMax = new getMax(this.setMin);
    }

    @Nullable
    public final String getDatabaseName() {
        return this.getMin.getDatabaseName();
    }

    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.getMin.setWriteAheadLoggingEnabled(z);
    }

    @RequiresApi(api = 24)
    @NonNull
    public final SupportSQLiteDatabase getWritableDatabase() {
        this.getMax.getMax.getMin(setHeaderIconInt.getMax);
        return this.getMax;
    }

    @RequiresApi(api = 24)
    @NonNull
    public final SupportSQLiteDatabase getReadableDatabase() {
        this.getMax.getMax.getMin(setHeaderIconInt.getMax);
        return this.getMax;
    }

    public final void close() {
        try {
            this.getMax.close();
        } catch (IOException e) {
            throw e;
        }
    }

    @NonNull
    public final SupportSQLiteOpenHelper setMin() {
        return this.getMin;
    }

    static final class getMax implements SupportSQLiteDatabase {
        @NonNull
        final setHeaderTitleInt getMax;

        static /* synthetic */ Object setMax() {
            return null;
        }

        getMax(@NonNull setHeaderTitleInt setheadertitleint) {
            this.getMax = setheadertitleint;
        }

        public final SupportSQLiteStatement compileStatement(String str) {
            return new setMin(str, this.getMax);
        }

        public final void beginTransaction() {
            try {
                this.getMax.length().beginTransaction();
            } catch (Throwable th) {
                this.getMax.setMax();
                throw th;
            }
        }

        public final void beginTransactionNonExclusive() {
            try {
                this.getMax.length().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.getMax.setMax();
                throw th;
            }
        }

        public final void endTransaction() {
            if (this.getMax.setMin() != null) {
                try {
                    this.getMax.setMin().endTransaction();
                } finally {
                    this.getMax.setMax();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public final void setTransactionSuccessful() {
            SupportSQLiteDatabase min = this.getMax.setMin();
            if (min != null) {
                min.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        public final boolean inTransaction() {
            if (this.getMax.setMin() == null) {
                return false;
            }
            return ((Boolean) this.getMax.getMin(getHeaderView.setMin)).booleanValue();
        }

        public final Cursor query(String str) {
            try {
                return new setMax(this.getMax.length().query(str), this.getMax);
            } catch (Throwable th) {
                this.getMax.setMax();
                throw th;
            }
        }

        public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
            try {
                return new setMax(this.getMax.length().query(supportSQLiteQuery), this.getMax);
            } catch (Throwable th) {
                this.getMax.setMax();
                throw th;
            }
        }

        @RequiresApi(api = 24)
        public final Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            try {
                return new setMax(this.getMax.length().query(supportSQLiteQuery, cancellationSignal), this.getMax);
            } catch (Throwable th) {
                this.getMax.setMax();
                throw th;
            }
        }

        public final void execSQL(String str) throws SQLException {
            this.getMax.getMin(new getRootMenu(str));
        }

        public final void execSQL(String str, Object[] objArr) throws SQLException {
            this.getMax.getMin(new setCurrentMenuInfo(str, objArr));
        }

        public final boolean isOpen() {
            SupportSQLiteDatabase min = this.getMax.setMin();
            if (min == null) {
                return false;
            }
            return min.isOpen();
        }

        public final String getPath() {
            return (String) this.getMax.getMin(getHeaderTitle.setMax);
        }

        @RequiresApi(api = 16)
        @SuppressLint({"UnsafeNewApiCall"})
        public final boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.getMax.getMin(getHeaderIcon.setMin)).booleanValue();
        }

        public final List<Pair<String, String>> getAttachedDbs() {
            return (List) this.getMax.getMin(getExpandedItem.getMin);
        }

        public final void close() throws IOException {
            setHeaderTitleInt setheadertitleint = this.getMax;
            synchronized (setheadertitleint.setMax) {
                setheadertitleint.equals = true;
                if (setheadertitleint.toFloatRange != null) {
                    setheadertitleint.toFloatRange.close();
                }
                setheadertitleint.toFloatRange = null;
            }
        }

        static /* synthetic */ Boolean length(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(supportSQLiteDatabase.isWriteAheadLoggingEnabled());
            }
            return Boolean.FALSE;
        }
    }

    static final class setMax implements Cursor {
        private final Cursor getMin;
        private final setHeaderTitleInt setMax;

        setMax(Cursor cursor, setHeaderTitleInt setheadertitleint) {
            this.getMin = cursor;
            this.setMax = setheadertitleint;
        }

        public final void close() {
            this.getMin.close();
            this.setMax.setMax();
        }

        public final boolean isClosed() {
            return this.getMin.isClosed();
        }

        public final int getCount() {
            return this.getMin.getCount();
        }

        public final int getPosition() {
            return this.getMin.getPosition();
        }

        public final boolean move(int i) {
            return this.getMin.move(i);
        }

        public final boolean moveToPosition(int i) {
            return this.getMin.moveToPosition(i);
        }

        public final boolean moveToFirst() {
            return this.getMin.moveToFirst();
        }

        public final boolean moveToLast() {
            return this.getMin.moveToLast();
        }

        public final boolean moveToNext() {
            return this.getMin.moveToNext();
        }

        public final boolean moveToPrevious() {
            return this.getMin.moveToPrevious();
        }

        public final boolean isFirst() {
            return this.getMin.isFirst();
        }

        public final boolean isLast() {
            return this.getMin.isLast();
        }

        public final boolean isBeforeFirst() {
            return this.getMin.isBeforeFirst();
        }

        public final boolean isAfterLast() {
            return this.getMin.isAfterLast();
        }

        public final int getColumnIndex(String str) {
            return this.getMin.getColumnIndex(str);
        }

        public final int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.getMin.getColumnIndexOrThrow(str);
        }

        public final String getColumnName(int i) {
            return this.getMin.getColumnName(i);
        }

        public final String[] getColumnNames() {
            return this.getMin.getColumnNames();
        }

        public final int getColumnCount() {
            return this.getMin.getColumnCount();
        }

        public final byte[] getBlob(int i) {
            return this.getMin.getBlob(i);
        }

        public final String getString(int i) {
            return this.getMin.getString(i);
        }

        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.getMin.copyStringToBuffer(i, charArrayBuffer);
        }

        public final short getShort(int i) {
            return this.getMin.getShort(i);
        }

        public final int getInt(int i) {
            return this.getMin.getInt(i);
        }

        public final long getLong(int i) {
            return this.getMin.getLong(i);
        }

        public final float getFloat(int i) {
            return this.getMin.getFloat(i);
        }

        public final double getDouble(int i) {
            return this.getMin.getDouble(i);
        }

        public final int getType(int i) {
            return this.getMin.getType(i);
        }

        public final boolean isNull(int i) {
            return this.getMin.isNull(i);
        }

        @Deprecated
        public final void deactivate() {
            this.getMin.deactivate();
        }

        @Deprecated
        public final boolean requery() {
            return this.getMin.requery();
        }

        public final void registerContentObserver(ContentObserver contentObserver) {
            this.getMin.registerContentObserver(contentObserver);
        }

        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.getMin.unregisterContentObserver(contentObserver);
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.getMin.registerDataSetObserver(dataSetObserver);
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.getMin.unregisterDataSetObserver(dataSetObserver);
        }

        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.getMin.setNotificationUri(contentResolver, uri);
        }

        @RequiresApi(api = 29)
        @SuppressLint({"UnsafeNewApiCall"})
        public final void setNotificationUris(@NonNull ContentResolver contentResolver, @NonNull List<Uri> list) {
            this.getMin.setNotificationUris(contentResolver, list);
        }

        @RequiresApi(api = 19)
        @SuppressLint({"UnsafeNewApiCall"})
        public final Uri getNotificationUri() {
            return this.getMin.getNotificationUri();
        }

        @RequiresApi(api = 29)
        @SuppressLint({"UnsafeNewApiCall"})
        @Nullable
        public final List<Uri> getNotificationUris() {
            return this.getMin.getNotificationUris();
        }

        public final boolean getWantsAllOnMoveCalls() {
            return this.getMin.getWantsAllOnMoveCalls();
        }

        @RequiresApi(api = 23)
        @SuppressLint({"UnsafeNewApiCall"})
        public final void setExtras(Bundle bundle) {
            this.getMin.setExtras(bundle);
        }

        public final Bundle getExtras() {
            return this.getMin.getExtras();
        }

        public final Bundle respond(Bundle bundle) {
            return this.getMin.respond(bundle);
        }
    }

    static class setMin implements SupportSQLiteStatement {
        private final String getMax;
        private final setHeaderTitleInt setMax;
        private final ArrayList<Object> setMin = new ArrayList<>();

        public final void close() throws IOException {
        }

        setMin(String str, setHeaderTitleInt setheadertitleint) {
            this.getMax = str;
            this.setMax = setheadertitleint;
        }

        private void setMin(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.setMin.size()) {
                for (int size = this.setMin.size(); size <= i2; size++) {
                    this.setMin.add((Object) null);
                }
            }
            this.setMin.set(i2, obj);
        }

        public final int executeUpdateDelete() {
            return ((Integer) this.setMax.getMin(new getOptionalIconsVisible(this, collapseItemActionView.getMax))).intValue();
        }

        public final long executeInsert() {
            return ((Long) this.setMax.getMin(new getOptionalIconsVisible(this, setOptionalIconsVisible.length))).longValue();
        }

        public final void bindNull(int i) {
            setMin(i, (Object) null);
        }

        public final void bindLong(int i, long j) {
            setMin(i, Long.valueOf(j));
        }

        public final void bindDouble(int i, double d) {
            setMin(i, Double.valueOf(d));
        }

        public final void bindString(int i, String str) {
            setMin(i, str);
        }

        public final void bindBlob(int i, byte[] bArr) {
            setMin(i, bArr);
        }

        static /* synthetic */ Object setMax(setMin setmin, next next, SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteStatement compileStatement = supportSQLiteDatabase.compileStatement(setmin.getMax);
            int i = 0;
            while (i < setmin.setMin.size()) {
                int i2 = i + 1;
                Object obj = setmin.setMin.get(i);
                if (obj == null) {
                    compileStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    compileStatement.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    compileStatement.bindDouble(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    compileStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    compileStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
            return next.length(compileStatement);
        }
    }
}
