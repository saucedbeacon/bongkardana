package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzh();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzd();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zza();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzc();
    @GuardedBy("DynamiteModule.class")
    private static Boolean zza = null;
    @GuardedBy("DynamiteModule.class")
    private static zzk zzb = null;
    @GuardedBy("DynamiteModule.class")
    private static zzm zzc = null;
    @GuardedBy("DynamiteModule.class")
    private static String zzd = null;
    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;
    private static final ThreadLocal<zza> zzf = new ThreadLocal<>();
    private static final VersionPolicy.zzb zzg = new zzb();
    private static final VersionPolicy zzh = new zzg();
    private final Context zzi;

    public interface VersionPolicy {

        public static class zza {
            public int zza = 0;
            public int zzb = 0;
            public int zzc = 0;
        }

        public interface zzb {
            int zza(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        zza zza(Context context, String str, zzb zzb2) throws LoadingException;
    }

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    static class zza {
        public Cursor zza;

        private zza() {
        }

        /* synthetic */ zza(zzb zzb) {
            this();
        }
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        VersionPolicy.zza zza2;
        zza zza3 = zzf.get();
        zza zza4 = new zza((zzb) null);
        zzf.set(zza4);
        try {
            zza2 = versionPolicy.zza(context, str, zzg);
            if (zza2.zzc == 0 || ((zza2.zzc == -1 && zza2.zza == 0) || (zza2.zzc == 1 && zza2.zzb == 0))) {
                int i = zza2.zza;
                int i2 = zza2.zzb;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i);
                sb.append(" and remote version is ");
                sb.append(i2);
                sb.append(".");
                throw new LoadingException(sb.toString(), (zzb) null);
            } else if (zza2.zzc == -1) {
                DynamiteModule zza5 = zza(context, str);
                if (zza4.zza != null) {
                    zza4.zza.close();
                }
                zzf.set(zza3);
                return zza5;
            } else if (zza2.zzc == 1) {
                DynamiteModule zza6 = zza(context, str, zza2.zzb);
                if (zza4.zza != null) {
                    zza4.zza.close();
                }
                zzf.set(zza3);
                return zza6;
            } else {
                int i3 = zza2.zzc;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(i3);
                throw new LoadingException(sb2.toString(), (zzb) null);
            }
        } catch (LoadingException e) {
            e.getMessage();
            if (zza2.zza == 0 || versionPolicy.zza(context, str, new zzb(zza2.zza, 0)).zzc != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, (zzb) null);
            }
            DynamiteModule zza7 = zza(context, str);
            if (zza4.zza != null) {
                zza4.zza.close();
            }
            zzf.set(zza3);
            return zza7;
        } catch (Throwable th) {
            if (zza4.zza != null) {
                zza4.zza.close();
            }
            zzf.set(zza3);
            throw th;
        }
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, zzb zzb) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzb zzb) {
            this(str, th);
        }
    }

    static class zzb implements VersionPolicy.zzb {
        private final int zza;
        private final int zzb = 0;

        public zzb(int i, int i2) {
            this.zza = i;
        }

        public final int zza(Context context, String str, boolean z) {
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext != null) {
                int length = str != null ? str.length() : 0;
                int min = dispatchOnCancelled.setMin(applicationContext, length);
                if (length != min) {
                    onCanceled oncanceled = new onCanceled(length, min, 8);
                    onCancelLoad.setMax(1767765365, oncanceled);
                    onCancelLoad.getMin(1767765365, oncanceled);
                }
            }
            return 0;
        }

        public final int zza(Context context, String str) {
            return this.zza;
        }
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            declaredField.get((Object) null);
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0091=Splitter:B:39:0x0091, B:23:0x0056=Splitter:B:23:0x0056, B:18:0x0039=Splitter:B:18:0x0039} */
    public static int zza(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.Boolean r1 = zza     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x00a6
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x009f }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x003c
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009f }
            if (r4 != r1) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0036:
            zza((java.lang.ClassLoader) r4)     // Catch:{ LoadingException -> 0x0039 }
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0056
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009f }
            r1.set(r3, r4)     // Catch:{ all -> 0x009f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0056:
            int r4 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x0094 }
            java.lang.String r5 = zzd     // Catch:{ LoadingException -> 0x0094 }
            if (r5 == 0) goto L_0x0091
            java.lang.String r5 = zzd     // Catch:{ LoadingException -> 0x0094 }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x0094 }
            if (r5 == 0) goto L_0x0067
            goto L_0x0091
        L_0x0067:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0094 }
            r6 = 29
            if (r5 < r6) goto L_0x0079
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0094 }
            java.lang.String r6 = zzd     // Catch:{ LoadingException -> 0x0094 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0094 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0094 }
            goto L_0x0084
        L_0x0079:
            com.google.android.gms.dynamite.zzi r5 = new com.google.android.gms.dynamite.zzi     // Catch:{ LoadingException -> 0x0094 }
            java.lang.String r6 = zzd     // Catch:{ LoadingException -> 0x0094 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0094 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0094 }
        L_0x0084:
            zza((java.lang.ClassLoader) r5)     // Catch:{ LoadingException -> 0x0094 }
            r1.set(r3, r5)     // Catch:{ LoadingException -> 0x0094 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0094 }
            zza = r5     // Catch:{ LoadingException -> 0x0094 }
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return r4
        L_0x0091:
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return r4
        L_0x0094:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009f }
            r1.set(r3, r4)     // Catch:{ all -> 0x009f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            goto L_0x00a4
        L_0x009f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
            throw r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a2 }
        L_0x00a2:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00bd }
        L_0x00a4:
            zza = r1     // Catch:{ all -> 0x00bd }
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            int r8 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x00b2 }
            return r8
        L_0x00b2:
            r9 = move-exception
            r9.getMessage()     // Catch:{ all -> 0x00c0 }
            r8 = 0
            return r8
        L_0x00b8:
            int r8 = zzb((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x00c0 }
            return r8
        L_0x00bd:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    private static int zzb(Context context, String str, boolean z) {
        zzk zza2 = zza(context);
        if (zza2 == null) {
            return 0;
        }
        try {
            if (zza2.zzb() >= 2) {
                return zza2.zzb(ObjectWrapper.wrap(context), str, z);
            }
            return zza2.zza(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            e.getMessage();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r0 = r8;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        r7 = r9;
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("V2 version check failed", r8, (com.google.android.gms.dynamite.zzb) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzc(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            zzd = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            zze = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r10 = zzf     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            com.google.android.gms.dynamite.DynamiteModule$zza r10 = (com.google.android.gms.dynamite.DynamiteModule.zza) r10     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.zza     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r1 != 0) goto L_0x007c
            r10.zza = r8     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.zzb) r0)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x008b:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a7
        L_0x008f:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0098
        L_0x0094:
            r8 = move-exception
            goto L_0x00a7
        L_0x0096:
            r8 = move-exception
            r9 = r0
        L_0x0098:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x009d
            throw r8     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a5 }
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zza(Context context, String str) {
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", r5, (com.google.android.gms.dynamite.zzb) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", r4, (com.google.android.gms.dynamite.zzb) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.DynamiteModule zza(android.content.Context r4, java.lang.String r5, int r6) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            java.lang.Boolean r2 = zza     // Catch:{ all -> 0x005c }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0054
            boolean r1 = r2.booleanValue()     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.dynamite.DynamiteModule r4 = zzb((android.content.Context) r4, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            return r4
        L_0x0014:
            com.google.android.gms.dynamite.zzk r1 = zza((android.content.Context) r4)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            if (r1 == 0) goto L_0x004c
            int r2 = r1.zzb()     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            r3 = 2
            if (r2 < r3) goto L_0x002a
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            com.google.android.gms.dynamic.IObjectWrapper r5 = r1.zzb((com.google.android.gms.dynamic.IObjectWrapper) r2, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            goto L_0x0032
        L_0x002a:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            com.google.android.gms.dynamic.IObjectWrapper r5 = r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
        L_0x0032:
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            if (r6 == 0) goto L_0x0044
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            r6.<init>(r5)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            return r6
        L_0x0044:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>((java.lang.String) r6, (com.google.android.gms.dynamite.zzb) r0)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            throw r5     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
        L_0x004c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            java.lang.String r6 = "Failed to create IDynamiteLoader."
            r5.<init>((java.lang.String) r6, (com.google.android.gms.dynamite.zzb) r0)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            throw r5     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
        L_0x0054:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            java.lang.String r6 = "Failed to determine which loading route to use."
            r5.<init>((java.lang.String) r6, (com.google.android.gms.dynamite.zzb) r0)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            throw r5     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
        L_0x005c:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
            throw r5     // Catch:{ RemoteException -> 0x006d, LoadingException -> 0x006b, all -> 0x005f }
        L_0x005f:
            r5 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r4, r5)
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r6 = "Failed to load remote module."
            r4.<init>(r6, r5, r0)
            throw r4
        L_0x006b:
            r4 = move-exception
            throw r4
        L_0x006d:
            r4 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>(r6, r4, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, int):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static zzk zza(Context context) {
        zzk zzk;
        synchronized (DynamiteModule.class) {
            if (zzb != null) {
                zzk zzk2 = zzb;
                return zzk2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzk = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzk) {
                        zzk = (zzk) queryLocalInterface;
                    } else {
                        zzk = new zzj(iBinder);
                    }
                }
                if (zzk != null) {
                    zzb = zzk;
                    return zzk;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    @KeepForSdk
    public final Context getModuleContext() {
        return this.zzi;
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException, RemoteException {
        zzm zzm;
        IObjectWrapper iObjectWrapper;
        synchronized (DynamiteModule.class) {
            zzm = zzc;
        }
        if (zzm != null) {
            zza zza2 = zzf.get();
            if (zza2 == null || zza2.zza == null) {
                throw new LoadingException("No result cursor", (zzb) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = zza2.zza;
            ObjectWrapper.wrap(null);
            if (zza().booleanValue()) {
                iObjectWrapper = zzm.zzb(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            } else {
                iObjectWrapper = zzm.zza(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            }
            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (zzb) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (zzb) null);
    }

    private static Boolean zza() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(zze >= 2);
        }
        return valueOf;
    }

    @GuardedBy("DynamiteModule.class")
    private static void zza(ClassLoader classLoader) throws LoadingException {
        zzm zzm;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzm = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzm) {
                    zzm = (zzm) queryLocalInterface;
                } else {
                    zzm = new zzl(iBinder);
                }
            }
            zzc = zzm;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zzb) null);
        }
    }

    @KeepForSdk
    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzi.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (zzb) null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzi = (Context) Preconditions.checkNotNull(context);
    }
}
