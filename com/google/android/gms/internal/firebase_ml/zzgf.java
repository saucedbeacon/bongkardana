package com.google.android.gms.internal.firebase_ml;

import com.google.android.exoplayer2.util.MimeTypes;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzgf {
    private static final Pattern zzxn = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern zzxo = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern zzxp;
    private static final Pattern zzxq;
    private String type = MimeTypes.BASE_TYPE_APPLICATION;
    private String zzxr = "octet-stream";
    private final SortedMap<String, String> zzxs = new TreeMap();
    private String zzxt;

    public zzgf(String str) {
        Matcher matcher = zzxp.matcher(str);
        zzlp.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        zzlp.checkArgument(zzxn.matcher(group).matches(), "Type contains reserved characters");
        this.type = group;
        this.zzxt = null;
        String group2 = matcher.group(2);
        zzlp.checkArgument(zzxn.matcher(group2).matches(), "Subtype contains reserved characters");
        this.zzxr = group2;
        this.zzxt = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = zzxq.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                zza(group4, group5);
            }
        }
    }

    private final zzgf zza(String str, String str2) {
        if (str2 == null) {
            this.zzxt = null;
            this.zzxs.remove(str.toLowerCase(Locale.US));
            return this;
        }
        zzlp.checkArgument(zzxo.matcher(str).matches(), "Name contains reserved characters");
        this.zzxt = null;
        this.zzxs.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    static boolean zzad(String str) {
        return zzxo.matcher(str).matches();
    }

    public final String zzfg() {
        String str = this.zzxt;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.type);
        sb.append('/');
        sb.append(this.zzxr);
        SortedMap<String, String> sortedMap = this.zzxs;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                if (!zzad(str2)) {
                    String replace = str2.replace("\\", "\\\\").replace("\"", "\\\"");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 2);
                    sb2.append("\"");
                    sb2.append(replace);
                    sb2.append("\"");
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        String sb3 = sb.toString();
        this.zzxt = sb3;
        return sb3;
    }

    public final String toString() {
        return zzfg();
    }

    private final boolean zza(zzgf zzgf) {
        return zzgf != null && this.type.equalsIgnoreCase(zzgf.type) && this.zzxr.equalsIgnoreCase(zzgf.zzxr);
    }

    public static boolean zzb(String str, String str2) {
        return str2 != null && new zzgf(str).zza(new zzgf(str2));
    }

    public final zzgf zza(Charset charset) {
        zza("charset", charset == null ? null : charset.name());
        return this;
    }

    public final Charset zzfs() {
        String str = (String) this.zzxs.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    public final int hashCode() {
        return zzfg().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgf)) {
            return false;
        }
        zzgf zzgf = (zzgf) obj;
        if (!zza(zzgf) || !this.zzxs.equals(zzgf.zzxs)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder("[^\\s/=;\"]+".length() + 14 + "[^\\s/=;\"]+".length() + ";.*".length());
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        zzxp = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder("\"([^\"]*)\"".length() + 1 + "[^\\s;\"]*".length());
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder("[^\\s/=;\"]+".length() + 12 + String.valueOf(sb3).length());
        sb4.append("\\s*;\\s*(");
        sb4.append("[^\\s/=;\"]+");
        sb4.append(")=(");
        sb4.append(sb3);
        sb4.append(")");
        zzxq = Pattern.compile(sb4.toString());
    }
}
