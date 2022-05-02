package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.internal.ae;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.bx;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.e;
import com.google.android.play.core.splitinstall.h;
import com.google.android.play.core.splitinstall.l;
import com.google.android.play.core.splitinstall.p;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FakeSplitInstallManager implements SplitInstallManager {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10987a = 0;
    private static final long c = TimeUnit.SECONDS.toMillis(1);
    private final Handler b;
    private final Context d;
    private final p e;
    private final bx f;
    private final ae<SplitInstallSessionState> g;
    private final Executor h;
    private final e i;
    private final File j;
    private final AtomicReference<SplitInstallSessionState> k;
    /* access modifiers changed from: private */
    public final Set<String> l;
    /* access modifiers changed from: private */
    public final Set<String> m;
    private final AtomicBoolean n;

    /* renamed from: o  reason: collision with root package name */
    private final a f10988o;

    @Deprecated
    public FakeSplitInstallManager(Context context, File file) {
        this(context, file, new p(context, context.getPackageName()));
    }

    FakeSplitInstallManager(Context context, @Nullable File file, p pVar) {
        Executor a2 = com.google.android.play.core.splitcompat.p.a();
        bx bxVar = new bx(context);
        a aVar = a.f10990a;
        this.b = new Handler(Looper.getMainLooper());
        this.k = new AtomicReference<>();
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = Collections.synchronizedSet(new HashSet());
        this.n = new AtomicBoolean(false);
        this.d = context;
        this.j = file;
        this.e = pVar;
        this.h = a2;
        this.f = bxVar;
        this.f10988o = aVar;
        this.g = new ae<>();
        this.i = l.f9621a;
    }

    static final /* synthetic */ SplitInstallSessionState a(int i2, SplitInstallSessionState splitInstallSessionState) {
        int status;
        if (splitInstallSessionState != null && i2 == splitInstallSessionState.sessionId() && ((status = splitInstallSessionState.status()) == 1 || status == 2 || status == 8 || status == 9 || status == 7)) {
            return SplitInstallSessionState.create(i2, 7, splitInstallSessionState.errorCode(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
        }
        throw new SplitInstallException(-3);
    }

    @Nullable
    private final synchronized SplitInstallSessionState a(j jVar) {
        SplitInstallSessionState c2 = c();
        SplitInstallSessionState a2 = jVar.a(c2);
        if (this.k.compareAndSet(c2, a2)) {
            return a2;
        }
        return null;
    }

    static final /* synthetic */ SplitInstallSessionState a(Integer num, int i2, int i3, Long l2, Long l3, List list, List list2, SplitInstallSessionState splitInstallSessionState) {
        SplitInstallSessionState create = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0, 0, new ArrayList(), new ArrayList()) : splitInstallSessionState;
        return SplitInstallSessionState.create(num == null ? create.sessionId() : num.intValue(), i2, i3, l2 == null ? create.bytesDownloaded() : l2.longValue(), l3 == null ? create.totalBytesToDownload() : l3.longValue(), list == null ? create.moduleNames() : list, list2 == null ? create.languages() : list2);
    }

    private static String a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* access modifiers changed from: private */
    public final void a(List<Intent> list, List<String> list2, List<String> list3, long j2, boolean z) {
        List<Intent> list4 = list;
        this.i.a().a(list, new i(this, list2, list3, j2, z, list));
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2) {
        return a(6, i2, (Long) null, (Long) null, (List<String>) null, (Integer) null, (List<String>) null);
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, @Nullable Long l2, @Nullable Long l3, @Nullable List<String> list, @Nullable Integer num, @Nullable List<String> list2) {
        SplitInstallSessionState a2 = a((j) new b(num, i2, i3, l2, l3, list, list2));
        if (a2 == null) {
            return false;
        }
        b(a2);
        return true;
    }

    private final void b(SplitInstallSessionState splitInstallSessionState) {
        this.b.post(new f(this, splitInstallSessionState));
    }

    @Nullable
    private final SplitInstallSessionState c() {
        return this.k.get();
    }

    private final h d() {
        h c2 = this.e.c();
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    /* access modifiers changed from: package-private */
    public final File a() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2, List list, List list2, List list3) {
        long j3 = j2;
        long j4 = j3 / 3;
        long j5 = 0;
        int i2 = 0;
        while (i2 < 3) {
            j5 = Math.min(j3, j5 + j4);
            a(2, 0, Long.valueOf(j5), Long.valueOf(j2), (List<String>) null, (Integer) null, (List<String>) null);
            SystemClock.sleep(c);
            SplitInstallSessionState c2 = c();
            if (c2.status() != 9 && c2.status() != 7 && c2.status() != 6) {
                i2++;
            } else {
                return;
            }
        }
        this.h.execute(new h(this, list, list2, list3, j2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(SplitInstallSessionState splitInstallSessionState) {
        this.g.a(splitInstallSessionState);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            File file = (File) list.get(i2);
            String a2 = av.a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.d.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", a(a2));
            intent.putExtra("split_id", a2);
            arrayList.add(intent);
            arrayList2.add(a(av.a(file)));
        }
        SplitInstallSessionState c2 = c();
        if (c2 != null) {
            this.h.execute(new g(this, c2.totalBytesToDownload(), arrayList, arrayList2, list2));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, List list2, List list3, long j2) {
        if (this.n.get()) {
            a(-6);
        } else {
            a((List<Intent>) list, (List<String>) list2, (List<String>) list3, j2, false);
        }
    }

    public final Task<Void> cancelInstall(int i2) {
        try {
            SplitInstallSessionState a2 = a((j) new e(i2));
            if (a2 != null) {
                b(a2);
            }
            return Tasks.a(null);
        } catch (SplitInstallException e2) {
            return Tasks.a((Exception) e2);
        }
    }

    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    public final Task<Void> deferredUninstall(List<String> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    public final Set<String> getInstalledLanguages() {
        return new HashSet(this.m);
    }

    public final Set<String> getInstalledModules() {
        return new HashSet(this.l);
    }

    public final Task<SplitInstallSessionState> getSessionState(int i2) {
        SplitInstallSessionState c2 = c();
        return (c2 == null || c2.sessionId() != i2) ? Tasks.a((Exception) new SplitInstallException(-4)) : Tasks.a(c2);
    }

    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState c2 = c();
        return Tasks.a(c2 != null ? Collections.singletonList(c2) : Collections.emptyList());
    }

    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.g.a(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z) {
        this.n.set(z);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i2) throws IntentSender.SendIntentException {
        return false;
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        if (r4.contains(r15) == false) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r21) {
        /*
            r20 = this;
            r9 = r20
            com.google.android.play.core.splitinstall.testing.d r0 = new com.google.android.play.core.splitinstall.testing.d     // Catch:{ SplitInstallException -> 0x01e9 }
            r1 = r21
            r0.<init>(r1)     // Catch:{ SplitInstallException -> 0x01e9 }
            com.google.android.play.core.splitinstall.SplitInstallSessionState r0 = r9.a((com.google.android.play.core.splitinstall.testing.j) r0)     // Catch:{ SplitInstallException -> 0x01e9 }
            if (r0 == 0) goto L_0x01dd
            int r0 = r0.sessionId()     // Catch:{ SplitInstallException -> 0x01e9 }
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r2 = r21.getLanguages()
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r2.next()
            java.util.Locale r3 = (java.util.Locale) r3
            java.lang.String r3 = r3.getLanguage()
            r10.add(r3)
            goto L_0x0020
        L_0x0034:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.io.File r3 = r9.j
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L_0x0051
            com.google.android.play.core.splitinstall.SplitInstallException r0 = new com.google.android.play.core.splitinstall.SplitInstallException
            r1 = -5
            r0.<init>(r1)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) r0)
            return r0
        L_0x0051:
            int r4 = r3.length
            r8 = 0
            r12 = 0
        L_0x0055:
            if (r8 >= r4) goto L_0x0196
            r14 = r3[r8]
            java.lang.String r15 = com.google.android.play.core.internal.av.a(r14)
            java.lang.String r5 = a((java.lang.String) r15)
            java.util.List r6 = r21.getModuleNames()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x012d
            java.lang.String r5 = a((java.lang.String) r15)
            java.util.HashSet r6 = new java.util.HashSet
            com.google.android.play.core.internal.bx r7 = r9.f
            java.util.List r7 = r7.a()
            r6.<init>(r7)
            com.google.android.play.core.splitinstall.h r7 = r20.d()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r16 = 0
            r1[r16] = r5
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Map r1 = r7.a(r1)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Collection r7 = r1.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x009a:
            boolean r17 = r7.hasNext()
            if (r17 == 0) goto L_0x00b0
            java.lang.Object r17 = r7.next()
            r18 = r3
            r3 = r17
            java.util.Set r3 = (java.util.Set) r3
            r5.addAll(r3)
            r3 = r18
            goto L_0x009a
        L_0x00b0:
            r18 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00bb:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r17 = r4
            java.lang.String r4 = "_"
            boolean r19 = r7.contains(r4)
            if (r19 == 0) goto L_0x00dc
            r19 = r6
            r6 = -1
            java.lang.String[] r4 = r7.split(r4, r6)
            r6 = 0
            r7 = r4[r6]
            goto L_0x00df
        L_0x00dc:
            r19 = r6
            r6 = 0
        L_0x00df:
            r3.add(r7)
            r4 = r17
            r6 = r19
            goto L_0x00bb
        L_0x00e7:
            r17 = r4
            r6 = 0
            java.util.Set<java.lang.String> r4 = r9.m
            r3.addAll(r4)
            r3.addAll(r10)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ff:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0120
            java.lang.Object r7 = r1.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r6 = r7.getKey()
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x011e
            java.lang.Object r6 = r7.getValue()
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
        L_0x011e:
            r6 = 0
            goto L_0x00ff
        L_0x0120:
            boolean r1 = r5.contains(r15)
            if (r1 == 0) goto L_0x017d
            boolean r1 = r4.contains(r15)
            if (r1 == 0) goto L_0x0131
            goto L_0x017d
        L_0x012d:
            r18 = r3
            r17 = r4
        L_0x0131:
            java.util.List r1 = r21.getLanguages()
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Set<java.lang.String> r4 = r9.l
            r3.<init>(r4)
            java.lang.String r4 = ""
            java.lang.String r5 = "base"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.addAll(r4)
            com.google.android.play.core.splitinstall.h r4 = r20.d()
            java.util.Map r3 = r4.a(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0157:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x018c
            java.lang.Object r4 = r1.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r5 = r4.getLanguage()
            boolean r5 = r3.containsKey(r5)
            if (r5 == 0) goto L_0x0157
            java.lang.String r4 = r4.getLanguage()
            java.lang.Object r4 = r3.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.contains(r15)
            if (r4 == 0) goto L_0x0157
        L_0x017d:
            long r3 = r14.length()
            long r12 = r12 + r3
            java.lang.String r1 = com.google.android.play.core.internal.av.a(r14)
            r2.add(r1)
            r11.add(r14)
        L_0x018c:
            int r8 = r8 + 1
            r1 = r21
            r4 = r17
            r3 = r18
            goto L_0x0055
        L_0x0196:
            r21.getModuleNames()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r3 = r21.getModuleNames()
            r1.<init>(r3)
            boolean r1 = r2.containsAll(r1)
            if (r1 != 0) goto L_0x01b3
            com.google.android.play.core.splitinstall.SplitInstallException r0 = new com.google.android.play.core.splitinstall.SplitInstallException
            r1 = -2
            r0.<init>(r1)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) r0)
            return r0
        L_0x01b3:
            r1 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            java.util.List r6 = r21.getModuleNames()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r3 = 0
            r1 = r20
            r7 = r0
            r8 = r10
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r9.h
            com.google.android.play.core.splitinstall.testing.c r2 = new com.google.android.play.core.splitinstall.testing.c
            r2.<init>(r9, r11, r10)
            r1.execute(r2)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.a(r0)
            return r0
        L_0x01dd:
            com.google.android.play.core.splitinstall.SplitInstallException r0 = new com.google.android.play.core.splitinstall.SplitInstallException     // Catch:{ SplitInstallException -> 0x01e9 }
            r1 = -100
            r0.<init>(r1)     // Catch:{ SplitInstallException -> 0x01e9 }
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) r0)     // Catch:{ SplitInstallException -> 0x01e9 }
            return r0
        L_0x01e9:
            r0 = move-exception
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.play.core.tasks.Task");
    }

    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.g.b(splitInstallStateUpdatedListener);
    }
}
