package com.alipay.mobile.rome.syncservice.sync.b.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.text.TextUtils;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncUpMessage;
import com.alipay.mobile.rome.syncservice.sync.d.b;
import com.alipay.mobile.rome.syncservice.up.SyncUplinkCallbackType;
import com.iap.ac.android.gol.google.GolGoogleAuthActivity;
import com.j256.ormlite.field.FieldType;

public class c extends a {
    public static final String b = c.class.getSimpleName();
    private static final String[] c = {FieldType.FOREIGN_ID_FIELD_SUFFIX, "userId", "biz", "dateTime", "sendTime", GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT, "random", "payload", "payloadPb", "sendStatus", GolGoogleAuthActivity.URL_PARAM_NEED_CALLBACK, "bizId"};

    /* access modifiers changed from: protected */
    public final String b() {
        return "syncUplink";
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS syncUplink ( _id INTEGER PRIMARY KEY AUTOINCREMENT, userId TEXT NOT NULL, biz TEXT NOT NULL, dateTime INTEGER NOT NULL, sendTime INTEGER, expireTime INTEGER, random INTEGER, payload TEXT, payloadPb BLOB, sendStatus INTEGER, needCallback INTEGER, bizId TEXT, reserve1 TEXT, reserve2 TEXT, reserve3 TEXT )");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS syncUplink_idx ON syncUplink( userId, _id, dateTime, random )");
        } catch (SQLException e) {
            String str = b;
            StringBuilder sb = new StringBuilder("excuteCreateTable:[ SQLException=");
            sb.append(e);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str, sb.toString());
            throw e;
        }
    }

    public final long a(String str, int i, long j, SyncUpMessage syncUpMessage, SyncUplinkCallbackType syncUplinkCallbackType) {
        String str2 = b;
        StringBuilder sb = new StringBuilder("insertMessage: userId=");
        sb.append(str);
        sb.append(", syncUpMessage=");
        sb.append(syncUpMessage);
        com.alipay.mobile.rome.syncsdk.util.c.a(str2, sb.toString());
        if (syncUpMessage == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("userId", str);
            contentValues.put("biz", syncUpMessage.biz);
            contentValues.put("sendTime", Long.valueOf(syncUpMessage.sendTime));
            contentValues.put(GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT, Long.valueOf(syncUpMessage.expireTime));
            contentValues.put("payload", syncUpMessage.msgData);
            contentValues.put("payloadPb", syncUpMessage.msgData_pb);
            contentValues.put("random", Integer.valueOf(i));
            contentValues.put("dateTime", Long.valueOf(j));
            contentValues.put(GolGoogleAuthActivity.URL_PARAM_NEED_CALLBACK, Integer.valueOf(syncUplinkCallbackType.ordinal()));
            contentValues.put("bizId", syncUpMessage.bizId);
            return a(contentValues);
        } catch (SQLiteDiskIOException e) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b, "insertMessage:".concat(String.valueOf(e)));
            a();
            return -4;
        } catch (SQLiteDatabaseCorruptException e2) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b, "insertMessage:".concat(String.valueOf(e2)));
            a();
            return -4;
        } catch (SQLiteReadOnlyDatabaseException e3) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b, "insertMessage:".concat(String.valueOf(e3)));
            String message = e3.getMessage();
            if (TextUtils.isEmpty(message) || !message.contains("1032")) {
                return -1;
            }
            a();
            return -4;
        } catch (SQLiteCantOpenDatabaseException e4) {
            String message2 = e4.getMessage();
            if (TextUtils.isEmpty(message2) || !message2.contains("14")) {
                return -1;
            }
            c();
            return -4;
        } catch (SQLiteException e5) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b, "insertMessage:".concat(String.valueOf(e5)));
            String message3 = e5.getMessage();
            if (TextUtils.isEmpty(message3) || !message3.contains("not an error") || !message3.contains("read/write mode")) {
                return -1;
            }
            c();
            return -4;
        } catch (Exception e6) {
            String str3 = b;
            StringBuilder sb2 = new StringBuilder("insertMessage: [Exception=");
            sb2.append(e6);
            sb2.append("]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str3, sb2.toString());
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b> b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = b
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "queryAllMsg: userId="
            java.lang.String r1 = r2.concat(r1)
            com.alipay.mobile.rome.syncsdk.util.c.a(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String[] r2 = c     // Catch:{ Exception -> 0x003a }
            java.lang.String r3 = "userId=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x003a }
            r5 = 0
            r4[r5] = r7     // Catch:{ Exception -> 0x003a }
            android.database.Cursor r1 = r6.a((java.lang.String[]) r2, (java.lang.String) r3, (java.lang.String[]) r4)     // Catch:{ Exception -> 0x003a }
        L_0x0024:
            boolean r7 = r1.moveToNext()     // Catch:{ Exception -> 0x003a }
            if (r7 == 0) goto L_0x0032
            com.alipay.mobile.rome.syncservice.sync.d.b r7 = a(r1)     // Catch:{ Exception -> 0x003a }
            r0.add(r7)     // Catch:{ Exception -> 0x003a }
            goto L_0x0024
        L_0x0032:
            if (r1 == 0) goto L_0x0056
        L_0x0034:
            r1.close()
            goto L_0x0056
        L_0x0038:
            r7 = move-exception
            goto L_0x0057
        L_0x003a:
            r7 = move-exception
            java.lang.String r2 = b     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "queryAllMsg: [ Exception="
            r3.<init>(r4)     // Catch:{ all -> 0x0038 }
            r3.append(r7)     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = " ]"
            r3.append(r7)     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0038 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r2, r7)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0056
            goto L_0x0034
        L_0x0056:
            return r0
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            r1.close()
        L_0x005c:
            goto L_0x005e
        L_0x005d:
            throw r7
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.sync.b.a.a.c.b(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (r1 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004d, code lost:
        if (r1 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b> a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "queryMsgByStatus: uid="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = ",biz="
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ",sendStatus=1"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.rome.syncsdk.util.c.a(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String[] r2 = c     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "userId=? AND biz=? AND sendStatus=?"
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0052 }
            r5 = 0
            r4[r5] = r7     // Catch:{ Exception -> 0x0052 }
            r7 = 1
            r4[r7] = r8     // Catch:{ Exception -> 0x0052 }
            r8 = 2
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Exception -> 0x0052 }
            r4[r8] = r7     // Catch:{ Exception -> 0x0052 }
            android.database.Cursor r1 = r6.a((java.lang.String[]) r2, (java.lang.String) r3, (java.lang.String[]) r4)     // Catch:{ Exception -> 0x0052 }
        L_0x003f:
            boolean r7 = r1.moveToNext()     // Catch:{ Exception -> 0x0052 }
            if (r7 == 0) goto L_0x004d
            com.alipay.mobile.rome.syncservice.sync.d.b r7 = a(r1)     // Catch:{ Exception -> 0x0052 }
            r0.add(r7)     // Catch:{ Exception -> 0x0052 }
            goto L_0x003f
        L_0x004d:
            if (r1 == 0) goto L_0x0070
            goto L_0x006d
        L_0x0050:
            r7 = move-exception
            goto L_0x0071
        L_0x0052:
            r7 = move-exception
            java.lang.String r8 = b     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "queryMsgByStatus: [ Exception="
            r2.<init>(r3)     // Catch:{ all -> 0x0050 }
            r2.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = " ]"
            r2.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0050 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r8, r7)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0070
        L_0x006d:
            r1.close()
        L_0x0070:
            return r0
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            goto L_0x0078
        L_0x0077:
            throw r7
        L_0x0078:
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.sync.b.a.a.c.a(java.lang.String, java.lang.String):java.util.List");
    }

    private static b a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        b bVar = new b();
        bVar.f9495a = (long) cursor.getInt(0);
        bVar.c = cursor.getString(1);
        bVar.biz = cursor.getString(2);
        bVar.e = cursor.getLong(3);
        bVar.sendTime = cursor.getLong(4);
        bVar.expireTime = cursor.getLong(5);
        bVar.d = cursor.getInt(6);
        bVar.msgData = cursor.getString(7);
        bVar.msgData_pb = cursor.getBlob(8);
        bVar.f = cursor.getInt(9);
        bVar.h = SyncUplinkCallbackType.toType(cursor.getInt(10));
        bVar.bizId = cursor.getString(11);
        if (bVar.sendTime > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > bVar.e + bVar.sendTime && currentTimeMillis < bVar.e + bVar.expireTime) {
                bVar.g = true;
            }
        } else {
            bVar.g = true;
        }
        bVar.b = com.alipay.mobile.rome.syncservice.up.b.a(bVar.f9495a, bVar.e, bVar.d);
        return bVar;
    }

    public final long a(String str, long j, long j2, int i) {
        int i2;
        String str2 = b;
        StringBuilder sb = new StringBuilder("updateSendStatus: userId=");
        sb.append(str);
        sb.append(",dateTime=");
        sb.append(j2);
        com.alipay.mobile.rome.syncsdk.util.c.a(str2, sb.toString());
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendStatus", 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("userId");
            sb2.append("=? AND ");
            sb2.append(FieldType.FOREIGN_ID_FIELD_SUFFIX);
            sb2.append("=? AND ");
            sb2.append("dateTime");
            sb2.append("=? AND ");
            sb2.append("random");
            sb2.append("=?");
            i2 = a(contentValues, sb2.toString(), new String[]{str, Long.toString(j), Long.toString(j2), Long.toString((long) i)});
        } catch (Exception e) {
            String str3 = b;
            StringBuilder sb3 = new StringBuilder("updateSendStatus: [Exception=");
            sb3.append(e);
            sb3.append("]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str3, sb3.toString());
            i2 = -1;
        }
        return (long) i2;
    }

    public final long b(String str, long j, long j2, int i) {
        int i2;
        String str2 = b;
        StringBuilder sb = new StringBuilder("deleteMsg: userId=");
        sb.append(str);
        sb.append(",dateTime=");
        sb.append(j2);
        com.alipay.mobile.rome.syncsdk.util.c.a(str2, sb.toString());
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("userId");
            sb2.append("=? AND ");
            sb2.append(FieldType.FOREIGN_ID_FIELD_SUFFIX);
            sb2.append("=? AND ");
            sb2.append("dateTime");
            sb2.append("=? AND ");
            sb2.append("random");
            sb2.append("=?");
            i2 = a(sb2.toString(), new String[]{str, Long.toString(j), Long.toString(j2), Integer.toString(i)});
        } catch (Exception e) {
            String str3 = b;
            StringBuilder sb3 = new StringBuilder("deleteMsg: [Exception=");
            sb3.append(e);
            sb3.append("]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str3, sb3.toString());
            i2 = -1;
        }
        return (long) i2;
    }

    public final long a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b, "deleteMsgByBizId : entityId or biz is empty");
            return -1;
        }
        String str4 = b;
        StringBuilder sb = new StringBuilder("deleteMsgByBizId: biz=");
        sb.append(str2);
        sb.append(", bizId=");
        sb.append(str3);
        com.alipay.mobile.rome.syncsdk.util.c.a(str4, sb.toString());
        int i = -1;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("userId");
            sb2.append("=? AND ");
            sb2.append("biz");
            sb2.append("=? AND ");
            sb2.append("bizId");
            sb2.append("=?");
            i = a(sb2.toString(), new String[]{str, str2, str3});
        } catch (Exception e) {
            String str5 = b;
            StringBuilder sb3 = new StringBuilder("deleteMsgByBizId: [Exception=");
            sb3.append(e);
            sb3.append("]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str5, sb3.toString());
        }
        return (long) i;
    }
}
