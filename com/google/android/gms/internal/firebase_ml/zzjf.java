package com.google.android.gms.internal.firebase_ml;

public abstract class zzjf extends zzjb {
    /* access modifiers changed from: protected */
    public abstract int zza(CharSequence charSequence, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract char[] zzak(int i);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: char} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza(java.lang.String r13, int r14) {
        /*
            r12 = this;
            int r0 = r13.length()
            char[] r1 = com.google.android.gms.internal.firebase_ml.zzjd.zzht()
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000b:
            if (r14 >= r0) goto L_0x00cf
            if (r14 >= r0) goto L_0x00c7
            int r5 = r14 + 1
            char r6 = r13.charAt(r14)
            r7 = 55296(0xd800, float:7.7486E-41)
            r8 = 1
            if (r6 < r7) goto L_0x0088
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 <= r7) goto L_0x0021
            goto L_0x0088
        L_0x0021:
            r7 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r9 = " at index "
            java.lang.String r10 = "' with value "
            if (r6 > r7) goto L_0x0062
            if (r5 != r0) goto L_0x002e
            int r6 = -r6
            goto L_0x0088
        L_0x002e:
            char r7 = r13.charAt(r5)
            boolean r11 = java.lang.Character.isLowSurrogate(r7)
            if (r11 == 0) goto L_0x003d
            int r6 = java.lang.Character.toCodePoint(r6, r7)
            goto L_0x0088
        L_0x003d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r14 = 83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r14 = "Expected low surrogate but got char '"
            r0.append(r14)
            r0.append(r7)
            r0.append(r10)
            r0.append(r7)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L_0x0062:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            int r5 = r5 - r8
            r14 = 82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r14 = "Unexpected low surrogate character '"
            r0.append(r14)
            r0.append(r6)
            r0.append(r10)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L_0x0088:
            if (r6 < 0) goto L_0x00bf
            char[] r5 = r12.zzak(r6)
            boolean r6 = java.lang.Character.isSupplementaryCodePoint(r6)
            if (r6 == 0) goto L_0x0095
            r8 = 2
        L_0x0095:
            int r8 = r8 + r14
            if (r5 == 0) goto L_0x00b9
            int r6 = r14 - r3
            int r7 = r4 + r6
            int r9 = r5.length
            int r9 = r9 + r7
            int r10 = r1.length
            if (r10 >= r9) goto L_0x00a9
            int r9 = r9 + r0
            int r9 = r9 - r14
            int r9 = r9 + 32
            char[] r1 = zza((char[]) r1, (int) r4, (int) r9)
        L_0x00a9:
            if (r6 <= 0) goto L_0x00af
            r13.getChars(r3, r14, r1, r4)
            r4 = r7
        L_0x00af:
            int r14 = r5.length
            if (r14 <= 0) goto L_0x00b8
            int r14 = r5.length
            java.lang.System.arraycopy(r5, r2, r1, r4, r14)
            int r14 = r5.length
            int r4 = r4 + r14
        L_0x00b8:
            r3 = r8
        L_0x00b9:
            int r14 = r12.zza((java.lang.CharSequence) r13, (int) r8, (int) r0)
            goto L_0x000b
        L_0x00bf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trailing high surrogate at end of input"
            r13.<init>(r14)
            throw r13
        L_0x00c7:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
            java.lang.String r14 = "Index exceeds specified range"
            r13.<init>(r14)
            throw r13
        L_0x00cf:
            int r14 = r0 - r3
            if (r14 <= 0) goto L_0x00df
            int r14 = r14 + r4
            int r5 = r1.length
            if (r5 >= r14) goto L_0x00db
            char[] r1 = zza((char[]) r1, (int) r4, (int) r14)
        L_0x00db:
            r13.getChars(r3, r0, r1, r4)
            r4 = r14
        L_0x00df:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1, r2, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzjf.zza(java.lang.String, int):java.lang.String");
    }

    private static char[] zza(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
