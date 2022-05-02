package com.j256.ormlite.db;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.j256.ormlite.field.BaseFieldConverter;
import com.j256.ormlite.field.DataPersister;
import com.j256.ormlite.field.FieldConverter;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class BaseDatabaseType implements DatabaseType {
    protected static String DEFAULT_SEQUENCE_SUFFIX = "_id_seq";
    protected Driver driver;

    private void appendCanBeNull(StringBuilder sb, FieldType fieldType) {
    }

    public void appendCreateTableSuffix(StringBuilder sb) {
    }

    public void appendSelectNextValFromSequence(StringBuilder sb, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-713632594, oncanceled);
            onCancelLoad.getMin(-713632594, oncanceled);
        }
    }

    /* access modifiers changed from: protected */
    public void configureId(StringBuilder sb, FieldType fieldType, List<String> list, List<String> list2, List<String> list3) {
    }

    public void dropColumnArg(FieldType fieldType, List<String> list, List<String> list2) {
    }

    public <T> DatabaseTableConfig<T> extractDatabaseTableConfig(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean generatedIdSqlAtEnd() {
        return true;
    }

    public String getCommentLinePrefix() {
        return "-- ";
    }

    public DataPersister getDataPersister(DataPersister dataPersister, FieldType fieldType) {
        return dataPersister;
    }

    /* access modifiers changed from: protected */
    public abstract String getDriverClassName();

    public FieldConverter getFieldConverter(DataPersister dataPersister, FieldType fieldType) {
        return dataPersister;
    }

    public String getPingStatement() {
        return "SELECT 1";
    }

    public boolean isAllowGeneratedIdInsertSupported() {
        return true;
    }

    public boolean isBatchUseTransaction() {
        return false;
    }

    public boolean isCreateIfNotExistsSupported() {
        return false;
    }

    public boolean isCreateTableReturnsNegative() {
        return false;
    }

    public boolean isCreateTableReturnsZero() {
        return true;
    }

    public boolean isEntityNamesMustBeUpCase() {
        return false;
    }

    public boolean isIdSequenceNeeded() {
        return false;
    }

    public boolean isLimitAfterSelect() {
        return false;
    }

    public boolean isLimitSqlSupported() {
        return true;
    }

    public boolean isNestedSavePointsSupported() {
        return true;
    }

    public boolean isOffsetLimitArgument() {
        return false;
    }

    public boolean isOffsetSqlSupported() {
        return true;
    }

    public boolean isSelectSequenceBeforeInsert() {
        return false;
    }

    public boolean isTruncateSupported() {
        return false;
    }

    public boolean isVarcharFieldWidthSupported() {
        return true;
    }

    public void loadDriver() throws SQLException {
        String driverClassName = getDriverClassName();
        if (driverClassName != null) {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder("Driver class was not found for ");
                sb.append(getDatabaseName());
                sb.append(" database.  Missing jar with class ");
                sb.append(driverClassName);
                sb.append(".");
                throw SqlExceptionUtil.create(sb.toString(), e);
            }
        }
    }

    public void setDriver(Driver driver2) {
        this.driver = driver2;
    }

    public void appendColumnArg(String str, StringBuilder sb, FieldType fieldType, List<String> list, List<String> list2, List<String> list3, List<String> list4) throws SQLException {
        StringBuilder sb2 = sb;
        FieldType fieldType2 = fieldType;
        appendEscapedEntityName(sb, fieldType.getColumnName());
        sb.append(' ');
        DataPersister dataPersister = fieldType.getDataPersister();
        int width = fieldType.getWidth();
        if (width == 0) {
            width = dataPersister.getDefaultWidth();
        }
        switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$field$SqlType[dataPersister.getSqlType().ordinal()]) {
            case 1:
                appendStringType(sb, fieldType, width);
                break;
            case 2:
                appendLongStringType(sb, fieldType, width);
                break;
            case 3:
                appendBooleanType(sb, fieldType, width);
                break;
            case 4:
                appendDateType(sb, fieldType, width);
                break;
            case 5:
                appendCharType(sb, fieldType, width);
                break;
            case 6:
                appendByteType(sb, fieldType, width);
                break;
            case 7:
                appendByteArrayType(sb, fieldType, width);
                break;
            case 8:
                appendShortType(sb, fieldType, width);
                break;
            case 9:
                appendIntegerType(sb, fieldType, width);
                break;
            case 10:
                appendLongType(sb, fieldType, width);
                break;
            case 11:
                appendFloatType(sb, fieldType, width);
                break;
            case 12:
                appendDoubleType(sb, fieldType, width);
                break;
            case 13:
                appendSerializableType(sb, fieldType, width);
                break;
            case 14:
                appendBigDecimalNumericType(sb, fieldType, width);
                break;
            case 15:
                appendUuidNativeType(sb, fieldType, width);
                break;
            case 16:
                String sqlOtherType = dataPersister.getSqlOtherType();
                if (sqlOtherType != null) {
                    sb.append(sqlOtherType);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder("Unknown SQL-type ");
                sb3.append(dataPersister.getSqlType());
                throw new IllegalArgumentException(sb3.toString());
        }
        sb.append(' ');
        if (fieldType.isGeneratedIdSequence() && !fieldType.isSelfGeneratedId()) {
            configureGeneratedIdSequence(sb, fieldType, list2, list, list4);
        } else if (fieldType.isGeneratedId() && !fieldType.isSelfGeneratedId()) {
            configureGeneratedId(str, sb, fieldType, list2, list3, list, list4);
        } else if (fieldType.isId()) {
            configureId(sb, fieldType, list2, list, list4);
        }
        if (!fieldType.isGeneratedId()) {
            Object defaultValue = fieldType.getDefaultValue();
            if (defaultValue != null) {
                sb.append("DEFAULT ");
                appendDefaultValue(sb, fieldType, defaultValue);
                sb.append(' ');
            }
            if (fieldType.isCanBeNull()) {
                appendCanBeNull(sb, fieldType);
            } else {
                sb.append("NOT NULL ");
            }
            if (fieldType.isUnique()) {
                addSingleUnique(sb, fieldType, list, list3);
            }
        }
    }

    /* renamed from: com.j256.ormlite.db.BaseDatabaseType$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$j256$ormlite$field$SqlType;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.j256.ormlite.field.SqlType[] r0 = com.j256.ormlite.field.SqlType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$j256$ormlite$field$SqlType = r0
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.LONG_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.CHAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SHORT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.INTEGER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.LONG     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x009c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SERIALIZABLE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.UUID     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.OTHER     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.db.BaseDatabaseType.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void appendStringType(StringBuilder sb, FieldType fieldType, int i) {
        if (isVarcharFieldWidthSupported()) {
            sb.append("VARCHAR(");
            sb.append(i);
            sb.append(')');
            return;
        }
        sb.append("VARCHAR");
    }

    /* access modifiers changed from: protected */
    public void appendUuidNativeType(StringBuilder sb, FieldType fieldType, int i) {
        throw new UnsupportedOperationException("UUID is not supported by this database type");
    }

    /* access modifiers changed from: protected */
    public void appendLongStringType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append(SecurityConstants.KEY_DISPLAY_TYPE_TEXT);
    }

    /* access modifiers changed from: protected */
    public void appendDateType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("TIMESTAMP");
    }

    /* access modifiers changed from: protected */
    public void appendBooleanType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("BOOLEAN");
    }

    /* access modifiers changed from: protected */
    public void appendCharType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("CHAR");
    }

    /* access modifiers changed from: protected */
    public void appendByteType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("TINYINT");
    }

    /* access modifiers changed from: protected */
    public void appendShortType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("SMALLINT");
    }

    private void appendIntegerType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("INTEGER");
    }

    /* access modifiers changed from: protected */
    public void appendLongType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("BIGINT");
    }

    private void appendFloatType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("FLOAT");
    }

    private void appendDoubleType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("DOUBLE PRECISION");
    }

    /* access modifiers changed from: protected */
    public void appendByteArrayType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("BLOB");
    }

    /* access modifiers changed from: protected */
    public void appendSerializableType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("BLOB");
    }

    /* access modifiers changed from: protected */
    public void appendBigDecimalNumericType(StringBuilder sb, FieldType fieldType, int i) {
        sb.append("NUMERIC");
    }

    private void appendDefaultValue(StringBuilder sb, FieldType fieldType, Object obj) {
        if (fieldType.isEscapedDefaultValue()) {
            appendEscapedWord(sb, obj.toString());
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: protected */
    public void configureGeneratedIdSequence(StringBuilder sb, FieldType fieldType, List<String> list, List<String> list2, List<String> list3) throws SQLException {
        StringBuilder sb2 = new StringBuilder("GeneratedIdSequence is not supported by database ");
        sb2.append(getDatabaseName());
        sb2.append(" for field ");
        sb2.append(fieldType);
        throw new SQLException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public void configureGeneratedId(String str, StringBuilder sb, FieldType fieldType, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        StringBuilder sb2 = new StringBuilder("GeneratedId is not supported by database ");
        sb2.append(getDatabaseName());
        sb2.append(" for field ");
        sb2.append(fieldType);
        throw new IllegalStateException(sb2.toString());
    }

    public void addPrimaryKeySql(FieldType[] fieldTypeArr, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        StringBuilder sb = null;
        for (FieldType fieldType : fieldTypeArr) {
            if ((!fieldType.isGeneratedId() || generatedIdSqlAtEnd() || fieldType.isSelfGeneratedId()) && fieldType.isId()) {
                if (sb == null) {
                    sb = new StringBuilder(48);
                    sb.append("PRIMARY KEY (");
                } else {
                    sb.append(',');
                }
                appendEscapedEntityName(sb, fieldType.getColumnName());
            }
        }
        if (sb != null) {
            sb.append(") ");
            list.add(sb.toString());
        }
    }

    public void addUniqueComboSql(FieldType[] fieldTypeArr, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        StringBuilder sb = null;
        for (FieldType fieldType : fieldTypeArr) {
            if (fieldType.isUniqueCombo()) {
                if (sb == null) {
                    sb = new StringBuilder(48);
                    sb.append("UNIQUE (");
                } else {
                    sb.append(',');
                }
                appendEscapedEntityName(sb, fieldType.getColumnName());
            }
        }
        if (sb != null) {
            sb.append(") ");
            list.add(sb.toString());
        }
    }

    public void appendEscapedWord(StringBuilder sb, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1949764390, oncanceled);
            onCancelLoad.getMin(-1949764390, oncanceled);
        }
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
    }

    public void appendEscapedEntityName(StringBuilder sb, String str) {
        sb.append('`');
        int indexOf = str.indexOf(46);
        if (indexOf > 0) {
            sb.append(str.substring(0, indexOf));
            sb.append("`.`");
            sb.append(str.substring(indexOf + 1));
        } else {
            sb.append(str);
        }
        sb.append('`');
    }

    public String generateIdSequenceName(String str, FieldType fieldType) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(DEFAULT_SEQUENCE_SUFFIX);
        String obj = sb.toString();
        return isEntityNamesMustBeUpCase() ? upCaseEntityName(obj) : obj;
    }

    public void appendLimitValue(StringBuilder sb, long j, Long l) {
        sb.append("LIMIT ");
        sb.append(j);
        sb.append(' ');
    }

    public void appendOffsetValue(StringBuilder sb, long j) {
        sb.append("OFFSET ");
        sb.append(j);
        sb.append(' ');
    }

    public String upCaseEntityName(String str) {
        return str.toUpperCase(Locale.ENGLISH);
    }

    public boolean isCreateIndexIfNotExistsSupported() {
        return isCreateIfNotExistsSupported();
    }

    public void appendInsertNoColumns(StringBuilder sb) {
        sb.append("() VALUES ()");
    }

    private void addSingleUnique(StringBuilder sb, FieldType fieldType, List<String> list, List<String> list2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" UNIQUE (");
        appendEscapedEntityName(sb2, fieldType.getColumnName());
        sb2.append(')');
        list.add(sb2.toString());
    }

    protected static class BooleanNumberFieldConverter extends BaseFieldConverter {
        protected BooleanNumberFieldConverter() {
        }

        public SqlType getSqlType() {
            return SqlType.BOOLEAN;
        }

        public Object parseDefaultString(FieldType fieldType, String str) {
            byte b;
            if (Boolean.parseBoolean(str)) {
                b = 1;
            } else {
                b = 0;
            }
            return Byte.valueOf(b);
        }

        public Object javaToSqlArg(FieldType fieldType, Object obj) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
        }

        public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) throws SQLException {
            return Byte.valueOf(databaseResults.getByte(i));
        }

        public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
            return ((Byte) obj).byteValue() == 1 ? Boolean.TRUE : Boolean.FALSE;
        }

        public Object resultStringToJava(FieldType fieldType, String str, int i) {
            return sqlArgToJava(fieldType, Byte.valueOf(Byte.parseByte(str)), i);
        }
    }
}
