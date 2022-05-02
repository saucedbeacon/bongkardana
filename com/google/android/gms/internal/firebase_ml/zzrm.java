package com.google.android.gms.internal.firebase_ml;

import id.dana.sendmoney.summary.SummaryActivity;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzrm implements Closeable, Flushable {
    private static final String[] zzblr = new String[128];
    private static final String[] zzbls;
    private final Writer out;
    private String separator;
    private boolean zzbkt;
    private int[] zzblb = new int[32];
    private int zzblc = 0;
    private String zzblt;
    private String zzblu;
    private boolean zzblv;

    public zzrm(Writer writer) {
        zzbx(6);
        this.separator = ":";
        this.zzblv = true;
        this.out = writer;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.zzblt = null;
            this.separator = ":";
            return;
        }
        this.zzblt = str;
        this.separator = ": ";
    }

    public final void setLenient(boolean z) {
        this.zzbkt = true;
    }

    public final zzrm zzpy() throws IOException {
        zzqc();
        return zza(1, "[");
    }

    public final zzrm zzpz() throws IOException {
        return zzc(1, 2, "]");
    }

    public final zzrm zzqa() throws IOException {
        zzqc();
        return zza(3, "{");
    }

    public final zzrm zzqb() throws IOException {
        return zzc(3, 5, "}");
    }

    private final zzrm zza(int i, String str) throws IOException {
        zzqf();
        zzbx(i);
        this.out.write(str);
        return this;
    }

    private final zzrm zzc(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.zzblu == null) {
            this.zzblc--;
            if (peek == i2) {
                zzqe();
            }
            this.out.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.zzblu);
        }
    }

    private final void zzbx(int i) {
        int i2 = this.zzblc;
        int[] iArr = this.zzblb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzblb = iArr2;
        }
        int[] iArr3 = this.zzblb;
        int i3 = this.zzblc;
        this.zzblc = i3 + 1;
        iArr3[i3] = i;
    }

    private final int peek() {
        int i = this.zzblc;
        if (i != 0) {
            return this.zzblb[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzbz(int i) {
        this.zzblb[this.zzblc - 1] = i;
    }

    public final zzrm zzcc(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.zzblu != null) {
            throw new IllegalStateException();
        } else if (this.zzblc != 0) {
            this.zzblu = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    private final void zzqc() throws IOException {
        if (this.zzblu != null) {
            int peek = peek();
            if (peek == 5) {
                this.out.write(44);
            } else if (peek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzqe();
            zzbz(4);
            zzce(this.zzblu);
            this.zzblu = null;
        }
    }

    public final zzrm zzcd(String str) throws IOException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-322850368, oncanceled);
            onCancelLoad.getMin(-322850368, oncanceled);
        }
        if (str == null) {
            return zzqd();
        }
        zzqc();
        zzqf();
        zzce(str);
        return this;
    }

    public final zzrm zzqd() throws IOException {
        if (this.zzblu != null) {
            if (this.zzblv) {
                zzqc();
            } else {
                this.zzblu = null;
                return this;
            }
        }
        zzqf();
        this.out.write("null");
        return this;
    }

    public final zzrm zzba(boolean z) throws IOException {
        zzqc();
        zzqf();
        this.out.write(z ? SummaryActivity.CHECKED : "false");
        return this;
    }

    public final zzrm zzb(double d) throws IOException {
        zzqc();
        if (this.zzbkt || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            zzqf();
            this.out.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public final zzrm zzu(long j) throws IOException {
        zzqc();
        zzqf();
        this.out.write(Long.toString(j));
        return this;
    }

    public final zzrm zza(Number number) throws IOException {
        if (number == null) {
            return zzqd();
        }
        zzqc();
        String obj = number.toString();
        if (this.zzbkt || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            zzqf();
            this.out.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void flush() throws IOException {
        if (this.zzblc != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void close() throws IOException {
        this.out.close();
        int i = this.zzblc;
        if (i > 1 || (i == 1 && this.zzblb[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzblc = 0;
    }

    private final void zzce(String str) throws IOException {
        String str2;
        String[] strArr = zzblr;
        this.out.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.out.write(str, i, i2 - i);
            }
            this.out.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.out.write(str, i, length - i);
        }
        this.out.write("\"");
    }

    private final void zzqe() throws IOException {
        if (this.zzblt != null) {
            this.out.write("\n");
            int i = this.zzblc;
            for (int i2 = 1; i2 < i; i2++) {
                this.out.write(this.zzblt);
            }
        }
    }

    private final void zzqf() throws IOException {
        int peek = peek();
        if (peek == 1) {
            zzbz(2);
            zzqe();
        } else if (peek == 2) {
            this.out.append(',');
            zzqe();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.zzbkt) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzbz(7);
        } else {
            this.out.append(this.separator);
            zzbz(5);
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            zzblr[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = zzblr;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzbls = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }
}
