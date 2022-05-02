package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.List;

public class MappedDelete<T, ID> extends BaseMappedStatement<T, ID> {
    private MappedDelete(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr) {
        super(tableInfo, str, fieldTypeArr);
    }

    public static <T, ID> MappedDelete<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) throws SQLException {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder sb = new StringBuilder(64);
            appendTableName(databaseType, sb, "DELETE FROM ", tableInfo.getTableName());
            appendWhereFieldEq(databaseType, idField, sb, (List<FieldType>) null);
            return new MappedDelete<>(tableInfo, sb.toString(), new FieldType[]{idField});
        }
        StringBuilder sb2 = new StringBuilder("Cannot delete from ");
        sb2.append(tableInfo.getDataClass());
        sb2.append(" because it doesn't have an id field");
        throw new SQLException(sb2.toString());
    }

    public int delete(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        try {
            Object[] fieldObjects = getFieldObjects(t);
            int delete = databaseConnection.delete(this.statement, fieldObjects, this.argFieldTypes);
            logger.debug("delete data with statement '{}' and {} args, changed {} rows", (Object) this.statement, (Object) Integer.valueOf(fieldObjects.length), (Object) Integer.valueOf(delete));
            if (fieldObjects.length > 0) {
                logger.trace("delete arguments: {}", (Object) fieldObjects);
            }
            if (delete > 0 && objectCache != null) {
                objectCache.remove(this.clazz, this.idField.extractJavaFieldToSqlArgValue(t));
            }
            return delete;
        } catch (SQLException e) {
            StringBuilder sb = new StringBuilder("Unable to run delete stmt on object ");
            sb.append(t);
            sb.append(": ");
            sb.append(this.statement);
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public int deleteById(DatabaseConnection databaseConnection, ID id2, ObjectCache objectCache) throws SQLException {
        try {
            Object[] objArr = {convertIdToFieldObject(id2)};
            int delete = databaseConnection.delete(this.statement, objArr, this.argFieldTypes);
            logger.debug("delete data with statement '{}' and {} args, changed {} rows", (Object) this.statement, (Object) 1, (Object) Integer.valueOf(delete));
            logger.trace("delete arguments: {}", (Object) objArr);
            if (delete > 0 && objectCache != null) {
                objectCache.remove(this.clazz, id2);
            }
            return delete;
        } catch (SQLException e) {
            StringBuilder sb = new StringBuilder("Unable to run deleteById stmt on id ");
            sb.append(id2);
            sb.append(": ");
            sb.append(this.statement);
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }
}
