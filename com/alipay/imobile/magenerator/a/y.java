package com.alipay.imobile.magenerator.a;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f10714a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    private static final y[] b = d();
    private final int c;
    private final int[] d;
    private final aa[] e;
    private final int f;

    private y(int i, int[] iArr, aa... aaVarArr) {
        this.c = i;
        this.d = iArr;
        this.e = aaVarArr;
        int a2 = aaVarArr[0].a();
        int i2 = 0;
        for (z zVar : aaVarArr[0].d()) {
            i2 += zVar.a() * (zVar.b() + a2);
        }
        this.f = i2;
    }

    public static y a(int i) {
        if (i > 0 && i <= 40) {
            return b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    private static y[] d() {
        return new y[]{new y(1, new int[0], new aa(7, new z(1, 19)), new aa(10, new z(1, 16)), new aa(13, new z(1, 13)), new aa(17, new z(1, 9))), new y(2, new int[]{6, 18}, new aa(10, new z(1, 34)), new aa(16, new z(1, 28)), new aa(22, new z(1, 22)), new aa(28, new z(1, 16))), new y(3, new int[]{6, 22}, new aa(15, new z(1, 55)), new aa(26, new z(1, 44)), new aa(18, new z(2, 17)), new aa(22, new z(2, 13))), new y(4, new int[]{6, 26}, new aa(20, new z(1, 80)), new aa(18, new z(2, 32)), new aa(26, new z(2, 24)), new aa(16, new z(4, 9))), new y(5, new int[]{6, 30}, new aa(26, new z(1, 108)), new aa(24, new z(2, 43)), new aa(18, new z(2, 15), new z(2, 16)), new aa(22, new z(2, 11), new z(2, 12))), new y(6, new int[]{6, 34}, new aa(18, new z(2, 68)), new aa(16, new z(4, 27)), new aa(24, new z(4, 19)), new aa(28, new z(4, 15))), new y(7, new int[]{6, 22, 38}, new aa(20, new z(2, 78)), new aa(18, new z(4, 31)), new aa(18, new z(2, 14), new z(4, 15)), new aa(26, new z(4, 13), new z(1, 14))), new y(8, new int[]{6, 24, 42}, new aa(24, new z(2, 97)), new aa(22, new z(2, 38), new z(2, 39)), new aa(22, new z(4, 18), new z(2, 19)), new aa(26, new z(4, 14), new z(2, 15))), new y(9, new int[]{6, 26, 46}, new aa(30, new z(2, 116)), new aa(22, new z(3, 36), new z(2, 37)), new aa(20, new z(4, 16), new z(4, 17)), new aa(24, new z(4, 12), new z(4, 13))), new y(10, new int[]{6, 28, 50}, new aa(18, new z(2, 68), new z(2, 69)), new aa(26, new z(4, 43), new z(1, 44)), new aa(24, new z(6, 19), new z(2, 20)), new aa(28, new z(6, 15), new z(2, 16))), new y(11, new int[]{6, 30, 54}, new aa(20, new z(4, 81)), new aa(30, new z(1, 50), new z(4, 51)), new aa(28, new z(4, 22), new z(4, 23)), new aa(24, new z(3, 12), new z(8, 13))), new y(12, new int[]{6, 32, 58}, new aa(24, new z(2, 92), new z(2, 93)), new aa(22, new z(6, 36), new z(2, 37)), new aa(26, new z(4, 20), new z(6, 21)), new aa(28, new z(7, 14), new z(4, 15))), new y(13, new int[]{6, 34, 62}, new aa(26, new z(4, 107)), new aa(22, new z(8, 37), new z(1, 38)), new aa(24, new z(8, 20), new z(4, 21)), new aa(22, new z(12, 11), new z(4, 12))), new y(14, new int[]{6, 26, 46, 66}, new aa(30, new z(3, 115), new z(1, 116)), new aa(24, new z(4, 40), new z(5, 41)), new aa(20, new z(11, 16), new z(5, 17)), new aa(24, new z(11, 12), new z(5, 13))), new y(15, new int[]{6, 26, 48, 70}, new aa(22, new z(5, 87), new z(1, 88)), new aa(24, new z(5, 41), new z(5, 42)), new aa(30, new z(5, 24), new z(7, 25)), new aa(24, new z(11, 12), new z(7, 13))), new y(16, new int[]{6, 26, 50, 74}, new aa(24, new z(5, 98), new z(1, 99)), new aa(28, new z(7, 45), new z(3, 46)), new aa(24, new z(15, 19), new z(2, 20)), new aa(30, new z(3, 15), new z(13, 16))), new y(17, new int[]{6, 30, 54, 78}, new aa(28, new z(1, 107), new z(5, 108)), new aa(28, new z(10, 46), new z(1, 47)), new aa(28, new z(1, 22), new z(15, 23)), new aa(28, new z(2, 14), new z(17, 15))), new y(18, new int[]{6, 30, 56, 82}, new aa(30, new z(5, 120), new z(1, 121)), new aa(26, new z(9, 43), new z(4, 44)), new aa(28, new z(17, 22), new z(1, 23)), new aa(28, new z(2, 14), new z(19, 15))), new y(19, new int[]{6, 30, 58, 86}, new aa(28, new z(3, 113), new z(4, 114)), new aa(26, new z(3, 44), new z(11, 45)), new aa(26, new z(17, 21), new z(4, 22)), new aa(26, new z(9, 13), new z(16, 14))), new y(20, new int[]{6, 34, 62, 90}, new aa(28, new z(3, 107), new z(5, 108)), new aa(26, new z(3, 41), new z(13, 42)), new aa(30, new z(15, 24), new z(5, 25)), new aa(28, new z(15, 15), new z(10, 16))), new y(21, new int[]{6, 28, 50, 72, 94}, new aa(28, new z(4, 116), new z(4, 117)), new aa(26, new z(17, 42)), new aa(28, new z(17, 22), new z(6, 23)), new aa(30, new z(19, 16), new z(6, 17))), new y(22, new int[]{6, 26, 50, 74, 98}, new aa(28, new z(2, 111), new z(7, 112)), new aa(28, new z(17, 46)), new aa(30, new z(7, 24), new z(16, 25)), new aa(24, new z(34, 13))), new y(23, new int[]{6, 30, 54, 78, 102}, new aa(30, new z(4, 121), new z(5, 122)), new aa(28, new z(4, 47), new z(14, 48)), new aa(30, new z(11, 24), new z(14, 25)), new aa(30, new z(16, 15), new z(14, 16))), new y(24, new int[]{6, 28, 54, 80, 106}, new aa(30, new z(6, 117), new z(4, 118)), new aa(28, new z(6, 45), new z(14, 46)), new aa(30, new z(11, 24), new z(16, 25)), new aa(30, new z(30, 16), new z(2, 17))), new y(25, new int[]{6, 32, 58, 84, 110}, new aa(26, new z(8, 106), new z(4, 107)), new aa(28, new z(8, 47), new z(13, 48)), new aa(30, new z(7, 24), new z(22, 25)), new aa(30, new z(22, 15), new z(13, 16))), new y(26, new int[]{6, 30, 58, 86, 114}, new aa(28, new z(10, 114), new z(2, 115)), new aa(28, new z(19, 46), new z(4, 47)), new aa(28, new z(28, 22), new z(6, 23)), new aa(30, new z(33, 16), new z(4, 17))), new y(27, new int[]{6, 34, 62, 90, 118}, new aa(30, new z(8, 122), new z(4, 123)), new aa(28, new z(22, 45), new z(3, 46)), new aa(30, new z(8, 23), new z(26, 24)), new aa(30, new z(12, 15), new z(28, 16))), new y(28, new int[]{6, 26, 50, 74, 98, 122}, new aa(30, new z(3, 117), new z(10, 118)), new aa(28, new z(3, 45), new z(23, 46)), new aa(30, new z(4, 24), new z(31, 25)), new aa(30, new z(11, 15), new z(31, 16))), new y(29, new int[]{6, 30, 54, 78, 102, 126}, new aa(30, new z(7, 116), new z(7, 117)), new aa(28, new z(21, 45), new z(7, 46)), new aa(30, new z(1, 23), new z(37, 24)), new aa(30, new z(19, 15), new z(26, 16))), new y(30, new int[]{6, 26, 52, 78, 104, TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, new aa(30, new z(5, 115), new z(10, 116)), new aa(28, new z(19, 47), new z(10, 48)), new aa(30, new z(15, 24), new z(25, 25)), new aa(30, new z(23, 15), new z(25, 16))), new y(31, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, new aa(30, new z(13, 115), new z(3, 116)), new aa(28, new z(2, 46), new z(29, 47)), new aa(30, new z(42, 24), new z(1, 25)), new aa(30, new z(23, 15), new z(28, 16))), new y(32, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS}, new aa(30, new z(17, 115)), new aa(28, new z(10, 46), new z(23, 47)), new aa(30, new z(10, 24), new z(35, 25)), new aa(30, new z(19, 15), new z(35, 16))), new y(33, new int[]{6, 30, 58, 86, 114, 142}, new aa(30, new z(17, 115), new z(1, 116)), new aa(28, new z(14, 46), new z(21, 47)), new aa(30, new z(29, 24), new z(19, 25)), new aa(30, new z(11, 15), new z(46, 16))), new y(34, new int[]{6, 34, 62, 90, 118, 146}, new aa(30, new z(13, 115), new z(6, 116)), new aa(28, new z(14, 46), new z(23, 47)), new aa(30, new z(44, 24), new z(7, 25)), new aa(30, new z(59, 16), new z(1, 17))), new y(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new aa(30, new z(12, 121), new z(7, 122)), new aa(28, new z(12, 47), new z(26, 48)), new aa(30, new z(39, 24), new z(14, 25)), new aa(30, new z(22, 15), new z(41, 16))), new y(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new aa(30, new z(6, 121), new z(14, 122)), new aa(28, new z(6, 47), new z(34, 48)), new aa(30, new z(46, 24), new z(10, 25)), new aa(30, new z(2, 15), new z(64, 16))), new y(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new aa(30, new z(17, 122), new z(4, 123)), new aa(28, new z(29, 46), new z(14, 47)), new aa(30, new z(49, 24), new z(10, 25)), new aa(30, new z(24, 15), new z(46, 16))), new y(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new aa(30, new z(4, 122), new z(18, 123)), new aa(28, new z(13, 46), new z(32, 47)), new aa(30, new z(48, 24), new z(14, 25)), new aa(30, new z(42, 15), new z(32, 16))), new y(39, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new aa(30, new z(20, 117), new z(4, 118)), new aa(28, new z(40, 47), new z(7, 48)), new aa(30, new z(43, 24), new z(22, 25)), new aa(30, new z(10, 15), new z(67, 16))), new y(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new aa(30, new z(19, 118), new z(6, 119)), new aa(28, new z(18, 47), new z(31, 48)), new aa(30, new z(34, 24), new z(34, 25)), new aa(30, new z(20, 15), new z(61, 16)))};
    }

    public final int a() {
        return this.c;
    }

    public final aa a(m mVar) {
        return this.e[mVar.ordinal()];
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return (this.c * 4) + 17;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
