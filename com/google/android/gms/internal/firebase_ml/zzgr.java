package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

enum zzgr {
    zzyh('+', "", ",", false, true),
    HASH('#', "#", ",", false, true),
    DOT('.', ".", ".", false, false),
    FORWARD_SLASH('/', "/", "/", false, false),
    SEMI_COLON(';', ";", ";", true, false),
    QUERY('?', "?", "&", true, false),
    AMP(Character.valueOf(Typography.amp), "&", "&", true, false),
    zzyo((String) null, "", ",", false, false);
    
    private final Character zzyp;
    private final String zzyq;
    private final String zzyr;
    private final boolean zzys;
    private final boolean zzyt;

    private zzgr(Character ch, String str, String str2, boolean z, boolean z2) {
        this.zzyp = ch;
        this.zzyq = (String) zzlp.checkNotNull(str);
        this.zzyr = (String) zzlp.checkNotNull(str2);
        this.zzys = z;
        this.zzyt = z2;
        if (ch != null) {
            zzgo.zzyg.put(ch, this);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzga() {
        return this.zzyq;
    }

    /* access modifiers changed from: package-private */
    public final String zzgb() {
        return this.zzyr;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzgc() {
        return this.zzys;
    }

    /* access modifiers changed from: package-private */
    public final int zzgd() {
        return this.zzyp == null ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    public final String zzah(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(550083310, oncanceled);
            onCancelLoad.getMin(550083310, oncanceled);
        }
        if (this.zzyt) {
            return zzjc.zzaq(str);
        }
        return zzjc.zzao(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzge() {
        return this.zzyt;
    }
}
