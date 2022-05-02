package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.sql.SQLException;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class IsNotNull extends BaseComparison {
    public void appendValue(DatabaseType databaseType, StringBuilder sb, List<ArgumentHolder> list) {
    }

    public /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder sb, List list) throws SQLException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(566444263, oncanceled);
            onCancelLoad.getMin(566444263, oncanceled);
        }
        super.appendSql(databaseType, str, sb, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public IsNotNull(String str, FieldType fieldType) throws SQLException {
        super(str, fieldType, (Object) null, false);
    }

    public void appendOperation(StringBuilder sb) {
        sb.append("IS NOT NULL ");
    }
}
