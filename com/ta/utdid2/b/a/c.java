package com.ta.utdid2.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ta.utdid2.a.a.e;
import com.ta.utdid2.b.a.b;
import java.io.File;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences.Editor f9852a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f8843a;

    /* renamed from: a  reason: collision with other field name */
    private b.a f8844a;

    /* renamed from: a  reason: collision with other field name */
    private b f8845a;

    /* renamed from: a  reason: collision with other field name */
    private d f8846a;
    private String l = "";

    /* renamed from: l  reason: collision with other field name */
    private boolean f8847l = false;
    private String m = "";

    /* renamed from: m  reason: collision with other field name */
    private boolean f8848m = false;
    private Context mContext;
    private boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9853o;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[SYNTHETIC, Splitter:B:25:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = ""
            r9.l = r0
            r9.m = r0
            r0 = 0
            r9.f8847l = r0
            r9.f8848m = r0
            r9.n = r0
            r1 = 0
            r9.f8843a = r1
            r9.f8845a = r1
            r9.f9852a = r1
            r9.f8844a = r1
            r9.mContext = r1
            r9.f8846a = r1
            r9.f9853o = r0
            r9.f8847l = r13
            r9.f9853o = r14
            r9.l = r12
            r9.m = r11
            r9.mContext = r10
            java.lang.String r13 = "t"
            r2 = 0
            if (r10 == 0) goto L_0x003b
            android.content.SharedPreferences r4 = r10.getSharedPreferences(r12, r0)
            r9.f8843a = r4
            long r4 = r4.getLong(r13, r2)
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            boolean r6 = com.ta.utdid2.a.a.e.isEmpty(r1)
            if (r6 != 0) goto L_0x0063
            java.lang.String r6 = "mounted"
            boolean r6 = r1.equals(r6)
            r7 = 1
            if (r6 == 0) goto L_0x0056
            r9.n = r7
            r9.f8848m = r7
            goto L_0x0067
        L_0x0056:
            java.lang.String r6 = "mounted_ro"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0063
            r9.f8848m = r7
            r9.n = r0
            goto L_0x0067
        L_0x0063:
            r9.n = r0
            r9.f8848m = r0
        L_0x0067:
            boolean r1 = r9.f8848m
            java.lang.String r6 = "t2"
            if (r1 != 0) goto L_0x0072
            boolean r1 = r9.n
            if (r1 == 0) goto L_0x0149
        L_0x0072:
            if (r10 == 0) goto L_0x0149
            boolean r1 = com.ta.utdid2.a.a.e.isEmpty(r11)
            if (r1 != 0) goto L_0x0149
            com.ta.utdid2.b.a.d r11 = r9.a((java.lang.String) r11)
            r9.f8846a = r11
            if (r11 == 0) goto L_0x0149
            com.ta.utdid2.b.a.b r11 = r11.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0149 }
            r9.f8845a = r11     // Catch:{ Exception -> 0x0149 }
            long r7 = r11.getLong(r13, r2)     // Catch:{ Exception -> 0x0149 }
            if (r14 != 0) goto L_0x00cb
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a3
            android.content.SharedPreferences r10 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            r9.a((android.content.SharedPreferences) r10, (com.ta.utdid2.b.a.b) r11)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.d r10 = r9.f8846a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r10 = r10.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8845a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x00a3:
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b6
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r13 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            r9.a((com.ta.utdid2.b.a.b) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8843a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x00b6:
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x014a
            android.content.SharedPreferences r10 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            r9.a((android.content.SharedPreferences) r10, (com.ta.utdid2.b.a.b) r11)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.d r10 = r9.f8846a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r10 = r10.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8845a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x00cb:
            android.content.SharedPreferences r11 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            long r4 = r11.getLong(r6, r2)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            long r7 = r11.getLong(r6, r2)     // Catch:{ Exception -> 0x00ef }
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f1
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f1
            android.content.SharedPreferences r10 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            r9.a((android.content.SharedPreferences) r10, (com.ta.utdid2.b.a.b) r11)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.d r10 = r9.f8846a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r10 = r10.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8845a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x00ef:
            goto L_0x014a
        L_0x00f1:
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x0107
            int r11 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0107
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r13 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            r9.a((com.ta.utdid2.b.a.b) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8843a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x0107:
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x011d
            int r11 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x011d
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r13 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            r9.a((com.ta.utdid2.b.a.b) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x00ef }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8843a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x011d:
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0135
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0135
            android.content.SharedPreferences r10 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            r9.a((android.content.SharedPreferences) r10, (com.ta.utdid2.b.a.b) r11)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.d r10 = r9.f8846a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r10 = r10.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8845a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x0135:
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x014a
            android.content.SharedPreferences r10 = r9.f8843a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r11 = r9.f8845a     // Catch:{ Exception -> 0x00ef }
            r9.a((android.content.SharedPreferences) r10, (com.ta.utdid2.b.a.b) r11)     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.d r10 = r9.f8846a     // Catch:{ Exception -> 0x00ef }
            com.ta.utdid2.b.a.b r10 = r10.a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x00ef }
            r9.f8845a = r10     // Catch:{ Exception -> 0x00ef }
            goto L_0x014a
        L_0x0149:
            r7 = r2
        L_0x014a:
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0156
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0186
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0186
        L_0x0156:
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = r9.f9853o
            if (r12 == 0) goto L_0x0168
            if (r12 == 0) goto L_0x0186
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0186
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0186
        L_0x0168:
            android.content.SharedPreferences r12 = r9.f8843a
            if (r12 == 0) goto L_0x0176
            android.content.SharedPreferences$Editor r12 = r12.edit()
            r12.putLong(r6, r10)
            r12.commit()
        L_0x0176:
            com.ta.utdid2.b.a.b r12 = r9.f8845a     // Catch:{ Exception -> 0x0186 }
            if (r12 == 0) goto L_0x0186
            com.ta.utdid2.b.a.b r12 = r9.f8845a     // Catch:{ Exception -> 0x0186 }
            com.ta.utdid2.b.a.b$a r12 = r12.a()     // Catch:{ Exception -> 0x0186 }
            r12.a((java.lang.String) r6, (long) r10)     // Catch:{ Exception -> 0x0186 }
            r12.commit()     // Catch:{ Exception -> 0x0186 }
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private d a(String str) {
        File a2 = a(str);
        if (a2 == null) {
            return null;
        }
        d dVar = new d(a2.getAbsolutePath());
        this.f8846a = dVar;
        return dVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private File m1322a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", new Object[]{externalStorageDirectory.getAbsolutePath(), File.separator, str}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private void a(SharedPreferences sharedPreferences, b bVar) {
        b.a a2;
        if (sharedPreferences != null && bVar != null && (a2 = bVar.a()) != null) {
            a2.b();
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof String) {
                    a2.a(str, (String) value);
                } else if (value instanceof Integer) {
                    a2.a(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a2.a(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a2.a(str, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a2.a(str, ((Boolean) value).booleanValue());
                }
            }
            a2.commit();
        }
    }

    private void a(b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (bVar != null && sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.clear();
            for (Map.Entry next : bVar.getAll().entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof String) {
                    edit.putString(str, (String) value);
                } else if (value instanceof Integer) {
                    edit.putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                }
            }
            edit.commit();
        }
    }

    private boolean h() {
        b bVar = this.f8845a;
        if (bVar == null) {
            return false;
        }
        boolean g = bVar.g();
        if (!g) {
            commit();
        }
        return g;
    }

    private void k() {
        b bVar;
        SharedPreferences sharedPreferences;
        if (this.f9852a == null && (sharedPreferences = this.f8843a) != null) {
            this.f9852a = sharedPreferences.edit();
        }
        if (this.n && this.f8844a == null && (bVar = this.f8845a) != null) {
            this.f8844a = bVar.a();
        }
        h();
    }

    public void putString(String str, String str2) {
        if (!e.isEmpty(str) && !str.equals(SecurityConstants.KEY_TEXT)) {
            k();
            SharedPreferences.Editor editor = this.f9852a;
            if (editor != null) {
                editor.putString(str, str2);
            }
            b.a aVar = this.f8844a;
            if (aVar != null) {
                aVar.a(str, str2);
            }
        }
    }

    public void remove(String str) {
        if (!e.isEmpty(str) && !str.equals(SecurityConstants.KEY_TEXT)) {
            k();
            SharedPreferences.Editor editor = this.f9852a;
            if (editor != null) {
                editor.remove(str);
            }
            b.a aVar = this.f8844a;
            if (aVar != null) {
                aVar.a(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean commit() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r6.f9852a
            r3 = 0
            if (r2 == 0) goto L_0x0021
            boolean r4 = r6.f9853o
            if (r4 != 0) goto L_0x0017
            android.content.SharedPreferences r4 = r6.f8843a
            if (r4 == 0) goto L_0x0017
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L_0x0017:
            android.content.SharedPreferences$Editor r0 = r6.f9852a
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0021
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            android.content.SharedPreferences r1 = r6.f8843a
            if (r1 == 0) goto L_0x0032
            android.content.Context r1 = r6.mContext
            if (r1 == 0) goto L_0x0032
            java.lang.String r2 = r6.l
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r6.f8843a = r1
        L_0x0032:
            r1 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            boolean r2 = com.ta.utdid2.a.a.e.isEmpty(r1)
            if (r2 != 0) goto L_0x009e
            java.lang.String r2 = "mounted"
            boolean r4 = r1.equals(r2)
            if (r4 == 0) goto L_0x007e
            com.ta.utdid2.b.a.b r4 = r6.f8845a
            if (r4 != 0) goto L_0x0073
            java.lang.String r4 = r6.m
            com.ta.utdid2.b.a.d r4 = r6.a((java.lang.String) r4)
            if (r4 == 0) goto L_0x007e
            java.lang.String r5 = r6.l
            com.ta.utdid2.b.a.b r4 = r4.a((java.lang.String) r5, (int) r3)
            r6.f8845a = r4
            boolean r5 = r6.f9853o
            if (r5 != 0) goto L_0x0065
            android.content.SharedPreferences r5 = r6.f8843a
            r6.a((android.content.SharedPreferences) r5, (com.ta.utdid2.b.a.b) r4)
            goto L_0x006a
        L_0x0065:
            android.content.SharedPreferences r5 = r6.f8843a
            r6.a((com.ta.utdid2.b.a.b) r4, (android.content.SharedPreferences) r5)
        L_0x006a:
            com.ta.utdid2.b.a.b r4 = r6.f8845a
            com.ta.utdid2.b.a.b$a r4 = r4.a()
            r6.f8844a = r4
            goto L_0x007e
        L_0x0073:
            com.ta.utdid2.b.a.b$a r4 = r6.f8844a
            if (r4 == 0) goto L_0x007e
            boolean r4 = r4.commit()
            if (r4 != 0) goto L_0x007e
            r0 = 0
        L_0x007e:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0090
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009e
            com.ta.utdid2.b.a.b r1 = r6.f8845a
            if (r1 == 0) goto L_0x009e
        L_0x0090:
            com.ta.utdid2.b.a.d r1 = r6.f8846a     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x009e
            com.ta.utdid2.b.a.d r1 = r6.f8846a     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r6.l     // Catch:{ Exception -> 0x009e }
            com.ta.utdid2.b.a.b r1 = r1.a((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x009e }
            r6.f8845a = r1     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.c.commit():boolean");
    }

    public String getString(String str) {
        h();
        SharedPreferences sharedPreferences = this.f8843a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!e.isEmpty(string)) {
                return string;
            }
        }
        b bVar = this.f8845a;
        if (bVar != null) {
            return bVar.getString(str, "");
        }
        return "";
    }
}
