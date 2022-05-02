package id.dana.data.base;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseHook;
import net.sqlcipher.database.SQLiteStatement;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/base/SqlCipherUtils;", "", "()V", "encrypt", "", "ctx", "Landroid/content/Context;", "originalFile", "Ljava/io/File;", "passphrase", "", "dbName", "", "getDatabaseState", "Lid/dana/data/base/SqlCipherUtils$State;", "name", "path", "State", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SqlCipherUtils {
    @NotNull
    public static final SqlCipherUtils INSTANCE = new SqlCipherUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/data/base/SqlCipherUtils$State;", "", "(Ljava/lang/String;I)V", "DOES_NOT_EXISTS", "UNENCRYPTED", "ENCRYPTED", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum State {
        DOES_NOT_EXISTS,
        UNENCRYPTED,
        ENCRYPTED
    }

    private SqlCipherUtils() {
    }

    @JvmStatic
    @NotNull
    public static final State getDatabaseState(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(str, "name");
        SQLiteDatabase.loadLibs(context);
        File databasePath = context.getDatabasePath(str);
        Intrinsics.checkNotNullExpressionValue(databasePath, "ctx.getDatabasePath(name)");
        return getDatabaseState(databasePath);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = id.dana.data.base.SqlCipherUtils.State.ENCRYPTED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r0 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final id.dana.data.base.SqlCipherUtils.State getDatabaseState(@org.jetbrains.annotations.NotNull java.io.File r3) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x000e
            id.dana.data.base.SqlCipherUtils$State r3 = id.dana.data.base.SqlCipherUtils.State.DOES_NOT_EXISTS
            return r3
        L_0x000e:
            r0 = 0
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = ""
            r2 = 1
            net.sqlcipher.database.SQLiteDatabase r0 = net.sqlcipher.database.SQLiteDatabase.openDatabase((java.lang.String) r3, (java.lang.String) r1, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r0, (int) r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r3 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x002a }
            r0.getVersion()     // Catch:{ Exception -> 0x002a }
            id.dana.data.base.SqlCipherUtils$State r3 = id.dana.data.base.SqlCipherUtils.State.UNENCRYPTED     // Catch:{ Exception -> 0x002a }
        L_0x0024:
            r0.close()
            goto L_0x002f
        L_0x0028:
            r3 = move-exception
            goto L_0x0030
        L_0x002a:
            id.dana.data.base.SqlCipherUtils$State r3 = id.dana.data.base.SqlCipherUtils.State.ENCRYPTED     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            return r3
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            goto L_0x0037
        L_0x0036:
            throw r3
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.base.SqlCipherUtils.getDatabaseState(java.io.File):id.dana.data.base.SqlCipherUtils$State");
    }

    @JvmStatic
    public static final void encrypt(@NotNull Context context, @NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(str, "dbName");
        Intrinsics.checkNotNullParameter(bArr, "passphrase");
        File databasePath = context.getDatabasePath(str);
        Intrinsics.checkNotNullExpressionValue(databasePath, "ctx.getDatabasePath(dbName)");
        encrypt(context, databasePath, bArr);
    }

    @JvmStatic
    public static final void encrypt(@NotNull Context context, @NotNull File file, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(file, "originalFile");
        Intrinsics.checkNotNullParameter(bArr, "passphrase");
        SQLiteDatabase.loadLibs(context);
        if (file.exists()) {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), "", (SQLiteDatabase.CursorFactory) null, 0);
            Intrinsics.checkNotNullExpressionValue(openDatabase, "db");
            int version = openDatabase.getVersion();
            openDatabase.close();
            File createTempFile = File.createTempFile("sqlcipherutils", "tmp", context.getCacheDir());
            Intrinsics.checkNotNullExpressionValue(createTempFile, "newFile");
            SQLiteDatabase openDatabase2 = SQLiteDatabase.openDatabase(createTempFile.getAbsolutePath(), bArr, (SQLiteDatabase.CursorFactory) null, 0, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
            SQLiteStatement compileStatement = openDatabase2.compileStatement("ATTACH DATABASE ? AS plaintext KEY ''");
            compileStatement.bindString(1, file.getAbsolutePath());
            compileStatement.execute();
            openDatabase2.rawExecSQL("SELECT sqlcipher_export('main', 'plaintext')");
            openDatabase2.rawExecSQL("DETACH DATABASE plaintext");
            openDatabase2.setVersion(version);
            compileStatement.close();
            openDatabase2.close();
            file.delete();
            createTempFile.renameTo(file);
        }
    }
}
