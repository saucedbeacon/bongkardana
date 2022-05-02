package com.ta.audid.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.j256.ormlite.field.FieldType;
import com.ta.audid.b.a.b;
import com.ta.audid.b.a.c;
import com.ta.audid.g.m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private c f9833a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, Boolean> f8825a = new HashMap<>();
    private HashMap<Class<?>, List<Field>> b = new HashMap<>();
    private String c;

    /* renamed from: c  reason: collision with other field name */
    private HashMap<Field, String> f8826c = new HashMap<>();
    private HashMap<Class<?>, String> d = new HashMap<>();

    public a(Context context, String str) {
        this.f9833a = new c(context, str);
        this.c = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r14v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<? extends com.ta.audid.b.b> find(java.lang.Class<? extends com.ta.audid.b.b> r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x013d }
            if (r12 != 0) goto L_0x0007
            monitor-exit(r11)
            return r0
        L_0x0007:
            java.lang.String r1 = r11.getTablename(r12)     // Catch:{ all -> 0x013d }
            android.database.sqlite.SQLiteDatabase r2 = r11.a(r12, r1)     // Catch:{ all -> 0x013d }
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r12 = "db is null"
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x013d }
            com.ta.audid.g.m.d(r12, r13)     // Catch:{ all -> 0x013d }
            monitor-exit(r11)
            return r0
        L_0x001b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            java.lang.String r5 = "SELECT * FROM "
            r4.<init>(r5)     // Catch:{ all -> 0x013d }
            r4.append(r1)     // Catch:{ all -> 0x013d }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x002e
            java.lang.String r13 = ""
            goto L_0x0038
        L_0x002e:
            java.lang.String r1 = " WHERE "
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r1.concat(r13)     // Catch:{ all -> 0x013d }
        L_0x0038:
            r4.append(r13)     // Catch:{ all -> 0x013d }
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x013d }
            if (r13 == 0) goto L_0x0044
            java.lang.String r13 = ""
            goto L_0x004e
        L_0x0044:
            java.lang.String r13 = " ORDER BY "
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r13.concat(r14)     // Catch:{ all -> 0x013d }
        L_0x004e:
            r4.append(r13)     // Catch:{ all -> 0x013d }
            if (r15 > 0) goto L_0x0056
            java.lang.String r13 = ""
            goto L_0x0060
        L_0x0056:
            java.lang.String r13 = " LIMIT "
            java.lang.String r14 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r13.concat(r14)     // Catch:{ all -> 0x013d }
        L_0x0060:
            r4.append(r13)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "DBMgr"
            r15 = 2
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "sql"
            r1[r3] = r4     // Catch:{ all -> 0x013d }
            r4 = 1
            r1[r4] = r13     // Catch:{ all -> 0x013d }
            com.ta.audid.g.m.d(r14, r1)     // Catch:{ all -> 0x013d }
            r14 = 0
            android.database.Cursor r14 = r2.rawQuery(r13, r14)     // Catch:{ all -> 0x0116 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0116 }
            r13.<init>()     // Catch:{ all -> 0x0116 }
            java.util.List r0 = r11.a((java.lang.Class<?>) r12)     // Catch:{ all -> 0x0113 }
        L_0x0085:
            if (r14 == 0) goto L_0x0108
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r12.newInstance()     // Catch:{ all -> 0x0113 }
            com.ta.audid.b.b r1 = (com.ta.audid.b.b) r1     // Catch:{ all -> 0x0113 }
            r5 = 0
        L_0x0094:
            int r6 = r0.size()     // Catch:{ all -> 0x0113 }
            if (r5 >= r6) goto L_0x0103
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch:{ all -> 0x0113 }
            java.lang.Class r7 = r6.getType()     // Catch:{ all -> 0x0113 }
            java.lang.String r8 = r11.a((java.lang.reflect.Field) r6)     // Catch:{ all -> 0x0113 }
            int r9 = r14.getColumnIndex(r8)     // Catch:{ all -> 0x0113 }
            r10 = -1
            if (r9 == r10) goto L_0x00ed
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            if (r7 == r8) goto L_0x00e1
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x0113 }
            if (r7 != r8) goto L_0x00b8
            goto L_0x00e1
        L_0x00b8:
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            if (r7 == r8) goto L_0x00d8
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0113 }
            if (r7 != r8) goto L_0x00c1
            goto L_0x00d8
        L_0x00c1:
            java.lang.Class r8 = java.lang.Double.TYPE     // Catch:{ all -> 0x0113 }
            if (r7 == r8) goto L_0x00cf
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            if (r7 != r8) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r7 = r14.getString(r9)     // Catch:{ all -> 0x0113 }
            goto L_0x00e9
        L_0x00cf:
            double r7 = r14.getDouble(r9)     // Catch:{ all -> 0x0113 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x00e9
        L_0x00d8:
            int r7 = r14.getInt(r9)     // Catch:{ all -> 0x0113 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x00e9
        L_0x00e1:
            long r7 = r14.getLong(r9)     // Catch:{ all -> 0x0113 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0113 }
        L_0x00e9:
            r6.set(r1, r7)     // Catch:{ Exception -> 0x0100 }
            goto L_0x0100
        L_0x00ed:
            java.lang.String r6 = "DBMgr"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0113 }
            java.lang.String r9 = "can not get field: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0113 }
            java.lang.String r8 = r9.concat(r8)     // Catch:{ all -> 0x0113 }
            r7[r3] = r8     // Catch:{ all -> 0x0113 }
            com.ta.audid.g.m.w(r6, r7)     // Catch:{ all -> 0x0113 }
        L_0x0100:
            int r5 = r5 + 1
            goto L_0x0094
        L_0x0103:
            r13.add(r1)     // Catch:{ all -> 0x0113 }
            goto L_0x0085
        L_0x0108:
            com.ta.audid.b.c r12 = r11.f9833a     // Catch:{ all -> 0x013d }
            r12.closeCursor(r14)     // Catch:{ all -> 0x013d }
            com.ta.audid.b.c r12 = r11.f9833a     // Catch:{ all -> 0x013d }
            r12.closeWritableDatabase(r2)     // Catch:{ all -> 0x013d }
            goto L_0x012f
        L_0x0113:
            r12 = move-exception
            r0 = r13
            goto L_0x0117
        L_0x0116:
            r12 = move-exception
        L_0x0117:
            java.lang.String r13 = "DBMgr"
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = "[get]"
            r15[r3] = r1     // Catch:{ all -> 0x0131 }
            r15[r4] = r12     // Catch:{ all -> 0x0131 }
            com.ta.audid.g.m.w(r13, r15)     // Catch:{ all -> 0x0131 }
            com.ta.audid.b.c r12 = r11.f9833a     // Catch:{ all -> 0x013d }
            r12.closeCursor(r14)     // Catch:{ all -> 0x013d }
            com.ta.audid.b.c r12 = r11.f9833a     // Catch:{ all -> 0x013d }
            r12.closeWritableDatabase(r2)     // Catch:{ all -> 0x013d }
            r13 = r0
        L_0x012f:
            monitor-exit(r11)
            return r13
        L_0x0131:
            r12 = move-exception
            com.ta.audid.b.c r13 = r11.f9833a     // Catch:{ all -> 0x013d }
            r13.closeCursor(r14)     // Catch:{ all -> 0x013d }
            com.ta.audid.b.c r13 = r11.f9833a     // Catch:{ all -> 0x013d }
            r13.closeWritableDatabase(r2)     // Catch:{ all -> 0x013d }
            throw r12     // Catch:{ all -> 0x013d }
        L_0x013d:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0141
        L_0x0140:
            throw r12
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.a.find(java.lang.Class, java.lang.String, java.lang.String, int):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:49|50|51|52|53|54|55|56|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:12|13|(8:16|(6:19|20|21|(2:23|74)(2:24|75)|29|17)|72|30|(2:32|(1:34)(1:35))(1:36)|37|38|14)|39|40|41|42|43|44|45|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:47|48|49|50|51|52|53|54|55|56|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:59|60|61|62|63|64|65|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0153, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x011d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0120 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0146 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0149 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0120=Splitter:B:43:0x0120, B:64:0x0149=Splitter:B:64:0x0149, B:55:0x013b=Splitter:B:55:0x013b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insert(java.util.List<? extends com.ta.audid.b.b> r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            monitor-enter(r19)
            if (r2 == 0) goto L_0x0152
            int r0 = r20.size()     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x000f
            goto L_0x0152
        L_0x000f:
            r3 = 0
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x014f }
            com.ta.audid.b.b r0 = (com.ta.audid.b.b) r0     // Catch:{ all -> 0x014f }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x014f }
            java.lang.String r4 = r1.getTablename(r0)     // Catch:{ all -> 0x014f }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x014f }
            com.ta.audid.b.b r0 = (com.ta.audid.b.b) r0     // Catch:{ all -> 0x014f }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x014f }
            android.database.sqlite.SQLiteDatabase r5 = r1.a(r0, r4)     // Catch:{ all -> 0x014f }
            r6 = 1
            if (r5 != 0) goto L_0x003c
            java.lang.String r0 = "DBMgr"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x014f }
            java.lang.String r4 = "can not get available db"
            r2[r3] = r4     // Catch:{ all -> 0x014f }
            com.ta.audid.g.m.w(r0, r2)     // Catch:{ all -> 0x014f }
            monitor-exit(r19)
            return
        L_0x003c:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0127 }
            com.ta.audid.b.b r0 = (com.ta.audid.b.b) r0     // Catch:{ all -> 0x0127 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0127 }
            java.util.List r7 = r1.a((java.lang.Class<?>) r0)     // Catch:{ all -> 0x0127 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0127 }
            r8.<init>()     // Catch:{ all -> 0x0127 }
            r5.beginTransaction()     // Catch:{ all -> 0x0127 }
            r9 = 0
        L_0x0053:
            int r0 = r20.size()     // Catch:{ all -> 0x0127 }
            if (r9 >= r0) goto L_0x011a
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x0127 }
            r10 = r0
            com.ta.audid.b.b r10 = (com.ta.audid.b.b) r10     // Catch:{ all -> 0x0127 }
            r11 = 0
        L_0x0061:
            int r0 = r7.size()     // Catch:{ all -> 0x0127 }
            r12 = 2
            if (r11 >= r0) goto L_0x0097
            java.lang.Object r0 = r7.get(r11)     // Catch:{ all -> 0x0127 }
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch:{ all -> 0x0127 }
            java.lang.String r13 = r1.a((java.lang.reflect.Field) r0)     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x0086 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0086 }
            r8.put(r13, r0)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0094
        L_0x0080:
            java.lang.String r0 = ""
            r8.put(r13, r0)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0094
        L_0x0086:
            r0 = move-exception
            java.lang.String r13 = "DBMgr"
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "get field failed"
            r12[r3] = r14     // Catch:{ all -> 0x0127 }
            r12[r6] = r0     // Catch:{ all -> 0x0127 }
            com.ta.audid.g.m.w(r13, r12)     // Catch:{ all -> 0x0127 }
        L_0x0094:
            int r11 = r11 + 1
            goto L_0x0061
        L_0x0097:
            long r13 = r10._id     // Catch:{ all -> 0x0127 }
            r15 = -1
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "_id"
            r8.remove(r0)     // Catch:{ all -> 0x0127 }
            r0 = 0
            long r13 = r5.insert(r4, r0, r8)     // Catch:{ all -> 0x0127 }
            r11 = 4
            r17 = 3
            r0 = 6
            int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r18 == 0) goto L_0x00d1
            r10._id = r13     // Catch:{ all -> 0x0127 }
            java.lang.String r13 = "DBMgr"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "mDbName"
            r0[r3] = r14     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = r1.c     // Catch:{ all -> 0x0127 }
            r0[r6] = r14     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "tablename"
            r0[r12] = r14     // Catch:{ all -> 0x0127 }
            r0[r17] = r4     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = "insert:success"
            r0[r11] = r12     // Catch:{ all -> 0x0127 }
            r11 = 5
            r0[r11] = r10     // Catch:{ all -> 0x0127 }
            com.ta.audid.g.m.d(r13, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0113
        L_0x00d1:
            java.lang.String r13 = "DBMgr"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "mDbName"
            r0[r3] = r14     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = r1.c     // Catch:{ all -> 0x0127 }
            r0[r6] = r14     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "tablename"
            r0[r12] = r14     // Catch:{ all -> 0x0127 }
            r0[r17] = r4     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = "insert:error"
            r0[r11] = r12     // Catch:{ all -> 0x0127 }
            r11 = 5
            r0[r11] = r10     // Catch:{ all -> 0x0127 }
            com.ta.audid.g.m.w(r13, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0113
        L_0x00ef:
            java.lang.String r0 = "_id=?"
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ all -> 0x0127 }
            long r12 = r10._id     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0127 }
            r11[r3] = r10     // Catch:{ all -> 0x0127 }
            int r0 = r5.update(r4, r8, r0, r11)     // Catch:{ all -> 0x0127 }
            long r10 = (long) r0     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "DBMgr"
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0127 }
            java.lang.String r13 = "db update :"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = r13.concat(r10)     // Catch:{ all -> 0x0127 }
            r12[r3] = r10     // Catch:{ all -> 0x0127 }
            com.ta.audid.g.m.w(r0, r12)     // Catch:{ all -> 0x0127 }
        L_0x0113:
            r8.clear()     // Catch:{ all -> 0x0127 }
            int r9 = r9 + 1
            goto L_0x0053
        L_0x011a:
            r5.setTransactionSuccessful()     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            r5.endTransaction()     // Catch:{ Exception -> 0x0120 }
        L_0x0120:
            com.ta.audid.b.c r0 = r1.f9833a     // Catch:{ all -> 0x014f }
            r0.closeWritableDatabase(r5)     // Catch:{ all -> 0x014f }
            monitor-exit(r19)
            return
        L_0x0127:
            r0 = move-exception
            java.lang.String r2 = "DBMgr"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0142 }
            r4[r3] = r0     // Catch:{ all -> 0x0142 }
            com.ta.audid.g.m.d(r2, r4)     // Catch:{ all -> 0x0142 }
            r5.setTransactionSuccessful()     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r5.endTransaction()     // Catch:{ Exception -> 0x013b }
        L_0x013b:
            com.ta.audid.b.c r0 = r1.f9833a     // Catch:{ all -> 0x014f }
            r0.closeWritableDatabase(r5)     // Catch:{ all -> 0x014f }
            monitor-exit(r19)
            return
        L_0x0142:
            r0 = move-exception
            r5.setTransactionSuccessful()     // Catch:{ Exception -> 0x0146 }
        L_0x0146:
            r5.endTransaction()     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            com.ta.audid.b.c r2 = r1.f9833a     // Catch:{ all -> 0x014f }
            r2.closeWritableDatabase(r5)     // Catch:{ all -> 0x014f }
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x0152:
            monitor-exit(r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.a.insert(java.util.List):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:14|15|(4:18|(2:20|57)(2:21|56)|22|16)|23|24|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ff */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00d5=Splitter:B:27:0x00d5, B:38:0x00ef=Splitter:B:38:0x00ef, B:48:0x00ff=Splitter:B:48:0x00ff} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int delete(java.util.List<? extends com.ta.audid.b.b> r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            monitor-enter(r17)
            r3 = 0
            if (r2 == 0) goto L_0x0108
            int r0 = r18.size()     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0108
        L_0x0010:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0105 }
            com.ta.audid.b.b r0 = (com.ta.audid.b.b) r0     // Catch:{ all -> 0x0105 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r1.getTablename(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0105 }
            com.ta.audid.b.b r4 = (com.ta.audid.b.b) r4     // Catch:{ all -> 0x0105 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0105 }
            android.database.sqlite.SQLiteDatabase r4 = r1.a(r4, r0)     // Catch:{ all -> 0x0105 }
            r5 = 1
            if (r4 != 0) goto L_0x003c
            java.lang.String r0 = "DBMgr"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0105 }
            java.lang.String r4 = "db is null"
            r2[r3] = r4     // Catch:{ all -> 0x0105 }
            com.ta.audid.g.m.d(r0, r2)     // Catch:{ all -> 0x0105 }
            monitor-exit(r17)
            return r3
        L_0x003c:
            r6 = 2
            r4.beginTransaction()     // Catch:{ all -> 0x00db }
            r7 = 0
        L_0x0041:
            int r8 = r18.size()     // Catch:{ all -> 0x00db }
            if (r7 >= r8) goto L_0x00cf
            java.lang.String r8 = "_id=?"
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch:{ all -> 0x00db }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r10.<init>()     // Catch:{ all -> 0x00db }
            java.lang.Object r11 = r2.get(r7)     // Catch:{ all -> 0x00db }
            com.ta.audid.b.b r11 = (com.ta.audid.b.b) r11     // Catch:{ all -> 0x00db }
            long r11 = r11._id     // Catch:{ all -> 0x00db }
            r10.append(r11)     // Catch:{ all -> 0x00db }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00db }
            r9[r3] = r10     // Catch:{ all -> 0x00db }
            int r8 = r4.delete(r0, r8, r9)     // Catch:{ all -> 0x00db }
            long r8 = (long) r8     // Catch:{ all -> 0x00db }
            r10 = 0
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 6
            int r16 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r16 > 0) goto L_0x0099
            java.lang.String r8 = "DBMgr"
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x00db }
            java.lang.String r10 = "db"
            r9[r3] = r10     // Catch:{ all -> 0x00db }
            java.lang.String r10 = r1.c     // Catch:{ all -> 0x00db }
            r9[r5] = r10     // Catch:{ all -> 0x00db }
            java.lang.String r10 = "tableName"
            r9[r6] = r10     // Catch:{ all -> 0x00db }
            r9[r14] = r0     // Catch:{ all -> 0x00db }
            java.lang.String r10 = " delete failed _id"
            r9[r13] = r10     // Catch:{ all -> 0x00db }
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x00db }
            com.ta.audid.b.b r10 = (com.ta.audid.b.b) r10     // Catch:{ all -> 0x00db }
            long r10 = r10._id     // Catch:{ all -> 0x00db }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00db }
            r9[r12] = r10     // Catch:{ all -> 0x00db }
            com.ta.audid.g.m.w(r8, r9)     // Catch:{ all -> 0x00db }
            goto L_0x00cb
        L_0x0099:
            java.lang.String r8 = "DBMgr"
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x00db }
            java.lang.String r10 = "db "
            r9[r3] = r10     // Catch:{ all -> 0x00db }
            java.lang.String r10 = r1.c     // Catch:{ all -> 0x00db }
            r9[r5] = r10     // Catch:{ all -> 0x00db }
            java.lang.String r10 = "tableName"
            r9[r6] = r10     // Catch:{ all -> 0x00db }
            r9[r14] = r0     // Catch:{ all -> 0x00db }
            java.lang.String r10 = "delete success _id"
            r9[r13] = r10     // Catch:{ all -> 0x00db }
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x00db }
            com.ta.audid.b.b r10 = (com.ta.audid.b.b) r10     // Catch:{ all -> 0x00db }
            long r10 = r10._id     // Catch:{ all -> 0x00db }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00db }
            r9[r12] = r10     // Catch:{ all -> 0x00db }
            com.ta.audid.g.m.d(r8, r9)     // Catch:{ all -> 0x00db }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ all -> 0x00db }
            com.ta.audid.b.b r8 = (com.ta.audid.b.b) r8     // Catch:{ all -> 0x00db }
            r9 = -1
            r8._id = r9     // Catch:{ all -> 0x00db }
        L_0x00cb:
            int r7 = r7 + 1
            goto L_0x0041
        L_0x00cf:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r4.endTransaction()     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            com.ta.audid.b.c r0 = r1.f9833a     // Catch:{ all -> 0x0105 }
        L_0x00d7:
            r0.closeWritableDatabase(r4)     // Catch:{ all -> 0x0105 }
            goto L_0x00f2
        L_0x00db:
            r0 = move-exception
            java.lang.String r7 = "DBMgr"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00f8 }
            java.lang.String r8 = "db delete error:"
            r6[r3] = r8     // Catch:{ all -> 0x00f8 }
            r6[r5] = r0     // Catch:{ all -> 0x00f8 }
            com.ta.audid.g.m.w(r7, r6)     // Catch:{ all -> 0x00f8 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r4.endTransaction()     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            com.ta.audid.b.c r0 = r1.f9833a     // Catch:{ all -> 0x0105 }
            goto L_0x00d7
        L_0x00f2:
            int r0 = r18.size()     // Catch:{ all -> 0x0105 }
            monitor-exit(r17)
            return r0
        L_0x00f8:
            r0 = move-exception
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r4.endTransaction()     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            com.ta.audid.b.c r2 = r1.f9833a     // Catch:{ all -> 0x0105 }
            r2.closeWritableDatabase(r4)     // Catch:{ all -> 0x0105 }
            throw r0     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        L_0x0108:
            monitor-exit(r17)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.a.delete(java.util.List):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int delete(java.lang.Class<? extends com.ta.audid.b.b> r6, java.lang.String r7, java.lang.String[] r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "whereArgs"
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x004f }
            r2 = 1
            r1[r2] = r8     // Catch:{ all -> 0x004f }
            r2 = 2
            java.lang.String r4 = ""
            r1[r2] = r4     // Catch:{ all -> 0x004f }
            r2 = 3
            java.lang.String r4 = "whereArgs"
            r1[r2] = r4     // Catch:{ all -> 0x004f }
            r2 = 4
            r1[r2] = r8     // Catch:{ all -> 0x004f }
            com.ta.audid.g.m.d(r0, r1)     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x004d
            java.lang.String r0 = r5.getTablename(r6)     // Catch:{ all -> 0x004f }
            android.database.sqlite.SQLiteDatabase r0 = r5.a(r6, r0)     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x002d
            monitor-exit(r5)
            return r3
        L_0x002d:
            java.lang.String r6 = r5.getTablename(r6)     // Catch:{ all -> 0x003b }
            int r3 = r0.delete(r6, r7, r8)     // Catch:{ all -> 0x003b }
            com.ta.audid.b.c r6 = r5.f9833a     // Catch:{ all -> 0x004f }
        L_0x0037:
            r6.closeWritableDatabase(r0)     // Catch:{ all -> 0x004f }
            goto L_0x004d
        L_0x003b:
            r6 = move-exception
            java.lang.String r7 = "DBMgr"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x0046 }
            com.ta.audid.g.m.w(r7, r6, r8)     // Catch:{ all -> 0x0046 }
            com.ta.audid.b.c r6 = r5.f9833a     // Catch:{ all -> 0x004f }
            goto L_0x0037
        L_0x0046:
            r6 = move-exception
            com.ta.audid.b.c r7 = r5.f9833a     // Catch:{ all -> 0x004f }
            r7.closeWritableDatabase(r0)     // Catch:{ all -> 0x004f }
            throw r6     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r5)
            return r3
        L_0x004f:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0053
        L_0x0052:
            throw r6
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.a.delete(java.lang.Class, java.lang.String, java.lang.String[]):int");
    }

    public String getTablename(Class<?> cls) {
        String str;
        if (cls == null) {
            return null;
        }
        if (this.d.containsKey(cls)) {
            return this.d.get(cls);
        }
        c cVar = (c) cls.getAnnotation(c.class);
        if (cVar == null || TextUtils.isEmpty(cVar.value())) {
            str = cls.getName().replace(".", "_");
        } else {
            str = cVar.value();
        }
        this.d.put(cls, str);
        return str;
    }

    private SQLiteDatabase a(Class<? extends b> cls, String str) {
        SQLiteDatabase writableDatabase = this.f9833a.getWritableDatabase();
        Boolean bool = Boolean.TRUE;
        if (this.f8825a.get(str) == null || !this.f8825a.get(str).booleanValue()) {
            bool = Boolean.FALSE;
        }
        if (cls != null && !bool.booleanValue()) {
            List a2 = a((Class<?>) cls);
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder(" SELECT * FROM ");
            sb.append(str);
            sb.append(" LIMIT 0");
            String obj = sb.toString();
            int i = 0;
            if (a2 != null) {
                Cursor cursor = null;
                int i2 = 1;
                try {
                    cursor = writableDatabase.rawQuery(obj, (String[]) null);
                } catch (Exception unused) {
                    m.d("DBMgr", "has not create talbe:", str);
                }
                if (cursor != null) {
                    i2 = 0;
                }
                while (i < a2.size()) {
                    Field field = (Field) a2.get(i);
                    if (!FieldType.FOREIGN_ID_FIELD_SUFFIX.equalsIgnoreCase(a(field)) && (i2 != 0 || (cursor != null && cursor.getColumnIndex(a(field)) == -1))) {
                        arrayList.add(field);
                    }
                    i++;
                }
                this.f9833a.closeCursor(cursor);
                i = i2;
            }
            if (i != 0) {
                b(writableDatabase, str, arrayList);
            } else if (arrayList.size() > 0) {
                a(writableDatabase, str, arrayList);
            }
            this.f8825a.put(str, Boolean.TRUE);
        }
        return writableDatabase;
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(str);
        sb.append(" ADD COLUMN ");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb2.append(obj);
            sb2.append(a(arrayList.get(i)));
            sb2.append(" ");
            sb2.append(a(arrayList.get(i).getType()));
            String obj2 = sb2.toString();
            try {
                sQLiteDatabase.execSQL(obj2);
            } catch (Exception e) {
                m.w("DBMgr", "update db error...", e);
            }
            sb2.delete(0, obj2.length());
            m.d("DBMgr", null, "excute sql:", obj2);
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(str);
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT ,");
        sb.append(sb2.toString());
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                Class<?> type = arrayList.get(i).getType();
                sb.append(" ");
                sb.append(a(arrayList.get(i)));
                sb.append(" ");
                sb.append(a(type));
                sb.append(" ");
                sb.append(b(type));
            }
        }
        sb.append(" );");
        String obj = sb.toString();
        m.d("DBMgr", "excute sql:", obj);
        try {
            sQLiteDatabase.execSQL(obj);
        } catch (Exception e) {
            m.w("DBMgr", "create db error", e);
        }
    }

    private String a(Class<?> cls) {
        return (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) ? "INTEGER" : SecurityConstants.KEY_DISPLAY_TYPE_TEXT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int count(java.lang.Class<? extends com.ta.audid.b.b> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L_0x0006
            monitor-exit(r4)
            return r0
        L_0x0006:
            java.lang.String r1 = r4.getTablename(r5)     // Catch:{ all -> 0x0049 }
            android.database.sqlite.SQLiteDatabase r5 = r4.a(r5, r1)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x003b
            r2 = 0
            java.lang.String r3 = "SELECT count(*) FROM "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x0033 }
            android.database.Cursor r2 = r5.rawQuery(r1, r2)     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0028
            r2.moveToFirst()     // Catch:{ all -> 0x0033 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0033 }
        L_0x0028:
            com.ta.audid.b.c r1 = r4.f9833a     // Catch:{ all -> 0x0049 }
            r1.closeCursor(r2)     // Catch:{ all -> 0x0049 }
            com.ta.audid.b.c r1 = r4.f9833a     // Catch:{ all -> 0x0049 }
        L_0x002f:
            r1.closeWritableDatabase(r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0033:
            com.ta.audid.b.c r1 = r4.f9833a     // Catch:{ all -> 0x0049 }
            r1.closeCursor(r2)     // Catch:{ all -> 0x0049 }
            com.ta.audid.b.c r1 = r4.f9833a     // Catch:{ all -> 0x0049 }
            goto L_0x002f
        L_0x003b:
            java.lang.String r5 = "DBMgr"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "db is null"
            r1[r0] = r2     // Catch:{ all -> 0x0049 }
            com.ta.audid.g.m.d(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)
            return r0
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x004d
        L_0x004c:
            throw r5
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.a.count(java.lang.Class):int");
    }

    /* renamed from: a  reason: collision with other method in class */
    private List<Field> m1318a(Class cls) {
        if (this.b.containsKey(cls)) {
            return this.b.get(cls);
        }
        List<Field> emptyList = Collections.emptyList();
        if (cls != null) {
            emptyList = new ArrayList<>();
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.getAnnotation(b.class) == null && !field.isSynthetic()) {
                    field.setAccessible(true);
                    emptyList.add(field);
                }
            }
            if (!(cls.getSuperclass() == null || cls.getSuperclass() == Object.class)) {
                emptyList.addAll(a((Class<?>) cls.getSuperclass()));
            }
            this.b.put(cls, emptyList);
        }
        return emptyList;
    }

    private String a(Field field) {
        String str;
        if (this.f8826c.containsKey(field)) {
            return this.f8826c.get(field);
        }
        com.ta.audid.b.a.a aVar = (com.ta.audid.b.a.a) field.getAnnotation(com.ta.audid.b.a.a.class);
        if (aVar == null || TextUtils.isEmpty(aVar.value())) {
            str = field.getName();
        } else {
            str = aVar.value();
        }
        this.f8826c.put(field, str);
        return str;
    }

    private String b(Class cls) {
        return (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) ? "default 0" : "default \"\"";
    }
}
