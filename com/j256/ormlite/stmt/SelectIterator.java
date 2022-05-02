package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.io.IOException;
import java.sql.SQLException;

public class SelectIterator<T, ID> implements CloseableIterator<T> {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SelectIterator.class);
    private boolean alreadyMoved;
    private final Dao<T, ID> classDao;
    private boolean closed;
    private final CompiledStatement compiledStmt;
    private final DatabaseConnection connection;
    private final ConnectionSource connectionSource;
    private final Class<?> dataClass;
    private boolean first = true;
    private T last;
    private final DatabaseResults results;
    private int rowC;
    private final GenericRowMapper<T> rowMapper;
    private final String statement;

    public SelectIterator(Class<?> cls, Dao<T, ID> dao, GenericRowMapper<T> genericRowMapper, ConnectionSource connectionSource2, DatabaseConnection databaseConnection, CompiledStatement compiledStatement, String str, ObjectCache objectCache) throws SQLException {
        this.dataClass = cls;
        this.classDao = dao;
        this.rowMapper = genericRowMapper;
        this.connectionSource = connectionSource2;
        this.connection = databaseConnection;
        this.compiledStmt = compiledStatement;
        this.results = compiledStatement.runQuery(objectCache);
        this.statement = str;
        if (str != null) {
            logger.debug("starting iterator @{} for '{}'", (Object) Integer.valueOf(hashCode()), (Object) str);
        }
    }

    public boolean hasNextThrow() throws SQLException {
        boolean z;
        if (this.closed) {
            return false;
        }
        if (this.alreadyMoved) {
            return true;
        }
        if (this.first) {
            this.first = false;
            z = this.results.first();
        } else {
            z = this.results.next();
        }
        if (!z) {
            IOUtils.closeThrowSqlException(this, "iterator");
        }
        this.alreadyMoved = true;
        return z;
    }

    public boolean hasNext() {
        try {
            return hasNextThrow();
        } catch (SQLException e) {
            this.last = null;
            closeQuietly();
            StringBuilder sb = new StringBuilder("Errors getting more results of ");
            sb.append(this.dataClass);
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public T first() throws SQLException {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.first()) {
            return getCurrent();
        }
        return null;
    }

    public T previous() throws SQLException {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.previous()) {
            return getCurrent();
        }
        return null;
    }

    public T current() throws SQLException {
        if (this.closed) {
            return null;
        }
        if (this.first) {
            return first();
        }
        return getCurrent();
    }

    public T nextThrow() throws SQLException {
        boolean z;
        if (this.closed) {
            return null;
        }
        if (!this.alreadyMoved) {
            if (this.first) {
                this.first = false;
                z = this.results.first();
            } else {
                z = this.results.next();
            }
            if (!z) {
                this.first = false;
                return null;
            }
        }
        this.first = false;
        return getCurrent();
    }

    public T next() {
        try {
            T nextThrow = nextThrow();
            if (nextThrow != null) {
                return nextThrow;
            }
            e = null;
            this.last = null;
            closeQuietly();
            StringBuilder sb = new StringBuilder("Could not get next result for ");
            sb.append(this.dataClass);
            throw new IllegalStateException(sb.toString(), e);
        } catch (SQLException e) {
            e = e;
        }
    }

    public T moveRelative(int i) throws SQLException {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.moveRelative(i)) {
            return getCurrent();
        }
        return null;
    }

    public void removeThrow() throws SQLException {
        T t = this.last;
        if (t != null) {
            Dao<T, ID> dao = this.classDao;
            if (dao != null) {
                try {
                    dao.delete(t);
                } finally {
                    this.last = null;
                }
            } else {
                StringBuilder sb = new StringBuilder("Cannot remove ");
                sb.append(this.dataClass);
                sb.append(" object because classDao not initialized");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No last ");
            sb2.append(this.dataClass);
            sb2.append(" object to remove. Must be called after a call to next.");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void remove() {
        try {
            removeThrow();
        } catch (SQLException e) {
            closeQuietly();
            StringBuilder sb = new StringBuilder("Could not delete ");
            sb.append(this.dataClass);
            sb.append(" object ");
            sb.append(this.last);
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.compiledStmt.close();
            this.closed = true;
            this.last = null;
            if (this.statement != null) {
                logger.debug("closed iterator @{} after {} rows", (Object) Integer.valueOf(hashCode()), (Object) Integer.valueOf(this.rowC));
            }
            try {
                this.connectionSource.releaseConnection(this.connection);
            } catch (SQLException e) {
                throw new IOException("could not release connection", e);
            }
        }
    }

    public void closeQuietly() {
        IOUtils.closeQuietly(this);
    }

    public DatabaseResults getRawResults() {
        return this.results;
    }

    public void moveToNext() {
        this.last = null;
        this.first = false;
        this.alreadyMoved = false;
    }

    private T getCurrent() throws SQLException {
        T mapRow = this.rowMapper.mapRow(this.results);
        this.last = mapRow;
        this.alreadyMoved = false;
        this.rowC++;
        return mapRow;
    }
}
