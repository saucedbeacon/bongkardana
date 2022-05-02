package com.alipay.imobile.magenerator.a;

public enum r {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int[] k;
    private final int l;

    private r(int[] iArr, int i) {
        this.k = iArr;
        this.l = i;
    }

    public final int a() {
        return this.l;
    }

    public final int a(y yVar) {
        int a2 = yVar.a();
        return this.k[a2 <= 9 ? 0 : a2 <= 26 ? (char) 1 : 2];
    }
}
