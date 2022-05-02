package com.alipay.mobile.rome.syncservice.sync.b.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.model.ResultCodeEnum;
import com.alipay.mobile.rome.syncservice.model.d;
import com.alipay.mobile.rome.syncservice.sync.d.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class b extends a {
    private static final String b = b.class.getSimpleName();
    private volatile Map<String, Integer> c = new ConcurrentHashMap();
    private volatile boolean d = false;

    public final String b() {
        return "sync_dispatch";
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `sync_dispatch` ( `userId` VARCHAR NOT NULL, `biz` VARCHAR NOT NULL, `sKey` VARCHAR NOT NULL, `pf` VARCHAR , `hm` VARCHAR , `md` VARCHAR , `sendNum` INTEGER ,  `localTime` BIGINT , `reserv1` VARCHAR, `reserv2` VARCHAR, `id` INTEGER PRIMARY KEY AUTOINCREMENT );");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `sync_dispatch_idx` ON `sync_dispatch` ( `userId`, `biz`, `sKey`)");
        } catch (SQLException e) {
            String str = b;
            StringBuilder sb = new StringBuilder("excuteCreateTable:[ SQLException=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
            throw e;
        }
    }

    public final int a(String str, String str2, int i) {
        try {
            return a("userId = ? AND biz = ? AND id = ? ", new String[]{str, str2, String.valueOf(i)});
        } catch (Exception e) {
            c.d(b, "deleteMsgItem: ".concat(String.valueOf(e)));
            return 0;
        }
    }

    public final int a(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1161637656, oncanceled);
            onCancelLoad.getMin(-1161637656, oncanceled);
        }
        try {
            return a("userId = ? AND biz = ? ", new String[]{str, str2});
        } catch (Exception e) {
            c.d(b, "deleteDownlinkMsgItem: ".concat(String.valueOf(e)));
            return 0;
        }
    }

    public final d a(a aVar) {
        if (aVar == null) {
            return new d(ResultCodeEnum.ERROR);
        }
        long j = -1;
        if (aVar != null) {
            try {
                if (!TextUtils.isEmpty(aVar.c) && !TextUtils.isEmpty(aVar.d)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("userId", aVar.b);
                    contentValues.put("biz", aVar.c);
                    contentValues.put("sKey", aVar.d);
                    contentValues.put("hm", aVar.e);
                    contentValues.put("md", aVar.f);
                    contentValues.put("sendNum", Integer.valueOf(aVar.g));
                    contentValues.put("localTime", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("reserv1", aVar.j);
                    contentValues.put("reserv2", aVar.k);
                    j = a(contentValues);
                    String str = b;
                    StringBuilder sb = new StringBuilder("insertDownlinkMsgItem[dbid=");
                    sb.append(j);
                    sb.append("] [sKey=");
                    sb.append(aVar.d);
                    sb.append("]");
                    c.a(str, sb.toString());
                    return j > 0 ? new d(ResultCodeEnum.SUCCESS) : new d(ResultCodeEnum.ERROR);
                }
            } catch (SQLiteConstraintException e) {
                if (a(aVar.b, aVar.c, aVar.d)) {
                    String str2 = b;
                    StringBuilder sb2 = new StringBuilder("insertDownlinkMsgItem: has same index:");
                    sb2.append(aVar.d);
                    c.a(str2, sb2.toString());
                    return new d(ResultCodeEnum.REPEATED_ITEM);
                }
                String str3 = b;
                StringBuilder sb3 = new StringBuilder("insertDownlinkMsgItem: ");
                sb3.append(aVar.d);
                sb3.append(",error reason: ");
                sb3.append(e);
                c.a(str3, sb3.toString());
            } catch (SQLiteDiskIOException e2) {
                c.d(b, "insertDownlinkMsgItem:".concat(String.valueOf(e2)));
                a();
                return new d(ResultCodeEnum.DB_CRUPT, String.valueOf(e2));
            } catch (SQLiteDatabaseCorruptException e3) {
                c.d(b, "insertDownlinkMsgItem:".concat(String.valueOf(e3)));
                a();
                return new d(ResultCodeEnum.DB_CRUPT, String.valueOf(e3));
            } catch (SQLiteReadOnlyDatabaseException e4) {
                c.d(b, "insertDownlinkMsgItem:".concat(String.valueOf(e4)));
                String message = e4.getMessage();
                if (TextUtils.isEmpty(message) || !message.contains("1032")) {
                    return new d(ResultCodeEnum.ERROR, String.valueOf(e4));
                }
                a();
                return new d(ResultCodeEnum.DB_CRUPT, String.valueOf(e4));
            } catch (SQLiteCantOpenDatabaseException e5) {
                String message2 = e5.getMessage();
                if (TextUtils.isEmpty(message2) || !message2.contains("14")) {
                    return new d(ResultCodeEnum.ERROR, String.valueOf(e5));
                }
                c();
                return new d(ResultCodeEnum.DB_CRUPT, String.valueOf(e5));
            } catch (SQLiteException e6) {
                c.d(b, "insertDownlinkMsgItem:".concat(String.valueOf(e6)));
                String message3 = e6.getMessage();
                if (TextUtils.isEmpty(message3) || !message3.contains("not an error") || !message3.contains("read/write mode")) {
                    return new d(ResultCodeEnum.ERROR, String.valueOf(e6));
                }
                c();
                return new d(ResultCodeEnum.DB_CRUPT, String.valueOf(e6));
            } catch (Exception e7) {
                c.d(b, "insertDownlinkMsgItem: ".concat(String.valueOf(e7)));
                return new d(ResultCodeEnum.ERROR, String.valueOf(e7));
            }
        }
        StringBuilder sb4 = new StringBuilder("string empty[biz:");
        sb4.append(aVar.c);
        sb4.append(",skey:");
        sb4.append(aVar.d);
        sb4.append("]");
        throw new Exception(sb4.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.alipay.mobile.rome.syncservice.sync.d.a b(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT userId,biz,sKey,pf,hm,md,sendNum,localTime,reserv1,reserv2,id FROM "
            r0.append(r2)
            java.lang.String r2 = "sync_dispatch"
            r0.append(r2)
            java.lang.String r3 = " WHERE id = "
            r0.append(r3)
            java.lang.String r3 = "( SELECT MIN(id) FROM "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " WHERE userId = ? AND biz = ? )"
            r0.append(r2)
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r18
            r3 = 1
            r2[r3] = r19
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a9, all -> 0x01a6 }
            android.database.Cursor r2 = r1.b(r0, r2)     // Catch:{ Exception -> 0x01a9, all -> 0x01a6 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x019d
            if (r2 != 0) goto L_0x0040
            r4 = 0
            goto L_0x0197
        L_0x0040:
            com.alipay.mobile.rome.syncservice.sync.d.a r0 = new com.alipay.mobile.rome.syncservice.sync.d.a     // Catch:{ Exception -> 0x01a4 }
            r0.<init>()     // Catch:{ Exception -> 0x01a4 }
            boolean r5 = r1.d     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r6 = "reserv2"
            java.lang.String r7 = "reserv1"
            java.lang.String r8 = "id"
            java.lang.String r9 = "localTime"
            java.lang.String r10 = "sendNum"
            java.lang.String r11 = "md"
            java.lang.String r12 = "hm"
            java.lang.String r13 = "sKey"
            java.lang.String r14 = "biz"
            java.lang.String r15 = "userId"
            if (r5 != 0) goto L_0x00e2
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r16 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x01a4 }
            r5.put(r15, r4)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r14)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r14, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r13)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r13, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r12)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r12, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r11)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r11, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r10)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r10, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r9)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r9, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r8, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r7)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r7, r5)     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.c     // Catch:{ Exception -> 0x01a4 }
            int r5 = r2.getColumnIndex(r6)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01a4 }
            r4.put(r6, r5)     // Catch:{ Exception -> 0x01a4 }
            r1.d = r3     // Catch:{ Exception -> 0x01a4 }
        L_0x00e2:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.b = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r14)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.c = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.d = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r12)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.e = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r11)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.f = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.g = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            long r3 = r2.getLong(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.h = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.i = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.j = r3     // Catch:{ Exception -> 0x01a4 }
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.c     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x01a4 }
            r0.k = r3     // Catch:{ Exception -> 0x01a4 }
            r4 = r0
        L_0x0197:
            if (r2 == 0) goto L_0x019c
            r2.close()
        L_0x019c:
            return r4
        L_0x019d:
            if (r2 == 0) goto L_0x01a2
        L_0x019f:
            r2.close()
        L_0x01a2:
            r2 = 0
            goto L_0x01c6
        L_0x01a4:
            r0 = move-exception
            goto L_0x01ab
        L_0x01a6:
            r0 = move-exception
            r4 = 0
            goto L_0x01c9
        L_0x01a9:
            r0 = move-exception
            r2 = 0
        L_0x01ab:
            java.lang.String r3 = b     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            java.lang.String r5 = "queryMsgByBiz: [ Exception="
            r4.<init>(r5)     // Catch:{ all -> 0x01c7 }
            r4.append(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = " ]"
            r4.append(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c7 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r0)     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x01a2
            goto L_0x019f
        L_0x01c6:
            return r2
        L_0x01c7:
            r0 = move-exception
            r4 = r2
        L_0x01c9:
            if (r4 == 0) goto L_0x01ce
            r4.close()
        L_0x01ce:
            goto L_0x01d0
        L_0x01cf:
            throw r0
        L_0x01d0:
            goto L_0x01cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.sync.b.a.a.b.b(java.lang.String, java.lang.String):com.alipay.mobile.rome.syncservice.sync.d.a");
    }

    private boolean a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT userId,biz,sKey FROM ");
        sb.append("sync_dispatch");
        sb.append(" WHERE userId = ? AND biz = ? AND sKey = ?");
        boolean z = false;
        String[] strArr = {str, str2, str3};
        Cursor cursor = null;
        try {
            Cursor b2 = b(sb.toString(), strArr);
            if (b2.getCount() > 0) {
                z = true;
            }
            if (b2 != null) {
                b2.close();
            }
            return z;
        } catch (Exception e) {
            String str4 = b;
            StringBuilder sb2 = new StringBuilder("hasMsgItem: [ Exception=");
            sb2.append(e);
            sb2.append(" ]");
            c.d(str4, sb2.toString());
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
