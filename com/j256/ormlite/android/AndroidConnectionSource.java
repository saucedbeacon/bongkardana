package com.j256.ormlite.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.db.SqliteAndroidDatabaseType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.BaseConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseConnectionProxyFactory;
import java.sql.SQLException;

public class AndroidConnectionSource extends BaseConnectionSource implements ConnectionSource {
    private static DatabaseConnectionProxyFactory connectionProxyFactory;
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) AndroidConnectionSource.class);
    private boolean cancelQueriesEnabled;
    private DatabaseConnection connection;
    private final DatabaseType databaseType;
    private final SQLiteOpenHelper helper;
    private volatile boolean isOpen;
    private final SQLiteDatabase sqliteDatabase;

    public boolean isSingleConnection(String str) {
        return true;
    }

    public void releaseConnection(DatabaseConnection databaseConnection) {
    }

    public AndroidConnectionSource(SQLiteOpenHelper sQLiteOpenHelper) {
        this.connection = null;
        this.isOpen = true;
        this.databaseType = new SqliteAndroidDatabaseType();
        this.cancelQueriesEnabled = false;
        this.helper = sQLiteOpenHelper;
        this.sqliteDatabase = null;
    }

    public AndroidConnectionSource(SQLiteDatabase sQLiteDatabase) {
        this.connection = null;
        this.isOpen = true;
        this.databaseType = new SqliteAndroidDatabaseType();
        this.cancelQueriesEnabled = false;
        this.helper = null;
        this.sqliteDatabase = sQLiteDatabase;
    }

    public DatabaseConnection getReadOnlyConnection(String str) throws SQLException {
        return getReadWriteConnection(str);
    }

    public DatabaseConnection getReadWriteConnection(String str) throws SQLException {
        DatabaseConnection savedConnection = getSavedConnection();
        if (savedConnection != null) {
            return savedConnection;
        }
        DatabaseConnection databaseConnection = this.connection;
        if (databaseConnection == null) {
            SQLiteDatabase sQLiteDatabase = this.sqliteDatabase;
            if (sQLiteDatabase == null) {
                try {
                    sQLiteDatabase = this.helper.getWritableDatabase();
                } catch (android.database.SQLException e) {
                    StringBuilder sb = new StringBuilder("Getting a writable database from helper ");
                    sb.append(this.helper);
                    sb.append(" failed");
                    throw SqlExceptionUtil.create(sb.toString(), e);
                }
            }
            AndroidDatabaseConnection androidDatabaseConnection = new AndroidDatabaseConnection(sQLiteDatabase, true, this.cancelQueriesEnabled);
            this.connection = androidDatabaseConnection;
            DatabaseConnectionProxyFactory databaseConnectionProxyFactory = connectionProxyFactory;
            if (databaseConnectionProxyFactory != null) {
                this.connection = databaseConnectionProxyFactory.createProxy(androidDatabaseConnection);
            }
            logger.trace("created connection {} for db {}, helper {}", (Object) this.connection, (Object) sQLiteDatabase, (Object) this.helper);
        } else {
            logger.trace("{}: returning read-write connection {}, helper {}", (Object) this, (Object) databaseConnection, (Object) this.helper);
        }
        return this.connection;
    }

    public boolean saveSpecialConnection(DatabaseConnection databaseConnection) throws SQLException {
        return saveSpecial(databaseConnection);
    }

    public void clearSpecialConnection(DatabaseConnection databaseConnection) {
        clearSpecial(databaseConnection, logger);
    }

    public void close() {
        this.isOpen = false;
    }

    public void closeQuietly() {
        close();
    }

    public DatabaseType getDatabaseType() {
        return this.databaseType;
    }

    public boolean isOpen(String str) {
        return this.isOpen;
    }

    public static void setDatabaseConnectionProxyFactory(DatabaseConnectionProxyFactory databaseConnectionProxyFactory) {
        connectionProxyFactory = databaseConnectionProxyFactory;
    }

    public boolean isCancelQueriesEnabled() {
        return this.cancelQueriesEnabled;
    }

    public void setCancelQueriesEnabled(boolean z) {
        this.cancelQueriesEnabled = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(Integer.toHexString(super.hashCode()));
        return sb.toString();
    }
}
