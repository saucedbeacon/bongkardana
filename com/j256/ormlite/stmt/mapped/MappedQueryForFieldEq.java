package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.List;

public class MappedQueryForFieldEq<T, ID> extends BaseMappedQuery<T, ID> {
    private final String label;

    protected MappedQueryForFieldEq(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType[] fieldTypeArr2, String str2) {
        super(tableInfo, str, fieldTypeArr, fieldTypeArr2);
        this.label = str2;
    }

    public T execute(DatabaseConnection databaseConnection, ID id2, ObjectCache objectCache) throws SQLException {
        T t;
        if (objectCache != null && (t = objectCache.get(this.clazz, id2)) != null) {
            return t;
        }
        Object[] objArr = {convertIdToFieldObject(id2)};
        T queryForOne = databaseConnection.queryForOne(this.statement, objArr, this.argFieldTypes, this, objectCache);
        if (queryForOne == null) {
            logger.debug("{} using '{}' and {} args, got no results", (Object) this.label, (Object) this.statement, (Object) 1);
        } else if (queryForOne != DatabaseConnection.MORE_THAN_ONE) {
            logger.debug("{} using '{}' and {} args, got 1 result", (Object) this.label, (Object) this.statement, (Object) 1);
        } else {
            logger.error("{} using '{}' and {} args, got >1 results", (Object) this.label, (Object) this.statement, (Object) 1);
            logArgs(objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(this.label);
            sb.append(" got more than 1 result: ");
            sb.append(this.statement);
            throw new SQLException(sb.toString());
        }
        logArgs(objArr);
        return queryForOne;
    }

    public static <T, ID> MappedQueryForFieldEq<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo, FieldType fieldType) throws SQLException {
        if (fieldType == null && (fieldType = tableInfo.getIdField()) == null) {
            StringBuilder sb = new StringBuilder("Cannot query-for-id with ");
            sb.append(tableInfo.getDataClass());
            sb.append(" because it doesn't have an id field");
            throw new SQLException(sb.toString());
        }
        return new MappedQueryForFieldEq(tableInfo, buildStatement(databaseType, tableInfo, fieldType), new FieldType[]{fieldType}, tableInfo.getFieldTypes(), "query-for-id");
    }

    protected static <T, ID> String buildStatement(DatabaseType databaseType, TableInfo<T, ID> tableInfo, FieldType fieldType) {
        StringBuilder sb = new StringBuilder(64);
        appendTableName(databaseType, sb, "SELECT * FROM ", tableInfo.getTableName());
        appendWhereFieldEq(databaseType, fieldType, sb, (List<FieldType>) null);
        return sb.toString();
    }

    private void logArgs(Object[] objArr) {
        if (objArr.length > 0) {
            logger.trace("{} arguments: {}", (Object) this.label, (Object) objArr);
        }
    }
}
