package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.sql.SQLException;
import java.util.List;

public class Between extends BaseComparison {
    private Object high;
    private Object low;

    public /* bridge */ /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder sb, List list) throws SQLException {
        super.appendSql(databaseType, str, sb, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Between(String str, FieldType fieldType, Object obj, Object obj2) throws SQLException {
        super(str, fieldType, (Object) null, true);
        this.low = obj;
        this.high = obj2;
    }

    public void appendOperation(StringBuilder sb) {
        sb.append("BETWEEN ");
    }

    public void appendValue(DatabaseType databaseType, StringBuilder sb, List<ArgumentHolder> list) throws SQLException {
        if (this.low == null) {
            StringBuilder sb2 = new StringBuilder("BETWEEN low value for '");
            sb2.append(this.columnName);
            sb2.append("' is null");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.high != null) {
            appendArgOrValue(databaseType, this.fieldType, sb, list, this.low);
            sb.append("AND ");
            appendArgOrValue(databaseType, this.fieldType, sb, list, this.high);
        } else {
            StringBuilder sb3 = new StringBuilder("BETWEEN high value for '");
            sb3.append(this.columnName);
            sb3.append("' is null");
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
