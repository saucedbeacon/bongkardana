package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseMappedStatement<T, ID> {
    protected static Logger logger = LoggerFactory.getLogger((Class<?>) BaseMappedStatement.class);
    protected final FieldType[] argFieldTypes;
    protected final Class<T> clazz;
    protected final FieldType idField;
    protected final String statement;
    protected final TableInfo<T, ID> tableInfo;

    protected BaseMappedStatement(TableInfo<T, ID> tableInfo2, String str, FieldType[] fieldTypeArr) {
        this.tableInfo = tableInfo2;
        this.clazz = tableInfo2.getDataClass();
        this.idField = tableInfo2.getIdField();
        this.statement = str;
        this.argFieldTypes = fieldTypeArr;
    }

    /* access modifiers changed from: protected */
    public Object[] getFieldObjects(Object obj) throws SQLException {
        Object[] objArr = new Object[this.argFieldTypes.length];
        int i = 0;
        while (true) {
            FieldType[] fieldTypeArr = this.argFieldTypes;
            if (i >= fieldTypeArr.length) {
                return objArr;
            }
            FieldType fieldType = fieldTypeArr[i];
            if (fieldType.isAllowGeneratedIdInsert()) {
                objArr[i] = fieldType.getFieldValueIfNotDefault(obj);
            } else {
                objArr[i] = fieldType.extractJavaFieldToSqlArgValue(obj);
            }
            if (objArr[i] == null) {
                objArr[i] = fieldType.getDefaultValue();
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public Object convertIdToFieldObject(ID id2) throws SQLException {
        return this.idField.convertJavaFieldToSqlArgValue(id2);
    }

    static void appendWhereFieldEq(DatabaseType databaseType, FieldType fieldType, StringBuilder sb, List<FieldType> list) {
        sb.append("WHERE ");
        appendFieldColumnName(databaseType, sb, fieldType, list);
        sb.append("= ?");
    }

    static void appendTableName(DatabaseType databaseType, StringBuilder sb, String str, String str2) {
        if (str != null) {
            sb.append(str);
        }
        databaseType.appendEscapedEntityName(sb, str2);
        sb.append(' ');
    }

    static void appendFieldColumnName(DatabaseType databaseType, StringBuilder sb, FieldType fieldType, List<FieldType> list) {
        databaseType.appendEscapedEntityName(sb, fieldType.getColumnName());
        if (list != null) {
            list.add(fieldType);
        }
        sb.append(' ');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MappedStatement: ");
        sb.append(this.statement);
        return sb.toString();
    }
}
