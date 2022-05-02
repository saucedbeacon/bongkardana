package o;

import androidx.annotation.Nullable;
import androidx.sqlite.db.SupportSQLiteQuery;

public final class setTitleOptional implements SupportSQLiteQuery {
    @Nullable
    private final Object[] getMax;
    private final String setMax;

    public setTitleOptional(String str, @Nullable Object[] objArr) {
        this.setMax = str;
        this.getMax = objArr;
    }

    public setTitleOptional(String str) {
        this(str, (Object[]) null);
    }

    public final String setMin() {
        return this.setMax;
    }

    public final void setMin(isTitleOptional istitleoptional) {
        Object[] objArr = this.getMax;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    istitleoptional.bindNull(i);
                } else if (obj instanceof byte[]) {
                    istitleoptional.bindBlob(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    istitleoptional.bindDouble(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    istitleoptional.bindDouble(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    istitleoptional.bindLong(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    istitleoptional.bindLong(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    istitleoptional.bindLong(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    istitleoptional.bindLong(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    istitleoptional.bindString(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    istitleoptional.bindLong(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public final int setMax() {
        Object[] objArr = this.getMax;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }
}
