package com.google.android.gms.internal.firebase_ml;

abstract class zzls extends zzkv<String> {
    private int limit;
    private int offset = 0;
    private final zzla zzaej;
    private final boolean zzaek;
    final CharSequence zzaem;

    protected zzls(zzlr zzlr, CharSequence charSequence) {
        this.zzaej = zzlr.zzaej;
        this.zzaek = false;
        this.limit = zzlr.limit;
        this.zzaem = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int zzal(int i);

    /* access modifiers changed from: package-private */
    public abstract int zzam(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzim() {
        int i;
        int i2 = this.offset;
        while (true) {
            int i3 = this.offset;
            if (i3 != -1) {
                int zzal = zzal(i3);
                if (zzal == -1) {
                    zzal = this.zzaem.length();
                    this.offset = -1;
                } else {
                    this.offset = zzam(zzal);
                }
                int i4 = this.offset;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.offset = i5;
                    if (i5 > this.zzaem.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i2 < zzal && this.zzaej.zzb(this.zzaem.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.zzaej.zzb(this.zzaem.charAt(i - 1))) {
                        zzal = i - 1;
                    }
                    if (!this.zzaek || i2 != i) {
                        int i6 = this.limit;
                    } else {
                        i2 = this.offset;
                    }
                }
            } else {
                zzin();
                return null;
            }
        }
        int i62 = this.limit;
        if (i62 == 1) {
            i = this.zzaem.length();
            this.offset = -1;
            while (i > i2 && this.zzaej.zzb(this.zzaem.charAt(i - 1))) {
                i--;
            }
        } else {
            this.limit = i62 - 1;
        }
        return this.zzaem.subSequence(i2, i).toString();
    }
}
