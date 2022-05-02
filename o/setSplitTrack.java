package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;

final class setSplitTrack {
    private static JsonReader.setMax getMax = JsonReader.setMax.getMin("nm", "g", "o", SecurityConstants.KEY_TEXT, "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.setMax getMin = JsonReader.setMax.getMin("p", "k");
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("n", SecurityConstants.KEY_VALUE);

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0154, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0156, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a2, code lost:
        r14 = r19;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.performCompletion length(com.airbnb.lottie.parser.moshi.JsonReader r21, o.setVerticalGravity r22) throws java.io.IOException {
        /*
            r0 = r21
            r1 = r22
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0017:
            boolean r17 = r21.getMin()
            if (r17 == 0) goto L_0x01a6
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r3 = getMax
            int r3 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r3)
            switch(r3) {
                case 0: goto L_0x0199;
                case 1: goto L_0x015a;
                case 2: goto L_0x0140;
                case 3: goto L_0x0130;
                case 4: goto L_0x011d;
                case 5: goto L_0x010a;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00cf;
                case 10: goto L_0x00c9;
                case 11: goto L_0x0033;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r14
            r20 = r15
            r14 = 0
            r21.isInside()
            r21.FastBitmap$CoordinateSystem()
            goto L_0x01a2
        L_0x0033:
            r21.length()
        L_0x0036:
            boolean r3 = r21.getMin()
            if (r3 == 0) goto L_0x00af
            r21.setMin()
            r3 = 0
            r19 = 0
        L_0x0042:
            boolean r18 = r21.getMin()
            if (r18 == 0) goto L_0x007e
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r2 = setMin
            int r2 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r2)
            if (r2 == 0) goto L_0x0075
            r18 = r14
            r14 = 1
            if (r2 == r14) goto L_0x005e
            r21.isInside()
            r21.FastBitmap$CoordinateSystem()
            r14 = r18
            goto L_0x0042
        L_0x005e:
            o.onTextFocusChanged r3 = new o.onTextFocusChanged
            float r2 = o.setTitleMarginStart.getMax()
            o.getThumbDrawable r14 = o.getThumbDrawable.getMax
            r20 = r15
            r15 = 0
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r2, r14, r15)
            r3.<init>(r2)
            r14 = r18
            r15 = r20
            goto L_0x0042
        L_0x0075:
            r18 = r14
            r20 = r15
            java.lang.String r19 = r21.toIntRange()
            goto L_0x0042
        L_0x007e:
            r18 = r14
            r20 = r15
            r21.setMax()
            java.lang.String r2 = "o"
            r14 = r19
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0093
            r14 = r3
        L_0x0090:
            r15 = r20
            goto L_0x0036
        L_0x0093:
            java.lang.String r2 = "d"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = "g"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r2 = 1
            goto L_0x00ac
        L_0x00a6:
            r2 = 1
            r1.FastBitmap$CoordinateSystem = r2
            r11.add(r3)
        L_0x00ac:
            r14 = r18
            goto L_0x0090
        L_0x00af:
            r18 = r14
            r20 = r15
            r2 = 1
            r21.getMax()
            int r3 = r11.size()
            if (r3 != r2) goto L_0x00c5
            r2 = 0
            java.lang.Object r3 = r11.get(r2)
            r11.add(r3)
        L_0x00c5:
            r14 = r18
            goto L_0x0156
        L_0x00c9:
            boolean r15 = r21.equals()
            goto L_0x0017
        L_0x00cf:
            r20 = r15
            double r2 = r21.toDoubleRange()
            float r13 = (float) r2
            goto L_0x0017
        L_0x00d8:
            r20 = r15
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r3 = r21.values()
            r15 = 1
            int r3 = r3 - r15
            r12 = r2[r3]
            goto L_0x0156
        L_0x00e8:
            r20 = r15
            r15 = 1
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r2 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r3 = r21.values()
            int r3 = r3 - r15
            r10 = r2[r3]
            goto L_0x0156
        L_0x00f7:
            r20 = r15
            o.onTextFocusChanged r9 = new o.onTextFocusChanged
            float r2 = o.setTitleMarginStart.getMax()
            o.getThumbDrawable r3 = o.getThumbDrawable.getMax
            r15 = 0
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r2, r3, r15)
            r9.<init>(r2)
            goto L_0x0156
        L_0x010a:
            r20 = r15
            o.onSearchClicked r8 = new o.onSearchClicked
            float r2 = o.setTitleMarginStart.getMax()
            o.makeLayout r3 = o.makeLayout.length
            r15 = 1
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r2, r3, r15)
            r8.<init>(r2)
            goto L_0x0156
        L_0x011d:
            r20 = r15
            r15 = 1
            o.onSearchClicked r7 = new o.onSearchClicked
            float r2 = o.setTitleMarginStart.getMax()
            o.makeLayout r3 = o.makeLayout.length
            java.util.List r2 = o.getSplitTrack.setMin(r0, r1, r2, r3, r15)
            r7.<init>(r2)
            goto L_0x0156
        L_0x0130:
            r20 = r15
            r15 = 1
            int r2 = r21.values()
            if (r2 != r15) goto L_0x013c
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.LINEAR
            goto L_0x013e
        L_0x013c:
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.RADIAL
        L_0x013e:
            r5 = r2
            goto L_0x0156
        L_0x0140:
            r20 = r15
            o.onCloseClicked r2 = new o.onCloseClicked
            o.applyThumbTint r3 = o.applyThumbTint.length
            r19 = r14
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            java.util.List r3 = o.getSplitTrack.setMin(r0, r1, r15, r3, r14)
            r2.<init>(r3)
            r16 = r2
        L_0x0154:
            r14 = r19
        L_0x0156:
            r15 = r20
            goto L_0x0017
        L_0x015a:
            r19 = r14
            r20 = r15
            r2 = -1
            r21.setMin()
        L_0x0162:
            boolean r3 = r21.getMin()
            if (r3 == 0) goto L_0x0194
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r3 = getMin
            int r3 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r3)
            if (r3 == 0) goto L_0x018c
            r14 = 1
            if (r3 == r14) goto L_0x017a
            r21.isInside()
            r21.FastBitmap$CoordinateSystem()
            goto L_0x0162
        L_0x017a:
            o.onWindowFocusChanged r6 = new o.onWindowFocusChanged
            o.setThumbTintMode r3 = new o.setThumbTintMode
            r3.<init>(r2)
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            java.util.List r3 = o.getSplitTrack.setMin(r0, r1, r15, r3, r14)
            r6.<init>(r3)
            goto L_0x0162
        L_0x018c:
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            int r2 = r21.values()
            goto L_0x0162
        L_0x0194:
            r14 = 0
            r21.setMax()
            goto L_0x0154
        L_0x0199:
            r19 = r14
            r20 = r15
            r14 = 0
            java.lang.String r4 = r21.toIntRange()
        L_0x01a2:
            r14 = r19
            goto L_0x0017
        L_0x01a6:
            r19 = r14
            r20 = r15
            if (r16 != 0) goto L_0x01c2
            o.onCloseClicked r0 = new o.onCloseClicked
            o.setTitleMarginTop r1 = new o.setTitleMarginTop
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            r16 = r0
        L_0x01c2:
            o.performCompletion r14 = new o.performCompletion
            r0 = r14
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r16
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r19
            r13 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSplitTrack.length(com.airbnb.lottie.parser.moshi.JsonReader, o.setVerticalGravity):o.performCompletion");
    }
}
