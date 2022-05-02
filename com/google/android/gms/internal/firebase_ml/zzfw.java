package com.google.android.gms.internal.firebase_ml;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

public final class zzfw extends zzii {
    private static final zzjb zzwm = new zzje("=&-_.!~*'()@:$,;/?:", false);
    private String fragment;
    private int port;
    private String zzwn;
    private String zzwo;
    private String zzwp;
    private List<String> zzwq;

    public zzfw() {
        this.port = -1;
    }

    public zzfw(String str) {
        this(zzu(str));
    }

    public zzfw(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    private zzfw(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.port = -1;
        this.zzwn = str.toLowerCase(Locale.US);
        this.zzwo = str2;
        this.port = i;
        this.zzwq = zzt(str3);
        String str7 = null;
        this.fragment = str4 != null ? zzjc.zzap(str4) : null;
        if (str5 != null) {
            zzgt.zze(str5, this);
        }
        this.zzwp = str6 != null ? zzjc.zzap(str6) : str7;
    }

    public final int hashCode() {
        return zzfg().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof zzfw)) {
            return false;
        }
        return zzfg().equals(((zzfw) obj).zzfg());
    }

    public final String toString() {
        return zzfg();
    }

    public final String zzfg() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) zzlp.checkNotNull(this.zzwn));
        sb.append("://");
        String str = this.zzwp;
        if (str != null) {
            sb.append(zzjc.zzas(str));
            sb.append('@');
        }
        sb.append((String) zzlp.checkNotNull(this.zzwo));
        int i = this.port;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.zzwq;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = this.zzwq.get(i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (str2.length() != 0) {
                    sb2.append(zzjc.zzaq(str2));
                }
            }
        }
        zza(entrySet(), sb2);
        String str3 = this.fragment;
        if (str3 != null) {
            sb2.append('#');
            sb2.append(zzwm.zzan(str3));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final URL zzr(String str) {
        try {
            return new URL(zzu(zzfg()), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void zzs(String str) {
        this.zzwq = zzt((String) null);
    }

    private static List<String> zzt(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (z) {
            int indexOf = str.indexOf(47, i);
            boolean z2 = indexOf != -1;
            if (z2) {
                str2 = str.substring(i, indexOf);
            } else {
                str2 = str.substring(i);
            }
            arrayList.add(zzjc.zzap(str2));
            i = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    static void zza(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry next : set) {
            Object value = next.getValue();
            if (value != null) {
                String zzat = zzjc.zzat((String) next.getKey());
                if (value instanceof Collection) {
                    for (Object zza : (Collection) value) {
                        z = zza(z, sb, zzat, zza);
                    }
                } else {
                    z = zza(z, sb, zzat, value);
                }
            }
        }
    }

    private static boolean zza(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append(Typography.amp);
        }
        sb.append(str);
        String zzat = zzjc.zzat(obj.toString());
        if (zzat.length() != 0) {
            sb.append('=');
            sb.append(zzat);
        }
        return z;
    }

    private static URL zzu(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ zzii zzer() {
        return (zzfw) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzfw) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfw zzfw = (zzfw) super.clone();
        if (this.zzwq != null) {
            zzfw.zzwq = new ArrayList(this.zzwq);
        }
        return zzfw;
    }
}
