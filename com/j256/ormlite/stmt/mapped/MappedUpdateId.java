package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.List;

public class MappedUpdateId<T, ID> extends BaseMappedStatement<T, ID> {
    private MappedUpdateId(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr) {
        super(tableInfo, str, fieldTypeArr);
    }

    public int execute(DatabaseConnection databaseConnection, T t, ID id2, ObjectCache objectCache) throws SQLException {
        T updateId;
        try {
            Object[] objArr = {convertIdToFieldObject(id2), extractIdToFieldObject(t)};
            int update = databaseConnection.update(this.statement, objArr, this.argFieldTypes);
            if (update > 0) {
                if (!(objectCache == null || (updateId = objectCache.updateId(this.clazz, this.idField.extractJavaFieldValue(t), id2)) == null || updateId == t)) {
                    this.idField.assignField(updateId, id2, false, objectCache);
                }
                this.idField.assignField(t, id2, false, objectCache);
            }
            logger.debug("updating-id with statement '{}' and {} args, changed {} rows", (Object) this.statement, (Object) 2, (Object) Integer.valueOf(update));
            logger.trace("updating-id arguments: {}", (Object) objArr);
            return update;
        } catch (SQLException e) {
            StringBuilder sb = new StringBuilder("Unable to run update-id stmt on object ");
            sb.append(t);
            sb.append(": ");
            sb.append(this.statement);
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public static <T, ID> MappedUpdateId<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) throws SQLException {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder sb = new StringBuilder(64);
            appendTableName(databaseType, sb, "UPDATE ", tableInfo.getTableName());
            sb.append("SET ");
            appendFieldColumnName(databaseType, sb, idField, (List<FieldType>) null);
            sb.append("= ? ");
            appendWhereFieldEq(databaseType, idField, sb, (List<FieldType>) null);
            return new MappedUpdateId<>(tableInfo, sb.toString(), new FieldType[]{idField, idField});
        }
        StringBuilder sb2 = new StringBuilder("Cannot update-id in ");
        sb2.append(tableInfo.getDataClass());
        sb2.append(" because it doesn't have an id field");
        throw new SQLException(sb2.toString());
    }

    private Object extractIdToFieldObject(T t) throws SQLException {
        return this.idField.extractJavaFieldToSqlArgValue(t);
    }
}
