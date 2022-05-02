package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.stmt.mapped.MappedPreparedStmt;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;

public abstract class BaseForeignCollection<T, ID> implements ForeignCollection<T>, Serializable {
    private static final long serialVersionUID = -5158840898186237589L;
    protected final transient Dao<T, ID> dao;
    private final transient FieldType foreignFieldType;
    private final transient boolean orderAscending;
    private final transient String orderColumn;
    private final transient Object parent;
    private final transient Object parentId;
    private transient PreparedQuery<T> preparedQuery;

    public abstract boolean remove(Object obj);

    public abstract boolean removeAll(Collection<?> collection);

    protected BaseForeignCollection(Dao<T, ID> dao2, Object obj, Object obj2, FieldType fieldType, String str, boolean z) {
        this.dao = dao2;
        this.foreignFieldType = fieldType;
        this.parentId = obj2;
        this.orderColumn = str;
        this.orderAscending = z;
        this.parent = obj;
    }

    public boolean add(T t) {
        try {
            return addElement(t);
        } catch (SQLException e) {
            throw new IllegalStateException("Could not create data element in dao", e);
        }
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (Object addElement : collection) {
            try {
                if (addElement(addElement)) {
                    z = true;
                }
            } catch (SQLException e) {
                throw new IllegalStateException("Could not create data elements in dao", e);
            }
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        if (this.dao == null) {
            return false;
        }
        CloseableIterator closeableIterator = closeableIterator();
        while (closeableIterator.hasNext()) {
            try {
                if (!collection.contains(closeableIterator.next())) {
                    closeableIterator.remove();
                    z = true;
                }
            } finally {
                IOUtils.closeQuietly(closeableIterator);
            }
        }
        return z;
    }

    public void clear() {
        if (this.dao != null) {
            CloseableIterator closeableIterator = closeableIterator();
            while (closeableIterator.hasNext()) {
                try {
                    closeableIterator.next();
                    closeableIterator.remove();
                } finally {
                    IOUtils.closeQuietly(closeableIterator);
                }
            }
        }
    }

    public int update(T t) throws SQLException {
        Dao<T, ID> dao2 = this.dao;
        if (dao2 == null) {
            return 0;
        }
        return dao2.update(t);
    }

    public int refresh(T t) throws SQLException {
        Dao<T, ID> dao2 = this.dao;
        if (dao2 == null) {
            return 0;
        }
        return dao2.refresh(t);
    }

    public Dao<T, ?> getDao() {
        return this.dao;
    }

    /* access modifiers changed from: protected */
    public PreparedQuery<T> getPreparedQuery() throws SQLException {
        if (this.dao == null) {
            return null;
        }
        if (this.preparedQuery == null) {
            SelectArg selectArg = new SelectArg();
            selectArg.setValue(this.parentId);
            QueryBuilder<T, ID> queryBuilder = this.dao.queryBuilder();
            String str = this.orderColumn;
            if (str != null) {
                queryBuilder.orderBy(str, this.orderAscending);
            }
            PreparedQuery<T> prepare = queryBuilder.where().eq(this.foreignFieldType.getColumnName(), selectArg).prepare();
            this.preparedQuery = prepare;
            if (prepare instanceof MappedPreparedStmt) {
                ((MappedPreparedStmt) prepare).setParentInformation(this.parent, this.parentId);
            }
        }
        return this.preparedQuery;
    }

    private boolean addElement(T t) throws SQLException {
        if (this.dao == null) {
            return false;
        }
        if (this.parent != null && this.foreignFieldType.getFieldValueIfNotDefault(t) == null) {
            this.foreignFieldType.assignField(t, this.parent, true, (ObjectCache) null);
        }
        this.dao.create(t);
        return true;
    }
}
