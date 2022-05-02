package com.google.android.gms.internal.firebase_ml;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.google.android.gms.internal.firebase_ml.zzii;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgd extends zzii {
    @zzim("Accept")
    private List<String> accept;
    @zzim("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP));
    @zzim("Age")
    private List<Long> age;
    @zzim("WWW-Authenticate")
    private List<String> authenticate;
    @zzim("Authorization")
    private List<String> authorization;
    @zzim("Cache-Control")
    private List<String> cacheControl;
    @zzim("Content-Encoding")
    private List<String> contentEncoding;
    @zzim("Content-Length")
    private List<Long> contentLength;
    @zzim("Content-MD5")
    private List<String> contentMD5;
    @zzim("Content-Range")
    private List<String> contentRange;
    @zzim("Content-Type")
    private List<String> contentType;
    @zzim("Cookie")
    private List<String> cookie;
    @zzim("Date")
    private List<String> date;
    @zzim("ETag")
    private List<String> etag;
    @zzim("Expires")
    private List<String> expires;
    @zzim("If-Match")
    private List<String> ifMatch;
    @zzim("If-Modified-Since")
    private List<String> ifModifiedSince;
    @zzim("If-None-Match")
    private List<String> ifNoneMatch;
    @zzim("If-Range")
    private List<String> ifRange;
    @zzim("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @zzim("Last-Modified")
    private List<String> lastModified;
    @zzim("Location")
    private List<String> location;
    @zzim("MIME-Version")
    private List<String> mimeVersion;
    @zzim("Range")
    private List<String> range;
    @zzim("Retry-After")
    private List<String> retryAfter;
    @zzim("User-Agent")
    private List<String> userAgent;

    public zzgd() {
        super(EnumSet.of(zzii.zzc.IGNORE_CASE));
    }

    public final zzgd zzv(String str) {
        this.authorization = zza((Object) null);
        return this;
    }

    public final String getContentType() {
        return (String) zza(this.contentType);
    }

    public final zzgd zzw(String str) {
        this.ifModifiedSince = zza((Object) null);
        return this;
    }

    public final zzgd zzx(String str) {
        this.ifMatch = zza((Object) null);
        return this;
    }

    public final zzgd zzy(String str) {
        this.ifNoneMatch = zza((Object) null);
        return this;
    }

    public final zzgd zzz(String str) {
        this.ifUnmodifiedSince = zza((Object) null);
        return this;
    }

    public final zzgd zzaa(String str) {
        this.ifRange = zza((Object) null);
        return this;
    }

    public final String getLocation() {
        return (String) zza(this.location);
    }

    public final String getUserAgent() {
        return (String) zza(this.userAgent);
    }

    public final zzgd zzab(String str) {
        this.userAgent = zza(str);
        return this;
    }

    private static void zza(Logger logger, StringBuilder sb, StringBuilder sb2, zzgm zzgm, String str, Object obj, Writer writer) throws IOException {
        if (obj != null && !zzid.isNull(obj)) {
            String name = obj instanceof Enum ? zzij.zza((Enum<?>) (Enum) obj).getName() : obj.toString();
            String str2 = ((HttpHeaders.AUTHORIZATION.equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : name;
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(zziv.zzadd);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append("'");
            }
            if (zzgm != null) {
                zzgm.addHeader(str, name);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(name);
                writer.write("\r\n");
            }
        }
    }

    static void zza(zzgd zzgd, StringBuilder sb, StringBuilder sb2, Logger logger, zzgm zzgm) throws IOException {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : zzgd.entrySet()) {
            String str = (String) next.getKey();
            Object[] objArr = {str};
            if (hashSet.add(str)) {
                Object value = next.getValue();
                if (value != null) {
                    zzij zzal = zzgd.zzho().zzal(str);
                    if (zzal != null) {
                        str = zzal.getName();
                    }
                    String str2 = str;
                    Class<?> cls = value.getClass();
                    if ((value instanceof Iterable) || cls.isArray()) {
                        for (Object zza : zziy.zzi(value)) {
                            zza(logger, sb, sb2, zzgm, str2, zza, (Writer) null);
                        }
                    } else {
                        zza(logger, sb, sb2, zzgm, str2, value, (Writer) null);
                    }
                }
            } else {
                throw new IllegalArgumentException(zzlx.zzb("multiple headers of the same name (headers are case insensitive): %s", objArr));
            }
        }
    }

    public final void zza(zzgp zzgp, StringBuilder sb) throws IOException {
        clear();
        zzgc zzgc = new zzgc(this, sb);
        int zzfz = zzgp.zzfz();
        for (int i = 0; i < zzfz; i++) {
            String zzad = zzgp.zzad(i);
            String zzae = zzgp.zzae(i);
            List<Type> list = zzgc.zzww;
            zzib zzib = zzgc.zzwv;
            zzhx zzhx = zzgc.zzwt;
            StringBuilder sb2 = zzgc.zzwu;
            if (sb2 != null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzad).length() + 2 + String.valueOf(zzae).length());
                sb3.append(zzad);
                sb3.append(": ");
                sb3.append(zzae);
                sb2.append(sb3.toString());
                sb2.append(zziv.zzadd);
            }
            zzij zzal = zzib.zzal(zzad);
            if (zzal != null) {
                Type zza = zzid.zza(list, zzal.getGenericType());
                if (zziy.zzc(zza)) {
                    Class<?> zzb = zziy.zzb(list, zziy.zzd(zza));
                    zzhx.zza(zzal.zzhp(), zzb, zza(zzb, list, zzae));
                } else if (zziy.zza(zziy.zzb(list, zza), (Class<?>) Iterable.class)) {
                    Collection<Object> collection = (Collection) zzal.zzh(this);
                    if (collection == null) {
                        collection = zzid.zzb(zza);
                        zzal.zzb(this, collection);
                    }
                    collection.add(zza(zza == Object.class ? null : zziy.zze(zza), list, zzae));
                } else {
                    zzal.zzb(this, zza(zza, list, zzae));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(zzad);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    zzb(zzad, arrayList);
                }
                arrayList.add(zzae);
            }
        }
        zzgc.zzwt.zzhk();
    }

    private static <T> T zza(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static <T> List<T> zza(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    private static Object zza(Type type, List<Type> list, String str) {
        return zzid.zza(zzid.zza(list, type), str);
    }

    public final /* synthetic */ zzii zzer() {
        return (zzgd) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzgd) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzgd) super.clone();
    }
}
