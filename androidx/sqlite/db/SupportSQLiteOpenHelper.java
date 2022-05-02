package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Closeable;

public interface SupportSQLiteOpenHelper extends Closeable {

    public interface length {
        @NonNull
        SupportSQLiteOpenHelper create(@NonNull Configuration configuration);
    }

    void close();

    @Nullable
    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);

    public static abstract class setMax {
        public final int setMax;

        public void getMax(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void getMax(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public abstract void length(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);

        public setMax(int i) {
            this.setMax = i;
        }

        public void getMin(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void setMin(java.lang.String r2) {
            /*
                java.lang.String r0 = ":memory:"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 != 0) goto L_0x002a
                java.lang.String r0 = r2.trim()
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0013
                goto L_0x002a
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x002a }
                r1 = 16
                if (r0 < r1) goto L_0x0022
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x002a }
                r0.<init>(r2)     // Catch:{ Exception -> 0x002a }
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch:{ Exception -> 0x002a }
                return
            L_0x0022:
                java.io.File r0 = new java.io.File     // Catch:{  }
                r0.<init>(r2)     // Catch:{  }
                r0.delete()     // Catch:{  }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(java.lang.String):void");
        }
    }

    public static class Configuration {
        @NonNull
        public final Context getMax;
        @Nullable
        public final String getMin;
        @NonNull
        public final setMax length;
        public final boolean setMax;

        Configuration(@NonNull Context context, @Nullable String str, @NonNull setMax setmax, boolean z) {
            this.getMax = context;
            this.getMin = str;
            this.length = setmax;
            this.setMax = z;
        }

        @NonNull
        public static getMax setMin(@NonNull Context context) {
            return new getMax(context);
        }

        public static class getMax {
            public setMax getMax;
            public boolean getMin;
            public String length;
            Context setMin;

            @NonNull
            public final Configuration setMax() {
                if (this.getMax == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.setMin == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.getMin || !TextUtils.isEmpty(this.length)) {
                    return new Configuration(this.setMin, this.length, this.getMax, this.getMin);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            getMax(@NonNull Context context) {
                this.setMin = context;
            }
        }
    }
}
