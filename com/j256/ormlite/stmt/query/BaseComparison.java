package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.sql.SQLException;
import java.util.List;

abstract class BaseComparison implements Comparison {
    private static final String NUMBER_CHARACTERS = "0123456789.-+";
    protected final String columnName;
    protected final FieldType fieldType;
    private final Object value;

    public abstract void appendOperation(StringBuilder sb);

    protected BaseComparison(String str, FieldType fieldType2, Object obj, boolean z) throws SQLException {
        if (!z || fieldType2 == null || fieldType2.isComparable()) {
            this.columnName = str;
            this.fieldType = fieldType2;
            this.value = obj;
            return;
        }
        StringBuilder sb = new StringBuilder("Field '");
        sb.append(str);
        sb.append("' is of data type ");
        sb.append(fieldType2.getDataPersister());
        sb.append(" which can not be compared");
        throw new SQLException(sb.toString());
    }

    public void appendSql(DatabaseType databaseType, String str, StringBuilder sb, List<ArgumentHolder> list) throws SQLException {
        if (str != null) {
            databaseType.appendEscapedEntityName(sb, str);
            sb.append('.');
        }
        databaseType.appendEscapedEntityName(sb, this.columnName);
        sb.append(' ');
        appendOperation(sb);
        appendValue(databaseType, sb, list);
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void appendValue(DatabaseType databaseType, StringBuilder sb, List<ArgumentHolder> list) throws SQLException {
        appendArgOrValue(databaseType, this.fieldType, sb, list, this.value);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void appendArgOrValue(com.j256.ormlite.db.DatabaseType r9, com.j256.ormlite.field.FieldType r10, java.lang.StringBuilder r11, java.util.List<com.j256.ormlite.stmt.ArgumentHolder> r12, java.lang.Object r13) throws java.sql.SQLException {
        /*
            r8 = this;
            if (r13 == 0) goto L_0x00df
            boolean r0 = r13 instanceof com.j256.ormlite.stmt.ArgumentHolder
            r1 = 0
            r2 = 63
            if (r0 == 0) goto L_0x0018
            r11.append(r2)
            com.j256.ormlite.stmt.ArgumentHolder r13 = (com.j256.ormlite.stmt.ArgumentHolder) r13
            java.lang.String r9 = r8.columnName
            r13.setMetaInfo(r9, r10)
            r12.add(r13)
            goto L_0x00d6
        L_0x0018:
            boolean r0 = r13 instanceof com.j256.ormlite.stmt.ColumnArg
            if (r0 == 0) goto L_0x0035
            com.j256.ormlite.stmt.ColumnArg r13 = (com.j256.ormlite.stmt.ColumnArg) r13
            java.lang.String r10 = r13.getTableName()
            if (r10 == 0) goto L_0x002c
            r9.appendEscapedEntityName(r11, r10)
            r10 = 46
            r11.append(r10)
        L_0x002c:
            java.lang.String r10 = r13.getColumnName()
            r9.appendEscapedEntityName(r11, r10)
            goto L_0x00d6
        L_0x0035:
            boolean r0 = r10.isArgumentHolderRequired()
            if (r0 == 0) goto L_0x0050
            r11.append(r2)
            com.j256.ormlite.stmt.SelectArg r9 = new com.j256.ormlite.stmt.SelectArg
            r9.<init>()
            java.lang.String r0 = r8.columnName
            r9.setMetaInfo(r0, r10)
            r9.setValue(r13)
            r12.add(r9)
            goto L_0x00d6
        L_0x0050:
            boolean r0 = r10.isForeign()
            if (r0 == 0) goto L_0x0074
            java.lang.Class r0 = r10.getType()
            java.lang.Class r2 = r13.getClass()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0074
            com.j256.ormlite.field.FieldType r4 = r10.getForeignIdField()
            java.lang.Object r7 = r4.extractJavaFieldValue(r13)
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r2.appendArgOrValue(r3, r4, r5, r6, r7)
            goto L_0x00d7
        L_0x0074:
            boolean r12 = r10.isEscapedValue()
            if (r12 == 0) goto L_0x0086
            java.lang.Object r10 = r10.convertJavaFieldToSqlArgValue(r13)
            java.lang.String r10 = r10.toString()
            r9.appendEscapedWord(r11, r10)
            goto L_0x00d6
        L_0x0086:
            boolean r9 = r10.isForeign()
            if (r9 == 0) goto L_0x00cf
            java.lang.Object r9 = r10.convertJavaFieldToSqlArgValue(r13)
            java.lang.String r9 = r9.toString()
            int r12 = r9.length()
            if (r12 <= 0) goto L_0x00cb
            char r12 = r9.charAt(r1)
            java.lang.String r13 = "0123456789.-+"
            int r12 = r13.indexOf(r12)
            if (r12 < 0) goto L_0x00a7
            goto L_0x00cb
        L_0x00a7:
            java.sql.SQLException r11 = new java.sql.SQLException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Foreign field "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = " does not seem to be producing a numerical value '"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = "'. Maybe you are passing the wrong object to comparison: "
            r12.append(r9)
            r12.append(r8)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x00cb:
            r11.append(r9)
            goto L_0x00d6
        L_0x00cf:
            java.lang.Object r9 = r10.convertJavaFieldToSqlArgValue(r13)
            r11.append(r9)
        L_0x00d6:
            r1 = 1
        L_0x00d7:
            if (r1 == 0) goto L_0x00de
            r9 = 32
            r11.append(r9)
        L_0x00de:
            return
        L_0x00df:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "argument for '"
            r11.<init>(r12)
            java.lang.String r10 = r10.getFieldName()
            r11.append(r10)
            java.lang.String r10 = "' is null"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.query.BaseComparison.appendArgOrValue(com.j256.ormlite.db.DatabaseType, com.j256.ormlite.field.FieldType, java.lang.StringBuilder, java.util.List, java.lang.Object):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.columnName);
        sb.append(' ');
        appendOperation(sb);
        sb.append(' ');
        sb.append(this.value);
        return sb.toString();
    }
}
