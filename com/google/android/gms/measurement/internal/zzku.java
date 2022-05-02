package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.j256.ormlite.field.FieldType;
import id.dana.data.constant.BranchLinkConstant;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzku extends zzgo {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze = new AtomicLong(0);
    private int zzf;
    private Integer zzg = null;

    zzku(zzfu zzfu) {
        super(zzfu);
    }

    static MessageDigest zzN() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @VisibleForTesting
    static long zzO(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    static boolean zzP(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return zzar(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzar(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean zzR(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzS(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean zzY(String str) {
        return !zzc[0].equals(str);
    }

    public static ArrayList<Bundle> zzak(List<zzaa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzaa next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.zza);
            bundle.putString("origin", next.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, next.zzd);
            bundle.putString("name", next.zzc.zzb);
            zzgq.zza(bundle, next.zzc.zza());
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, next.zze);
            String str = next.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzas zzas = next.zzg;
            if (zzas != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzas.zza);
                zzaq zzaq = next.zzg.zzb;
                if (zzaq != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzaq.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, next.zzh);
            zzas zzas2 = next.zzi;
            if (zzas2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzas2.zza);
                zzaq zzaq2 = next.zzi.zzb;
                if (zzaq2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzaq2.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, next.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, next.zzj);
            zzas zzas3 = next.zzk;
            if (zzas3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzas3.zza);
                zzaq zzaq3 = next.zzk.zzb;
                if (zzaq3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzaq3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean zzam(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static final boolean zzan(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    @VisibleForTesting
    static final boolean zzao(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final Object zzap(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zzC(String.valueOf(obj), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle zzU = zzU((Bundle) parcelable);
                    if (!zzU.isEmpty()) {
                        arrayList.add(zzU);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private final int zzaq(String str) {
        if ("_ldl".equals(str)) {
            this.zzs.zzc();
            return 2048;
        } else if (FieldType.FOREIGN_ID_FIELD_SUFFIX.equals(str)) {
            this.zzs.zzc();
            return 256;
        } else if (!this.zzs.zzc().zzn((String) null, zzea.zzae) || !"_lgclid".equals(str)) {
            this.zzs.zzc();
            return 36;
        } else {
            this.zzs.zzc();
            return 100;
        }
    }

    private static boolean zzar(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean zzas(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String zzS : strArr) {
            if (zzS(str, zzS)) {
                return true;
            }
        }
        return false;
    }

    static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzA(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            zzov.zzb();
            if (this.zzs.zzc().zzn((String) null, zzea.zzag) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (this.zzs.zzq()) {
                    this.zzs.zzau().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (zzao(str2)) {
                return true;
            } else {
                this.zzs.zzau().zzd().zzb("Invalid admob_app_id. Analytics disabled.", zzem.zzl(str2));
                return false;
            }
        } else if (zzao(str)) {
            return true;
        } else {
            if (this.zzs.zzq()) {
                this.zzs.zzau().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzem.zzl(str));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzB(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final String zzC(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzD(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.zzg()
            boolean r2 = r14.zzs(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            if (r22 == 0) goto L_0x00aa
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzgs.zzc
            boolean r2 = zzas(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzjk r2 = r2.zzy()
            r2.zzg()
            r2.zzb()
            boolean r6 = r2.zzD()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzku r2 = r2.zzl()
            int r2 = r2.zzZ()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            r2.zzc()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ad
            com.google.android.gms.measurement.internal.zzfu r10 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r10 = r10.zzau()
            com.google.android.gms.measurement.internal.zzek r10 = r10.zzh()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.zzd(r11, r3, r8, r6)
            com.google.android.gms.measurement.internal.zzfu r6 = r7.zzs
            r6.zzc()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzae r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzea.zzR
            r10 = r15
            boolean r1 = r1.zzn(r15, r2)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = zzR(r16)
            if (r1 != 0) goto L_0x00c9
        L_0x00c3:
            boolean r1 = zzR(r17)
            if (r1 == 0) goto L_0x00d1
        L_0x00c9:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            r1.zzc()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d8
        L_0x00d1:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            r1.zzc()
            r1 = 100
        L_0x00d8:
            boolean r1 = r14.zzt(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00df
            return r9
        L_0x00df:
            if (r22 == 0) goto L_0x0172
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.zzz(r1, r2, r3, r4, r5, r6)
            goto L_0x0171
        L_0x00f7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012f
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x0100:
            if (r13 >= r12) goto L_0x0171
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzh()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.zzc(r2, r0, r8)
            goto L_0x0172
        L_0x011c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.zzz(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0100
        L_0x012f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0172
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x013b:
            if (r13 >= r12) goto L_0x0171
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015e
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzh()
            if (r0 == 0) goto L_0x0156
            java.lang.Class r0 = r0.getClass()
            goto L_0x0158
        L_0x0156:
            java.lang.String r0 = "null"
        L_0x0158:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.zzc(r2, r0, r8)
            goto L_0x0172
        L_0x015e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.zzz(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013b
        L_0x0171:
            return r9
        L_0x0172:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzku.zzD(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    public final Object zzE(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.zzs.zzc();
            return zzap(256, obj, true, true);
        }
        if (zzR(str)) {
            this.zzs.zzc();
        } else {
            this.zzs.zzc();
            i = 100;
        }
        return zzap(i, obj, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zzF(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzgr.zzd
            boolean r13 = zzas(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            com.google.android.gms.measurement.internal.zzfu r0 = r9.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            int r15 = r0.zzc()
            com.google.android.gms.measurement.internal.zzfu r0 = r9.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzea.zzW
            r8 = r21
            boolean r0 = r0.zzn(r8, r1)
            if (r0 == 0) goto L_0x0037
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            goto L_0x003b
        L_0x0037:
            java.util.Set r0 = r23.keySet()
        L_0x003b:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0043:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x005b
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r2 = 0
            goto L_0x006a
        L_0x005b:
            if (r25 == 0) goto L_0x0062
            int r0 = r9.zzq(r7)
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 != 0) goto L_0x0069
            int r0 = r9.zzr(r7)
        L_0x0069:
            r2 = r0
        L_0x006a:
            if (r2 == 0) goto L_0x0080
            r0 = 3
            if (r2 != r0) goto L_0x0071
            r5 = r7
            goto L_0x0073
        L_0x0071:
            r0 = 0
            r5 = r0
        L_0x0073:
            r0 = r20
            r1 = r14
            r3 = r7
            r4 = r7
            r0.zzI(r1, r2, r3, r4, r5)
            r14.remove(r7)
            goto L_0x0120
        L_0x0080:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r14
            r6 = r24
            r19 = r7
            r7 = r25
            r8 = r13
            int r2 = r0.zzD(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x00ac
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r17)
            r0 = r20
            r1 = r14
            r3 = r19
            r4 = r19
            r0.zzI(r1, r2, r3, r4, r5)
            goto L_0x00ce
        L_0x00ac:
            if (r2 == 0) goto L_0x00ce
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00d0
            r0 = 21
            if (r2 != r0) goto L_0x00be
            r3 = r10
            goto L_0x00bf
        L_0x00be:
            r3 = r6
        L_0x00bf:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r14
            r4 = r6
            r0.zzI(r1, r2, r3, r4, r5)
            r14.remove(r6)
            goto L_0x0120
        L_0x00ce:
            r6 = r19
        L_0x00d0:
            boolean r0 = zzh(r6)
            if (r0 == 0) goto L_0x0120
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x011a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.zzfu r2 = r9.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzfu r3 = r9.zzs
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzm()
            java.lang.String r3 = r3.zzc(r10)
            com.google.android.gms.measurement.internal.zzfu r4 = r9.zzs
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzm()
            java.lang.String r4 = r4.zzf(r11)
            r2.zzc(r1, r3, r4)
            r1 = 5
            zzan(r14, r1)
            r14.remove(r6)
        L_0x011a:
            r8 = r21
            r18 = r0
            goto L_0x0043
        L_0x0120:
            r8 = r21
            goto L_0x0043
        L_0x0124:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzku.zzF(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final void zzG(zzen zzen, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1420018234, oncanceled);
            onCancelLoad.getMin(-1420018234, oncanceled);
        }
        int i2 = 0;
        for (String str : new TreeSet(zzen.zzd.keySet())) {
            if (zzh(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.zzs.zzau().zzd().zzc(sb.toString(), this.zzs.zzm().zzc(zzen.zza), this.zzs.zzm().zzf(zzen.zzd));
                zzan(zzen.zzd, 5);
                zzen.zzd.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzH(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.zzs.zzl().zzL(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzI(Bundle bundle, int i, String str, String str2, Object obj) {
        if (zzan(bundle, i)) {
            this.zzs.zzc();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzJ(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = zzt("user property referrer", str, zzaq(str), obj);
        } else {
            z = zzt("user property", str, zzaq(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final Object zzK(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zzap(zzaq(str), obj, true, false);
        }
        return zzap(zzaq(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    public final void zzL(Bundle bundle, String str, Object obj) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(807978915, oncanceled);
            onCancelLoad.getMin(807978915, oncanceled);
        }
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.zzs.zzau().zzh().zzc("Not putting event parameter. Invalid value type. name, type", this.zzs.zzm().zzd(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzM(zzkt zzkt, String str, int i, String str2, String str3, int i2, boolean z) {
        Bundle bundle = new Bundle();
        zzan(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        if (z) {
            zzkt.zza(str, "_err", bundle);
            return;
        }
        this.zzs.zzat();
        this.zzs.zzk().zzs("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zzQ(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzs.zzax()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzs.zzau().zzj().zzb("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzT(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzu = this.zzs.zzc().zzu();
        this.zzs.zzat();
        return zzu.equals(str);
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzU(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzE = zzE(str, bundle.get(str));
                if (zzE == null) {
                    this.zzs.zzau().zzh().zzb("Param value can't be null", this.zzs.zzm().zzd(str));
                } else {
                    zzL(bundle2, str, zzE);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final zzas zzV(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzn(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle zzF = zzF(str, str2, bundle2, CollectionUtils.listOf("_o"), false);
            if (z) {
                zzF = zzU(zzF);
            }
            Preconditions.checkNotNull(zzF);
            return new zzas(str2, new zzaq(zzF), str3, j);
        }
        this.zzs.zzau().zzb().zzb("Invalid conditional property event name", this.zzs.zzm().zze(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zzW(Context context, String str) {
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1335561390, oncanceled);
                onCancelLoad.getMin(1335561390, oncanceled);
            }
        }
        if (context != null) {
            context2 = context.getApplicationContext();
        }
        if (context2 != null) {
            int length2 = str != null ? str.length() : 0;
            int min2 = dispatchOnCancelled.getMin(context2, length2);
            if (length2 != min2) {
                onCanceled oncanceled2 = new onCanceled(length2, min2, 32);
                onCancelLoad.setMax(1335561390, oncanceled2);
                onCancelLoad.getMin(1335561390, oncanceled2);
            }
        }
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.zzs.zzau().zzb().zzb("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.zzs.zzau().zzb().zzb("Package name not found", e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzX(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzZ() {
        if (this.zzg == null) {
            this.zzg = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzs.zzax()) / 1000);
        }
        return this.zzg.intValue();
    }

    /* access modifiers changed from: protected */
    public final boolean zza() {
        return true;
    }

    public final int zzaa(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzs.zzax(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzab(long j, long j2) {
        return (j + (j2 * DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzac(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.zzs.zzau().zze().zzb("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zzad(zzcf zzcf, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(BranchLinkConstant.PayloadKey.REFERRAL, str);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning string value to wrapper", e);
        }
    }

    public final void zzae(zzcf zzcf, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(BranchLinkConstant.PayloadKey.REFERRAL, j);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzaf(zzcf zzcf, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(BranchLinkConstant.PayloadKey.REFERRAL, i);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzag(zzcf zzcf, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(BranchLinkConstant.PayloadKey.REFERRAL, bArr);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzah(zzcf zzcf, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(BranchLinkConstant.PayloadKey.REFERRAL, z);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzai(zzcf zzcf, Bundle bundle) {
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzaj(zzcf zzcf, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(BranchLinkConstant.PayloadKey.REFERRAL, arrayList);
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zzs.zzau().zze().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final URL zzal(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{42004L, Integer.valueOf(zzZ())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.zzs.zzc().zzv())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.zzs.zzau().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final void zzaz() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.zzs.zzau().zze().zza("Utils falling back to Random for random id");
            }
        }
        this.zze.set(nextLong);
    }

    public final long zzd() {
        long andIncrement;
        long j;
        if (this.zze.get() == 0) {
            synchronized (this.zze) {
                long nextLong = new Random(System.nanoTime() ^ this.zzs.zzay().currentTimeMillis()).nextLong();
                int i = this.zzf + 1;
                this.zzf = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.zze) {
            this.zze.compareAndSet(-1, 1);
            andIncrement = this.zze.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzi(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("medium", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.zzs.zzau().zze().zzb("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzj(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.zzs.zzau().zzd().zzc("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.zzs.zzau().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzk(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.zzs.zzau().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.zzs.zzau().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zzb;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzs.zzau().zzd().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzas(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzas(str2, strArr2)) {
            return true;
        }
        this.zzs.zzau().zzd().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzm(String str, int i, String str2) {
        if (str2 == null) {
            this.zzs.zzau().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.zzs.zzau().zzd().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzn(String str) {
        if (!zzk("event", str)) {
            return 2;
        }
        if (!zzl("event", zzgr.zza, zzgr.zzb, str)) {
            return 13;
        }
        this.zzs.zzc();
        if (!zzm("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzo(String str) {
        if (!zzk("user property", str)) {
            return 6;
        }
        if (!zzl("user property", zzgt.zza, (String[]) null, str)) {
            return 15;
        }
        this.zzs.zzc();
        if (!zzm("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzq(String str) {
        if (!zzj("event param", str)) {
            return 3;
        }
        if (!zzl("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.zzs.zzc();
        if (!zzm("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzr(String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzl("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.zzs.zzc();
        if (!zzm("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzs(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzt(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                this.zzs.zzau().zzh().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzz(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            this.zzs.zzc();
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int zzq = z ? zzq(str6) : 0;
                    if (zzq == 0) {
                        zzq = zzr(str6);
                    }
                    i = zzq;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    zzI(bundle, i, str6, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (zzs(bundle2.get(str6))) {
                        this.zzs.zzau().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        str4 = str6;
                        i2 = 22;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = zzD(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        zzI(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (zzh(str4) && !zzas(str4, zzgs.zzd) && (i3 = i3 + 1) > 0) {
                        this.zzs.zzau().zzd().zzc("Item cannot contain custom parameters", this.zzs.zzm().zzc(str5), this.zzs.zzm().zzf(bundle2));
                        zzan(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }
}
