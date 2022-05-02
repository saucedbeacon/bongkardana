package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class setupDialog {
    @Nullable
    public static String getMin(Context context, Uri uri) {
        return getMax(context, uri, "_display_name", (String) null);
    }

    @Nullable
    private static String toIntRange(Context context, Uri uri) {
        return getMax(context, uri, "mime_type", (String) null);
    }

    @Nullable
    public static String setMin(Context context, Uri uri) {
        String intRange = toIntRange(context, uri);
        if ("vnd.android.document/directory".equals(intRange)) {
            return null;
        }
        return intRange;
    }

    public static boolean setMax(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(toIntRange(context, uri));
    }

    public static boolean getMax(Context context, Uri uri) {
        String intRange = toIntRange(context, uri);
        return !"vnd.android.document/directory".equals(intRange) && !TextUtils.isEmpty(intRange);
    }

    public static boolean length(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(toIntRange(context, uri));
    }

    public static boolean equals(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String intRange = toIntRange(context, uri);
        int max = setMax(context, uri, "flags", 0);
        if (TextUtils.isEmpty(intRange)) {
            return false;
        }
        if ((max & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(intRange) && (max & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(intRange) || (max & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean IsOverlapping(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        } finally {
            getMax(cursor);
        }
    }

    @Nullable
    private static String getMax(Context context, Uri uri, String str, @Nullable String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            getMax(cursor);
            return str2;
        } catch (Exception unused) {
            return str2;
        } finally {
            getMax(cursor);
        }
    }

    private static int setMax(Context context, Uri uri, String str, int i) {
        return (int) getMin(context, uri, str, (long) i);
    }

    private static long getMin(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            getMax(cursor);
            return j;
        } catch (Exception unused) {
            return j;
        } finally {
            getMax(cursor);
        }
    }

    private static void getMax(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
