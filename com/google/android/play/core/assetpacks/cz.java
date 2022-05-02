package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.cj;
import com.google.android.play.core.internal.h;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class cz implements w {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10904a = new af("FakeAssetPackService");
    private static final AtomicInteger h = new AtomicInteger(1);
    private final String b;
    private final aw c;
    private final bz d;
    private final Context e;
    private final dl f;
    private final cj<Executor> g;
    private final Handler i = new Handler(Looper.getMainLooper());

    cz(File file, aw awVar, bz bzVar, Context context, dl dlVar, cj<Executor> cjVar) {
        this.b = file.getAbsolutePath();
        this.c = awVar;
        this.d = bzVar;
        this.e = context;
        this.f = dlVar;
        this.g = cjVar;
    }

    static long a(@AssetPackStatus int i2, long j) {
        if (i2 == 2) {
            return j / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j;
        }
        return 0;
    }

    private final AssetPackState a(String str, @AssetPackStatus int i2) throws LocalTestingException {
        long j = 0;
        for (File length : b(str)) {
            j += length.length();
        }
        String str2 = str;
        return AssetPackState.a(str, i2, 0, a(i2, j), j, this.d.b(str));
    }

    private static String a(File file) throws LocalTestingException {
        try {
            return db.a((List<File>) Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        } catch (IOException e3) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e3);
        }
    }

    private final void a(int i2, String str, @AssetPackStatus int i3) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f.a());
        bundle.putInt("session_id", i2);
        File[] b2 = b(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : b2) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = av.a(file);
            bundle.putParcelableArrayList(h.a("chunk_intents", str, a2), arrayList2);
            bundle.putString(h.a("uncompressed_hash_sha256", str, a2), a(file));
            bundle.putLong(h.a("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(h.a("slice_ids", str), arrayList);
        bundle.putLong(h.a("pack_version", str), (long) this.f.a());
        bundle.putInt(h.a("status", str), i3);
        bundle.putInt(h.a("error_code", str), 0);
        bundle.putLong(h.a("bytes_downloaded", str), a(i3, j));
        bundle.putLong(h.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", a(i3, j));
        bundle.putLong("total_bytes_to_download", j);
        this.i.post(new cy(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    private final File[] b(String str) throws LocalTestingException {
        File file = new File(this.b);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new cx(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a2 : listFiles) {
                        if (av.a(a2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final Task<AssetPackStates> a(List<String> list, az azVar, Map<String, Long> map) {
        f10904a.c("getPackStates(%s)", list);
        i iVar = new i();
        this.g.a().execute(new cv(this, list, azVar, iVar));
        return iVar.a();
    }

    public final Task<AssetPackStates> a(List<String> list, List<String> list2, Map<String, Long> map) {
        f10904a.c("startDownload(%s)", list2);
        i iVar = new i();
        this.g.a().execute(new cu(this, list2, iVar, list));
        return iVar.a();
    }

    public final Task<List<String>> a(Map<String, Long> map) {
        f10904a.c("syncPacks()", new Object[0]);
        return Tasks.a(new ArrayList());
    }

    public final void a() {
        f10904a.c("keepAlive", new Object[0]);
    }

    public final void a(int i2) {
        f10904a.c("notifySessionFailed", new Object[0]);
    }

    public final void a(int i2, String str) {
        f10904a.c("notifyModuleCompleted", new Object[0]);
        this.g.a().execute(new cw(this, i2, str));
    }

    public final void a(int i2, String str, String str2, int i3) {
        f10904a.c("notifyChunkTransferred", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Intent intent) {
        this.c.a(this.e, intent);
    }

    public final void a(String str) {
        f10904a.c("removePack(%s)", str);
    }

    public final void a(List<String> list) {
        f10904a.c("cancelDownload(%s)", list);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, az azVar, i iVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState a2 = a(str, azVar.a(8, str));
                j += a2.totalBytesToDownload();
                hashMap.put(str, a2);
            } catch (LocalTestingException e2) {
                iVar.a((Exception) e2);
                return;
            }
        }
        iVar.a(AssetPackStates.a(j, (Map<String, AssetPackState>) hashMap));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, i iVar, List list2) {
        List list3 = list;
        i iVar2 = iVar;
        HashMap hashMap = new HashMap();
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            String str = (String) list3.get(i2);
            try {
                AssetPackState a2 = a(str, 1);
                j += a2.totalBytesToDownload();
                hashMap.put(str, a2);
                i2++;
            } catch (LocalTestingException e2) {
                iVar2.a((Exception) e2);
                return;
            }
        }
        int size2 = list.size();
        int i3 = 0;
        while (i3 < size2) {
            String str2 = (String) list3.get(i3);
            try {
                int andIncrement = h.getAndIncrement();
                a(andIncrement, str2, 1);
                a(andIncrement, str2, 2);
                a(andIncrement, str2, 3);
                i3++;
            } catch (LocalTestingException e3) {
                iVar2.a((Exception) e3);
                return;
            }
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            String str3 = (String) list2.get(i4);
            hashMap.put(str3, AssetPackState.a(str3, 4, 0, 0, 0, 0.0d));
        }
        iVar2.a(AssetPackStates.a(j, (Map<String, AssetPackState>) hashMap));
    }

    public final Task<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-474673589, oncanceled);
            onCancelLoad.getMin(-474673589, oncanceled);
        }
        f10904a.c("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        i iVar = new i();
        try {
            for (File file : b(str)) {
                if (av.a(file).equals(str2)) {
                    iVar.a(ParcelFileDescriptor.open(file, 268435456));
                    return iVar.a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e2) {
            f10904a.d("getChunkFileDescriptor failed", e2);
            iVar.a((Exception) new LocalTestingException("Asset Slice file not found.", e2));
        } catch (LocalTestingException e3) {
            f10904a.d("getChunkFileDescriptor failed", e3);
            iVar.a((Exception) e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, String str) {
        try {
            a(i2, str, 4);
        } catch (LocalTestingException e2) {
            f10904a.d("notifyModuleCompleted failed", e2);
        }
    }
}
