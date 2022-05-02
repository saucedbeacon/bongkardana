package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

final class dq {

    /* renamed from: a  reason: collision with root package name */
    private final int f10922a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    dq() {
    }

    dq(int i, @Nullable String str, long j, long j2, int i2) {
        this();
        this.f10922a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f10922a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final long d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.dq
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.dq r8 = (com.google.android.play.core.assetpacks.dq) r8
            int r1 = r7.f10922a
            int r3 = r8.a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.c
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.e
            int r8 = r8.e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.dq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f10922a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.f10922a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
