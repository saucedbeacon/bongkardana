package o;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class getTitle {
    @NonNull
    public static Cursor getMin(@NonNull Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static int length(@NonNull Cursor cursor, @NonNull String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append("`");
        int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return getMax(cursor.getColumnNames(), str);
        }
        return -1;
    }

    public static int setMax(@NonNull Cursor cursor, @NonNull String str) {
        String str2;
        int length = length(cursor, str);
        if (length >= 0) {
            return length;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    @VisibleForTesting(otherwise = 2)
    private static int getMax(String[] strArr, String str) {
        String concat = ".".concat(String.valueOf(str));
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        sb.append("`");
        String obj = sb.toString();
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2.length() >= str.length() + 2) {
                if (str2.endsWith(concat)) {
                    return i;
                }
                if (str2.charAt(0) == '`' && str2.endsWith(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
