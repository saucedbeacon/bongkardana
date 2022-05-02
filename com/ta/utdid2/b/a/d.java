package com.ta.utdid2.b.a;

import com.ta.utdid2.b.a.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class d {
    private static final Object b = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Object f9854a = new Object();
    private File d;
    private HashMap<File, a> e = new HashMap<>();

    public d(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.d = new File(str);
    }

    private File a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        StringBuilder sb = new StringBuilder("File ");
        sb.append(str);
        sb.append(" contains a path separator");
        throw new IllegalArgumentException(sb.toString());
    }

    private File a() {
        File file;
        synchronized (this.f9854a) {
            file = this.d;
        }
        return file;
    }

    private File b(String str) {
        File a2 = a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".xml");
        return a(a2, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public com.ta.utdid2.b.a.b a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.io.File r6 = r5.b((java.lang.String) r6)
            java.lang.Object r0 = b
            monitor-enter(r0)
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r1 = r5.e     // Catch:{ all -> 0x00b2 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00b2 }
            com.ta.utdid2.b.a.d$a r1 = (com.ta.utdid2.b.a.d.a) r1     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.i()     // Catch:{ all -> 0x00b2 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            return r1
        L_0x0019:
            monitor-exit(r0)
            java.io.File r0 = a(r6)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x002a
            r6.delete()
            r0.renameTo(r6)
        L_0x002a:
            boolean r0 = r6.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0090
            boolean r0 = r6.canRead()
            if (r0 == 0) goto L_0x0090
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x005c, Exception -> 0x0054 }
            r0.<init>(r6)     // Catch:{ XmlPullParserException -> 0x005c, Exception -> 0x0054 }
            java.util.HashMap r2 = com.ta.utdid2.b.a.e.a(r0)     // Catch:{ XmlPullParserException -> 0x004e, Exception -> 0x004a, all -> 0x0047 }
            r0.close()     // Catch:{ XmlPullParserException -> 0x004e, Exception -> 0x004a, all -> 0x0047 }
            r0.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0090
        L_0x0047:
            r6 = move-exception
            r2 = r0
            goto L_0x007d
        L_0x004a:
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0055
        L_0x004e:
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x005d
        L_0x0052:
            r6 = move-exception
            goto L_0x007d
        L_0x0054:
            r0 = r2
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            r2 = r0
            goto L_0x0090
        L_0x005c:
            r0 = r2
        L_0x005d:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            int r2 = r3.available()     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            r3.read(r2)     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            r3.close()     // Catch:{ all -> 0x006f }
            goto L_0x008a
        L_0x006f:
            goto L_0x008a
        L_0x0071:
            r6 = move-exception
            r2 = r3
            goto L_0x0077
        L_0x0074:
            r2 = r3
            goto L_0x0084
        L_0x0076:
            r6 = move-exception
        L_0x0077:
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r6     // Catch:{ all -> 0x0052 }
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r6
        L_0x0083:
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r3 = r2
        L_0x008a:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0090:
            java.lang.Object r0 = b
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0099
            r1.a((java.util.Map) r2)     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x0099:
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r1 = r5.e     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00af }
            com.ta.utdid2.b.a.d$a r1 = (com.ta.utdid2.b.a.d.a) r1     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x00ad
            com.ta.utdid2.b.a.d$a r1 = new com.ta.utdid2.b.a.d$a     // Catch:{ all -> 0x00af }
            r1.<init>(r6, r7, r2)     // Catch:{ all -> 0x00af }
            java.util.HashMap<java.io.File, com.ta.utdid2.b.a.d$a> r7 = r5.e     // Catch:{ all -> 0x00af }
            r7.put(r6, r1)     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return r1
        L_0x00af:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x00b6
        L_0x00b5:
            throw r6
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.b.a.d.a(java.lang.String, int):com.ta.utdid2.b.a.b");
    }

    /* access modifiers changed from: private */
    public static File a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        return new File(sb.toString());
    }

    static final class a implements b {
        private static final Object c = new Object();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<b.C0037b, Object> f9855a;
        private Map b;

        /* renamed from: c  reason: collision with other field name */
        private final int f8849c;
        private final File e;
        private final File f;
        private boolean p = false;

        a(File file, int i, Map map) {
            this.e = file;
            this.f = d.a(file);
            this.f8849c = i;
            this.b = map == null ? new HashMap() : map;
            this.f9855a = new WeakHashMap<>();
        }

        public final boolean g() {
            return this.e != null && new File(this.e.getAbsolutePath()).exists();
        }

        public final void c(boolean z) {
            synchronized (this) {
                this.p = z;
            }
        }

        public final boolean i() {
            boolean z;
            synchronized (this) {
                z = this.p;
            }
            return z;
        }

        public final void a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.b = map;
                }
            }
        }

        public final Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.b);
            }
            return hashMap;
        }

        public final String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.b.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        public final long getLong(String str, long j) {
            synchronized (this) {
                Long l = (Long) this.b.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        /* renamed from: com.ta.utdid2.b.a.d$a$a  reason: collision with other inner class name */
        public final class C0038a implements b.a {
            private final Map<String, Object> c = new HashMap();
            private boolean q = false;

            public C0038a() {
            }

            public final b.a a(String str, String str2) {
                synchronized (this) {
                    this.c.put(str, str2);
                }
                return this;
            }

            public final b.a a(String str, int i) {
                synchronized (this) {
                    this.c.put(str, Integer.valueOf(i));
                }
                return this;
            }

            public final b.a a(String str, long j) {
                synchronized (this) {
                    this.c.put(str, Long.valueOf(j));
                }
                return this;
            }

            public final b.a a(String str, float f) {
                synchronized (this) {
                    this.c.put(str, Float.valueOf(f));
                }
                return this;
            }

            public final b.a a(String str, boolean z) {
                synchronized (this) {
                    this.c.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            public final b.a a(String str) {
                synchronized (this) {
                    this.c.put(str, this);
                }
                return this;
            }

            public final b.a b() {
                synchronized (this) {
                    this.q = true;
                }
                return this;
            }

            public final boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<b.C0037b> hashSet;
                boolean a2;
                synchronized (d.a()) {
                    z = a.a(a.this).size() > 0;
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet<>(a.a(a.this).keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.q) {
                            a.a(a.this).clear();
                            this.q = false;
                        }
                        for (Map.Entry next : this.c.entrySet()) {
                            String str = (String) next.getKey();
                            Object value = next.getValue();
                            if (value == this) {
                                a.a(a.this).remove(str);
                            } else {
                                a.a(a.this).put(str, value);
                            }
                            if (z) {
                                arrayList.add(str);
                            }
                        }
                        this.c.clear();
                    }
                    a2 = a.a(a.this);
                    if (a2) {
                        a.this.c(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str2 = (String) arrayList.get(size);
                        for (b.C0037b bVar : hashSet) {
                            if (bVar != null) {
                                bVar.a(a.this, str2);
                            }
                        }
                    }
                }
                return a2;
            }
        }

        public final b.a a() {
            return new C0038a();
        }

        private FileOutputStream a(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
            return fileOutputStream;
        }

        private boolean j() {
            if (this.e.exists()) {
                if (this.f.exists()) {
                    this.e.delete();
                } else if (!this.e.renameTo(this.f)) {
                    return false;
                }
            }
            try {
                FileOutputStream a2 = a(this.e);
                if (a2 == null) {
                    return false;
                }
                e.a(this.b, (OutputStream) a2);
                a2.close();
                this.f.delete();
                return true;
            } catch (Exception unused) {
                if (this.e.exists()) {
                    this.e.delete();
                }
                return false;
            }
        }
    }
}
