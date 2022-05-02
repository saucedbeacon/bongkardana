package com.google.android.gms.internal.firebase_ml;

import id.dana.sendmoney.summary.SummaryActivity;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

final class zzhn extends zzhh {
    private List<String> zzaaa = new ArrayList();
    private zzhj zzaab;
    private String zzaac;
    private final zzrh zzzy;
    private final zzhm zzzz;

    zzhn(zzhm zzhm, zzrh zzrh) {
        this.zzzz = zzhm;
        this.zzzy = zzrh;
        zzrh.setLenient(true);
    }

    public final void close() throws IOException {
        this.zzzy.close();
    }

    public final String zzgs() {
        if (this.zzaaa.isEmpty()) {
            return null;
        }
        List<String> list = this.zzaaa;
        return list.get(list.size() - 1);
    }

    public final zzhj zzgr() {
        return this.zzaab;
    }

    public final zzhd zzgp() {
        return this.zzzz;
    }

    public final byte zzgu() {
        zzhh();
        return Byte.parseByte(this.zzaac);
    }

    public final short zzgv() {
        zzhh();
        return Short.parseShort(this.zzaac);
    }

    public final int getIntValue() {
        zzhh();
        return Integer.parseInt(this.zzaac);
    }

    public final float zzgw() {
        zzhh();
        return Float.parseFloat(this.zzaac);
    }

    public final BigInteger zzgz() {
        zzhh();
        return new BigInteger(this.zzaac);
    }

    public final BigDecimal zzha() {
        zzhh();
        return new BigDecimal(this.zzaac);
    }

    public final double zzgy() {
        zzhh();
        return Double.parseDouble(this.zzaac);
    }

    public final long zzgx() {
        zzhh();
        return Long.parseLong(this.zzaac);
    }

    private final void zzhh() {
        zzlp.checkArgument(this.zzaab == zzhj.VALUE_NUMBER_INT || this.zzaab == zzhj.VALUE_NUMBER_FLOAT);
    }

    public final String getText() {
        return this.zzaac;
    }

    public final zzhj zzgq() throws IOException {
        zzrj zzrj;
        zzhj zzhj;
        if (this.zzaab != null) {
            int i = zzhq.zzzh[this.zzaab.ordinal()];
            if (i == 1) {
                this.zzzy.beginArray();
                this.zzaaa.add((Object) null);
            } else if (i == 2) {
                this.zzzy.beginObject();
                this.zzaaa.add((Object) null);
            }
        }
        try {
            zzrj = this.zzzy.zzpr();
        } catch (EOFException unused) {
            zzrj = zzrj.END_DOCUMENT;
        }
        switch (zzhq.zzaae[zzrj.ordinal()]) {
            case 1:
                this.zzaac = "[";
                this.zzaab = zzhj.START_ARRAY;
                break;
            case 2:
                this.zzaac = "]";
                this.zzaab = zzhj.END_ARRAY;
                List<String> list = this.zzaaa;
                list.remove(list.size() - 1);
                this.zzzy.endArray();
                break;
            case 3:
                this.zzaac = "{";
                this.zzaab = zzhj.START_OBJECT;
                break;
            case 4:
                this.zzaac = "}";
                this.zzaab = zzhj.END_OBJECT;
                List<String> list2 = this.zzaaa;
                list2.remove(list2.size() - 1);
                this.zzzy.endObject();
                break;
            case 5:
                if (!this.zzzy.nextBoolean()) {
                    this.zzaac = "false";
                    this.zzaab = zzhj.VALUE_FALSE;
                    break;
                } else {
                    this.zzaac = SummaryActivity.CHECKED;
                    this.zzaab = zzhj.VALUE_TRUE;
                    break;
                }
            case 6:
                this.zzaac = "null";
                this.zzaab = zzhj.VALUE_NULL;
                this.zzzy.nextNull();
                break;
            case 7:
                this.zzaac = this.zzzy.nextString();
                this.zzaab = zzhj.VALUE_STRING;
                break;
            case 8:
                String nextString = this.zzzy.nextString();
                this.zzaac = nextString;
                if (nextString.indexOf(46) == -1) {
                    zzhj = zzhj.VALUE_NUMBER_INT;
                } else {
                    zzhj = zzhj.VALUE_NUMBER_FLOAT;
                }
                this.zzaab = zzhj;
                break;
            case 9:
                this.zzaac = this.zzzy.nextName();
                this.zzaab = zzhj.FIELD_NAME;
                List<String> list3 = this.zzaaa;
                list3.set(list3.size() - 1, this.zzaac);
                break;
            default:
                this.zzaac = null;
                this.zzaab = null;
                break;
        }
        return this.zzaab;
    }

    public final zzhh zzgt() throws IOException {
        if (this.zzaab != null) {
            int i = zzhq.zzzh[this.zzaab.ordinal()];
            if (i == 1) {
                this.zzzy.skipValue();
                this.zzaac = "]";
                this.zzaab = zzhj.END_ARRAY;
            } else if (i == 2) {
                this.zzzy.skipValue();
                this.zzaac = "}";
                this.zzaab = zzhj.END_OBJECT;
            }
        }
        return this;
    }
}
